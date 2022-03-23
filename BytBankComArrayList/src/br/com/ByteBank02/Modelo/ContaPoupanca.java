package br.com.ByteBank02.Modelo;

public class ContaPoupanca extends Conta {
	
public ContaPoupanca(int agencia, int numero) {
	super(agencia, numero);
}

@Override
public void deposita(double valor) {
	super.saldo += valor;
}

@Override
public String toString() {
	return "ContaPoupanca, " +super.toString();
}

@Override
public void saca(double valor) throws SaldoInsuficienteException {
	if (this.saldo < valor) {
		throw new SaldoInsuficienteException("Saldo: " +this.saldo + ", valor: " +valor);
	}
	this.saldo -= valor;
}

public double getSaldo() {
	return this.saldo;
}
}
