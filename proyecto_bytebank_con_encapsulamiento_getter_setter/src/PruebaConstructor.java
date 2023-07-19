
public class PruebaConstructor {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(555,9);
		Cuenta cuenta2 = new Cuenta(333,8); 
		
		System.out.println(Cuenta.getTotal());
	}

}
