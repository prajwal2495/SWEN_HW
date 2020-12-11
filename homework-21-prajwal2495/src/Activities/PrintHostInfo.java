package Activities;

import java.io.IOException;
import java.net.InetAddress;

/**
 * @author Prajwal Krishna.
 * Beginning of the class PrintHostInfo.
 */
public class PrintHostInfo {
    /**
     * main() method
     * experimenting on the functions of the InetAddress to get the information on the local host
     * @param args, default arguments
     * @throws IOException, handling IOException that is being thrown by all the network related classes
     */
    public static void main(String[] args) throws IOException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.getHostName());
        System.out.println(localHost.getHostAddress());
        System.out.println();

        InetAddress localHostByName = InetAddress.getByName("panda");
        System.out.println(localHostByName.getHostName());
        System.out.println(localHostByName.getHostAddress());
        System.out.println();


        InetAddress localHostByLoopBackAddress = InetAddress.getByName("127.0.0.1");
        System.out.println(localHostByLoopBackAddress.getHostName());
        System.out.println(localHostByLoopBackAddress.getHostAddress());
    }
}
