package proyecto.empleados;

public abstract class Employee {
	
	String completeName,address, jobName;
	
	
	public Employee(String name, String direccion, String puesto) {
		
		completeName = name;
		address = direccion;
		jobName = puesto;
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


	@Override
	public String toString() {
		return "Nombre completo" + completeName + ", Direccion=" + address + ", Nombre del puesto=" + jobName;
	}
	
	public abstract double earnings();

}
