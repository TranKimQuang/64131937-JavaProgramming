import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byte {
  public static void main(String[] args) {
    try (FileOutputStream fileOut = new FileOutputStream("Quang.txt")) {
      for (int i = 1; i < 127; i++) {
        fileOut.write(i);
      }
      System.out.println("File written successfully.");
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
