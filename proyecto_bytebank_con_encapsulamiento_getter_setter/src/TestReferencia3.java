
public class TestReferencia3 {
	public static void main(String[] args) {
		Cuenta cuentaOsvaldo = new Cuenta(4,5);
		Cliente cliente = new Cliente(); // Aparece porque la variable cliente no se usa por ende se debe quitar 
//		cuentaOsvaldo.titular = cliente;
		cuentaOsvaldo.setTitular(cliente); // Lo que hara sera inicializar
		
		System.out.println(cuentaOsvaldo.getTitular().getNombre());
	
	}

}
