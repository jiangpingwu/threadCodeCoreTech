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
        for(int i = 0;i <5000000;i++) {
            if(this.interrupted()) {
                System.out.println(this.getName()+" 已经是停止的状态! 我要退出了！");
                break;
            }
            System.out.println(this.getName()+" i="+(i+1));
        }
    }

}
