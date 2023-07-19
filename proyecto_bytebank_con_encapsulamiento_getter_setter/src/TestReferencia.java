
public class TestReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(1,2);
		primeraCuenta.depositar(12500);
		primeraCuenta.getSaldo();
		
		Cuenta segundaCuenta = primeraCuenta;// Hara que se trabaje en el mismo objeto y tambien porque no se le dio un new Cuenta a segundaCuenta
		segundaCuenta.depositar(15500);
		segundaCuenta.getSaldo();
		
		System.out.println("Saldo primera cuenta: " + primeraCuenta.getSaldo());
		System.out.println("Saldo segunda cuenta: " + segundaCuenta.getSaldo());
		
		segundaCuenta.getSaldo();
		System.out.println(primeraCuenta.getSaldo()); // Ambas cambian porque se hace referencia al mismo objeto 
		System.out.println(segundaCuenta.getSaldo());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo ");
		} else {
			System.out.println("Son diferentes");
		}
		
		
		
	}

}
