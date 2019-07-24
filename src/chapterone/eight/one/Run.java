package chapterone.eight.one;

/**
 * @ClassName: Run
 * @description: TODO
 * @author: alan
 * @date: 2019-07-19 20:31
 * @version: V1.0
 **/
public class Run {

    public static void main(String[] args){
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(5000);
            //A段
            thread.suspend();
            System.out.println("A= " + System.currentTimeMillis() + " i= "+thread.getI());
            Thread.sleep(5000);
            System.out.println("A= " + System.currentTimeMillis() + " i= "+thread.getI());

            //B段
            thread.resume();
            System.out.println("B= " + System.currentTimeMillis() + " i= "+thread.getI());
            Thread.sleep(5000);
            System.out.println("B= " + System.currentTimeMillis() + " i= "+thread.getI());

            //C段
            thread.suspend();
            System.out.println("C= " + System.currentTimeMillis() + " i= "+thread.getI());
            Thread.sleep(5000);
            System.out.println("C= " + System.currentTimeMillis() + " i= "+thread.getI());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
