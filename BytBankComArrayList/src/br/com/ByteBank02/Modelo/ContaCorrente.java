package br.com.ByteBank02.Modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorSaca = valor +0.02;
		super.saca(valorSaca);
	}
	
	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente, " + toString();
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
