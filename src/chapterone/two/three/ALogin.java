package chapterone.two.three;

/**
 * @ClassName: ALogin
 * @description: TODO
 * @author: alan
 * @date: 2019-07-10 19:26
 * @version: V1.0
 **/
public class ALogin extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+": ALogin running");
        LoginServlet.doPost("a", "aa");
    }
}
