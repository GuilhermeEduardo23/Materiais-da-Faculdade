
package Menu;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LimpaTabela {
    public static void limparTabela(JTable tabela){
        if(tabela.getRowCount() > 0){
            DefaultTableModel tblRemove = (DefaultTableModel)tabela.getModel();
            int contador = tabela.getRowCount();
            int i = 0;
            
            while(i < contador){
                tblRemove.removeRow(0);
                i++;
            }
        }
    }
}
