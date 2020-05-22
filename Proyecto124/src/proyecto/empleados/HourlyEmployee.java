package proyecto.empleados;

public class HourlyEmployee extends Employee {

	private double wage, hours;

	public HourlyEmployee(String name, String direccion, String puesto, String phone, double horasTra,
			double hoursWorked) {

		super(name, direccion, puesto, phone);
		setWage(horasTra);
		setHours(hoursWorked);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double horasTra) {

		if (horasTra > 0.0)
			wage = horasTra;
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

	public double salHours() {

		return (getHours() * getWage());
	}

	String Impresion() {
		String cadena = super.Impresion() + "\n Horas trabajadas: " + getHours() + "\n tipo de empleado : "
				+ " Empleado por hora" + "\n Salario total: " + salHours();

		return cadena;
	}

}
