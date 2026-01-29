package entornos;

import java.util.Iterator;

public class p {
	
	/**
	 * Clase que analiza un conjunto de números enteros.
	 * Calcula el valor máximo, comprueba si se repite,
	 * obtiene la media y muestra resultados por consola.
	 * @author Toni
	 */
	
	/**
	 * Método para sacar la media de los números del array
	 * @param nums Array de números del main
	 */
	
	static void mediaNums(int[] nums) {
		double sumaArray = 0;
		for (int i = 0; i < nums.length; i++) {
			sumaArray += nums[i];
		}
		
		double media = sumaArray / nums.length;
		System.out.println("Media: " +media);
		
		if (media > 5) {
			System.out.println("Bien");
		}
		else {
			System.out.println("Mal");
		}
	}
	
	/**
	 * Método para comprobar las veces que se repite el número máximo
	 * @param nums Números del array
	 * @param maximo Número máximo a calcular
	 */
	
	static void repeticionesContador(int[] nums, int maximo){
        int repeticion = 0;
        
        for (int i = 0; i < nums.length; i++) {
			if (nums[i] == maximo) {
				repeticion++;
			}
		}
        if (repeticion > 1) {
        	System.out.println("Se repite el número");
		}else {
			System.out.println("No se repite el número");
		}

	}
	
	/**
	 * Método para comprobar el número máximo del array
	 * @param nums Números del array
	 * @return Devuelve el número más alto
	 */
	static int numMaximo(int [] nums) {
        int numMasAlto = nums[0];
        for (int i = 0; i < nums.length; i++) {
			if (nums[i] > numMasAlto) {
				numMasAlto = nums[i];
			}
		}
        return numMasAlto;
	}
	
	/**
	 * Método principal del código
	 */
    public static void main(String[] args) {

    	/**
    	 * Variable principal
    	 */
        int[] numerosComprobar = {5, 7, 3, 7, 2, 9, 7};


        numMaximo(numerosComprobar);

        int maximo = numMaximo(numerosComprobar);
        repeticionesContador(numerosComprobar, maximo);

        mediaNums(numerosComprobar);
    }
}

