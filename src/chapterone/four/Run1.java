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
        /**
         * 如果将线程对象以构造参数的方式传递给Thread对象进行start()启动时，运行的结果和前面实例的结果有些差异。
         * 造成这样的差异的原因还是来自于Thread.currentThread()和this之间的差异
         * （具体解释参考：http://blog.csdn.net/yezis/article/details/57513130）
         */

    }
}
