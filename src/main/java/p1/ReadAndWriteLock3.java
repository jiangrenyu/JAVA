package p1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by jiangry01 on 2018/3/4.
 */
public class ReadAndWriteLock3 {
    ReentrantReadWriteLock rrwl = new ReentrantReadWriteLock();

    public static void main(String args[]){
        final ReadAndWriteLock3 lock = new ReadAndWriteLock3();
        //创建N个线程，用于读操作
        ExecutorService es1 = Executors.newCachedThreadPool();
        es1.execute(new Runnable() {
            public void run() {
                lock.writeFile(Thread.currentThread());
            }
        });
        //创建N个线程,用于写操作
        ExecutorService es2 = Executors.newCachedThreadPool();
        es2.execute(new Runnable() {
            public void run() {
                lock.writeFile(Thread.currentThread());
            }
        });

    }

    /**
     * 读操作
     * @param thread
     */
    public  void readFile(Thread thread){
        rrwl.readLock().lock();
        boolean readLock = rrwl.isWriteLocked();
        if(!readLock){
          System.out.println("当前为读锁.......");
        }
        try{
           for(int i=0;i<5;i++){
               Thread.sleep(1000);
               System.out.println("正在进行读操作.......");
           }
           System.out.println("读操作完毕..........");
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("释放读锁......");
            rrwl.readLock().unlock();
        }
    }

    /**
     *
     * @param thread
     */
    public void writeFile(Thread thread){
        rrwl.writeLock().lock();
        boolean writeLock = rrwl.isWriteLocked();
        if(writeLock){
            System.out.println("当前为写锁.......");
        }
        try{
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                System.out.println("正在进行写操作.......");
            }
            System.out.println("写操作完毕..........");
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("释放写锁......");
            rrwl.writeLock().unlock();
        }
    }
}
