package proyecto.empleados;

import javax.swing.JOptionPane;

public class MainProyect {

	public static String completeName, address, jobTitle, phone;
	static int selected = -1;
	public static double gananciasE, pagoHora, nominaEmp = 0, bono, horasT;

	public static void main(String[] args) {

		while (selected != 0) {

			try {

				String employeeType = JOptionPane.showInputDialog(null,
						"************************\nSeleccione le tipo de empleado:\n1.- Empleado de planta"
								+ "\n2.- Empleado por destajo\n" + "3.- Empleado por hora\n" + "4.-Imprimir planilla\n"
								+ "0.- Salir del Pedido\n************************",
						"*****EMPLEADOS*****", JOptionPane.PLAIN_MESSAGE);
				selected = Integer.parseInt(employeeType);

				if (selected == 1 || selected == 2 || selected == 3 || selected == 4) {

					completeName = JOptionPane.showInputDialog(null, "ingrese el nombre completo del empleado",
							JOptionPane.PLAIN_MESSAGE);
					address = JOptionPane.showInputDialog(null, "ingrese la direccion del empleado",
							JOptionPane.PLAIN_MESSAGE);
					jobTitle = JOptionPane.showInputDialog(null, "ingrese el nombre del puesto del empleado",
							JOptionPane.PLAIN_MESSAGE);
					phone = JOptionPane.showInputDialog(null, "ingrese el numero de telefono del empleado",
							JOptionPane.PLAIN_MESSAGE);
				}

				switch (selected) {
				case 1:

					String employeeTypeP = JOptionPane.showInputDialog(null,
							"***********\n Seleccione el Tipo de empleado de planta: \n 1. Empleado de planta aministrativo:"
									+ "\n2.Empleado de planta operativo",
							JOptionPane.PLAIN_MESSAGE);

					int emType = Integer.parseInt(employeeTypeP);

					if (emType == 1) {

						String hourlyWage = JOptionPane.showInputDialog(null, "ingrese el pago por hora",
								JOptionPane.PLAIN_MESSAGE);
						double pagoHora = Double.parseDouble(hourlyWage);

						String companyEarnings = JOptionPane.showInputDialog(null,
								"ingrese las ganancias de la empresa", JOptionPane.PLAIN_MESSAGE);
						double gananciasE = Double.parseDouble(companyEarnings);

						String bonoE = JOptionPane.showInputDialog(null, "ingrese el bono", JOptionPane.PLAIN_MESSAGE);
						double bono = Double.parseDouble(bonoE);

						AdmEmployee AdmEmployee = new AdmEmployee(completeName, address, jobTitle, phone, gananciasE,
								pagoHora, bono);

						JOptionPane.showMessageDialog(null, AdmEmployee.Impresion());
						nominaEmp = nominaEmp + AdmEmployee.salAdministrativo();

					} else if (emType == 2) {

						String horasTra = JOptionPane.showInputDialog(null,
								"ingrese la cantidad de horas trabajadas del empleado", JOptionPane.PLAIN_MESSAGE);
						int horasT = Integer.parseInt(horasTra);

						String pagoH = JOptionPane.showInputDialog(null, "ingrese el pago por hora",
								JOptionPane.PLAIN_MESSAGE);
						double pagoHora = Double.parseDouble(pagoH);

						String bonoOperative = JOptionPane.showInputDialog(null, "ingrese el bono",
								JOptionPane.PLAIN_MESSAGE);

						double bono = Double.parseDouble(bonoOperative);

						OperEmployee OperEmployee = new OperEmployee(completeName, address, jobTitle, phone, horasT,
								pagoHora, bono);
						JOptionPane.showMessageDialog(null, OperEmployee.Impresion());
						nominaEmp = nominaEmp + OperEmployee.salOperativo();

					} else {

						JOptionPane.showMessageDialog(null, "Opcion invalida!");

					}

					break;
				case 2:

					String products = JOptionPane.showInputDialog(null, "ingrese la cantidad de productos elaborados",
							JOptionPane.PLAIN_MESSAGE);
					double productE = Double.parseDouble(products);

					String Cproducts = JOptionPane.showInputDialog(null, "ingrese el costo de los productos",
							JOptionPane.PLAIN_MESSAGE);
					double CproductE = Double.parseDouble(Cproducts);

					DestEmployee DestEmployee = new DestEmployee(completeName, address, jobTitle, phone, productE,
							CproductE);
					JOptionPane.showMessageDialog(null, DestEmployee.Impresion());
					nominaEmp = nominaEmp + DestEmployee.salDestajo();

					break;
				case 3:

					String hoursWorked = JOptionPane.showInputDialog(null,
							"ingrese la cantidad de horas trabajadas del empleado", JOptionPane.PLAIN_MESSAGE);
					double horasT = Double.parseDouble(hoursWorked);
					String pagoH = JOptionPane.showInputDialog(null, "ingrese el pago por hora",
							JOptionPane.PLAIN_MESSAGE);
					double pagoHora = Double.parseDouble(pagoH);

					HourlyEmployee HourlyEmployee = new HourlyEmployee(completeName, address, jobTitle, phone, pagoHora,
							horasT);
					JOptionPane.showMessageDialog(null, HourlyEmployee.Impresion());
					nominaEmp = nominaEmp + HourlyEmployee.salHours();

					break;

				case 4:
					JOptionPane.showMessageDialog(null, "El total de planilla es: $" + nominaEmp);
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
