
public class EjemploValoresVariables {
	
	public static void main(String[] args) {
		int numero1 = 4;
		int numero2 = 5;
		
		System.out.println(numero2);
		
		numero2 = numero1; // numero 4
		System.out.println(numero2);
		
		numero1 = 88; 
		System.out.println(numero2); // seguira siendo numero 2 4 ya que java almaceno los datos antes que se cambie numero1
	}

}
