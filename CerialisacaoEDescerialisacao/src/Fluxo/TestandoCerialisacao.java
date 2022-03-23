package Fluxo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestandoCerialisacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		String nome = "gabriel";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("projeto.bin"));
//		oos.writeObject(nome);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("projeto.bin"));
		String nome = (String) ois.readObject();
		ois.close();
		
		System.out.println(nome);
	}
}
