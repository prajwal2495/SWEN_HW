import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Problem03 {

    public Problem03() throws IOException {
    }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String website = null;

        System.out.println("Enter a website URL:");
        website = scanner.nextLine();
        website = "HTTP://"+website;

        URL url = null;
        try {
            url = new URL(website);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        URLConnection urlConnection = null;
        try {
            urlConnection = url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            urlConnection.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }



        InputStream inputStream = null;
        try {
            inputStream = urlConnection.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }


        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);



        String line = null;
        while(true){
            try {
                line = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(line == null){
                break;
            }
            System.out.println(line);
        }
    }
}

