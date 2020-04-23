package Limonada;

import javax.swing.JOptionPane;

public class mainLimonada {

	static int selectLimonada = -1;

	public static void main(String[] args) {

		conAzucar obj1 = new conAzucar();
		sinAzucar obj2 = new sinAzucar();
		int vas = 1;

		while (selectLimonada != 0) {

			try {
				String limonada = JOptionPane.showInputDialog(null,
						"************************\nElige opción:\n1.- Limonada sin Azucar"
								+ "\n2.- Limonada con azucar\n" + "3.- Totales\n"
								+ "0.- Salir del Pedido\n************************",
						"*****LIMONADAS*****", JOptionPane.PLAIN_MESSAGE);

				selectLimonada = Integer.parseInt(limonada);

				switch (selectLimonada) {
				case 1:
					if (vas > 0) {

						String ventV = JOptionPane.showInputDialog(null, "cuantos vasos de Limonada sin azucar desea",
								"*****LIMONADAS*****", JOptionPane.PLAIN_MESSAGE);
						obj2.setVentaVasos(Integer.parseInt(ventV));
						obj2.calcularPrecio();
						obj2.totalVasosUtilizados();
//						total = (int) (total + obj2.calcularPrecio());
//						vasos = (int) (vasos - obj2.totalVasosUtilizados());

					} else {
						
						JOptionPane.showMessageDialog(null,"ya no hay mas vasos regrese pronto..");
					}

					break;
				case 2:
					
					String ventV = JOptionPane.showInputDialog(null, "cuantos vasos de Limonada con azucar desea",
							"*****LIMONADAS*****", JOptionPane.PLAIN_MESSAGE);
					obj1.setVentaVasos(Integer.parseInt(ventV));
					String ventA = JOptionPane.showInputDialog(null, "cuantas cucaharadas de azucar por Limonada desea",
							"*****LIMONADAS*****", JOptionPane.PLAIN_MESSAGE);
					obj1.setAzucarUsada(Integer.parseInt(ventA));
					total = (int) (total + obj1.calcularPrecio());
					vasos = (int) (vasos - obj1.totalVasosUtilizados());
					azucar = (int) (azucar - obj1.totalAzucar());
					
					break;
				case 3:
					
					JOptionPane.showMessageDialog(null,"Total Dinero es: " + total + "\n Vasos Consumidos es: " + (100-vasos) + 
							"\n Azucar Cosumida es: "+ obj1.totalAzucar(azucar));
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