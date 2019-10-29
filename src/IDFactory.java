
public class IDFactory {

    private static int orderNum;

    public static int getID() {
        return orderNum++;
    }

}
