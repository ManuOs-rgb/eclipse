
public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta cuentaPamela = new Cuenta(7,5);
		cuentaPamela.getSaldo();
		cuentaPamela.depositar(200);
		System.out.println("Este es tu saldo total con el deposito Pamela : " + cuentaPamela.getSaldo());
		
		cuentaPamela.retirar(100);
		System.out.println("Con tu retiro te queda Pamela : " + cuentaPamela.getSaldo());
		
		Cuenta cuentaOsvaldo = new Cuenta(4,9);
		cuentaOsvaldo.depositar(1000);
		System.out.println("Tu saldo Osvaldo con el deposito es de : " + cuentaOsvaldo.getSaldo());
//		cuentaOsvaldo.transferir(400, cuentaPamela);
		
		boolean puedeTransferir = cuentaOsvaldo.transferir(400, cuentaPamela);
		
		if (puedeTransferir) {
			System.out.println("Transferencia exitosa" );
		} else {
			System.out.println("No se pudo transferir");
		}
		
//		if(cuentaOsvaldo.transferir(400, cuentaPamela)) {
//			System.out.println("Transferencia exitosa");
//			
//		} else {
//			System.out.println("No es posible transferir");
//		}
		 
		System.out.println("Tu saldo Pamela con lo transferido es: " + cuentaPamela.getSaldo());
		System.out.println("Tu saldo Osvaldo con lo transferido es de: " + cuentaOsvaldo.getSaldo());
	}
}
