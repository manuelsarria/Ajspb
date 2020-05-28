package proyecto.empleados;

public class DestEmployee extends Employee {

	private double product, commissionRate;

	public DestEmployee(String name, String direccion, String puesto, String phone, double products, double rate) {
		super(name, direccion, puesto, phone);
		setProduct(products);
		setCommissionRate(rate);
	}

	public double getProduct() {
		return product;
	}

	public void setProduct(double products) {
		if (products >= 0.0)
			product = products;
		else
			throw new IllegalArgumentException("los productos deben ser mayor a 0");
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double rate) {
		if (rate > 0.0)
			commissionRate = rate;
		else
			throw new IllegalArgumentException("el costo del producto debe ser mayor a 0");
	}

	public double salDestajo() {

		return (getProduct() * getCommissionRate());

	}

	String Impresion() {
		String cadena = super.Impresion() + "\n tipo de empleado : " + "Empleado por destajo" + "\n Salario total: "
				+ salDestajo();

		return cadena;
	}

	@Override
	public double salAdministrativo() {
		return 0;
	}

	@Override
	public double salOperativo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double salHours() {
		// TODO Auto-generated method stub
		return 0;
	}

}
