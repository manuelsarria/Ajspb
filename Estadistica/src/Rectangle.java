
public class Rectangle extends Shape {
  
  private double length, width;
  
  public Rectangle(String color,double length, double width) {
    super(color);
    this.length = length;
    this.width = width;
  }
  
  @Override
  public int getArea() {
    
    return super.getArea();
  }

  @Override
  public String toString() {
    return super.toString() + "length=" + length + ", width=" + width + ", area=" + area + "";
  }

  @Override
  double calcularArea() {
     
    return length * width;
  }  

}
