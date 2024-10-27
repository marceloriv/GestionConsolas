
/**
 *
 * @author Marcelo
 */
public interface ICalculable {

    double DESCUENTOPORTATIL = 0.07; // Desuento del 7% a portatil
    double DESCUENTOSOBREMESA = 0.1; // Desuento del 10% a sobremesa
    double IVA = 1.19; // Se le suma un 19% al precio final el IVA

    double calcularPrecioFinal();

}
