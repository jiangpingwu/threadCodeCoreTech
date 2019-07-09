package chapterone.two.one;

/**
 * @ClassName: Run
 * @description: TODO
 * @author: alan
 * @date: 2019-07-04 19:39
 * @version: V1.0
 **/
public class Run {

    public static void main(String[] args){
        /**
         * 在使用多线程技术时，代码的运行结果与代码执行顺序或调用顺序是无关的。
         */
        MyThread myThread = new MyThread();
        myThread.start();
        /**
         * 多次执行start()，会出现java.lang.IllegalThreadStateException异常
         * 执行start()顺序不代表线程启动的顺序。
         */
        //myThread.start();
        System.out.println("运行结束！");
    }
}
