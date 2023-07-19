
public class CrearCuenta {
	public static void main(String[] args) {
		// VARIABLE            VALOR
		Cuenta primeraCuenta = new Cuenta(532,6);
		primeraCuenta.depositar(400);
		primeraCuenta.getSaldo();
		System.out.println("Tu saldo es de: " +primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta(54,7);
		segundaCuenta.retirar(300);
		segundaCuenta.getSaldo();
		System.out.println("TU SALDO ES DE : " + segundaCuenta.getSaldo());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo ");
		} else {
			System.out.println("Son diferentes");
		}
	}
}
