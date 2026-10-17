package negocio;

public class Factura {
    private String numeroPieza;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Factura(String numeroPieza, String descripcion, int cantidad, double precio) {
        setNumeroPieza(numeroPieza);
        setDescripcion(descripcion);
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public void setNumeroPieza(String numeroPieza) {
        if(numeroPieza != null && !numeroPieza.isBlank()) {
            this.numeroPieza = numeroPieza;
        }

    }
    public String getNumeroPieza() {
        return numeroPieza;
    }


    public void setDescripcion(String descripcion) {
        if(descripcion != null && !descripcion.isBlank()){
            this.descripcion = descripcion;
        }
    }
    public String getDescripcion() {
        return descripcion;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = (cantidad > 0) ? cantidad : 0;
    }
    public int getCantidad() {
        return cantidad;
    }


    public void setPrecio(double precio) {
        this.precio = (precio > 0) ? precio : 0.0;
    }
    public double getPrecio() {
        return precio;
    }

    public double getMontoFactura() {
        return cantidad * precio;
    }
}

