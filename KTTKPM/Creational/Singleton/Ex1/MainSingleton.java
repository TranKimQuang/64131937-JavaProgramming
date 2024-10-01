package Creational.Singleton.Ex1;

public class MainSingleton {
  public static void main(String[] args) {
    MySingleton ms1 = MySingleton.getInstance();
    MySingleton ms2 = MySingleton.getInstance();
    ms1.countPrint();
    ms1.countPrint();
    ms2.countPrint();
    ms1.countPrint();
  }
}
