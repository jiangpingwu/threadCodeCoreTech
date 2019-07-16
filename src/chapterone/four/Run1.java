package chapterone.four;

/**
 * @ClassName: Run1
 * @description: TODO
 * @author: alan
 * @date: 2019-07-15 20:01
 * @version: V1.0
 **/
public class Run1 {

    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread thread = new Thread(countOperate);
        System.out.println("main begin t1 isAlive="+thread.isAlive());
        thread.setName("A");
        thread.start();
        System.out.println("main end t1 isAlive="+thread.isAlive());
        System.out.println("main begin countOperate isAlive="+Thread.currentThread().isAlive());
        countOperate.start();
        System.out.println("main end countOperate isAlive="+Thread.currentThread().isAlive());


    }
}
