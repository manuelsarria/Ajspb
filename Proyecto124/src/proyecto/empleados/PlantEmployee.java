package proyecto.empleados;

public class PlantEmployee extends Employee {

	public String antiguedad;
	public double companyEarnings, salHora;
	public int horasT;
	
	// Empleado administrativo
	public PlantEmployee(String name, String direccion, String puesto, String antiguedad, double companyEarnings,
			double hourlyWage) {
		super(name, direccion, puesto);
		setCompanyEarnings(companyEarnings);
		setAntiguedad(antiguedad);
		setSalHora(hourlyWage);
	}
	// Empleado operativo
	public PlantEmployee(String name, String direccion, String puesto, String antiguedad, double hourlyWage,
			int horasT) {
		super(name, direccion, puesto);
		setAntiguedad(antiguedad);
		setSalHora(hourlyWage);
		setHorasT(horasT);
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

	public String getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getCompanyEarnings() {
		return companyEarnings;
	}

	public void setCompanyEarnings(double companyEarnings) {
		this.companyEarnings = companyEarnings;
	}

	public int getHorasT() {
		return horasT;
	}

	public void setHorasT(int horasT) {
		this.horasT = horasT;
	}

	@Override
	public double earnings() {

		if (companyEarnings > 0) {
			return (getCompanyEarnings() * 0.2) + (40 * getSalHora()) - (((getCompanyEarnings() * 0.2) * 40) * 0.5);
		} else {

			if (getHorasT() <= 40)
				return getSalHora() * getHorasT();
			else
				return 40 * getHorasT() + (getHorasT() - 40) * getSalHora() * 2.0
						- ((40 * getHorasT() + (getHorasT() - 40) * getSalHora() * 2.0) * 0.5);
		}

	}
	
	@Override
	public String toString() {
		return String.format("Empleado de planta: %s\n%s: $%,.2f; %s: %,.2f",
				super.toString() + " salario " + earnings());
	}

}
