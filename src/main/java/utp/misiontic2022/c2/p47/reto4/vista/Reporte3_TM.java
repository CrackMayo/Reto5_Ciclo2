/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

/**
 *
 * @author User
 */
public class Reporte3_TM extends AbstractTableModel{

    private List<Requerimiento_3> requerimientos3;
    
    public Reporte3_TM(){
        this(new ArrayList<>());
    }
    
     public Reporte3_TM(List<Requerimiento_3> requerimientos3){
        this.requerimientos3 = requerimientos3;
    }
    
    @Override
    public int getRowCount() {
        return requerimientos3.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Requerimiento_3 requerimiento3 = requerimientos3.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return requerimiento3.getIdProyecto();
            case 1:
                return requerimiento3.getCiudad();
            case 2:
                return requerimiento3.getClasificacion();
            case 3:
                return requerimiento3.getCostoProyecto();
        }
        
        return null;
    }
    
    public String getColumnName(int column){
        switch(column) {
            case 0:
                return "ID Proyecto";
            case 1:
                return "Ciudad";
            case 2:
                return "Clasificacion";
            case 3:
                return "Costo del Proyecto";
              
        }
        return super.getColumnName(column);
    }
    
}
