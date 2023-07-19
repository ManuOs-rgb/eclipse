
public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario Osvaldo = new Funcionario();
		Osvaldo.setNombre("Osvaldo");
		Osvaldo.setDocumento("979609");
		Osvaldo.setSalario(15550);
		Osvaldo.setTipo(0);
		
		System.out.println(Osvaldo.getSalario());
		System.out.println(Osvaldo.getBonificacion());
	}

}
