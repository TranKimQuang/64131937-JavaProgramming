package HomeWork.Bai2;

import java.util.Scanner;

public class ManagePhoneBook {
  public static void main(String[] args) {
    PhoneBook phoneBook = new PhoneBook();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nPHONEBOOK MANAGEMENT SYSTEM");
      System.out.println("1. Insert Phone");
      System.out.println("2. Remove Phone");
      System.out.println("3. Update Phone");
      System.out.println("4. Search Phone");
      System.out.println("5. Sort");
      System.out.println("6. Display PhoneBook");
      System.out.println("7. Exit");
      System.out.print("Choose an option: ");

      int choice = scanner.nextInt();
      scanner.nextLine();  // Consume newline

      switch (choice) {
        case 1:
          System.out.print("Enter name: ");
          String name = scanner.nextLine();
          System.out.print("Enter phone number: ");
          String phone = scanner.nextLine();
          phoneBook.insertPhone(name, phone);
          break;

        case 2:
          System.out.print("Enter name to remove: ");
          name = scanner.nextLine();
          phoneBook.removePhone(name);
          break;

        case 3:
          System.out.print("Enter name to update: ");
          name = scanner.nextLine();
          System.out.print("Enter new phone number: ");
          String newPhone = scanner.nextLine();
          phoneBook.updatePhone(name, newPhone);
          break;

        case 4:
          System.out.print("Enter name to search: ");
          name = scanner.nextLine();
          phoneBook.searchPhone(name);
          break;

        case 5:
          phoneBook.sort();
          break;

        case 6:
          phoneBook.displayPhoneBook();
          break;

        case 7:
          System.out.println("Exiting...");
          scanner.close();
          System.exit(0);

        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }
}
