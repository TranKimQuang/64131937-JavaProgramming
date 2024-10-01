import java.io.FileWriter;
import java.io.IOException;

public class Char {
  public static void main(String[] args) throws IOException {
    FileWriter fw;
    fw = new FileWriter("Quang.txt");
    fw.write("Than em vua trang lai vua tron");
    fw.write("Bay noi ba chim voi nuoc non");
    fw.flush();
    fw.close();
  }
}
