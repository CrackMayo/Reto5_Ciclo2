/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;

/**
 *
 * @author User
 */
public class Reporte2_TM extends AbstractTableModel{

    private List<Requerimiento_2> requerimientos2;
    
    public Reporte2_TM(){
        this(new ArrayList<>());
    }
    
     public Reporte2_TM(List<Requerimiento_2> requerimientos2){
        this.requerimientos2 = requerimientos2;
    }
    
    @Override
    public int getRowCount() {
        return requerimientos2.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Requerimiento_2 requerimiento2 = requerimientos2.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return requerimiento2.getIdMaterial();
            case 1:
                return requerimiento2.getNombreMaterial();
            case 2:
                return requerimiento2.getCantidad();
            case 3:
                return requerimiento2.getPrecioUnidad();
            case 4:
                return requerimiento2.getPrecioTotal();
        }
        
        return null;
    }
    
    public String getColumnName(int column){
        switch(column) {
            case 0:
                return "ID Material";
            case 1:
                return "Nombre Material";
            case 2:
                return "Cantidad";
            case 3:
                return "Precio Unidad";
            case 4:
                return "Precio Total";
              
        }
        return super.getColumnName(column);
    }
    
}
