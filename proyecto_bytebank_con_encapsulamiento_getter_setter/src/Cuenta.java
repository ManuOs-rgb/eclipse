// Entidad Cuenta 
class Cuenta{
	private double saldo;
	private int agencia = 1;
	public int numero;
	private Cliente titular =  new Cliente();// Se selecciona Cliente para dar una referencia 
	
	private static int total;
	public Cuenta(int agencia, int numero) { //RETORNA 
		if (agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Se van creando: " + total + " cuenta/s");
	}
	
//	 public Cuenta( int agencia, int numero) {
//	        this.agencia = agencia;
//	        this.numero = numero;
//	        System.out.println("Estoy creando una cuenta " + this.numero);
//
//	        Cuenta.total ++;
//	    }
	
	
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
	
	public double getSaldo() {
		return this.saldo;
	}
	
//	public void setAgencia(int nuevaAgencia){
//		if (nuevaAgencia > 0) {
//			this.agencia = nuevaAgencia;
//		} else {
//			System.out.println("No estan permitidos numeros negativos en Agencia!");
//		}
//	}
	
	public int getAgencia() {
		return agencia;
	}
	
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
}
