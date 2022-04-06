package edu.fpdual.ejemplo.proyect;
/**
 * @author Ismael Orellana Bello
 * @version 1.0
 *
 * */
public class Ejer3 {

	public Ejer3(){
		Integer numeros[] = new Integer[5];
		numeros=generarNumeros(numeros);
		Integer nuevosNumeros[]=numerosNuevos(numeros);
		imprimirNumeros(nuevosNumeros);
	}


	public static void main(String[] args) {
		Integer numeros[] = new Integer[5];
		numeros=generarNumeros(numeros);
		Integer nuevosNumeros[]=numerosNuevos(numeros);
		imprimirNumeros(nuevosNumeros);

	}
	
	private static void imprimirNumeros(Integer[] nuevosNumeros) {
		System.out.println("------------------------");
		for(int i=0;i<nuevosNumeros.length;i++) {
			if(nuevosNumeros[i]==null) {
				System.out.println("Número no par");
			}
			else {
				System.out.println(nuevosNumeros[i]);
			}
			
		}
	}

	private static Integer[] numerosNuevos(Integer[] numeros) {
		Integer nuevosNumeros[]= new Integer[numeros.length];
		String convertirNumero;
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]%2==0) {
				String nuevoNumero="";
				convertirNumero=numeros[i].toString();
				int longitud = convertirNumero.length();
					for(int x=1;x<longitud-1;x++) {
						nuevoNumero+=convertirNumero.charAt(x);
					}
					nuevosNumeros[i]=Integer.parseInt(nuevoNumero);
				}	
			}
		return nuevosNumeros;
	}

	public static Integer[] generarNumeros(Integer[] numeros) {
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=(int)Math.floor(Math.random()*(0-(9999+1))+(9999));
			System.out.println(numeros[i]);
		}
		return numeros;
	}
}
