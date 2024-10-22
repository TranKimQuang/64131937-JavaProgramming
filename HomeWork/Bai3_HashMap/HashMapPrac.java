package HomeWork.Bai3;

import java.util.HashMap;

public class HashMapPrac {
  public static void main(String[] args) {
    //khoi tao
    HashMap <Integer,String> map = new HashMap <>();
    HashMap <Integer,Float> map2 = new HashMap <>();
    //khai bao cac phan tu
    map.put(3,"trai cam");
    map.put(5,"trai buoi");
    map2.put(5, 1.2F);
    //lay gia tri
    String value1 = map.get(3);
    String value2 = map.get(5);
    Float value3 = map2.get(5);
    System.out.println(value1);
    System.out.println(value2);
    System.out.println(value3);
    // xoa phan tu
    map.remove(3,"trai cam");
    System.out.println(map.get(3));
    // kiem tra 1 phan tu trong hashmap co ton tai khong
    boolean check = map.containsKey(3);
    System.out.println(check);
    // kiem tra 1 gia tri co ton tai trong hashmap khong
    boolean checkVL = map.containsValue("trai buoi");
    System.out.println(checkVL);
    // kiem tra hashmap co rong khong
    boolean isEmpty = map.isEmpty();
    System.out.println(isEmpty);
    //lay so luong phan tu
    int  soLuongPT = map.size();
    System.out.println(soLuongPT);
    //duyet hashmap
    for (Integer key : map.keySet()) {
      String vl = map.get(key);
      System.out.println(key + " : " + vl);
    }

  }
}
