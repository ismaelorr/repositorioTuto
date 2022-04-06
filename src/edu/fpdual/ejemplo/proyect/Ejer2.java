package edu.fpdual.ejemplo.proyect;
/**
 * @author Ismael Orellana Bello
 * @version 1.0
 *
 * */
public class Ejer2 {

	public static void main(String[] args) {
		Integer numeros[] = new Integer[5];
		numeros=generarNumeros(numeros);
		Boolean resultados []=compararNumeros(numeros);
		mandarMensajes(resultados,numeros);
		
	}
	private static void mandarMensajes(Boolean[] resultados, Integer[] numeros) {
		for(int i=0;i<numeros.length;i++) {
			if(resultados[i]) {
				System.out.println("El n�mero : "+numeros[i]+" contiene el 2 o el 3");
			}
			else {
				System.out.println("El n�mero : "+numeros[i] +" no contiene el 2 o el 3");
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
			if(numerosConvertidos.indexOf("2") != -1 || numerosConvertidos.indexOf("3")!=-1) {
				resultados[i]=true;
			}
			else {
				resultados[i]=false;
			}
		}
		return resultados;
	}

}
