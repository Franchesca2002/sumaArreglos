package sumaArreglo;

public class claseSumaArreglo {

	public static void main(String[] args) {
		int[] numeros = {10,5,7,14,3,11};
		int valorUmbral = 8;
		int suma =0;
		
		for (int numero : numeros);
		if (numero > valorUmbral) {
			suma += numero;
		}

	}
     System.out.println("La suma de los elementos mayores que" + valorUmbral + "es:" +suma);
}
