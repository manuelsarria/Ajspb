
public class Triagle extends Shape {
  
  private double base, height;
  
  public Triagle(String color,double base, double height) {
    super(color);
    this.base = base;
    this.height = height;
  }
  
   @Override
  public int getArea() {
    // TODO Auto-generated method stub
    return super.getArea();
  } 

  @Override
  double calcularArea() {
    
    return (base * height)/2;
  }
  
  

}
