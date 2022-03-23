package Fluxo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CerialisacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Gabriel Samersla");
//		cliente.setCpf("015.203.800-32");
//				cliente.setProficao("dev");
				
//				ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("cliente.bin"));
//				oos.writeObject(cliente);
//				oos.close();
				
				ObjectInputStream ois = new ObjectInputStream( new FileInputStream("cliente.bin"));
				Cliente cliente = (Cliente) ois.readObject();
				ois.close();
				System.out.println(cliente.getNome());
	}
}
