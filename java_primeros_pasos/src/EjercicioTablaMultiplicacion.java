
public class EjercicioTablaMultiplicacion {
	public static void main(String[] args) {
		for (int contador = 0; contador <=10; contador++) {
			for (int multiplicacion = 0; multiplicacion <= 10; multiplicacion++) {
				System.out.print(contador * multiplicacion); // el print lo que hara es no saltar de linea por cada iteracion 
				System.out.print(" "); // al no tener ln en el print no hara salto de linea pero si dara un espacio 
			}
			System.out.println(); // Este println lo que hace es que hara un salto de linea por que pone ln
		}
	}
}
