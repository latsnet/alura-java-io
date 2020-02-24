package br.com.alura.java.io.teste;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class TesteProperties {

	public static void main(String[] args) throws Exception {
		CriaProperties();
		LerProperties();
	}
	
	private static void CriaProperties() throws Exception {
		Properties prop = new Properties();
		prop.setProperty("login", "testeLogin");
		prop.setProperty("senha", "teste-senha");
		prop.setProperty("endereco", "www.endereco.com.br");
		
		prop.store(new FileWriter("conf.properties"), "Comentários do arquivo de Propriedades");
	}
	
	private static void LerProperties() throws Exception {
		Properties prop = new Properties();
		prop.load(new FileReader("conf.properties"));
		
		System.out.println(String.format("Login: %s", prop.getProperty("login")));
		System.out.println(String.format("Senha: %s", prop.getProperty("senha")));
		System.out.println(String.format("Endereço: %s", prop.getProperty("endereco")));
	}

}
