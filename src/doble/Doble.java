
package doble;

/**
 *
 * @author Emilia
 */
import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class Doble {

	public static void main(String[] args) {
		float numero;
                Scanner teclado = new Scanner(System.in);//Creación de un objeto Scanner
		System.out.print("Introduce un número real: ");
		numero = teclado.nextFloat(); //Invocamos un método sobre un objeto Scanner
                        
                        System.out.println("El doble del número: " + numero + " es: " + 2 * numero);
	}

}
