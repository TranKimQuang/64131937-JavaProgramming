package HomeWork.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainManager {
  public static void main(String[] args) {
    ArrayList<Book> bookList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int choice;
    do {
      // Hiển thị menu
      System.out.println("Welcome to the Book Display");
      System.out.println("1. Add Book");
      System.out.println("2. Display Book");
      System.out.println("3. Calculate Average Price");
      System.out.println("4. Exit");
      System.out.println("Enter your choice: ");
      choice = sc.nextInt();

      switch (choice) {
        case 1:
          // Thêm sách mới
          addNewBook(bookList, sc);
          break;
        case 2:
          // Hiển thị danh sách sách
          displayBook(bookList);
          break;
        case 3:
          // Hiển thị danh sách với giá trung bình
          displayBooksWithAveragePrice(bookList);
          break;
        case 4:
          // Thoát
          System.out.println("Goodbye!");
          break;
        default:
          System.out.println("Please enter a valid option!");
      }
    } while (choice != 4);
    sc.close();
  }

  // Thêm sách mới
  private static void addNewBook(ArrayList<Book> bookList, Scanner sc) {
    sc.nextLine(); // Clear buffer
    System.out.println("Enter title: ");
    String title = sc.nextLine();
    System.out.println("Enter author: ");
    String author = sc.nextLine();
    System.out.println("Enter publishDate: ");
    String publishDate = sc.nextLine();
    System.out.println("Enter language: ");
    String language = sc.nextLine();

    int[] priceList = new int[5];
    System.out.println("Enter 5 prices: ");
    for (int i = 0; i < 5; i++) {
      System.out.println("Enter price #" + (i + 1) + ": ");
      priceList[i] = sc.nextInt();
    }

    // Tạo sách mới
    Book newBook = new Book(title, author, publishDate, language, priceList);
    bookList.add(newBook);
    System.out.println("Adding complete!");
  }

  // Hiển thị danh sách sách
  private static void displayBook(ArrayList<Book> bookList) {
    if (bookList.isEmpty()) {
      System.out.println("No books found!");
    } else {
      for (Book book : bookList) {
        book.display();
      }
    }
  }

  // Hiển thị sách với giá trung bình
  private static void displayBooksWithAveragePrice(ArrayList<Book> bookList) {
    if (bookList.isEmpty()) {
      System.out.println("No books found!");
    } else {
      for (Book book : bookList) {
        book.calculateAveragePrice();
        book.display();
      }
    }
  }
}