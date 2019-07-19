package chapterone.seven.five;

/**
 * @ClassName: MyThread
 * @description: TODO
 * @author: alan
 * @date: 2019-07-19 20:10
 * @version: V1.0
 **/
public class MyThread extends Thread {
    private int i=0;

    @Override
    public void run() {
        try {
            while(true){
                i++;
                System.out.println("i="+i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
