
import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class Test {

    public static void main(String[] args) {

        String separador = "--".repeat(20);
        //Creamos los objetos registro, consolasPortatil y sobremesa
        RegistroConsola registro = new RegistroConsola();
        ConsolaPortatil consolaPortatil1 = new ConsolaPortatil(7, "nintendo", "ds", 1000);
        ConsolaSobremesa consolaSobremesa1 = new ConsolaSobremesa(2, "Sony", "PS5", 650_000);

        //Agregamos al ArrayList los objetos
        registro.agregarConsola(consolaPortatil1);
        registro.agregarConsola(consolaSobremesa1);
        System.out.println(separador);
        registro.clasificacionConsolas();
        System.out.println("La cantidad de consolas sobre el precio es: " + registro.obtnerConsolasCaro(500_000));

//       Definir nuestro escaner (Entrada de datos por teclado a traves del scanner)
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println(separador);
            System.out.println("--Menu de opciones--");
            System.out.println(separador);
            System.out.println("1.Listar Consolas");
            System.out.println("2.Eliminar Consola");
            System.out.println("3.Clasificación de consolas");
            System.out.println("4.Salir");  //salir del menu
            System.out.print("Elija su opción:");
            
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    registro.listar();
                    break;
                case 2:
                    String modelo;
                    System.out.print("Introduzca el modelo a eliminar:");
                    modelo = entrada.next();
                    registro.eliminarConsola(modelo);
                    break;
                case 3:
                    registro.clasificacionConsolas();
                    break;
                case 4:
                    System.out.println("Adios...");
                    System.out.println("(*/ω＼*)");
                    break;
                default:
                    System.out.println("Opción invalida.");
            }

        } while (opcion != 4);

    }

}
