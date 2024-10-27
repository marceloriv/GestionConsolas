
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class RegistroConsola {

    private ArrayList<Consola> consolas;

    public RegistroConsola() {
        consolas = new ArrayList<>();
    }

    public boolean buscarConsola(String modelo) {
        for (Consola consola : consolas) {
            if (consola.getModelo().equalsIgnoreCase(modelo)) {
                return true;
            }

        }
        return false;
    }

    /* 
    agregarConsola: Agrega una consola a la colección, validando que
no exista otra con el mismo modelo según retorno del método
buscarConsola
     */
    public void agregarConsola(Consola consola) {
        if (!buscarConsola(consola.getModelo())) {
            consolas.add(consola);
            System.out.println("Se agrego: " + consola);
        } else {
            System.out.println("Ya existe una consola con el modelo: " + consola.getModelo());
        }
    }

    public void listar() {
        for (Consola consola : consolas) {
            System.out.println(consola);
        }
    }

    public void eliminarConsola(String modelo) {
        for (Consola consola : consolas) {
            if (consola.getModelo().equalsIgnoreCase(modelo)) {
                consolas.remove(consola);
                System.out.println("Se ha eliminado la consola :" + modelo);

            } else {
                System.out.println("No se ha encontrado el modelo: " + modelo);
            }
        }

    }

    public int obtnerConsolasCaro(int precioReferencia) {
        int cantidad = 0;
        for (Consola consola : consolas) {
            if (consola.getPrecio() >= precioReferencia) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public void clasificacionConsolas() {
        int consolasPortatil = 0, consolasSobremesa = 0;

        for (Consola consola : consolas) {
            // ¿consola es una instancia de ConsolaPortatil?
            if (consola instanceof ConsolaPortatil) {
                consolasPortatil++;
                // ¿consola es una instancia de ConsolaSobremesa?
            } else if (consola instanceof ConsolaSobremesa) {
                consolasSobremesa++;
            }
        }
        System.out.println("La cantidad de consolas de Portatil: " + consolasPortatil);
        System.out.println("La cantidad de consolas de Sobremesa: " + consolasSobremesa);
    }
}
