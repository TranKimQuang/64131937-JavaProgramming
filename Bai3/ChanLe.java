package Bai3;

import java.util.Scanner;

public class ChanLe {
  public static void main(String[] args) {
    int a;
    Scanner sc = new Scanner(System.in);
    System.out.println("Type a number: ");
    a = sc.nextInt();
    if (a%2==0)
      System.out.println(a+" is even");
    else
      System.out.println(a+" is odd");
    System.out.println("Bye");

  }
}
