package chapterone.seven.two;

/**
 * @ClassName: Run
 * @description: TODO
 * @author: alan
 * @date: 2019-07-16 15:50
 * @version: V1.0
 **/
public class Run2 {

    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1？ =  "+Thread.interrupted());
        System.out.println("是否停止2？ =  "+Thread.interrupted());
        System.out.println("end");
    }
}
