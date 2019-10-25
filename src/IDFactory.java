
public class IDFactory {

    private static int bestillingsID;

    public static int getID() {
        return bestillingsID++;
    }

}
