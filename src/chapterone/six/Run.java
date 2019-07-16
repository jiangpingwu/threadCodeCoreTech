package chapterone.six;

/**
 * @ClassName: Run
 * @description: TODO
 * @author: alan
 * @date: 2019-07-16 14:51
 * @version: V1.0
 **/
public class Run {

    public static void main(String[] args) {
        Thread runThrad = Thread.currentThread();
        System.out.println(runThrad.getName() + " | "+runThrad.getId());

    }
}
