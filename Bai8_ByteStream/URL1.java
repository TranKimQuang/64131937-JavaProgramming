
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URL1 {
  public static void main(String[] args) throws IOException {
    URL url = new URL("https://ntu.edu.vn/default.aspx");
    URLConnection connection = url.openConnection();
    InputStream inputStream = connection.getInputStream();
    InputStreamReader ir = new InputStreamReader(inputStream);
    BufferedReader bufRead = new BufferedReader(ir);
    String line;
    while (true)
    {
      line = bufRead.readLine();
      if (line==null) break;
      System.out.println(line);
    }
  }

}