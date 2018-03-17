package pattern.factory;

/**
 * Created by jiangry01 on 2018/3/16.
 */
public class AbFactory {
    public static void  main(String args[]){
           AbstractFactory abstractFactory1 = new Factory1();
           abstractFactory1.createDrinks().prices();
           abstractFactory1.createVehicle().run();
           AbstractFactory abstractFactory2 = new Factory2();
           abstractFactory2.createVehicle().run();
           abstractFactory2.createDrinks().prices();
    }
}
abstract  class AbstractFactory{
     /**
      * 生产交通工具的工厂
      */
     public abstract  Vehicle createVehicle();
    /**
     * 生产饮料的工厂
     */
     public abstract  Drinks createDrinks();
}

class  Factory1 extends AbstractFactory{

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Drinks createDrinks() {
        return new WaterDrinks();
    }
}

class Factory2 extends AbstractFactory{

    @Override
    public Vehicle createVehicle() {
        return new Boat();
    }

    @Override
    public Drinks createDrinks() {
        return new ColaDrinks();
    }
}
