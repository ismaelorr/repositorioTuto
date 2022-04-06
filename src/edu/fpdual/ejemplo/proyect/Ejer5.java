package edu.fpdual.ejemplo.proyect;
/**
 * @author Ismael Orellana Bello
 * @version 1.0
 *
 * */
public class Ejer5 {

	public static void main(String[] args) {
		String palabras []= {"asodkas","asd3asd","asfijsa4","asdasd"};
		String nuevasPalabras[]=comprobarNumeros(palabras);
		imprimirNumerosAlReves(nuevasPalabras);
	}

	private static String[] comprobarNumeros(String[] palabras) {
		String nuevasPalabras[]= new String[palabras.length];
		for(int i=0;i<palabras.length;i++) {
			int contador=0;
			for(int x=0;x<palabras[i].length();x++) {
				if(Character.isLetter(palabras[i].charAt(x))) {
					contador++;
				}
			}
			if(contador==palabras[i].length()) {
				nuevasPalabras[i]=palabras[i];
			}
			else {
				nuevasPalabras[i]="La palabra : "+palabras[i]+" contiene n�meros";
			}
		}
		return nuevasPalabras;
	}
	
	private static void imprimirNumerosAlReves(String[] nuevasPalabras) {
		System.out.println("--------------------------");
		for(int i=0;i<nuevasPalabras.length;i++) {
			System.out.println(nuevasPalabras[i]);
		}
		
	}

}
