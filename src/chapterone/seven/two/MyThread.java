package chapterone.seven.two;

/**
 * @ClassName: MyThread
 * @description: TODO
 * @author: alan
 * @date: 2019-07-16 15:38
 * @version: V1.0
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        for(int i = 0;i <500000;i++) {
            //System.out.println("i="+(i+1));
        }
    }

}
