
public abstract class Shape {
  
  private String color;
  public int area;
  
  public Shape(String color) {
    this.color = color;
  }
  
  
  public int getArea() {
    return area;
  }
  public void setArea(int area) {
    this.area = area;
  }
  
  @Override
  public String toString() {
    return "color=" + color + ", area=" + area + "";
  }
  
  
  abstract double calcularArea();


}
