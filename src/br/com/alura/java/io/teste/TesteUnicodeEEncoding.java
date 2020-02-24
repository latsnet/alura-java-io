package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "C";
		System.out.println(s.codePointAt(0));

		System.out.println(Charset.defaultCharset().displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.println(bytes.length + ", windows-1252");
		
		bytes = s.getBytes("utf-8");
		System.out.println(bytes.length + ", utf-8");

		bytes = s.getBytes("utf-16");
		System.out.println(bytes.length + ", utf-16");

		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length + ", StandardCharsets.US_ASCII");
		
		/* -------------------- */
		
		String texto1 = "13ª Órgão Oficial";
		byte[] b = texto1.getBytes();
		String texto2 = new String(b, "windows-1252"); 
		System.out.println(texto2);

	}

}
