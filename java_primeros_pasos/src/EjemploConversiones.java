
public class EjemploConversiones {
	
	public static void main(String[] args) {
		double variable1 = 230.88;
		int variable1Enetero = (int) variable1; // Cast
		// Imprime en consola 
		System.out.println(variable1Enetero);
		
		// int prueba = 1222222222; No compila por ser de rango grande 
		long prueba = 122222222L; // Se fuerza el resultado en int 
		
		int resultado = (int) variable1 + variable1Enetero; // Fuerza el resultado en int
		System.out.println(resultado);
	}

}
