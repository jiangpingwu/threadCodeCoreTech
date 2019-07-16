package chapterone.four;

/**
 * @ClassName: MyThread
 * @description: TODO
 * @author: alan
 * @date: 2019-07-15 19:57
 * @version: V1.0
 **/
public class MyThread extends Thread {

    public void run() {
        System.out.println("run="+this.isAlive());
    }
}
