package chapterone.seven.two;

/**
 * @ClassName: Run
 * @description: TODO
 * @author: alan
 * @date: 2019-07-16 15:50
 * @version: V1.0
 **/
public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread= new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            //Thread.currentThread().interrupt();
            /**
             * this.interrupted();是static方法，测试当前线程是否已经中断，当前线程是指运行this.interrupted()方法的线程
             */
            System.out.println("是否停止1？ =  "+thread.interrupted());
            System.out.println("是否停止2？ =  "+thread.interrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
