package bookPoo;

import java.util.*;

public class AregloPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(" diga un numero para convertilo en letra " );
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		String valorNumero [] = new String[20];
		valorNumero[1] = "uno";
		valorNumero[2] = "dos";
		valorNumero[3] = "tres";
		valorNumero[4] = "cuatro";
		valorNumero[5] = "sico";
		valorNumero[6] = "seis";
		valorNumero[7] = "siete";
		valorNumero[8] = "ocho";
		valorNumero[9] = "nueve";
		valorNumero[10] = "diez";
		valorNumero[0] = "cero";
		valorNumero[20] = "veinte";
		
		numero = entrada.nextInt();
		System.out.println(valorNumero[numero]);
	}

}
