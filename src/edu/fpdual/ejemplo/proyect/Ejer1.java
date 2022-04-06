package edu.fpdual.ejemplo.proyect;

/**
 * @author Ismael Orellana Bello
 * @version 1.0
 *
 * */
public class Ejer1 {


	
	public static void main(String[] args) {
		Integer numeros[] = new Integer[5];
		numeros=generarNumeros(numeros);
		Boolean resultados []=compararNumeros(numeros);
		mandarMensajes(resultados,numeros);
		
	}


	private static void mandarMensajes(Boolean[] resultados, Integer[] numeros) {
		for(int i=0;i<numeros.length;i++) {
			if(resultados[i]) {
				System.out.println("El número : "+numeros[i]+" contiene el 6 al principio o al final");
			}
			else {
				System.out.println("El numero : "+numeros[i] +" no contiene el 6 al principio o al final");
			}
		}
		
	}
	private static Integer[] generarNumeros(Integer[] numeros) {
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=(int)Math.floor(Math.random()*(0-(200+1))+(200));
		}
		return numeros;
		
	}
	public static Boolean[] compararNumeros(Integer[] numeros) {
		String numerosConvertidos;
		Boolean resultados []= new Boolean[numeros.length];
		for(int i=0;i<numeros.length;i++) {
			numerosConvertidos=numeros[i].toString();
			if(numerosConvertidos.indexOf("6") == 0 || numerosConvertidos.indexOf("6")==numerosConvertidos.length()-1) {
				resultados[i]=true;
			}
			else {
				resultados[i]=false;
			}
		}
		return resultados;
	}
}
