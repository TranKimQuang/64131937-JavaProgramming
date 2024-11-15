public class Calculator {
  public double add(double a, double b) {
    return a + b;
  }

  public double subtract(double a, double b) {
    return a - b;
  }

  public double multiply(double a, double b) {
    return a * b;
  }

  public double divide(double a, double b) {
    if (b != 0) {
      return a / b;
    } else {
      throw new ArithmeticException("Division by zero");
    }
  }

  public double squareRoot(double a) {
    return Math.sqrt(a);
  }

  public double sin(double a) {
    return Math.sin(a);
  }

  public double cos(double a) {
    return Math.cos(a);
  }

  public double exp(double a) {
    return Math.exp(a);
  }

  public double ln(double a) {
    return Math.log(a);
  }

  public double log(double a) {
    return Math.log10(a);
  }
}

