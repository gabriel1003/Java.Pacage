package br.com.ByteBank02.Teste;

import br.com.ByteBank02.Modelo.ContaCorrente;
import br.com.ByteBank02.Modelo.ContaPoupanca;
import br.com.ByteBank02.Modelo.SaldoInsuficienteException;

public class TestaValor {
	public static void main(String[] args) {
		ContaCorrente cr = new ContaCorrente(13, 15);
		cr.deposita(200);

		try {
			cr.saca(100);
		}
		catch (SaldoInsuficienteException ex) {
			System.out.println("N�o tem dinheiro: " + ex.getMessage());
		}

		ContaPoupanca cp = new ContaPoupanca(03, 15);
		cp.deposita(120.12);
		
		try {
			cp.saca(300);
		}
		catch (SaldoInsuficienteException ex) {
			System.out.println("n�o tem dinheiro. " +ex.getMessage());
		}
		
		System.out.println("o saldo da sua conta corrente �: " +cr.getSaldo());
		System.out.println("o saldo da conta poupan�a �: " +cp.getSaldo());
	}
}
