package gis;

import static java.lang.Math.PI;

/**
 * Created by jiangry01 on 2018/3/12.
 */
public class Main {

    public static double calcDistance(double Longitude1, double Latitude1, double Longitude2, double Latitude2){
        double dRadLat1 = Rad(Latitude1);
        double dRadLat2 = Rad(Latitude2);
        double a = dRadLat1 - dRadLat2;
        double b = Rad(Longitude1) - Rad(Longitude2);
        double EARTH_RADIUS = 6371;
        double dRad = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(dRadLat1) * Math.cos(dRadLat2) * Math.pow(Math.sin(b / 2), 2)));
        double dDistance = dRad * EARTH_RADIUS;
        dDistance = round(dDistance * 10000) / 10000;
        return Math.abs(dDistance * 1000);
    }

    private static double Rad(double dDegree){
        return dDegree * PI / 180.0;
    }

    private static double round(double d) {
        return Math.floor(d + 0.5);
    }

    public static void main(String[] args) {
        double Longitude1 = 114.0823;
        double Latitude1 =  22.55911;
        double Longitude2 = 114.0823;
        double Latitude2 =  22.55912;

        double num = calcDistance(Longitude1, Latitude1, Longitude2, Latitude2);
        System.out.println(num);
    }
}
