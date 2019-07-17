package chapterone.seven.three;

/**
 * @ClassName: MyThread
 * @description: TODO
 * @author: alan
 * @date: 2019-07-17 14:57
 * @version: V1.0
 **/
public class MyThread extends Thread {

    public void run() {
        super.run();
        try {
            for(int i = 0;i <5000000;i++) {
                if(this.interrupted()) {
                    System.out.println(this.getName()+" 已经是停止的状态! 我要退出了！");
                    throw new InterruptedException();
                    //break;
                }
                System.out.println(this.getName()+" i="+(i+1));
            }
            System.out.println("我在for下面");
        } catch (Exception e) {
            System.out.println("进入MyThread.java类run方法中的catch");
            e.printStackTrace();
        }
    }

}
