package chapterone.two.two;

/**
 * @ClassName: Run
 * @description: TODO
 * @author: alan
 * @date: 2019-07-04 19:58
 * @version: V1.0
 **/
public class Run {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        /**
         * 构造函数Thread(Runnable target)意味着不光可以传入runnable接口的对象，还可以传入Thread类的对象，
         * 这样做完全可以将一个Thread对象的run（）方法交给其他线程进行调用
         */
        System.out.println("运行结束");
    }
}
