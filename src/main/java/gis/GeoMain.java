package gis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangry01 on 2018/3/13.
 */
public class GeoMain {
    public static void main(String args[]){
        List<GeoCoordinate> geoCoordinateList = new ArrayList<GeoCoordinate>();
        GeoCoordinate g1 = new GeoCoordinate();
        g1.setLontitude(1);
        g1.setLatitude(4);
        GeoCoordinate g2 = new GeoCoordinate();
        g2.setLontitude(1);
        g2.setLatitude(1);
        GeoCoordinate g3 = new GeoCoordinate();
        g3.setLontitude(4);
        g3.setLatitude(4);
        GeoCoordinate g4 = new GeoCoordinate();
        g3.setLontitude(4);
        g3.setLatitude(1);
        geoCoordinateList.add(g1);
        geoCoordinateList.add(g2);
        geoCoordinateList.add(g3);
        geoCoordinateList.add(g4);

        GeoCoordinate  re = GeoMain.getCenterPoint(geoCoordinateList);
        System.out.println(re.getLontitude() +"   "+ re.getLatitude());
    }

    /**
     * 根据输入的地点坐标计算中心点
     * @param geoCoordinateList
     * @return
     */
    public static GeoCoordinate getCenterPoint(List<GeoCoordinate> geoCoordinateList) {
        int total = geoCoordinateList.size();
        double X = 0, Y = 0, Z = 0;
        for (GeoCoordinate g : geoCoordinateList) {
            double lat, lon, x, y, z;
            lat = g.getLatitude() * Math.PI / 180;
            lon = g.getLontitude() * Math.PI / 180;
            x = Math.cos(lat) * Math.cos(lon);
            y = Math.cos(lat) * Math.sin(lon);
            z = Math.sin(lat);
            X += x;
            Y += y;
            Z += z;
        }

        X = X / total;
        Y = Y / total;
        Z = Z / total;
        double Lon = Math.atan2(Y, X);
        double Hyp = Math.sqrt(X * X + Y * Y);
        double Lat = Math.atan2(Z, Hyp);
        return new GeoCoordinate(Lat * 180 / Math.PI, Lon * 180 / Math.PI);
    }

    /**
     * 根据输入的地点坐标计算中心点（适用于400km以下的场合）
     * @param geoCoordinateList
     * @return
     */
    public static GeoCoordinate getCenterPoint400(List<GeoCoordinate> geoCoordinateList) {
        // 以下为简化方法（400km以内）
        int total = geoCoordinateList.size();
        double lat = 0, lon = 0;
        for (GeoCoordinate g : geoCoordinateList) {
            lat += g.getLatitude() * Math.PI / 180;
            lon += g.getLontitude() * Math.PI / 180;
        }
        lat /= total;
        lon /= total;
        return new GeoCoordinate(lat * 180 / Math.PI, lon * 180 / Math.PI);
    }
}
