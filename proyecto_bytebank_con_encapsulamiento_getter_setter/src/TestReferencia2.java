
public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente osvaldo = new Cliente();
		osvaldo.setNombre("Osvaldo");
		osvaldo.setDocumento("979609");
		osvaldo.setTelefono("55-62-12-10-79");
		
		Cuenta cuentaOsvaldo = new Cuenta(5,5);
		cuentaOsvaldo.setTitular(osvaldo); // Esto hace una referencia  
		
		System.out.println(cuentaOsvaldo.getTitular().getDocumento());
		System.out.println(cuentaOsvaldo.getTitular());
		System.out.println(cuentaOsvaldo.getAgencia());
		System.out.println(cuentaOsvaldo.getNumero());
		
	}

}
