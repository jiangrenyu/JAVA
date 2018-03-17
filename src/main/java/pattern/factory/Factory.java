package pattern.factory;

/**
 * Created by jiangry01 on 2018/3/16.
 */
public class Factory {
   public static void main(String args[]){
        VehicleFactory carFactory  = new CarFactory();
        VehicleFactory boatFactory = new BoatFactory();
        Vehicle car = carFactory.createVehicle();
        Vehicle boat = boatFactory.createVehicle();
        car.run();
        boat.run();
   }
}

/**
 * 抽象工厂类
 */
abstract  class  VehicleFactory{
     public  abstract  Vehicle createVehicle();
}

/**
 * 子工厂类
 */
class  CarFactory extends  VehicleFactory{
    public Vehicle createVehicle(){
         return new Car();
    }
}
class  BoatFactory extends  VehicleFactory{
    public Vehicle createVehicle(){
        return new Boat();
    }
}

class  BicycleFactory extends  VehicleFactory{
    public Vehicle createVehicle(){
        return new Bicycle();
    }
}


