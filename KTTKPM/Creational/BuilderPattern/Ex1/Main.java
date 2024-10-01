package Creational.BuilderPattern.Ex1;


public class Main {
  public static void main(String[] args) {
    Computer c = new Computer.Builder()
        .buildCpu("RTX 3080")
        .buildRAM("512GB")
        .buildstorage("2TB")
        .buildScreen("LG 312 inch 8K")
        .build();
    System.out.println(c.toString());
  }
}
