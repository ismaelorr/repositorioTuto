package edu.fpdual.ejemplo.proyect;
import java.util.ArrayList;

/**
 * @author Ismael Orellana Bello
 * @version 1.0
 *
 * */

public class Ejer6{

	
	public Ejer6() {
		new Ejer6_1();
		new Ejer6_2();
		new Ejer6_3();
		new Ejer6_4();
		new Ejer6_5();
	}
	
	public class Ejer6_1{
		
		
		public Ejer6_1() {
			System.out.println("Clase : 1");
			ArrayList <Integer>numeros=generarNumeros();
			ArrayList<Boolean> resultados =compararNumeros(numeros);
			mandarMensajes(resultados,numeros);
		}
		
		
	private void mandarMensajes(ArrayList <Boolean> resultados, ArrayList <Integer> numeros) {
		for(int i=0;i<numeros.size();i++) {
			if(resultados.get(i)) {
				System.out.println("El n�mero : "+numeros.get(i)+" contiene el 6 al principio o al final");
			}
			else {
				System.out.println("El n�mero : "+numeros.get(i)+" no contiene el 6 al principio o al final");
			}
		}
		
	}
	private ArrayList<Integer> generarNumeros(){
		ArrayList <Integer> numeros = new ArrayList<>();
		for(int i=0;i<5;i++) {
			numeros.add((int)Math.floor(Math.random()*(0-(200+1))+(200)));
		}
		return numeros;
		
	}
	public ArrayList<Boolean> compararNumeros(ArrayList <Integer>numeros) {
		String numerosConvertidos;
		ArrayList <Boolean> resultados = new ArrayList<>();
		for(int i=0;i<numeros.size();i++) {
			numerosConvertidos=numeros.get(i).toString();
			if(numerosConvertidos.indexOf("6") == 0 || numerosConvertidos.indexOf("6")==numerosConvertidos.length()-1) {
				resultados.add(true);
				
			}
			else {
				resultados.add(false);
			}
		}
		return resultados;
	}
	}
	
	public class Ejer6_2{
		
		public Ejer6_2() {
			System.out.println("Clase : 2");
			ArrayList <Integer>numeros=generarNumeros();
			ArrayList<Boolean> resultados =compararNumeros(numeros);
			mandarMensajes(resultados,numeros);
		}
		
		private void mandarMensajes(ArrayList <Boolean> resultados, ArrayList <Integer> numeros) {
			for(int i=0;i<numeros.size();i++) {
				if(resultados.get(i)) {
					System.out.println("El n�mero : "+numeros.get(i)+" contiene el 2 o el 3");
				}
				else {
					System.out.println("El n�mero : "+numeros.get(i) +" no contiene el 2 o el 3");
				}
			}
			
		}
		private ArrayList<Integer> generarNumeros(){
			ArrayList <Integer> numeros = new ArrayList<>();
			for(int i=0;i<5;i++) {
				numeros.add((int)Math.floor(Math.random()*(0-(200+1))+(200)));
			}
			return numeros;
			
		}
		public ArrayList<Boolean> compararNumeros(ArrayList <Integer>numeros) {
			String numerosConvertidos;
			ArrayList <Boolean> resultados = new ArrayList<>();
			for (Integer numero : numeros) {
				numerosConvertidos = numero.toString();
				if (numerosConvertidos.indexOf("2") != -1 || numerosConvertidos.indexOf("3") != -1) {
					resultados.add(true);

				} else {
					resultados.add(false);
				}
			}
			return resultados;
		}
		
	}
	
	public class Ejer6_3{
		
		
		public Ejer6_3(){
			System.out.println("Clase : 3");
			ArrayList <Integer> numeros=generarNumeros();
			ArrayList <Integer> nuevosNumeros=numerosNuevos(numeros);
			imprimirNumeros(nuevosNumeros);
		}
		
