package proyecto.empleados;

public class OperEmployee extends Employee {

	public double salHora, total;
	public double bonoOperative;
	public int horasT;

	public OperEmployee(String name, String direccion, String puesto, String telefono, int horasTra, double PagoH,
			double bono) {
		super(name, direccion, puesto, telefono);
		setSalHora(PagoH);
		setHorasT(horasTra);
		setBonoOperative(bono);
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

	public double getBonoOperative() {
		return bonoOperative;
	}

	public void setBonoOperative(double bonoOperative) {
		this.bonoOperative = bonoOperative;
	}

	public double salOperativo() {

		if ((getHorasT() <= 60) && (getHorasT() >= 0)) {

			total = ((getSalHora() * getHorasT()) + getBonoOperative());
			return (total - super.calcImpuesto(total));

		} else {

			throw new IllegalArgumentException("Las horas trabajadas deben ser mayor a 0 y menor o igual a 60");
			// String nota;
			// return nota="error vuelve a intentarlo";
			/*
			 * total = (40 * getHorasT()) + ((getHorasT() - 40) * getSalHora() * 2.0);
			 * return (total - super.calcImpuesto(total));
			 */
		}

	}

	String Impresion() {
		String cadena = super.Impresion() + "\n Horas trabajadas: " + getHorasT() + "\n bono de antiguedad : "
				+ getBonoOperative() + "\n tipo de empleado : " + " Empleado de planta Operativo" + "\n Salario total: "
				+ salOperativo();

		return cadena;
	}

	@Override
	public double salAdministrativo() {
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
