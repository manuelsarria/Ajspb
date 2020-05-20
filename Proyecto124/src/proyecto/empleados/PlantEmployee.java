package proyecto.empleados;

public class PlantEmployee extends Employee {

	public String antiguedad;
	public double companyEarnings, salHora, bono = 50, total;
	public int horasT;

	// Empleado administrativo
	public PlantEmployee(String name, String direccion, String puesto, String telefono, double companyEarnings,
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
				"\n tipo de empleado : " + "Administrativo"+
				"\n Salario total: " + salAdministrativo() ;
		
		return cadena;
	}

}
