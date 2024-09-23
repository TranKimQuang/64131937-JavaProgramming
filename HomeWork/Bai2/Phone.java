package HomeWork.Bai2;
import java.util.Scanner;

// Abstract class Phone
public abstract class Phone {
  public abstract void insertPhone(String name, String phone);
  public abstract void removePhone(String name);
  public abstract void updatePhone(String name, String newphone);
  public abstract void searchPhone(String name);
  public abstract void sort();
}

