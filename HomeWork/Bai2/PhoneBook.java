package HomeWork.Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// PhoneBook class extending Phone
public class PhoneBook extends Phone {
  // Inner class to represent a phone entry
  class PhoneEntry {
    String name;
    String phones; // Multiple phone numbers stored in a single string

    PhoneEntry(String name, String phones) {
      this.name = name;
      this.phones = phones;
    }

    @Override
    public String toString() {
      return "Name: " + name + ", Phones: " + phones;
    }
  }

  // List to store phone entries
  private ArrayList<PhoneEntry> PhoneList = new ArrayList<>();

  // Insert phone method
  @Override
  public void insertPhone(String name, String phone) {
    for (PhoneEntry entry : PhoneList) {
      if (entry.name.equalsIgnoreCase(name)) {
        if (!entry.phones.contains(phone)) {
          entry.phones += ": " + phone;
          System.out.println("Phone number added to existing contact.");
        } else {
          System.out.println("Phone number already exists.");
        }
        return;
      }
    }
    PhoneList.add(new PhoneEntry(name, phone));
    System.out.println("Contact added.");
  }

  // Remove phone method
  @Override
  public void removePhone(String name) {
    for (PhoneEntry entry : PhoneList) {
      if (entry.name.equalsIgnoreCase(name)) {
        PhoneList.remove(entry);
        System.out.println("Contact removed.");
        return;
      }
    }
    System.out.println("Contact not found.");
  }

  // Update phone method
  @Override
  public void updatePhone(String name, String newphone) {
    for (PhoneEntry entry : PhoneList) {
      if (entry.name.equalsIgnoreCase(name)) {
        entry.phones = newphone;
        System.out.println("Phone number updated.");
        return;
      }
    }
    System.out.println("Contact not found.");
  }

  // Search phone method
  @Override
  public void searchPhone(String name) {
    for (PhoneEntry entry : PhoneList) {
      if (entry.name.equalsIgnoreCase(name)) {
        System.out.println(entry);
        return;
      }
    }
    System.out.println("Contact not found.");
  }

  // Sort method
  @Override
  public void sort() {
    Collections.sort(PhoneList, new Comparator<PhoneEntry>() {
      @Override
      public int compare(PhoneEntry o1, PhoneEntry o2) {
        return o1.name.compareToIgnoreCase(o2.name);
      }
    });
    System.out.println("Phonebook sorted.");
  }

  // Method to display the phonebook
  public void displayPhoneBook() {
    if (PhoneList.isEmpty()) {
      System.out.println("Phonebook is empty.");
    } else {
      for (PhoneEntry entry : PhoneList) {
        System.out.println(entry);
      }
    }
  }
}

