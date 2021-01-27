package utilities;
/*
We will create and store utility methods for repeated steps t
hat can be used in browsers, and store in the class
 */
public class BrowserUtils {

    public static void  sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
