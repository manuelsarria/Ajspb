package proyecto.empleados;

import javax.swing.JOptionPane;

public class MainProyect {

	public String completeName, address, jobTitle;
	public static int selected;
	public static int val;

	public static void main(String[] args) {

		while (selected != 0) {

			try {
				String employeeType = JOptionPane.showInputDialog(null,
						"************************\nSeleccione le tipo de empleado:\n1.- Empleado de planta"
								+ "\n2.- Empleado por destajo\n" + "3.- Empleado por hora\n"
								+ "0.- Salir del Pedido\n************************",
						"*****EMPLEADOS*****", JOptionPane.PLAIN_MESSAGE);
				selected = Integer.parseInt(employeeType);
				
				String completeName = JOptionPane.showInputDialog(null, "ingrese el nombre completo del empleado",
						JOptionPane.PLAIN_MESSAGE);
				String address = JOptionPane.showInputDialog(null, "ingrese la direccion del empleado",
						JOptionPane.PLAIN_MESSAGE);
				String jobTitle = JOptionPane.showInputDialog(null, "ingrese el nombre del puesto del empleado",
						JOptionPane.PLAIN_MESSAGE);


				switch (selected) {
				case 1:
					

					String employeeTypeP = JOptionPane.showInputDialog(null,
							"***********\n Tipo de empleado de planta: \n 1. Empleado de planta aministrativo:"
									+ "\n2.Empleado de planta operativo",
							JOptionPane.PLAIN_MESSAGE);
					int emType = Integer.parseInt(employeeTypeP);
					
					if (emType == 1) {
						
						
						
					}

//					if (vas > 0) {
//
//						String ventV = JOptionPane.showInputDialog(null, "cuantos vasos de Limonada sin azucar desea",
//								"*****LIMONADAS*****", JOptionPane.PLAIN_MESSAGE);
//						obj2.setVentaVasos(Integer.parseInt(ventV));
//						obj2.calcularPrecio();
//						obj2.totalVasosUtilizados();
//						total = (int) (total + obj2.calcularPrecio());
//						vasos = (int) (vasos - obj2.totalVasosUtilizados());
//
//					} else {
//
//						JOptionPane.showMessageDialog(null, "ya no hay mas vasos regrese pronto..");
//					}

					break;
				case 2:
					String ventV = JOptionPane.showInputDialog(null, "cuantos vasos de Limonada sin azucar desea",
							"*****LIMONADAS*****", JOptionPane.PLAIN_MESSAGE);
					int sinAzucar = Integer.parseInt(ventV);
					venta = obj.calcularPrecio(sinAzucar);
					JOptionPane.showMessageDialog(null, "Su compra fue procesada, total a pagar: " + venta);
					ventasTotales = ventasTotales + venta;
//
//					String ventV = JOptionPane.showInputDialog(null, "cuantos vasos de Limonada con azucar desea",
//							"*****LIMONADAS*****", JOptionPane.PLAIN_MESSAGE);
//					obj1.setVentaVasos(Integer.parseInt(ventV));
//					String ventA = JOptionPane.showInputDialog(null, "cuantas cucaharadas de azucar por Limonada desea",
//							"*****LIMONADAS*****", JOptionPane.PLAIN_MESSAGE);
//					obj1.setAzucarUsada(Integer.parseInt(ventA));
//					total = (int) (total + obj1.calcularPrecio());
//					vasos = (int) (vasos - obj1.totalVasosUtilizados());
//					azucar = (int) (azucar - obj1.totalAzucar());

					break;
				case 3:

					JOptionPane.showMessageDialog(null,
							"Total Dinero es: " + ventasTotales + "\n Vasos Consumidos es: "
									+ obj.totalVasosUtilizados() + "\n Cucharadas de azucar cosumida es: "
									+ obj.totalAzucarUtilizada());
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Pedido Terminado!");
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
