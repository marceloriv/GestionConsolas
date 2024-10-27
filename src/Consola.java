
/**
 *
 * @author Marcelo
 */
public abstract class Consola implements ICalculable {

    protected String marca, modelo;
    protected double precio;

    public Consola(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Consola{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }

    public abstract void obtenerClasificacion();
    
    @Override
    public  abstract  double  calcularPrecioFinal();
}