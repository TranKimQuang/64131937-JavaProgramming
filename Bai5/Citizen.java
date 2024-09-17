package Bai5;

public class Citizen {
  // Fields
  private String name;
  private String DoB;
  private String Nationality;
  private String Gender;
  private String Id;

  // Constructor
  public Citizen(String name, String doB, String gender, String id, String nationality) {
    this.name = name;
    this.DoB = doB;
    this.Gender = gender;
    this.Id = id;
    this.Nationality = nationality;
  }
  public Citizen() {}

  // Getter and Setter methods
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDoB() {
    return DoB;
  }

  public void setDoB(String doB) {
    this.DoB = doB;
  }

  public String getGender() {
    return Gender;
  }

  public void setGender(String gender) {
    this.Gender = gender;
  }

  public String getNationality() {
    return Nationality;
  }

  public void setNationality(String nationality) {
    this.Nationality = nationality;
  }

  public String getId() {
    return Id;
  }

  public void setId(String id) {
    this.Id = id;
  }

  // Override toString method
  @Override
  public String toString() {
    return "Citizen{" +
        "name='" + name + '\'' +
        ", DoB='" + DoB + '\'' +
        ", Nationality='" + Nationality + '\'' +
        ", Gender='" + Gender + '\'' +
        ", Id='" + Id + '\'' +
        '}';
  }
}
