package proyecto.empleados;

public class HourlyEmployee extends Employee {

	private double wage, hours; // salario por hora

	public HourlyEmployee(String name, String direccion, String puesto, double hourlyWage, double hoursWorked) {
		
		super(name, direccion, puesto);
		setWage(hourlyWage);
		setHours(hoursWorked);
	}
	
	

	public double getWage() {
		return wage;
	}



	public void setWage(double hourlyWage) {

		if (hourlyWage > 0.0)
			wage = hourlyWage;
		else
			throw new IllegalArgumentException("El salario por hora debe ser mayor a 0");
	}



	public double getHours() {
		return hours;
	}



	public void setHours(double hoursWorked) {
		if ((hoursWorked > 0.0) && (hoursWorked <= 60))
			hours = hoursWorked;
		else
			throw new IllegalArgumentException("Las horas trabajadas deben ser mayor a 0 y menor o igual a 60");
	}



	@Override
	public double earnings() {
		if (getHours() <= 40) // no trabajo horas extras
			return getWage() * getHours();
		else
			return 40 * getWage() + (getHours() - 40) * getWage() * 2.0;
	}
	
	@Override
	public String toString() {
		return String.format("Empleado por hora: %s\n%s: $%,.2f; %s: %,.2f",
				super.toString() + " salario por hora " + getWage());
	}

}
