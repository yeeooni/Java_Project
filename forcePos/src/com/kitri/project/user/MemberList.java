package com.kitri.project.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MemberList implements MouseListener {

	Vector v;
	Vector cols;
	DefaultTableModel model;
	JTable jTable;
	JScrollPane pane;
	UserDao dao;
	
	//기본생성자
	public MemberList() {
		
		UserDao dao = new UserDao();
		v = dao.getMemberList();
		cols = getColum();
		
		model = new DefaultTableModel(v, cols);
	
		jTable = new JTable(model);
		pane = new JScrollPane(jTable);
		
		
		jTable.addMouseListener(this);
		

		
		
		
	}
	
	//Jtable 내용 갱신
	public void jtableRefresh() {
		
		dao = new UserDao();
		DefaultTableModel model = new DefaultTableModel(dao.getMemberList(), getColum());
		jTable.setModel(model);
		
	}
	
	//Jtable 컬럼
	private Vector getColum() {
		Vector col = new Vector();
		
		col.add("유저코드");
		col.add("이름");
		col.add("분류");
		
		return col;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
