package Core;

import javax.swing.table.AbstractTableModel;

public class TabelModelKromosom extends AbstractTableModel{
public Object [][]data;
public String [] namaKolom;


    public TabelModelKromosom(Object [][] data, String [] namakolom){
        this.data = data;
        this.namaKolom = namakolom;
        //showNamaKolom();
    }
    public void showNamaKolom(){
        for(int a=0; a<namaKolom.length; a++){
            System.out.println(namaKolom[a]);
        }
    }
    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return namaKolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int colIndex) {
        return data[rowIndex][colIndex];
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return true;
    }
    
}
