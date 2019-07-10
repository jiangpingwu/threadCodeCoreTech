package chapterone.two.three;

/**
 * @ClassName: Run2
 * @description: TODO
 * @author: alan
 * @date: 2019-07-10 19:57
 * @version: V1.0
 **/
public class Run2 {

    public static void main(String[] args) {
        MyThread2 run = new MyThread2();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        Thread t4 = new Thread(run);
        Thread t5 = new Thread(run);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
