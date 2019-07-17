package chapterone.seven.four;

/**
 * @ClassName: Run
 * @description: TODO
 * @author: alan
 * @date: 2019-07-17 15:46
 * @version: V1.0
 **/
public class Run {

    public static void main(String[] args){
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        }catch (Exception e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("main end");
    }
}
