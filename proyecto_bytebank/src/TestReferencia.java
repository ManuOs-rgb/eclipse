
public class TestReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;
		
		Cuenta segundaCuenta = primeraCuenta; // Hara que se trabaje en el mismo objeto y tambien porque no se le dio un new Cuenta a segundaCuenta 
		segundaCuenta.saldo = 100;
		
		System.out.println("Saldo primera cuenta: " + primeraCuenta.saldo);
		System.out.println("Saldo segunda cuenta: " + segundaCuenta.saldo);
		
		segundaCuenta.saldo += 400;
		System.out.println(primeraCuenta.saldo); // Ambas cambian porque se hace referencia al mismo objeto 
		System.out.println(segundaCuenta.saldo);
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo ");
		} else {
			System.out.println("Son diferentes");
		}
		
		
		
	}

}
