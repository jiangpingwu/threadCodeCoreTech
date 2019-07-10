package chapterone.two.three;

/**
 * @ClassName: Test1
 * @description: TODO
 * @author: alan
 * @date: 2019-07-04 20:05
 * @version: V1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1();
        Thread a = new Thread(myThread,"A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        /**
         * 会出现非线程安全的情况:
         * 非线程安全问题（随机）：主要是指多个线程对同一个对象中的同一个实例变量进行操作时会出现值被更改、
         * 值不同步的情况，进而影响程序的执行流程
         *
         * 某些JVM中，i--的操作分成三步：
         *
         * 1）取得原有的i值
         *
         * 2）计算i-1
         *
         * 3）对i进行赋值
         *
         * 在这三个步骤中，如果有多个线程同时访问，那么一定会出现非线程安全问题
         */
        System.out.println("main");
    }
}
