package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Requerimiento_1 {
    // Su código
    private String nombre;
    private String cargo;
    private int numProyectos;

    public Requerimiento_1() {

    }
    public Requerimiento_1(String nombre, String cargo, int numProyectos) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.numProyectos = numProyectos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNumProyectos() {
        return numProyectos;
    }

    public void setNumProyectos(int numProyectos) {
        this.numProyectos = numProyectos;
    }

}
