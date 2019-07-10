package chapterone.two.three;

/**
 * @ClassName: BLogin
 * @description: TODO
 * @author: alan
 * @date: 2019-07-10 19:26
 * @version: V1.0
 **/
public class BLogin extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+": BLogin running");
        LoginServlet.doPost("b", "bb");
    }

}
