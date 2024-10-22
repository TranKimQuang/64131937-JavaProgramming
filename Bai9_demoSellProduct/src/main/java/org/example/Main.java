package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
    String strConn = "jdbc:mysql://localhost:3306/demosellproduct" ;
    Connection conn = DriverManager.getConnection(strConn, "root", "");
    System.out.println("haha");
    String sqlSelect = "select * from Product";
    Statement lenh= conn.createStatement();
    ResultSet ketQua= lenh.executeQuery(sqlSelect);
    while (ketQua.next()){
      int id =ketQua.getInt(1);
      String nameP = ketQua.getString(2);
      String priceP = ketQua.getString(3);
      String describeP = ketQua.getString(4);
      System.out.println(id + " ~ " + nameP + " ~ " + priceP + " ~ " + describeP);

    }

  }
}