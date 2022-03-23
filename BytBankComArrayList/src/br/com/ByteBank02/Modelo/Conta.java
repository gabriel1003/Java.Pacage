package br.com.ByteBank02.Modelo;

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		Conta.total ++;
		System.out.println("o total de contas criadas é: " +Conta.total);
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public abstract void deposita(double valor);
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " +this.saldo +", Valor:" +valor);
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	public int getNumero() {
		return this.numero;
	}
	public static int getTotal() {
		return Conta.total;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Numero: " +this.numero +", Agencia" +this.agencia;
	}
}
