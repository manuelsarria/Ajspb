import com.sun.java.util.jar.pack.Package.File;

public class Archivos {
  
  
   public static void main(String[] args) {
     
     int opc = 1;
     
     switch (opc) {
       case 1:
         System.out.println("El nombre del archivo");
         File f = new File("C:\\User\\folder\\Name.txt");
         System.out.println(f.getName());
         break;
       case 2:
         System.out.println("el camino relactivo");
         File file = new File("properties\\files\\Name.txt");
         break;
       case 3:
         System.out.println("el camino absoluto");
         File f = new File("name.txt"); 
         System.out.println(f.getAbsolutePath());
         break;
       case 4:
         System.out.println("si el archivo se puede leer");
         break;
       case 5:
         System.out.println("si el archivo se puede escribir");
         break;
       case 6:
         System.out.println("El tamaño del archivo");
         break;
       case 7:
         System.out.println("renombrar un archivo");
         break;
       case 8:
         System.out.println("eliminar");
         break;
       default:
         System.out.println("opcion incorrecta");
         break;
     }
    
  }

}
