package proyecto.empleados;

public class SalariedEmployee extends Employee {

	private double basicSalary;

	public SalariedEmployee(String name, String direccion, String puesto, double salary) {

		super(name, direccion, puesto);
		setBasicSalary(salary);
	}

	public double getBasicSalary() {

		return basicSalary;
	}

	public void setBasicSalary(double salary) {

		double baseSalary;

		if (salary > 0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException("el salario basico debe ser mayor a 0");
	}

	@Override
	public String toString() {
		return String.format("Empleado asalariado: %s\n%s: $%,.2f",
				super.toString() + " salario basico " + getBasicSalary());
	}

	@Override
	public double earnings() {
		return 0;
	}

}
