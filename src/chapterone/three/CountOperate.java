package chapterone.three;

/**
 * @ClassName: CountOperate
 * @description: TODO
 * @author: alan
 * @date: 2019-07-15 19:41
 * @version: V1.0
 **/
public class CountOperate extends Thread {
    public CountOperate() {
        System.out.println("CountOperation---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()"+this.getName());
        System.out.println("CountOperation---end");
    }
    public void run() {
        System.out.println("CountOperation---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()"+this.getName());
        System.out.println("CountOperation---end");
    }
}
