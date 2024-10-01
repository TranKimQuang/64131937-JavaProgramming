package Creational.BuilderPattern.Ex1;

public class Computer {
  String cpu, ram, storage, screen;

  protected Computer(Builder b){
    this.cpu = b.cpu;
    this.ram = b.ram;
    this.storage = b.storage;
    this.screen = b.screen;

}
public static class Builder {
  private String cpu, ram, storage, screen;

  public Builder buildCpu(String cpu) {
    this.cpu = cpu;
    return this;
  }


  public Builder buildRAM(String ram) {
    this.ram = ram;
    return this;
  }


  public Builder buildstorage(String storage) {
    this.storage = storage;
    return this;
  }

  public Builder buildScreen(String screen) {
    this.screen = screen;
    return this;
  }
  public Computer build(){
    return new Computer(this);
  }


}
  @Override
  public String toString() {
    return "Builder{" +
        "cpu='" + cpu + '\'' +
        ", ram='" + ram + '\'' +
        ", storage='" + storage + '\'' +
        ", screen='" + screen + '\'' +
        '}';
  }
}
