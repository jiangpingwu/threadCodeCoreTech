package chapterone.seven.four;

/**
 * @ClassName: Run
 * @description: TODO
 * @author: alan
 * @date: 2019-07-17 15:46
 * @version: V1.0
 **/
public class Run1 {

    public static void main(String[] args){
        MyThread1 thread = new MyThread1();
        thread.start();
        thread.interrupt();
        System.out.println("main end");
    }
}
