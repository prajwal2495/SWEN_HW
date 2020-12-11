package Activities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author Prajwal Krishna.
 * Beginning of the class GooglePrinter.
 */

public class GooglePrinter {

    /**
     * main() method
     * experimenting on the functions of the URL to get the information on the given URL
     * @param args, default arguments
     * @throws IOException, handling IOException that is being thrown by all the network related classes
     */
    public static void main(String[] args) throws IOException {
        URL googleUrl = new URL("https://www.google.com");
        URLConnection googleUrlConnect = googleUrl.openConnection();

        googleUrlConnect.connect();

        InputStream inputStream = googleUrlConnect.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        while(true){
            line = bufferedReader.readLine();
            if(line == null){
                break;
            }
            System.out.println(line);
        }
    }
}
