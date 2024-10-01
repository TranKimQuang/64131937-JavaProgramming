package Creational.BuilderPattern.Ex2;

public class DataAccessFactory {
  public static DataAccess createDataAccess(String type) {
    if ("type1".equalsIgnoreCase(type)) {
      return DataAccess.getInstance();
    }else if ("type2".equalsIgnoreCase(type)) {
    }
    return null;

  }
}
