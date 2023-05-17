package rs.ac.bg.fon.ps.view.form.componenet.table;

import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import rs.ac.bg.fon.ps.domain.Vozac;


public class VozacTableModel extends AbstractTableModel{
    private final String[] columnNames= {"ID","JMBG","Ime", "Prezime","Datum rodjenja", "Radni staz"};
    private final List<Vozac> vozaci;

    public VozacTableModel(List<Vozac> vozaci) {
        this.vozaci = vozaci;
    }

    @Override
    public String getColumnName(int column) {
        if (column>columnNames.length) return "n/a";
        return columnNames[column]; 
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
       
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Vozac vozac = vozaci.get(rowIndex);
        switch(columnIndex){
            case 0:
                vozac.setJMBG(String.valueOf(value));
                break;
            case 1:
                vozac.setIme(String.valueOf(value));
                break;
            case 2:
                vozac.setPrezime(String.valueOf(value));
                break;
            case 3:
                vozac.setDatumRodjenja((Date)(value));
                break;
            case 4:
                vozac.setRadniStaz((int) value);
                break;
        }
    }
    
    @Override
    public int getRowCount() {
        if (vozaci==null) return 0;
        return vozaci.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vozac vozac = vozaci.get(rowIndex);
        switch(columnIndex){
            case 0: return vozac.getJMBG();
            case 1: return vozac.getIme();
            case 2: return vozac.getPrezime();
            case 3: return vozac.getDatumRodjenja();
            case 4: return vozac.getRadniStaz();
            default:
                return "n/a";
        }
    }

    public void addProduct(Vozac vozac) {
        vozaci.add(vozac);
        //fireTableDataChanged();
        fireTableRowsInserted(vozaci.size()-1, vozaci.size()-1);
    }

    public Vozac getProductAt(int row) {
        return vozaci.get(row);
    }
    
}
