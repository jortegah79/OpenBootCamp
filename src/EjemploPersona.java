
public class EjemploPersona {

	public static void main (String [] args) {
		
		Persona juan=new Persona("Juan");
		
		juan.setEdad(43);
		
		juan.setTelefono("625789456");
		
		System.out.println("Mi nombre es "+juan.getNombre()+ " y mi edad es "+juan.getEdad()+", pero mi número de teléfono NO es "+juan.getTelefono());
	}
}

class Persona{
	
	private String nombre;
	
	private int edad;
	
	private String telefono;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public Persona(String nombre) {
		
		this.nombre=nombre;
	}
	
	
}