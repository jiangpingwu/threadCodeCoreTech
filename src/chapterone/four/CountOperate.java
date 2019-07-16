package chapterone.four;

/**
 * @ClassName: CountOperate
 * @description: TODO
 * @author: alan
 * @date: 2019-07-15 20:01
 * @version: V1.0
 **/
public class CountOperate extends Thread {
    public CountOperate() {
        System.out.println("CountOperation---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());
        System.out.println("this.getName()"+this.getName());
        System.out.println("this.isAlive()"+this.isAlive());
        System.out.println("CountOperation---end");
    }
    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());
        System.out.println("this.getName()"+this.getName());
        System.out.println("this.isAlive()"+this.isAlive());
        System.out.println("run---end");
    }
}
