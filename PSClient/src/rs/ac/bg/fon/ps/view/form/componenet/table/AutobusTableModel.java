package rs.ac.bg.fon.ps.view.form.componenet.table;

import java.math.BigDecimal;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import rs.ac.bg.fon.ps.domain.Autobus;
import rs.ac.bg.fon.ps.domain.VrstaAutobusa;

public class AutobusTableModel extends AbstractTableModel {

    List<Autobus> autobusi;
    String [] columns=new String[]{"Registarski broj", "Marka", "Godina proizvodnje", "Broj mesta", "Vrsta"};
    Class[]classes= new Class[]{Object.class,Object.class,Object.class,Object.class,Object.class};
    
     @Override
    public int getRowCount() {
        return autobusi.size();
        

    }

    public AutobusTableModel(List<Autobus> autobusi) {
        this.autobusi = autobusi;
    }

    @Override
    public int getColumnCount() {
            return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
            
        Autobus autobus=autobusi.get(rowIndex);
        switch (columnIndex) {
            case 0: return autobus.getRegBrojVozila();
            case 1: return autobus.getMarkaAutobusa();
            case 2: return autobus.getGodinaProizvodnje();
            case 3: return autobus.getMarkaAutobusa();
            case 4: return autobus.getVrstaAutobusa();
            default:
                return "n/a";
        }


    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
    Autobus autobus=autobusi.get(rowIndex);
        switch (columnIndex) {
            case 0: autobus.setRegBrojVozila(String.valueOf(aValue)); break;
            case 1: autobus.setMarkaAutobusa(String.valueOf(aValue)); break;
            case 2: autobus.setGodinaProizvodnje((int)(aValue)); break;
            case 3: autobus.setMarkaAutobusa(String.valueOf(aValue)); break;
            case 4: autobus.setVrstaAutobusa((VrstaAutobusa)(aValue)); break;
            default:
                
        }

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
return true;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
            return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
            return columns[column];
    }
 
    
    
    public void addAutobus(Autobus autobus){
        autobusi.add(autobus);
        fireTableDataChanged();
    }
    public void removeAutobus(int index){
        autobusi.remove(index);
        fireTableCellUpdated(index, index);
    }
    public List<Autobus> getAutobusi(){
        return autobusi;
    }
}
