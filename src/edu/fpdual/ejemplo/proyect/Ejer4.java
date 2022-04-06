package edu.fpdual.ejemplo.proyect;
/**
 * @author Ismael Orellana Bello
 * @version 1.0
 *
 * */
public class Ejer4 {

	public static void main(String[] args) {
		Integer numeros[] = new Integer[5];	
		numeros=generarNumeros(numeros);
		String numerosAlReves[]=ponerAlReves(numeros);
		imprimirNumerosAlReves(numerosAlReves);
}
	private static void imprimirNumerosAlReves(String[] numerosAlReves) {
		System.out.println("--------------------------");
		for(int i=0;i<numerosAlReves.length;i++) {
			System.out.println(numerosAlReves[i]);
		}
		
	}
	
	
	private static String[] ponerAlReves(Integer[] numeros) {
		String [] numerosAlReves= new String [numeros.length];
		for(int i=0;i<numeros.length;i++) {
			String aux="";
			String numero = numeros[i].toString();
			for(int x=numero.length()-1;x>=0;x--) {
				aux+=numero.charAt(x);
			}
			numerosAlReves[i]=aux;
		}
		return numerosAlReves;
	}
	
	
	private static Integer[] generarNumeros(Integer[] numeros) {
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=(int)Math.floor(Math.random()*(0-(10000+1))+(10000));
			System.out.println(numeros[i]);
		}
		return numeros;
	}
	
}
