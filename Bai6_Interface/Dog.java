package Bai6;

public class Dog implements In_Animal {
  private String name;
  private int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public void sound(){
    System.out.println("wof wof");
  }

  @Override
  public String toString() {
    return "Dog{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
