
public class Coche {

	 int puertas=4;
	
	public void incrementaPuertas() {
		
		this.puertas++;
	}
	
	public static void main(String [] args) {
		
		Coche miCoche=new Coche();
						
		System.out.println("Número de puertas antes del método: " + miCoche.puertas);
		
		miCoche.incrementaPuertas();
		
		System.out.println("Número de puertas después de método: " +miCoche.puertas);
		
		
	}
}
