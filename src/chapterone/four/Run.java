package chapterone.four;

/**
 * @ClassName: Run
 * @description: TODO
 * @author: alan
 * @date: 2019-07-15 19:58
 * @version: V1.0
 **/
public class Run {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("begin="+myThread.isAlive());
        myThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end="+myThread.isAlive());

    }
}
