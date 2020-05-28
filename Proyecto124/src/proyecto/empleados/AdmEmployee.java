package proyecto.empleados;

public class AdmEmployee extends Employee {

	public double companyEarnings, salHora, total;
	public double bonoEmployee;

	public AdmEmployee(String name, String direccion, String puesto, String telefono, double companyEarnings,
			double hourlyWage, double bonoE) {
		super(name, direccion, puesto, telefono);
		setCompanyEarnings(companyEarnings);
		setSalHora(hourlyWage);
		setBonoEmployee(bonoE);
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

	public double getBonoEmployee() {
		return bonoEmployee;
	}

	public void setBonoEmployee(double bonoEmployee) {
		this.bonoEmployee = bonoEmployee;
	}

	public double porcent(double earnings) {

		return (earnings * 0.02);
	}

	public double salAdministrativo() {

		total = ((40 * getSalHora()) + getBonoEmployee()) + porcent(getCompanyEarnings());
		return total - super.calcImpuesto(total);
	}

	String Impresion() {
		String cadena = super.Impresion() + "\n Horas trabajadas: " + "40" + "\n bono de antiguedad : "
				+ getBonoEmployee() + "\n tipo de empleado : " + "Empleado de planta Administrativo"
				+ "\n Salario total: " + salAdministrativo();

		return cadena;
	}

	@Override
	public double salOperativo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double salDestajo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double salHours() {
		// TODO Auto-generated method stub
		return 0;
	}

}
