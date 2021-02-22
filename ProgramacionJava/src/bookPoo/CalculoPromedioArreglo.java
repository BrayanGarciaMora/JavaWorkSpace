package bookPoo;

import java.util.*;

public class CalculoPromedioArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite las nostas");
		Scanner s = new Scanner(System.in);
		double promedio;
		double sumatoria = 0;
		int tamano = 10;
		int contador = 1;
		double[] arreglo = new double[tamano];
		for (int i = 0; i < tamano; i++) {
			contador +=contador;
		
			
			System.out.println(contador);
			arreglo[i] = s.nextDouble();
			
		}
		System.out.println("El arreglo original es: ");
		for (int i = 0; i < tamano; i++) {
			System.out.println(arreglo[i]);
		}

		for (int i = 0; i < tamano; i++) {
			sumatoria += arreglo[i];
		}
		promedio = sumatoria / tamano;
		System.out.println("El promedio es: " + promedio);
	}

}
