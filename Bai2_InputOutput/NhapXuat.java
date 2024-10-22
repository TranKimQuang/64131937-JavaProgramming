package Bai2;

import java.util.Scanner;

public class NhapXuat {
  public static void main(String[] args) {
//khai bao cac bien can thiet
    int a,b,tong;
    //chuan bi nhap du lieu
    Scanner banPhim = new Scanner(System.in);
    //Nhap du lieu
    System.out.println("Nhap a: ");
    a=banPhim.nextInt();
    System.out.println("Nhap b: ");
    b=banPhim.nextInt();
    tong = a + b;
    System.out.println("Tong a va b la: " + tong);


  }
}
