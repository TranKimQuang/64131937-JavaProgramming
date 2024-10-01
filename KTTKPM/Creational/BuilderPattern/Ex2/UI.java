package Creational.BuilderPattern.Ex2;

public class UI {
  private String uiName;

  public UI(String uiName) {
    this.uiName = uiName;
  }

  public void addSanPham(SanPham sanPham) {
    DataAccess dataAccess = DataAccess.getInstance();
    dataAccess.themSP(sanPham);
    System.out.println("Thêm sản phẩm: " + sanPham);
  }

  public void removeSanPham(String maSP) {
    DataAccess dataAccess = DataAccess.getInstance();
    dataAccess.xoaSP(maSP);
    System.out.println("Xóa sản phẩm với mã: " + maSP);
  }

  public void updateSanPham(SanPham sanPham) {
    DataAccess dataAccess = DataAccess.getInstance();
    dataAccess.capNhatSP(sanPham);
    System.out.println("Cập nhật sản phẩm: " + sanPham);
  }

  public void displaySanPhams() {
    DataAccess dataAccess = DataAccess.getInstance();
    System.out.println("Danh sách sản phẩm:");
    for (SanPham sanPham : dataAccess.getSanPhams()) {
      System.out.println(sanPham);
    }
  }
}

