package chapterone.five;

/**
 * @ClassName: MyThread
 * @description: TODO
 * @author: alan
 * @date: 2019-07-16 11:43
 * @version: V1.0
 **/
public class MyThread2 extends Thread {

    public void run() {
        try {
            System.out.println("run threadName="+this.currentThread().getName()+" begin="+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadName="+this.currentThread().getName()+" end="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
