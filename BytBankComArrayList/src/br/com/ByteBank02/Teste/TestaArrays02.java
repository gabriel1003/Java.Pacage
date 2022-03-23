package br.com.ByteBank02.Teste;

import br.com.ByteBank02.Modelo.ContaCorrente;
import br.com.ByteBank02.Modelo.ContaPoupanca;

public class TestaArrays02 {
	public static void main(String[] args) {

		Object[] referencias = new Object[5];

		ContaCorrente cc1 = new ContaCorrente(123, 146);
		referencias[0] = cc1;

		ContaPoupanca cc2 = new ContaPoupanca(22, 46);
		referencias[1] = cc2;

		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		
		System.out.println(cc2.getNumero());
	}
}
