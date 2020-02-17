package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("lorem-escrita.txt");
		Writer writer = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(writer);
		
		bw.write("Lorem ipson ...");
		bw.newLine();
		bw.newLine();
		bw.write("Final do arquivo");
		
		bw.close();
	}
	
}
