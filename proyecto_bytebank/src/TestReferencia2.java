
public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente osvaldo = new Cliente();
		osvaldo.nombre = "Osvaldo";
		osvaldo.documento = "979609";
		osvaldo.telefono = "5562121079";
		
		Cuenta cuentaOsvaldo = new Cuenta();
		cuentaOsvaldo.agencia = 1;
		cuentaOsvaldo.titular = osvaldo; // Esto hace una referencia  
		
		System.out.println(cuentaOsvaldo.titular.documento);
		System.out.println(cuentaOsvaldo.titular);
		
		
	}

}
