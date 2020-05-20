package proyecto.empleados;

public class CommissionEmployee extends Employee {

  private double product, commissionRate;

  public CommissionEmployee(String name, String direccion, String puesto, String phone, double products,
      double rate) {
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
      throw new IllegalArgumentException("las ventas deben ser mayor a 0");
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

  @Override
  public String toString() {
    return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", "Empleado por destajo: ",
        super.toString() + "productos producidos " + getProduct(), "pago por producto :",
        getCommissionRate() + "total :");
  }

}
