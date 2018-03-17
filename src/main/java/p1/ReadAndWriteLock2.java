package p1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by jiangry01 on 2018/3/4.
 */
public class ReadAndWriteLock2 {
    ReentrantReadWriteLock rrwl = new ReentrantReadWriteLock();

    /**
     * 读操作
     * @param thread
     */
    public void get(Thread thread) {
        rrwl.readLock().lock();
        try {
            long start = System.currentTimeMillis();
            System.out.println("开始时间:  " +start);
            System.out.println("读操作开始..................");
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "  正在读取文件..............");
            }
            System.out.println("读操作完毕..................");
            long end = System.currentTimeMillis();
            System.out.println("结束时间:  " + end);
            System.out.println("用时:  "+ (end - start));
        } finally {
            rrwl.readLock().unlock();
        }
    }

    /**
     * 写操作
     * @param thread
     */
    public void set(Thread thread){
        rrwl.writeLock().lock();
        try{
            System.out.println("开始时间:  "+System.currentTimeMillis());
            System.out.println("写操作开始..................");
            for(int i=0;i<5;i++){
                try{
                    Thread.sleep(2000);
                }catch(Exception e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"  正在写入文件..............");
            }
            System.out.println("写操作完毕..................");
            System.out.println("结束时间:  "+System.currentTimeMillis());
        }finally {
            rrwl.writeLock().unlock();
        }
    }
    public static void main(String args[]){
        final ReadAndWriteLock2 lock = new ReadAndWriteLock2();
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

    }
}
