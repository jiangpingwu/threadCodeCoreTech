package chapterone.two.three;

/**
 * @ClassName: MyThread2
 * @description: TODO
 * @author: alan
 * @date: 2019-07-10 19:57
 * @version: V1.0
 **/
public class MyThread2 extends Thread {
    private int i = 5;
    //synchronized public void run() {
        public void run() {
        //代码i--由前面项目中单独一行运行改成在当前项目中在println()方法中直接进行打印
        /**
         * 虽然println（）内部是同步的，但i--的操作却是在进入println（）之前发生的。
         * 所以为了防止非线程安全问题，还是应该继续使用同步方法
         */
        System.out.println("i="+(i--)+"  threadName="+Thread.currentThread().getName());
    }
}
