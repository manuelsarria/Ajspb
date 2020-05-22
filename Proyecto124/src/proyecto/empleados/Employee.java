package proyecto.empleados;

public class Employee {

	String completeName, address, jobName, phoneNumber;

	public Employee() {

	}

	public Employee(String name, String direccion, String puesto, String telefono) {

		completeName = name;
		address = direccion;
		jobName = puesto;
		phoneNumber = telefono;
	}

	public String getCompleteName() {
		return completeName;
	}

	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public double calcImpuesto(double par) {
		return (par * 0.05);
	}

	String Impresion() {
		String cadena = "Nombre: " + completeName + "\n Direccion: " + address + "\n Nombre del puesto: " + jobName
				+ "\n Telefono: " + phoneNumber;

		return cadena;
	}

}
