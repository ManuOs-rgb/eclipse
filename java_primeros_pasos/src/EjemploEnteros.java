
public class EjemploEnteros {
	public static void main(String[] args) {
		
		//edad = 28 No compila porque falta definir el valor de la variable 
		int edad;
		edad = 28;
		
		// No compila porque el parametro no es la variable , es un String 
		System.out.println(edad);
		
		edad = 37; // Sobreescribe el valor de la variable 
		System.out.println(edad);
		
		edad = 35 + 99; // se puede asociar operaciones aritmeticas
		System.out.println(edad);
		
		System.out.println("Mi edad es: " + edad); // Concatenar un String con la variable edad usando +
	}

}
