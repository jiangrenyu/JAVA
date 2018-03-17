package p1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by jiangry01 on 2018/3/4.
 */
public class ReadAndWriteLock1 {

    public synchronized void get(Thread thread){
          long start = System.currentTimeMillis();
          System.out.println("开始时间:  "+start);
          System.out.println("读操作开始..................");
          for(int i=0;i<5;i++){
              try{
                  Thread.sleep(2000);
              }catch(Exception e){
                  e.printStackTrace();
              }
              System.out.println(Thread.currentThread().getName()+"  正在读取文件..............");
          }
          System.out.println("读操作完毕..................");
          long end = System.currentTimeMillis();
          System.out.println("结束时间:  "+ end);
          System.out.println("用时: "+(end-start));
    }

    public static void main(String args[]){
          final ReadAndWriteLock1 lock = new ReadAndWriteLock1();
          //final ReadAndWriteLock1 lock1 = new ReadAndWriteLock1();
          //long start = System.currentTimeMillis();
          new Thread(new Runnable() {
              public void run() {
                  lock.get(Thread.currentThread());
              }
          }).start();

          new Thread(new Runnable() {
              public void run() {
                  lock.get(Thread.currentThread());
              }
          }).start();
          //long end = System.currentTimeMillis();
          //System.out.println("用时:  " + (end - start));

    }
}
