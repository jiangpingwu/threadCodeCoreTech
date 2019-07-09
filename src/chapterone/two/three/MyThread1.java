package chapterone.two.three;

/**
 * @ClassName: MyThread1
 * @description: TODO
 * @author: alan
 * @date: 2019-07-04 20:04
 * @version: V1.0
 **/
public class MyThread1 extends Thread {
    private int count = 5;

    @Override
    public void run() {
        super.run();
        //此实例不要用for语句，因为使用同步后其他线程就得不到运行的机会了
        count--;
        System.out.println("由"+this.currentThread().getName()+"计算，count="+count);

    }
}
