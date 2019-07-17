package chapterone.seven.three;

/**
 * @ClassName: Run
 * @description: TODO
 * @author: alan
 * @date: 2019-07-17 14:57
 * @version: V1.0
 **/
public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread= new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
            System.out.println(thread.getName()+" thread.interrupt");
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }

        System.out.println("end");
    }
}
