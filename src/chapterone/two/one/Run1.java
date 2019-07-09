package chapterone.two.one;

/**
 * @ClassName: Run
 * @description: TODO
 * @author: alan
 * @date: 2019-07-04 19:39
 * @version: V1.0
 **/
public class Run1 {

    public static void main(String[] args){
        /**
         * start（)通知“”线程规划器“”此线程已经准备就绪，等待调用线程对象的run()，具有异步效果。
         * 如果直接调用run()，则是同步，从上到下顺序依次执行
         */
        MyThread myThread = new MyThread();
        myThread.run();
        System.out.println("main");
    }
}
