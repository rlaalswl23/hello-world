package chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RemoveActionListener implements ActionListener {

	JTable table;

	public RemoveActionListener(JTable table) {
		super();
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int row = table.getSelectedRow();
		if (row == -1)
			return;
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.removeRow(row);
	}
	
}
