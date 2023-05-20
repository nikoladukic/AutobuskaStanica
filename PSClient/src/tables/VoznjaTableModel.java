package tables;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import domain.Autobus;
import domain.Vozac;
import domain.Voznja;
import java.text.SimpleDateFormat;


public class VoznjaTableModel extends AbstractTableModel {

    List<Voznja> voznje;
    String [] columns=new String[]{ "Datum polaska", "Vreme polaska", "Vozac", "Autobus","Mesto Polaska", "Mesto dolaska"};
    Class[]classes= new Class[]{Object.class,Object.class,Object.class,Object.class,Object.class,Object.class};
    
     public VoznjaTableModel(List<Voznja> voznje) {
        this.voznje = voznje;
    }
    @Override
    public int getRowCount() {
        return voznje.size();
    }

  

    @Override
    public int getColumnCount() {
            return columns.length;
    }

     @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
            
        Voznja voznja=voznje.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                String datum = format.format(voznja.getDatumPolaska());
                return datum;
            case 1:
                int HH=voznja.getVremePolaska().getHours();
                int mm=voznja.getVremePolaska().getMinutes();
                int ss=voznja.getVremePolaska().getSeconds();
                return HH+":"+mm+":"+ss;
            case 2: return voznja.getVozac();
            case 3: return voznja.getAutobus();
            default:
                return "n/a";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
    Voznja voznja=voznje.get(rowIndex);
        switch (columnIndex) {
            case 1: voznja.setDatumPolaska((Date)(aValue)); break;
            case 2: voznja.setVremePolaska(Time.valueOf(String.valueOf(aValue))); break;
            case 3: voznja.setVozac((Vozac)(aValue)); break;
            case 4: voznja.setAutobus((Autobus)(aValue)); break;
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
 
    
    
    public void addVoznja(Voznja voznja){
        voznje.add(voznja);
        fireTableDataChanged();
    }
    public void removeVoznja(int index){
        voznje.remove(index);
        fireTableCellUpdated(index, index);
    }
    public List<Voznja> getVoznja(){
        return voznje;
    }
    
}
