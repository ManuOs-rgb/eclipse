
public class CrearCuenta {
	public static void main(String[] args) {
		// VARIABLE            VALOR
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 500;
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 500;
		System.out.println("TU SALDO ES DE : " + segundaCuenta.saldo);
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo ");
		} else {
			System.out.println("Son diferentes");
		}
	}
}
