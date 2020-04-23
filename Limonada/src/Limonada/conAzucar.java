package Limonada;

public class conAzucar extends sinAzucar{

	private int azucarUsada, azucar;

	public conAzucar() {
		azucar = 80;
	}

	public double calcularPrecio() {

		vasos = vasos - ventaVasos;
		return 0.50 * ventaVasos;

	}

	public int totalVasosUtilizados() {
		
		return (100 - vasos);

	}

	public int totalAzucar() {
		return azucarUsada * ventaVasos;
	}
	
	public int totalAzucar(int Tazucar) {
		
		return azucar - Tazucar;
	}

	public int getVentaVasos() {
		return ventaVasos;
	}

	public void setVentaVasos(int ventaVasos) {
		this.ventaVasos = ventaVasos;
	}

	public void setAzucarUsada(int azucarUsada) {
		this.azucarUsada = azucarUsada;
	}

}
