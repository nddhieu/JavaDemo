package topic.URL;
/**
 * this demonstrate
 *  element of URL
 * how to read URLconnectionStream by convert bytestream to readable stream
 * read content of InputStream ( - byte stream)
 * read contet of BufferedReader (- readable content which is converted from byte to char)
 */

import com.sun.xml.internal.messaging.saaj.util.CharReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://mail.google.com/mail/u/0/?tab=wm#inbox");
        readPartOfURL(url);
/**
 * read content of a URL stream as source code
 * there are multiple step to read url-> openConnection --> InputStream -->InputStreamReader -->BufferedReader
 * step 1: open connection to URL by using URLConnection class
 * step 2: convert urlConnection as HttpURLCOnnection
 * step 3: get inputStream (basic input stream) from connection, then wrap into InputStreamReader (bridge byte stream to char) then wrap to BufferReader for reading content
 * step 4: read content in BufferedReader
 */
//demonstrate the content of InputStream
    readContentURLConnectionStream(url);
    readURLstreamByBufferReader(url);
}

    private static void readContentURLConnectionStream(URL url) throws IOException {
        // step 1
        URLConnection urlConnection = url.openConnection();
        //step 2
        HttpURLConnection connection = (HttpURLConnection) urlConnection;
        //step 3
        InputStream inputStream = connection.getInputStream(); // input Stream is the abstract class which is superclass of all classes representing* an input stream of bytes.
        InputStreamReader inStream = new InputStreamReader(inputStream);  // InputStreamReader is the bridge between the byte stream to character stream
        // demonstrate the content of InputStreamReader
        System.out.println("reading inputStream - bytestream...");
        int inputStreamReader;
        while ((inputStreamReader = inStream.read()) !=-1){
            System.out.print(inputStreamReader);
        }


    }

    private static void readURLstreamByBufferReader(URL url) throws IOException {
        // step 1
        URLConnection urlConnection = url.openConnection();
        //step 2
        HttpURLConnection connection = (HttpURLConnection) urlConnection;
        InputStreamReader inStream1 = new InputStreamReader(connection.getInputStream());
        BufferedReader in = new BufferedReader(inStream1); // for efficiency of reading the stream, wrap inputStreamReader to BufferReader - will easier to read and more function
        //step 4
        // read BufferedReader stream - readable content
        String current;
        String urlString = "";

        System.out.println("convert inputStreamReader to BufferReader to read content");

        while ((current = in.readLine()) != null){
            System.out.println(current);
        }
    }

    private static void readPartOfURL(URL url) {
        System.out.println("URL is " + url.toString());
        System.out.println("protocol is " + url.getProtocol());
        System.out.println("authority is " + url.getAuthority());
        System.out.println("file name is " + url.getFile());
        System.out.println("host is " + url.getHost());
        System.out.println("path is " + url.getPath());
        System.out.println("port is " + url.getPort());
        System.out.println("default port is " + url.getDefaultPort());
        System.out.println("query is " + url.getQuery());
        System.out.println("ref is " + url.getRef());
    }

}
