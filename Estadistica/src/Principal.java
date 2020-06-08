import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Principal {
  
  public static void main(String[] args) throws NumberFormatException, IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("ingresa la longitud del rectangulo");
    double width = Double.parseDouble(br.readLine());
    System.out.println("ingresa el color");
    String color = br.readLine();
    System.out.println("ingresa el ancho del rectangulo");
    double length = Double.parseDouble(br.readLine());
    System.out.println("ingresa la base del triangulo");
    double base = Double.parseDouble(br.readLine());
    System.out.println("ingresa la altura del triangulo");
    double height = Double.parseDouble(br.readLine());   
    
    
    Shape obj = new Rectangle(color, length, width);
    Shape obj1 = new Triagle(color, base, height);
    
    
    double smo = (obj.calcularArea() - obj1.calcularArea()); 
    System.out.println("el area sombreada es :" + smo);
  }

}
