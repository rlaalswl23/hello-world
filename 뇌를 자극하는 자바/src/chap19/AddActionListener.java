package chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.kosea.kmove30.JDBC_Manager;

public class AddActionListener implements ActionListener {

	JTable table;
	JTextField text1, text2, text3;
	JDBC_Manager jdbcManager;
	
	public AddActionListener(JDBC_Manager jdbcManager, 
			                  JTable table, JTextField text1, 
			                   JTextField text2, JTextField text3) {
		
		this.jdbcManager = jdbcManager;
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}
	public void actionPerformed(ActionEvent e) {
		
		String arr[] = new String[3];
		arr[0] = text1.getText();
		arr[1] = text2.getText();
		arr[2] = text3.getText();
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		boolean isCheck = false; // 입력창 체크상태
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].length() > 0)
				isCheck = true;
			else
				isCheck = false;
			System.out.println("arr["+i+"]:" + arr[i]);
		}
		
		if(isCheck) {
	    	model.addRow(arr); // JTable 테이블에 데이터 추가
	    	try {
		         //DB insert 추가 작업
	     	     jdbcManager.insertTable(arr);
	    	}catch (Exception ex) {
				ex.getMessage();
			}
	    }
		// 입력창 빈칸 만들기
		text1.setText("");
		text2.setText("");
		text3.setText("");
	}
	
}
