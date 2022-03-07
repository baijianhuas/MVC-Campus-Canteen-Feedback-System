package campus.canteen.until;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P {
    private static final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss-SSS");

    public static void out(Object obj) {
        System.out.println("--BJH " + format.format(new Date()) + " " + obj);
    }

    public static void outnl(Object obj) {
        System.out.printf("--BJH " + format.format(new Date()) + " " + obj);
    }
}
