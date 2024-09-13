package Bai4;

import java.util.Scanner;

public class BMI {
  public static void main(String[] args) {
    float w,h,BMI;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the weight in kilograms: ");
    w = sc.nextFloat();
    System.out.print("Enter the height in Meters: ");
    h = sc.nextFloat();
    BMI = w/(h*h);
    System.out.println("BMI is "+BMI);
    if (BMI < 18.5)
      System.out.println("Underweight");
    if (BMI >= 18.5 && BMI <= 24.9)
      System.out.println("Normal");
    if(BMI >= 25.9 && BMI <= 29.9)
      System.out.println("Overweight");
    else
      System.out.println("Obese");

  }
}
