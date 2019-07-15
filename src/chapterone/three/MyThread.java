package chapterone.three;

/**
 * @ClassName: MyThread
 * @description: TODO
 * @author: alan
 * @date: 2019-07-15 19:34
 * @version: V1.0
 **/
public class MyThread extends Thread {

    public MyThread() {
        System.out.println("构造方法的打印： "+Thread.currentThread().getName());
    }
    public void run() {
        System.out.println("run方法打印："+Thread.currentThread().getName());
    }
}
