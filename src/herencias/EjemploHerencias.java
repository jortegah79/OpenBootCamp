package herencias;

public class EjemploHerencias {

	public static void main(String[] args) {
	
		Cliente cliente=new Cliente();
		
		cliente.setNombre("Juan");
		
		cliente.setEdad(43);
		
		cliente.setTelefono("625789456");
		
		cliente.setCredito(25000);
		
		/************************************************  Cliente   *********************************************************************/
		
		Trabajador trabajador=new Trabajador();
		
		trabajador.setNombre("Jorge");
		
		trabajador.setEdad(28);
		
		trabajador.setTelefono("666774123");
		
		trabajador.setSalario(20856);
		
		/*************************************************   Trabajador   *************************************************************/   
		
		System.out.println("El cliente "+cliente.getNombre()+ " tiene la edad de "+ cliente.getEdad() +
				" años y su número de teléfono es "+cliente.getTelefono()+". Dispone de un crédito de "+cliente.getCredito()+" €.");
		
		System.out.println("El trabajador "+trabajador.getNombre()+ " tiene la edad de "+trabajador.getEdad()+
				" años y su número de teléfono es " + trabajador.getTelefono()+ " .Su salario es de "+trabajador.getSalario()+" € anuales.");
		
	}

}

class Persona{
	
	private int Edad;
	
	private String nombre;
	
	private String telefono;
	
	
	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}

class Cliente extends Persona{
		
	private int credito;

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}
}

class Trabajador extends Persona{
	
	private int salario;

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
}