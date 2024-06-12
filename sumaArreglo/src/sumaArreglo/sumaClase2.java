package sumaArreglo;

import java.util.Arrays;

public class sumaClase2 {

	public static void main(String[] args) {
		int[] array1 = {2,4,5};
		int[] array2 = {1,6,8};
		int[] suma = new int[array1.length];
		
		for (int i = 0; i < array1.length; i++) {
			suma[i] =array1[i] + array2[i];
			
		}
		System.out.println("La suma de los elementos correspondientes de dos arrays es:" + Arrays.toString(suma));

	}

}
