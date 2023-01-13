package ejercicioexamen;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// IMC
		System.out.println("PROGRAMA PARA CALCULAR EL IMC\n");
		double peso;
		double altura;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca  el peso en kilos: ");
		peso=teclado.nextDouble();
		System.out.println("Introduzca la altura en cm: ");
		altura=teclado.nextDouble();
		
		double imc=peso/(Math.pow(altura/100, 2));
		
		if (imc<0) {
			System.err.println("Al introducido algún dato erroneo");
		}
		
		else if(imc<18.5) {
			System.out.println("Bajo peso ");
		}else if(imc<=24.9){
			System.out.println("Peso normal (saludable) ");
		
		}else if (imc<=29.9) {
			System.out.println("Sobrepeso ");
			
		}else if (imc<=40) {
			System.out.println("Obesidad premórbida ");
		}else {
			System.out.println("Obesidad mórbida");

		}
		
		

	}

}
