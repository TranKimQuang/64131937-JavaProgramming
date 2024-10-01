import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Byte2 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = null;
    fis = new FileInputStream("quang.txt");
    int byteRead;
    while (true){
    byteRead = fis.read();
    if(byteRead == -1){
      break;
    }
      System.out.println((char)byteRead);
    }
    System.out.println("done.");
  }
}
