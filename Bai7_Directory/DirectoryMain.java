import java.util.HashMap;
import java.util.Scanner;

public class DirectoryMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    HashMap<String,String> directory = new HashMap<>();
    directory.put("hello","xin chao");
    directory.put("goodbye","tam biet");
    directory.put("company","cong ty");
    directory.put("enterprise","doanh nghiep");
    directory.put("desk","ban lam viec");
    directory.put("plug","phich cam");
    directory.put("universe","vu tru");
    directory.put("fight","chien dau");
    directory.put("keyboard","ban phim");
    directory.put("graveyard","khu mo");
    System.out.println("nhap tu khoa can tim: ");
    String key = scanner.nextLine();
    System.out.println(directory.get(key));

  }
}
