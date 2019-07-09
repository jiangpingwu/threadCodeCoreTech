package chapterone.two.three;

/**
 * @ClassName: MyThread
 * @description: TODO
 * @author: alan
 * @date: 2019-07-04 20:01
 * @version: V1.0
 **/
public class MyThread extends Thread {
    private int count = 5;
    public MyThread(String name) {
        super();
        //设置线程名称
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while(count>0) {
            count--;
            System.out.println("由"+this.currentThread().getName()+"计算，count="+count);
        }
    }
}
