package bookPoo;

public class EjemploArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero[] = new int[10];
		System.out.println("El arreglo original es ");
		for (int i = 0; i < numero.length; i++) {
			numero[i] = i * 5;
			System.out.println(numero[i]);
		}

		EjemploArreglos ejemplo = new EjemploArreglos();
		int indice = ejemplo.busquedaBinaria(numero, 40, 4, numero.length - 1);
		System.out.println("El indice del valor '45' es: " + indice);
	}

	public int busquedaBinaria(int[] arreglo, int clave, int posInicial, int posFinal) {

		int posMitad = (posFinal + posInicial) / 2;
		if (clave == arreglo[posMitad]) {
			return posMitad;
		} else if (clave < arreglo[posMitad]) {
			if (posMitad - 1 <= posInicial) {
				return -1;
			} else {
				return busquedaBinaria(arreglo, clave, posInicial, posMitad - 1);
			}
		} else {
			if (posMitad + 1 >= posFinal) {
				return -1;
			} else {
				return busquedaBinaria(arreglo, clave, posMitad + 1, posFinal);
			}
		}

	}

}
