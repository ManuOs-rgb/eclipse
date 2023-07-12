
public class EjemploCondicionales2 {
	public static void main(String[] args) {
		System.out.println();

		int edad = 18;
		int cantidadPersonas = 2;
//		boolean esPareja = true;
		boolean esPareja = cantidadPersonas > 1; // > 1 hace que retorne true  o false 
		boolean puedeEntrar = edad >=18 && esPareja;
		System.out.println("El valor de la condicion es: " + esPareja);
		
		if (edad >= 18 && esPareja) { // || es una condicion OR  y && es una condicion AND
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");
		} else {
				System.out.println("Usted es menor de edad, no puede entrar");
		}
		
		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no esta permitido a entrar ");
		}
	}

}
