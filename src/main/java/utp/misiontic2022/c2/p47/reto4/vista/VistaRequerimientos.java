package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            // Su código
            ArrayList<Requerimiento_1> result1 = controlador.consultarRequerimiento1();
            for (Requerimiento_1 persona : result1) {
                System.out.println(persona.getNombre() + " " + persona.getCargo() + " " + persona.getNumProyectos());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            // Su código
            ArrayList<Requerimiento_2> result2 = controlador.consultarRequerimiento2();
            for (Requerimiento_2 material : result2) {
                System.out.println(material.getIdMaterial() + " " + material.getNombreMaterial() + " " + material.getCantidad() + " " + material.getPrecioUnidad() + " " + material.getPrecioTotal());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            ArrayList<Requerimiento_3> result3 = controlador.consultarRequerimiento3();
            for (Requerimiento_3 proyecto : result3) {
                System.out.println(proyecto.getIdProyecto() + " " + proyecto.getCiudad() + " " + proyecto.getClasificacion() + " " + proyecto.getCostoProyecto());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
