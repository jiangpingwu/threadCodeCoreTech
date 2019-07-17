package chapterone.seven.one;

/**
 * @ClassName: Run
 * @description: TODO
 * @author: alan
 * @date: 2019-07-16 15:40
 * @version: V1.0
 **/
public class Run {

    public static void main(String[] args) {
        try {
            Thread myThread= new MyThread();
            myThread.start();
            Thread.sleep(2000);
            /**
             *说明调用interrupt并没有停止线程
             */
            Thread.interrupted();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
