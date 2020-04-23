package Limonada;

public class sinAzucar {
	
	public int vasos, ventaVasos;
	public static double total;
	
	  public sinAzucar() {
	    vasos = 100;
	    total = total + total;
	  }
	  

	  public double calcularPrecio() {
	    
	    vasos = vasos-ventaVasos;
	    return 0.45*ventaVasos;
	    
	  }
	  
	  public int totalVasosUtilizados() {
	    
	    return (100 - vasos);
	    
	  }
	  
	  public double totalCost() {
		    
		    total = total + calcularPrecio();
		    return total;
		    
	  }


	  public void setVentaVasos(int ventaVasos) {
	    this.ventaVasos = ventaVasos;
	  }

}