
public class ConversionDatos {
	
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		/*
		 * Tipos de datos en Java
		 * Numéricos: byte, short, int, long, float, doble
		 * Booleanos:(verdadero, falso): boolean
		 * Caracteres: char
		 * Cadenas: String
		 */
		
		/* aqui se generó un error para observar que cuando 
		 * llevas al limite un dato, te sugiere usar el siguiente 
		 * rango para que sea valido y correcto el codigo
		 * byte 8 bits
		 * short 16 bits
		 * int 32 bits
		 * long 64 bits
		byte numeropequeno = 122;
		byte otropeque = 122;
		byte suma = numeropequeno + otropeque*/
		//int suma = numeropequeno + otropeque; -este es el bueno-
		
		int numero1 = 1000;
		long numero2 = numero1;
		float numero3 = numero2;
		
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero3);
		//System.out.println(suma);
	}

}
