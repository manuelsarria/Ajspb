package proyecto.empleados;

public class CommissionEmployee extends Employee {

	private double sales, commissionRate;

	public CommissionEmployee(String name, String direccion, String puesto, double Csales, double rate) {
		super(name, direccion, puesto);
		setSales(Csales);
		setCommissionRate(rate);
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double Csales) {
		if (Csales >= 0.0)
			sales = Csales;
		else
			throw new IllegalArgumentException("las ventas deben ser mayor a 0");
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double rate) {
		if (rate > 0.0 && rate < 1.0)
			commissionRate = rate;
		else
			throw new IllegalArgumentException("la tasa de comision debe ser mayor a 0 y menor a 1");
	}

	@Override
	public double earnings() {
		return getCommissionRate() * getSales();
	}

	@Override
	public String toString() {
		return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", "comision del empleado: ",
				super.toString() + " ventas " + getSales(), "porcentaje de comision :", getCommissionRate());
	}

}
