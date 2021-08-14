package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Requerimiento_2 {
    // Su código
    private int idMaterial;
    private String nombreMaterial;
    private int cantidad;
    private int precioUnidad;
    private int precioTotal;

    public Requerimiento_2() {

    }

    public Requerimiento_2(int idMaterial, String nombreMaterial, int cantidad, int precioUnidad, int precioTotal) {
        this.idMaterial = idMaterial;
        this.nombreMaterial = nombreMaterial;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.precioTotal = precioTotal;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

}
