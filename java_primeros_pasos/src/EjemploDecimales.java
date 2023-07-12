
public class EjemploDecimales {
	public static void main(String[] args) {
		// int salario = 1250.88 No compila porque es decimal y no cabe en una variable tipo int 
		double salario = 1258.88;
		System.out.println(salario);
		
		double edad = 28; // Numeros enteros se pueden asignar a variables tipo double
		System.out.println(edad); 
		double salarioMitad = salario/2;
		System.out.println(salarioMitad); // Pueden usarse variables en operadores matematicos
		
		int division = 1250/3; // Compila pero da un valor decimal
		System.out.println(division); // Ignora el decimal , No redondea, toma la parte entera
		
	}
}
