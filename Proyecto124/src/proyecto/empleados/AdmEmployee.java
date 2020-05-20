package proyecto.empleados;

public class AdmEmployee extends Employee {

	public double companyEarnings, salHora, total;
	public double bono = 50;

	public AdmEmployee(String name, String direccion, String puesto, String telefono, double companyEarnings,
			double hourlyWage) {
		super(name, direccion, puesto, telefono);
		setCompanyEarnings(companyEarnings);
		setSalHora(hourlyWage);
		Impresion();
	}

	public double getSalHora() {
		return salHora;
	}

	public void setSalHora(double hourlyWage) {
		if (hourlyWage > 0.0)
			salHora = hourlyWage;
		else
			throw new IllegalArgumentException("El salario por hora debe ser mayor a 0");
	}

	public double getCompanyEarnings() {
		return companyEarnings;
	}

	public void setCompanyEarnings(double companyEarnings) {
		this.companyEarnings = companyEarnings;
	}

	public double porcent(double earnings) {

		return (earnings * 0.02);
	}

	public double salAdministrativo() {

		total = (40 * getSalHora() + bono) + porcent(getCompanyEarnings());
		return total - super.calcImpuesto(total);
	}

	String Impresion( ) {
		String cadena = super.Impresion()+ 
				"\n Horas trabajadas: " + "40"+
				"\n bono de antiguedad : " + bono +
				"\n tipo de empleado : " + "Empleado de planta Administrativo"+
				"\n Salario total: " + salAdministrativo() ;
		
		return cadena;
	}

}
