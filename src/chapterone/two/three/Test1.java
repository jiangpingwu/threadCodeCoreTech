package chapterone.two.three;

/**
 * @ClassName: Test1
 * @description: TODO
 * @author: alan
 * @date: 2019-07-04 20:05
 * @version: V1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1();
        Thread a = new Thread(myThread,"A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        /**
         * 会发生并发情况
         */
        System.out.println("main");
    }
}
