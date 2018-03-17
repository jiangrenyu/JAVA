package pattern.factory;

/**
 * 工厂模式
 * Created by jiangry01 on 2018/3/16.
 */

/**
 * 定义工厂接口
 */
interface IFactory{

}

/**
 * 定义一个抽象产品类（交通工具）
 */
abstract  class   Vehicle{
    public abstract void run();
}

/**
 * 另一个抽象产品类
 */
abstract  class  Drinks{
    public abstract void prices();
}

/**
 * 具体的产品类
 */
class Car extends  Vehicle{
    @Override
    public void run(){
         System.out.println("小汽车......");
    }
}

class Bicycle  extends  Vehicle{
    @Override
    public void run(){
        System.out.println("自行车......");
    }
}

class Boat extends  Vehicle{
    @Override
    public void run(){
        System.out.println("船......");
    }
}
class ColaDrinks extends Drinks{
    @Override
    public void prices() {
        System.out.println("可口可乐......");
    }
}
class WaterDrinks extends Drinks{
    @Override
    public void prices() {
        System.out.println("矿泉水......");
    }
}

public class SimpleFactory {

    public static final int CA = 1;
    public static final int BY = 2;
    public static final int BO = 3;

    public Vehicle create(int type){
        switch (type){
            case CA:
                return  new Car();
            case BY:
                return  new Bicycle();
            case BO:
                return  new Boat();
            default:
                return new Car();
        }

    }

   public static void main(String args[]){
        Vehicle vehicle = new SimpleFactory().create(1);
        vehicle.run();
   }
}

class A{

}

class B{

}
