package chapterone.three;

/**
 * @ClassName: Run
 * @description: TODO
 * @author: alan
 * @date: 2019-07-15 19:34
 * @version: V1.0
 **/
public class Run2 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        //myThread.run();
        /**
         * 由第一个实验可以看出：Mythread的构造函数是被main函数调用的，而run（）方法是被名称为Thread-0调用的
         *
         * 由第二个实验可以看出：直接调用run()的话，则调用者名称为main
         */
    }
}
