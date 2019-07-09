package chapterone.two.three;

/**
 * @ClassName: Test
 * @description: TODO
 * @author: alan
 * @date: 2019-07-04 20:02
 * @version: V1.0
 **/
public class Test {

    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
        System.out.println("main");
    }
}
