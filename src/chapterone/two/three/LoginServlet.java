package chapterone.two.three;

/**
 * @ClassName: LoginServlet
 * @description: TODO
 * @author: alan
 * @date: 2019-07-10 19:25
 * @version: V1.0
 **/
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;

    synchronized public static void doPost(String username,String password) {
    //public static void doPost(String username,String password) {
        try {
            usernameRef = username;
            if(username.equals("a")) {
                System.out.println(Thread.currentThread().getName()+": usernameRef="+usernameRef+"       passwordRef="+passwordRef);
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println(Thread.currentThread().getName()+": usernameRef="+usernameRef+"       passwordRef="+passwordRef);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
