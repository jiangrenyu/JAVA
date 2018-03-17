package gis;

/**
 * 封装坐标经纬度
 * Created by jiangry01 on 2018/3/13.
 */
public class GeoCoordinate {
    private double latitude;
    private double lontitude;

    public GeoCoordinate(){}

    public GeoCoordinate(double latitude,double lontitude){
        this.lontitude = lontitude;
        this.latitude  = latitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLontitude() {
        return lontitude;
    }

    public void setLontitude(double lontitude) {
        this.lontitude = lontitude;
    }
}
