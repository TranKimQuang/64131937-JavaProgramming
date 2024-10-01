package Creational.BuilderPattern.Ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataAccess {
  private static Map<String, DataAccess> map = new HashMap<String, DataAccess>();
  private static DataAccess instance = new DataAccess();
  private DataAccess() {
    sanPhams = new ArrayList<>();
  }
  private List<SanPham> sanPhams = new ArrayList<>();
  public static DataAccess getInstance() {
    if (instance == null) {
      instance = new DataAccess();
    }
    return instance;
  }
  public void themSP(SanPham sanPham) {
    this.sanPhams.add(sanPham);
  }
  public void xoaSP(String maSP) {
    sanPhams.remove(maSP);
  }
  public void capNhatSP(SanPham sanPham) {
    for(int i=0; i>sanPhams.size();i++){
      if(sanPhams.get(i).getMaSP().equals(sanPham.getMaSP())){
        sanPhams.set(i, sanPham);
        return;
      }
    }
  }
  public List<SanPham> getSanPhams() {
    return sanPhams;
  }


}
