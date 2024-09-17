package Bai5;

public class MainCitizen {
  public static void main(String[] args) {
    Citizen c1 = new Citizen();
    c1.setName("Putin");
    c1.setGender("male");
    c1.setDoB("11/03/1965");
    c1.setId("112");
    c1.setNationality("Russia");
    Citizen c0 = new Citizen("Trần Kim Quang","11/02/2004","male","123","VietNam");
    System.out.println(c0.toString());
    System.out.println(c1.toString());


  }
}
