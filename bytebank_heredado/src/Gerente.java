
public class Gerente extends Funcionario implements Autenticable {

    public double getBonificacion() {
        System.out.println("Llamando metodo del Gerente");
        return super.getSalario() + this.getSalario();
    }

	@Override
	public String getClave() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

}
