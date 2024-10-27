
/**
 *
 * @author Marcelo
 */
public class ConsolaSobremesa extends Consola implements ICalculable {

    private int numeroDeControles;

    public ConsolaSobremesa(int numeroDeControles, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.numeroDeControles = numeroDeControles;
    }

    public int getNumeroDeControles() {
        return numeroDeControles;
    }

    public void setNumeroDeControles(int numeroDeControles) {
        this.numeroDeControles = numeroDeControles;
    }

    @Override
    public String toString() {
        return super.toString() + "ConsolaSobremesa{" + "numeroDeControles=" + numeroDeControles + '}';
    }

    @Override
    public void obtenerClasificacion() {
        System.out.println("Sobremesa");
    }

    @Override
    public double calcularPrecioFinal() {
        double precioDescuento = getPrecio() - (getPrecio() * DESCUENTOSOBREMESA);
        return precioDescuento * IVA;
    }

}
