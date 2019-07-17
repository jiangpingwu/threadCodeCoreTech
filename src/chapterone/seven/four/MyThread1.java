package chapterone.seven.four;

/**
 * @ClassName: MyThread
 * @description: TODO
 * @author: alan
 * @date: 2019-07-17 15:43
 * @version: V1.0
 **/
public class MyThread1 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for(int i=0; i<100000; i++){
                System.out.println("i=1"+(i+1));
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        }catch (InterruptedException e){
            System.out.println("先停止！再遇到sleep！进入catch！");
            e.printStackTrace();
        }
    }

}
