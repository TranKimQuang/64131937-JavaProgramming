package Bai4;

import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMI {
  public static void main(String[] args) {
    float w = 0, h = 0, BMI = 0;
    Scanner sc = new Scanner(System.in);

    boolean validInput = false;

    // Xử lý nhập cân nặng
    while (!validInput) {
      System.out.print("Enter the weight in kilograms: ");
      try {
        w = sc.nextFloat();
        validInput = true; // Đầu vào hợp lệ, thoát vòng lặp
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number for weight.");
        sc.next(); // Xóa đầu vào không hợp lệ
      }
    }

    validInput = false; // Reset cho chiều cao

    // Xử lý nhập chiều cao
    while (!validInput) {
      System.out.print("Enter the height in meters: ");
      try {
        h = sc.nextFloat();
        if (h <= 0) {
          throw new IllegalArgumentException("Height must be greater than zero.");
        }
        validInput = true; // Đầu vào hợp lệ, thoát vòng lặp
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number for height.");
        sc.next(); // Xóa đầu vào không hợp lệ
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }
    while (!validInput) {
      System.out.print("Enter the weight in kilograms: ");
      try {
        w = sc.nextFloat();
        if (w <= 0) {
          throw new IllegalArgumentException("Weight must be greater than zero.");
        }
        validInput = true; // Đầu vào hợp lệ, thoát vòng lặp
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number for weight.");
        sc.next(); // Xóa đầu vào không hợp lệ
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }
    BMI = w / (h * h);
    System.out.println("BMI is " + BMI);

    if (BMI < 18.5)
      System.out.println("Underweight");
    else if (BMI >= 18.5 && BMI <= 24.9)
      System.out.println("Normal");
    else if (BMI >= 25.0 && BMI <= 29.9)
      System.out.println("Overweight");
    else
      System.out.println("Obese");

    sc.close();
  }
}
