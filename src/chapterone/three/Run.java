package chapterone.three;

/**
 * @ClassName: Run
 * @description: TODO
 * @author: alan
 * @date: 2019-07-15 19:42
 * @version: V1.0
 **/
public class Run {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        CountOperate countOperate = new CountOperate();
        Thread thread = new Thread(countOperate);
        thread.setName("A");
        thread.start();

    }
}
