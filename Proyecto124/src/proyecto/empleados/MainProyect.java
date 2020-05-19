package proyecto.empleados;

import javax.swing.JOptionPane;

public class MainProyect {

  public String completeName, address, jobTitle;
  public static int selected;
  public static int val;
  public static double gananciasE = 500, pagoHora = 3.00;

  public static void main(String[] args) {

    while (selected != 0) {

      try {
        String employeeType = JOptionPane.showInputDialog(null,
            "************************\nSeleccione le tipo de empleado:\n1.- Empleado de planta"
                + "\n2.- Empleado por destajo\n" + "3.- Empleado por hora\n"
                + "0.- Salir del Pedido\n************************",
            "*****EMPLEADOS*****", JOptionPane.PLAIN_MESSAGE);
        selected = Integer.parseInt(employeeType);

        String completeName = JOptionPane.showInputDialog(null,
            "ingrese el nombre completo del empleado", JOptionPane.PLAIN_MESSAGE);
        String address = JOptionPane.showInputDialog(null, "ingrese la direccion del empleado",
            JOptionPane.PLAIN_MESSAGE);
        String jobTitle = JOptionPane.showInputDialog(null,
            "ingrese el nombre del puesto del empleado", JOptionPane.PLAIN_MESSAGE);


        switch (selected) {
          case 1:


            String employeeTypeP = JOptionPane.showInputDialog(null,
                "***********\n Tipo de empleado de planta: \n 1. Empleado de planta aministrativo:"
                    + "\n2.Empleado de planta operativo",
                JOptionPane.PLAIN_MESSAGE);

            int emType = Integer.parseInt(employeeTypeP);

            String antiguedad = JOptionPane.showInputDialog(null,
                "ingrese la antiguedad del empleado", JOptionPane.PLAIN_MESSAGE);

            if (emType == 1) {


              PlantEmployee obj = new PlantEmployee(completeName, address, jobTitle, antiguedad,
                  gananciasE, pagoHora);

            } else {

              String horasL = JOptionPane.showInputDialog(null,
                  "ingrese la cantidad de horas trabajadas del empleado",
                  JOptionPane.PLAIN_MESSAGE);
              int horasT = Integer.parseInt(horasL);

              PlantEmployee obj =
                  new PlantEmployee(completeName, address, jobTitle, antiguedad, pagoHora, horasT);

            }

            break;
          case 2:

            String products = JOptionPane.showInputDialog(null,
                "ingrese la cantidad de productos elaborados", JOptionPane.PLAIN_MESSAGE);
            int productE = Integer.parseInt(products);
            String Cproducts = JOptionPane.showInputDialog(null,
                "ingrese el costo de los productos", JOptionPane.PLAIN_MESSAGE);
            int CproductE = Integer.parseInt(Cproducts);

            CommissionEmployee CommissionEmployee =
                new CommissionEmployee(completeName, address, jobTitle, productE, CproductE);
            //
            break;
          case 3:

            String horasL = JOptionPane.showInputDialog(null,
                "ingrese la cantidad de horas trabajadas del empleado", JOptionPane.PLAIN_MESSAGE);
            int horasT = Integer.parseInt(horasL);
            String pagoH = JOptionPane.showInputDialog(null,
                "ingrese el pago por hora", JOptionPane.PLAIN_MESSAGE);
            int pagoHo = Integer.parseInt(pagoH);
            
            HourlyEmployee HourlyEmployee = new HourlyEmployee(completeName, address, jobTitle, pagoHo, horasT);

            break;
          case 0:
            JOptionPane.showMessageDialog(null, "fin del Programa!");
            break;
          default:
            JOptionPane.showMessageDialog(null, "Opcion no Reconocida");
            break;
        }

      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Uoop! Error!");
      }
    }
  }

}
