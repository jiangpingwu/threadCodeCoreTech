package chapterone.five;

/**
 * @ClassName: Run
 * @description: TODO
 * @author: alan
 * @date: 2019-07-16 11:43
 * @version: V1.0
 **/
public class Run {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("begin = " +System.currentTimeMillis());
        myThread.run();
        //myThread.start();
        System.out.println("end = " +System.currentTimeMillis());

    }
}
