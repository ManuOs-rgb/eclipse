// Entidad Cuenta 
class Cuenta{
	double saldo;
	int agencia;
	int numero;
	Cliente titular =  new Cliente();// Se selecciona Cliente para dar una referencia 
	
	// NO RETORNA VALOR
	public void depositar(double valor){
		// Esta cuenta  Esta cuenta
		// This object   This object 
		this.saldo += valor;
//		this.saldo          = this.saldo + valor;
	}
	
	// RETORNA VALOR
	public boolean retirar(double valor) {
		 if (this.saldo >= valor) {
//			this.saldo = this.saldo - valor; 
			 this.saldo -= valor;
			return true;
		 } else {
			 return false;
		 }
	}
	
	public boolean transferir(double valor, Cuenta cuenta){
		if (this.saldo >= valor) {
//			this.saldo = this.saldo - valor;
			this.saldo -= valor;
//			cuenta.saldo = cuenta.saldo + valor;
			cuenta.depositar(valor);
			return true;
			
		}
		return false;
		
	}
}
