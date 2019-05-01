/**
 * @author : liupu.
 * @date : 2019/05/01
 */
public class Test {

    public static void show() {
        long startTime = System.currentTimeMillis();
        System.out.println("Hello World");
        long stayTime = System.currentTimeMillis() - startTime;
        System.out.println("== method cost time = " + stayTime + " ===");
    }
}
