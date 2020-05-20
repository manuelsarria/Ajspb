package proyecto.empleados;

import javax.swing.JOptionPane;

public class MainProyect {

	public static String completeName, address, jobTitle, phone;
	static int selected = -1;
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

				completeName = JOptionPane.showInputDialog(null, "ingrese el nombre completo del empleado",
						JOptionPane.PLAIN_MESSAGE);
				address = JOptionPane.showInputDialog(null, "ingrese la direccion del empleado",
						JOptionPane.PLAIN_MESSAGE);
				jobTitle = JOptionPane.showInputDialog(null, "ingrese el nombre del puesto del empleado",
						JOptionPane.PLAIN_MESSAGE);
				phone = JOptionPane.showInputDialog(null, "ingrese el numero de telefono del empleado",
						JOptionPane.PLAIN_MESSAGE);

				switch (selected) {
				case 1:

					String employeeTypeP = JOptionPane.showInputDialog(null,
							"***********\n Seleccione el Tipo de empleado de planta: \n 1. Empleado de planta aministrativo:"
									+ "\n2.Empleado de planta operativo",
							JOptionPane.PLAIN_MESSAGE);

					int emType = Integer.parseInt(employeeTypeP);

					if (emType == 1) {

						AdmEmployee AdmEmployee = new AdmEmployee(completeName, address, jobTitle, phone, gananciasE,
								pagoHora);
						JOptionPane.showMessageDialog(null, AdmEmployee.Impresion());

					} else if (emType == 2) {

						String horasL = JOptionPane.showInputDialog(null,
								"ingrese la cantidad de horas trabajadas del empleado", JOptionPane.PLAIN_MESSAGE);
						int horasT = Integer.parseInt(horasL);

						String pagoH = JOptionPane.showInputDialog(null, "ingrese el pago por hora",
								JOptionPane.PLAIN_MESSAGE);
						double pagoHo = Double.parseDouble(pagoH);

						OperEmployee OperEmployee = new OperEmployee(completeName, address, jobTitle, phone, horasT,
								pagoHo);
						JOptionPane.showMessageDialog(null, OperEmployee.Impresion());

					} else {

						JOptionPane.showMessageDialog(null, "Opcion invalida!");

					}

					break;
				case 2:

					String products = JOptionPane.showInputDialog(null, "ingrese la cantidad de productos elaborados",
							JOptionPane.PLAIN_MESSAGE);
					int productE = Integer.parseInt(products);
					String Cproducts = JOptionPane.showInputDialog(null, "ingrese el costo de los productos",
							JOptionPane.PLAIN_MESSAGE);
					int CproductE = Integer.parseInt(Cproducts);

					CommissionEmployee CommissionEmployee = new CommissionEmployee(completeName, address, jobTitle,
							phone, productE, CproductE);
					//
					break;
				case 3:

					String horasL = JOptionPane.showInputDialog(null,
							"ingrese la cantidad de horas trabajadas del empleado", JOptionPane.PLAIN_MESSAGE);
					int horasT = Integer.parseInt(horasL);
					String pagoH = JOptionPane.showInputDialog(null, "ingrese el pago por hora",
							JOptionPane.PLAIN_MESSAGE);
					int pagoHo = Integer.parseInt(pagoH);

					HourlyEmployee HourlyEmployee = new HourlyEmployee(completeName, address, jobTitle, phone, pagoHo,
							horasT);

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
