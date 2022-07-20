
public class Ejercicio2 {

	public static void main(String[] args) {

		/*********************************************
		 * Parte If
		 ********************************************/
		int numeroIf = 1;
		System.out.print("La variable numeroIf ");
		if (numeroIf > 0) {
			System.out.println("és positiva.");
		} else if (numeroIf < 0) {
			System.out.println("és negativa.");
		} else {
			System.out.println("és 0.");
		}
		/********************************************
		 * Parte While
		 *******************************************/

		int numeroWhile = 0;

		while (numeroWhile < 3) {

			System.out.println("En el while -> numeroWhile = " + numeroWhile);

			numeroWhile++;

		}
		/*********************************************
		 * Parte Do-While
		 ****************************************************/

		do {

			System.out.println("En el do-while -> numeroWhile = " + numeroWhile);

			numeroWhile++;

		} while (numeroWhile < 3);
		
		
		
		/*
		 * Parte bucle FOR
		 */
		
		for(int numeroFor=0;numeroFor<=3;numeroFor++){
			
			System.out.println("Valor de la variable numeroFor: "+ numeroFor);
		}
		
		
		/*
		 *PARTE DEL SWITCH-CASE 
		 */
		
		
		String estacion="OpenBootCamp";
		
		System.out.print("La variable estacion ");
		switch(estacion) {
		
		case "verano":
			System.out.println("és verano...");
			break;
		case "invierno":
			System.out.println("és invierno...");
			break;
		case "otoño":
			System.out.println("és otoño...");
			break;
		case "primavera":
			System.out.println("és primavera...");
			break;
		default:
			System.out.println("no és una estación..");
			break;
		
		}
		
		
	}

}
