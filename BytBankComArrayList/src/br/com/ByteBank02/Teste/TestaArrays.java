package br.com.ByteBank02.Teste;

import br.com.ByteBank02.Modelo.ContaCorrente;

public class TestaArrays {
	public static void main(String[] args) {

		ContaCorrente[] contas = new ContaCorrente[5];
		ContaCorrente cc1 = new ContaCorrente(12, 14);

		contas[0] = cc1;

		ContaCorrente cc2 = new ContaCorrente(22, 22);
		contas[1] = cc2;

		System.out.println(contas[1].getNumero());
	}
}
