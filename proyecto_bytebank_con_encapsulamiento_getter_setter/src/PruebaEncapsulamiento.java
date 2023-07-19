
public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(5,8);
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Pamela");
		cliente.setDocumento("979609");
		
		cuenta.setTitular(cliente);
		
		Cliente titular = cuenta.getTitular(); // SE REFERENCIA EN EL MISMO OBJETO 
		
		System.out.println(cliente.getNombre()); // DARA EL MISMO NOMBRE
		System.out.println(cuenta.getTitular().getNombre()); // DARA EL MISMO NOMBRE PORWQUE ESTAN EN LA MISMA REFERENCIA
		System.out.println(titular);
	}

}
