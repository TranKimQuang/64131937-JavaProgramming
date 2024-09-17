package Bai6;

public class Pig implements In_Animal {
  private String name;
  private int age;

  public Pig(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public void sound(){
    System.out.println("un in un in");
  }

  @Override
  public String toString() {
    return "Pig{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}