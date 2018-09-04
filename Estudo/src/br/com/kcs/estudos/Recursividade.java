package br.com.kcs.estudos;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursividade {
	
	public static int soma(int valor) {
		if(valor == 0) {
			return valor;			
		} else {
			System.out.println(valor);
			return valor + soma(valor-1);
		}
	}
	
	public static double soma(double valor) {
		double total = 0;
		for (int i = 1; i <= valor; i++) {
			total += i;
		}
		return total;
	}
	
	public static int potencia(int x, int e) {
		if(e == 1) {
			return x;
		} else {
			return x * potencia(x, e-1);
		}
	}
	
	public static void caminho(Path path) {
		if(Files.isRegularFile(path)) {
			System.out.println(path.toAbsolutePath());
		} else {
			String s = "\n" + path.toAbsolutePath();
			System.out.println(s.toUpperCase());
			try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
				for (Path p : stream) {
					caminho(p);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 3 * 3 * 3 * 3
	public static void main(String[] args) {
		//System.out.println("Int: " + soma(10));
		//System.out.println("Double: " + soma(10.0));
		//System.out.println("Potência: " + potencia(3, 4));
		caminho(Paths.get("C:/Users/Kleber/git/XTI/"));
	}
}
