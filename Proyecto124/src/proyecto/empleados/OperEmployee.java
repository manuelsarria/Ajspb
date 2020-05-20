package proyecto.empleados;

public class OperEmployee extends Employee {

	public double salHora, total;
	public double bono = 50;
	public int horasT;

	public OperEmployee(String name, String direccion, String puesto, String telefono, int horasTra, double PagoH) {
		super(name, direccion, puesto, telefono);
		setSalHora(PagoH);
		setHorasT(horasTra);
		Impresion();
	}

	public double getSalHora() {
		return salHora;
	}

	public void setSalHora(double PagoH) {
		if (PagoH > 0.0)
			salHora = PagoH;
		else
			throw new IllegalArgumentException("El salario por hora debe ser mayor a 0");
	}

	public int getHorasT() {
		return horasT;
	}

	public void setHorasT(int horasT) {
		this.horasT = horasT;
	}

	public double salOperativo() {
		
		if (getHorasT() <= 40) {
			
			total = (getSalHora() * getHorasT() + bono);
			return (total - super.calcImpuesto(total));
			
		} else {
			total = (40 * getHorasT()) + ((getHorasT() - 40) * getSalHora() * 2.0);
			return (total - super.calcImpuesto(total));
		}
	}
	
	String Impresion( ) {
		String cadena = super.Impresion()+ 
				"\n Horas trabajadas: " + getHorasT() +
				"\n bono de antiguedad : " + bono +
				"\n tipo de empleado : " + " Empleado de planta Operativo"+
				"\n Salario total: " + salOperativo() ;
		
		return cadena;
	}

}
