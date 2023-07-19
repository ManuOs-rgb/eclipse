
public class Gerente extends Funcionario{
	private String clave;
	private int contraseña;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
//	public boolean iniciarSesion(String clave) {
//		return clave == "123";
//	}
	
    public int getContraseña() {
        return contraseña;
    }
	
	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}
	
	public boolean autenticar(int contraseña) {
		if(this.contraseña == contraseña) {
			return true;
		} else {
			return false;
		}
		
	}
	// Sobreescritura de metodo
	public double getBonificacion(){
//		return super.getSalario() + super.getSalario()*0.1;
		return super.getSalario() + super.getBonificacion();
	}
	
	
	
}