		public void imprimirNumeros(ArrayList <Integer> nuevosNumeros) {
			System.out.println("------------------------");
			for(int i=0;i<nuevosNumeros.size();i++) {
				if(nuevosNumeros.get(i)==null) {
					System.out.println("N�mero no par");
				}
				else {
					System.out.println(nuevosNumeros.get(i));
				}
				
			}
		}

		public ArrayList <Integer> numerosNuevos(ArrayList <Integer> numeros) {
			ArrayList<Integer> nuevosNumeros = new ArrayList<>();
			String convertirNumero;
			String nuevoNumero="";
			for(int i=0;i<numeros.size();i++) {
				if((numeros.get(i))%2==0) {
					convertirNumero=numeros.get(i).toString();
					int longitud = convertirNumero.length();
						for(int x=1;x<longitud-1;x++) {
							nuevoNumero+=convertirNumero.charAt(x);
						}
						nuevosNumeros.add(Integer.parseInt(nuevoNumero));
						nuevoNumero="";
					}	
				}
			return nuevosNumeros;
		}

		public ArrayList <Integer> generarNumeros() {
			ArrayList <Integer> numeros= new ArrayList<>();
			for(int i=0;i<5;i++) {
				numeros.add((int)Math.floor(Math.random()*(0-(9999+1))+(9999)));
				System.out.println(numeros.get(i));
			}
			return numeros;
		}
	}
	
	public class Ejer6_4{
		
		public Ejer6_4() {
			System.out.println("Clase : 4");
			ArrayList <Integer> numeros=generarNumeros();
			ArrayList<String> numerosAlReves=ponerAlReves(numeros);
			imprimirNumerosAlReves(numerosAlReves);
		}
		
		private static void imprimirNumerosAlReves(ArrayList<String> numerosAlReves) {
			System.out.println("--------------------------");
			for(int i=0;i<numerosAlReves.size();i++) {
				System.out.println(numerosAlReves.get(i));
			}
			
		}
	}
		
		private static ArrayList <String> ponerAlReves(ArrayList <Integer> numeros) {
			ArrayList <String> numerosAlReves= new ArrayList<>();
			for(int i=0;i<numeros.size();i++) {
				String aux="";
				String numero = numeros.get(i).toString();
				for(int x=numero.length()-1;x>=0;x--) {
					aux+=numero.charAt(x);
				}
				numerosAlReves.add(aux);
			}
			return numerosAlReves;
		}
		
		
		public ArrayList<Integer> generarNumeros(){
			ArrayList <Integer> numeros = new ArrayList<>();
			for(int i=0;i<5;i++) {
				numeros.add((int)Math.floor(Math.random()*(0-(200+1))+(200)));
			}
			return numeros;
		}
		
		public class Ejer6_5{
			
			public Ejer6_5(){
				System.out.println("Clase : 5");
				String palabras []= {"asodkas","asd3asd","asfijsa4","asdasd"};
				ArrayList <String> nuevasPalabras=comprobarNumeros(palabras);
				imprimirNumerosAlReves(nuevasPalabras);
			}
			
			private static ArrayList<String> comprobarNumeros(String[] palabras) {
				ArrayList<String> nuevasPalabras= new ArrayList<>();
				for(int i=0;i<palabras.length;i++) {
					int contador=0;
					for(int x=0;x<palabras[i].length();x++) {
						if(Character.isLetter(palabras[i].charAt(x))) {
							contador++;
						}
					}
					if(contador==palabras[i].length()) {
						nuevasPalabras.add(palabras[i]);
					}
					else {
						nuevasPalabras.add("La palabra : "+palabras[i]+" contiene n�meros");
					}
				}
				return nuevasPalabras;
			}
			
			private static void imprimirNumerosAlReves(ArrayList<String> nuevasPalabras) {
				System.out.println("--------------------------");
				for(int i=0;i<nuevasPalabras.size();i++) {
					System.out.println(nuevasPalabras.get(i));
				}
			
		}
		
	}
	
	public static void main(String [] args) {
		new Ejer6();
	}
}

