//package HomeWork.Bai1;
//
//
//
//import java.awt.*;
//import java.util.Scanner;
//import java.util.ArrayList;
//public class MenuDisplay {
//  public static void main(String[] args) {
//    ArrayList<Menu> bookList = new ArrayList<>();
//    Scanner sc = new Scanner(System.in);
//    int choice;
//    do{
//      //menu display
//      System.out.println("Welcome to the Book Display");
//      System.out.println("1. Add Book");
//      System.out.println("2. Display Book");
//      System.out.println("3. Caculate Average Price");
//      System.out.println("4. Exit");
//      System.out.println("Enter your choice: ");
//      choice = sc.nextInt();
//      switch(choice) {
//        case 1:
//          //Them sach
//          addNewBook(bookList, sc);
//          break;
//        case 2:
//          //hien thi sach
//          displayBook(bookList);
//          break;
//        case 3:
//          //Hien thi danh sach voi gia trung binh
//          displayBooksWithAveragePrice(bookList);
//          break;
//        case 4:
//          //thoat
//          System.out.println("Goodbye!");
//          break;
//        default:
//          System.out.println(
//              "Please enter a valid option!");
//
//      }
//
//    }
//    while (choice!=4);
//    sc.close();
//  }
//  private static void addNewBook(ArrayList<Menu> bookList, Scanner sc) {
//    sc.nextLine();
//    System.out.println("Enter title: ");
//    String title = sc.nextLine();
//    System.out.println("Enter author: ");
//    String author = sc.nextLine();
//    System.out.println("Enter publishDate: ");
//    String publishDate = sc.nextLine();
//    System.out.println("Enter language: ");
//    String language = sc.nextLine();
//    int[] priceList = new int[5];
//    System.out.println("Enter 5 prices: ");
//    for (int i = 0; i < 5; i++) {
//      System.out.println("Enter price #" + (i + 1) + ": ");
//      priceList[i] = sc.nextInt();
//    }
//    //Tao sach moi
//    Book nb= new Book();
//        bookList = addNewBook();
//    System.out.println("adding complete! ");
//
//
//
//  }
//  private static void displayBook(ArrayList<Menu> bookList) {
//    if (bookList.isEmpty()) {
//      System.out.println("No books found!");
//    }
//    else {
//      for (Menu book : bookList) {
//        Menu.display();
//      }
//    }
//  }
//  //DPA
//  private static void displayBooksWithAveragePrice(ArrayList<Menu> bookList) {
//    if (bookList.isEmpty()) {
//      System.out.println("No books found!");
//
//    }
//    else {
//
//      Menu.calculateAveragePrice();
//    Menu.display();
//    }
//  }
//
//}
