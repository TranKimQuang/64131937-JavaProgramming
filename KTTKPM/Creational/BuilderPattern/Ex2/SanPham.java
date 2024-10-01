package Creational.BuilderPattern.Ex2;

import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.Map;

public class SanPham {
  private String maSP,tenSP;
  private int soLuongSP;
  private double giaSP;

  public SanPham(String maSP, String tenSP, int soLuongSP, double giaSP) {
    this.maSP = maSP;
    this.tenSP = tenSP;
    this.soLuongSP = soLuongSP;
    this.giaSP = giaSP;
  }
  public String getMaSP() {
    return maSP;
  }

  public void setMaSP(String maSP) {
    this.maSP = maSP;
  }

  public String getTenSP() {
    return tenSP;
  }

  public void setTenSP(String tenSP) {
    this.tenSP = tenSP;
  }

  public int getSoLuongSP() {
    return soLuongSP;
  }

  public void setSoLuongSP(int soLuongSP) {
    this.soLuongSP = soLuongSP;
  }

  public double getGiaSP() {
    return giaSP;
  }

  public void setGiaSP(double giaSP) {
    this.giaSP = giaSP;
  }

  @Override
  public String toString() {
    return "SanPham{" +
        "maSP='" + maSP + '\'' +
        ", tenSP='" + tenSP + '\'' +
        ", soLuongSP=" + soLuongSP +
        ", giaSP=" + giaSP +
        '}';
  }
}


