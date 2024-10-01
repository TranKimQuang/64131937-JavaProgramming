package Creational.BuilderPattern.Ex3;

public class Computer {
  private String cpu;
  private String ram;
  private String screen;
  private String hardDisk;

  public Computer(Builder builder) {
    this.cpu = builder.cpu;
    this.ram = builder.ram;
    this.screen = builder.screen;
    this.hardDisk = builder.hardDisk;
  }

  @Override
  public String toString() {
    return "Computer{" +
        "CPU='" + cpu + '\'' +
        ", RAM='" + ram + '\'' +
        ", SCREEN='" + screen + '\'' +
        ", Hard Disk='" + hardDisk + '\'' +
        '}';
  }

  public static class Builder {
    private String cpu;
    private String ram;
    private String screen;
    private String hardDisk;

    public Builder setCpu(String cpu) {
      this.cpu = cpu;
      return this;
    }

    public Builder setRam(String ram) {
      this.ram = ram;
      return this;
    }

    public Builder setScreen(String screen) {
      this.screen = screen;
      return this;
    }

    public Builder setHardDisk(String hardDisk) {
      this.hardDisk = hardDisk;
      return this;
    }

    public Computer build() {
      return new Computer(this);
    }
  }
}
