package chapterone.seven.five;

/**
 * @ClassName: Run
 * @description: TODO
 * @author: alan
 * @date: 2019-07-19 20:11
 * @version: V1.0
 **/
public class Run {

    public static void main(String[] args){
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
            /**
             *java.lang.InterruptedException: sleep interrupted
             */
            //thread.interrupt();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
