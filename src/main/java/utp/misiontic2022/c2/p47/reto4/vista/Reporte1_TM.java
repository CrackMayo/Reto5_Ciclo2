/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;

/**
 *
 * @author User
 */
public class Reporte1_TM extends AbstractTableModel{

    private List<Requerimiento_1> requerimientos1;
    
    public Reporte1_TM(){
        this(new ArrayList<>());
    }
    
     public Reporte1_TM(List<Requerimiento_1> requerimientos1){
        this.requerimientos1 = requerimientos1;
    }
    
    @Override
    public int getRowCount() {
        return requerimientos1.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Requerimiento_1 requerimiento1 = requerimientos1.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return requerimiento1.getNombre();
            case 1:
                return requerimiento1.getCargo();
            case 2:
                return requerimiento1.getNumProyectos();
        }
        
        return null;
    }
    
    public String getColumnName(int column){
        switch(column) {
            case 0:
                return "Líder";
            case 1:
                return "Cargo";
            case 2:
                return "Número de Proyectos";
        }
        return super.getColumnName(column);
    }
    
}
