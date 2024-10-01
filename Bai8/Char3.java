import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Char3 {
  public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("Quang.txt");
    BufferedReader br = new BufferedReader(fr);
    String dong1 = br.readLine();
    System.out.println(dong1);
  }
}
