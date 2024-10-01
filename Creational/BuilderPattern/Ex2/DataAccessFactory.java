package Creational.BuilderPattern.Ex2;

public class DataAccessFactory {
  public static DataAccess createDataAccess(String type) {
    if ("Type1".equalsIgnoreCase(type)) {
      return DataAccess.getInstance();
    }else if ("Type2".equalsIgnoreCase(type)) {
    }
    return null;

  }
}
