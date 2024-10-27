
/**
 *
 * @author Marcelo
 */
public class ConsolaPortatil extends Consola implements ICalculable {

    private int autonomiaBateria;

    public ConsolaPortatil(int autonomiaBateria, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.autonomiaBateria = autonomiaBateria;
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public String toString() {
        return super.toString() + "ConsolaPortatil{" + "autonomiaBateria=" + autonomiaBateria + '}';
    }

    @Override
    public void obtenerClasificacion() {
        System.out.println("Portatil");
    }

    @Override
    public double calcularPrecioFinal() {
        //                                          1000  - (1000 * 0.07) 
        //                                          930 * 1.19
        //                                          930 * (1+ IVA) | IVA = 0.19
        //                                          1106,7 = resultado
        double precioDescuento = getPrecio() - (getPrecio() * DESCUENTOPORTATIL);
        return precioDescuento * IVA;
    }

}
