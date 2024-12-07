package com.nt.jdbc;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIAppFrame extends JFrame implements ActionListener ,WindowListener{
private static final String STUDENT_INSERT_QUERY="INSERT INTO STUDENT VALUES(?,?,?)";
private JLabel lno,lname,laddrs,lresult;
private JTextField tno,tname,taddrs;
private JButton btn;
Connection con;
PreparedStatement ps;

public GUIAppFrame(){
System.out.println("constructor");
setTitle("GUI App");
setSize(200,200);
setBackground(Color.CYAN);
setLayout(new FlowLayout());
//add comps
lno=new JLabel("student number::");
add(lno);
tno=new JTextField(10);
add(tno);

lname=new JLabel("student name::");
add(lname);
tname=new JTextField(10);
add(tname);

laddrs=new JLabel("student address::");
add(laddrs);
taddrs=new JTextField(10);
add(taddrs);

btn=new JButton("Register");
add(btn);
btn.addActionListener(this);

lresult=new JLabel("");
lresult.setForeground(Color.RED);
add(lresult);
setVisible(true);
makeConnection();
//Terminate app when window is closed
setDefaultCloseOperation(EXIT_ON_CLOSE);
addWindowListener(this);
}//constructor


private void makeConnection(){
System.out.println("makeConnection()");
try{
//register JDBC driver
Class.forName("oracle.jdbc.driver.OracleDriver");
//establish the connection
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
//create PreparedStatement object 
ps=con.prepareStatement(STUDENT_INSERT_QUERY);
}//try
catch(SQLException se){
se.printStackTrace();
}
catch(Exception e){
e.printStackTrace();
}

}//makeConnection()


@Override
public void actionPerformed(ActionEvent ae) {
System.out.println("actionPerformed(-)");
int no=0;
String name=null,addrs=null;
int result=0;
try{
//read the text box values
no=Integer.parseInt(tno.getText());
name=tname.getText();
addrs=taddrs.getText();
//set values to query params
ps.setInt(1, no);
ps.setString(2,name);
ps.setString(3,addrs);
//execute the Query
result=ps.executeUpdate();
if(result==1)
lresult.setText("Registration successful");
else
lresult.setText("Registration Failed");
}//try
catch(SQLException se){
lresult.setText("Registration Failed");
}
catch(Exception e){
lresult.setText("Registration Failed");
e.printStackTrace();
}
}//method

public static void main(String[] args) {
System.out.println("main(-)");
new GUIAppFrame();

}//main

@Override
public void windowOpened(WindowEvent e) {
// TODO Auto-generated method stub

}

@Override
public void windowClosing(WindowEvent e) {
System.out.println("windowClosing(-)");
//close jdbc objs
try{
if(ps!=null)
ps.close();
}
catch(SQLException se){
se.printStackTrace();
}

try{
if(con!=null)
con.close();
}
catch(SQLException se){
se.printStackTrace();
}
}//windowClosing(-)

@Override
public void windowClosed(WindowEvent e) {
// TODO Auto-generated method stub

}

@Override
public void windowIconified(WindowEvent e) {
// TODO Auto-generated method stub

}

@Override
public void windowDeiconified(WindowEvent e) {
// TODO Auto-generated method stub

}

@Override
public void windowActivated(WindowEvent e) {
// TODO Auto-generated method stub

}

@Override
public void windowDeactivated(WindowEvent e) {
// TODO Auto-generated method stub

}
}//class