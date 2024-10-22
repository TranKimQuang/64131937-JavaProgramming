package HomeWork.Bai1;
import java.util.Scanner;

class Book implements IBook {
  // Thuộc tính
  private static int idCounter = 0; // Tự động tăng ID cho mỗi sách
  private int id;
  private String title;
  private String author;
  private String publishDate;
  private String language;
  private float averagePrice;
  private int[] priceList = new int[5];

  // Constructor mà không cần truyền `id` và `averagePrice`
  public Book(String title, String author, String publishDate, String language, int[] priceList) {
    this.id = ++idCounter;  // Tự động tăng id
    this.title = title;
    this.author = author;
    this.publishDate = publishDate;
    this.language = language;
    this.priceList = priceList;
    calculateAveragePrice(); // Tự động tính giá trung bình
  }

  // Phương thức hiển thị thông tin sách
  @Override
  public void display() {
    System.out.println("ID: " + id);
    System.out.println("Tên sách: " + title);
    System.out.println("Tác giả: " + author);
    System.out.println("Ngày xuất bản: " + publishDate);
    System.out.println("Ngôn ngữ: " + language);
    System.out.println("Giá trung bình: " + averagePrice);
    System.out.println();
  }

  // Phương thức tính giá trung bình
  public void calculateAveragePrice() {
    int sum = 0;
    for (int price : priceList) {
      sum += price;
    }
    this.averagePrice = (float) sum / priceList.length;
  }
}

