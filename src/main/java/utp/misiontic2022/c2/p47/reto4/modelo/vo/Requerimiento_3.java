package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Requerimiento_3 {
    // Su código
    private int idProyecto;
    private String ciudad;
    private String clasificacion;
    private int costoProyecto;

    public Requerimiento_3() {

    }

    public Requerimiento_3(int idProyecto, String ciudad, String clasificacion, int costoProyecto) {
        this.idProyecto = idProyecto;
        this.ciudad = ciudad;
        this.clasificacion = clasificacion;
        this.costoProyecto = costoProyecto;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getCostoProyecto() {
        return costoProyecto;
    }

    public void setCostoProyecto(int costoProyecto) {
        this.costoProyecto = costoProyecto;
    }

}
