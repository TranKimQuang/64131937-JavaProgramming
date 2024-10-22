import java.io.FileReader;
import java.io.IOException;

public class Char2 {
  public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("quang.txt");
    char[] buf = new char[15];
    fr.read(buf);
    for (int i = 0; i < buf.length; i++)
      System.out.print(buf[i]);
  }
}
