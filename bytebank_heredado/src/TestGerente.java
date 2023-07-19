
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
//		gerente.setSalario(28000);
		
		// Funcionario gerente = new Funcionario();
		gerente.setNombre("Valo");
		gerente.setSalario(30000);
		gerente.setClave("13"); // PONER ESTO NO SIRVE YA QUE SE LE DIO UN VALOR CON EL BOOLEAN
		gerente.setDocumento("701-5689787879");
		gerente.setTipo(1);
		
		System.out.println(gerente.getNombre());
		System.out.println( "Tu salario es: " + gerente.getSalario());
		System.out.println(gerente.getDocumento());
		System.out.println(" Tu bonificacion : " + gerente.getBonificacion());
		
		gerente.setContraseña(4645); // CON ESTO HARE QUE LA CONTRASEÑA QUE SE INTRODUZCA SEA LA CORRECTA
		boolean autentico = gerente.autenticar(4245);
		
		System.out.println(autentico);
		System.out.println(gerente.autenticar(4645));
//		System.out.println(gerente.iniciarSesion("123"));
	}

}
