
public class TipoVariable {
	public static void main(String[] args) {
		System.out.println("Pamela bonita !!!");
		int edad = 28;
		System.out.println(edad);
		
		edad = 47; // Se puede usar el system de esta forma colocando todo de forma mas normal
		System.out.println(edad);
		
		edad = 46 + 88;
		System.out.println("Mi edad es: " + edad);
		
		int prueba; // se puede añadir primero el int con el nombre 
		prueba = 23; // poner el nombre mas el valor e imprimir
		System.out.println(prueba);
		
		double salario = 13500.500; // La variable double redondea 
		System.out.println(salario);
		 
		double salarioMitad = salario/2;
		System.out.println(salarioMitad);
		
		
		// CONVERSIOES 
		
		double variable1 = 230.89;
		int variable1Entero = (int) variable1; // Cast tranforma el valor a el otro  
		System.out.println(variable1Entero);
		
	}
}
