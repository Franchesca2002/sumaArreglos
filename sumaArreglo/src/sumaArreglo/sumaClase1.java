package sumaArreglo;

public class sumaClase1 {

	public static void main(String[] args) {
		int[] numeros = {1,2,3,4,5};
		int suma = sumarRecursivamente(numeros,numeros.length -1);
		System.out.println("La suma de los elementos del array es:" + suma);

	}

	private static int sumarRecursivamente(int[] numeros, int indice) {
		if (indice < 0) {
		return 0;
	}
		return numeros[indice] + sumarRecursivamente(numeros,indice -1);

}
}
