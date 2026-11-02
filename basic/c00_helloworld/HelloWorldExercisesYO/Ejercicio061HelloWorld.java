package basic.c00_helloworld.HelloWorldExercisesYO;
import java.io.BufferedReader; //Es la clase que permite leer el texto línea por línea.
import java.io.InputStreamReader;//Es el puente que convierte la entrada de bytes en caracteres legibles.
import java.io.IOException;//Maneja los posibles errores de E/S. los dos de encima y este son necesarios para usar el bufferedReader.
/* La conexión entre los tres es que BufferedReader lee los datos del InputStreamReader, que convierte en caracteres, y
 el throw IOExecption asegura que tu programa maneje cualquier problema durante el proceso. */
import java.util.Scanner;//esto es para el método Scanner.
import java.io.DataInputStream;
//import java.io.IOException;
public class Ejercicio061HelloWorld {
    public static void main(String[]args)throws IOException { /* Sirve para avisarle a Java que el método podría tener errores
     de entrada o salida, comp problemas al leer un archivo, pasando la responsabilidad de manejar esos posibles fallos a otra parte del programa*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Creo un objeto.
        /* System.in es la entrada por teclado.
          InputStreamReader convierte esa entrada en texto legible.
          BufferedReader la procesa de forma eficiente y línea por línea  */
        String entrada = reader.readLine();
        System.out.println(entrada);
        /////////////////////////////////////
        Scanner sc = new Scanner(System.in);// creo objeto Scanner
        String entrada1 = sc.nextLine();
        System.out.println(entrada1);
        //////////////////////////////////
        sc.useDelimiter("\n");
        String entrada2 = sc.next();
        System.out.println(entrada2);

    /* ¿Cuándo usar cada uno?
     BufferedReader es para grandes volúmenes de datos en bruto por su gran eficiencia con la memoria.
     Scanner con nextLine() para entradas interactivas por teclado cuando la simplicidad predomine.
     El delimitador con tokens es útil si necesitas procesar partes específicas línea a línea con Scanner.
       */

        /* DataInputStream es una clase que te permite leer datos de tipo primitivo, como enteros, booleanos o flotantes,
         directamente desde un flujo de entrada en formato binario. Es muy útil cuando necesitas procesar información que
           fue guardada de esa manera, sin preocuparte por la conversión de texto.*/

        DataInputStream entrada3 = new DataInputStream(System.in);
        int numero = entrada3.readInt();
        System.out.println(numero);
        /*El método 'readInt()' espera recibir los cuatro bytes que forman el número entero en formato binario.
         Por lo que no basta con escribirlo directamente en la consola como texto.
          Por ejemplo el número 1 en binario se representa con los bytes 00 00 00 01 en hexadecimal.Esos cuatro bytes
          son los que el método readInt() procesaría para devolverte el entero. Ese método espera recibir los cuatro
                            bytes binarios directamente desde otro programa o archivo. Si intentas teclear un número
                            normal, el resultado  será un valor completamente diferente.*/

        /* Para leer un archivo,debes envolver un FileInputStream dentro de tu DataInputStream. Así los bytes que espera
        leer provendran directamente de ese archivo.
         */
    }
}
