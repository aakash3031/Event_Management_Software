/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event.management2;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CS
 */
public class Addmember extends javax.swing.JInternalFrame {
int d;
    /**
     * Creates new form AddUser
     */
    public Addmember() {
        initComponents();
        
          
           Toolkit yk= Toolkit.getDefaultToolkit();
         int x=(int) yk.getScreenSize().getWidth();
         int y=(int) yk.getScreenSize().getHeight();
        //  jLabel2.setSize(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        label3 = new java.awt.Label();
        textField2 = new java.awt.TextField();
        label4 = new java.awt.Label();
        textArea1 = new java.awt.TextArea();
        label5 = new java.awt.Label();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        label6 = new java.awt.Label();
        textField3 = new java.awt.TextField();
        label8 = new java.awt.Label();
        textField5 = new java.awt.TextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("AddMember");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        label1.setBackground(new java.awt.Color(204, 204, 255));
        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(102, 51, 0));
        label1.setText("MEMBER REGISTRATION");
        getContentPane().add(label1);
        label1.setBounds(120, 10, 225, 28);

        label2.setBackground(new java.awt.Color(204, 204, 255));
        label2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(102, 51, 0));
        label2.setText("Name");
        getContentPane().add(label2);
        label2.setBounds(50, 130, 96, 19);

        textField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textField1.setForeground(new java.awt.Color(102, 51, 0));
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        getContentPane().add(textField1);
        textField1.setBounds(190, 120, 190, 30);

        label3.setBackground(new java.awt.Color(204, 204, 255));
        label3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(102, 51, 0));
        label3.setText("Phone");
        getContentPane().add(label3);
        label3.setBounds(50, 180, 96, 19);

        textField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textField2.setForeground(new java.awt.Color(102, 51, 0));
        getContentPane().add(textField2);
        textField2.setBounds(190, 170, 190, 30);

        label4.setBackground(new java.awt.Color(204, 204, 255));
        label4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label4.setForeground(new java.awt.Color(102, 51, 0));
        label4.setText("Address");
        getContentPane().add(label4);
        label4.setBounds(50, 320, 96, 19);

        textArea1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textArea1.setForeground(new java.awt.Color(102, 51, 0));
        getContentPane().add(textArea1);
        textArea1.setBounds(190, 280, 190, 120);

        label5.setBackground(new java.awt.Color(204, 204, 255));
        label5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label5.setForeground(new java.awt.Color(102, 51, 0));
        label5.setText("Gender");
        getContentPane().add(label5);
        label5.setBounds(50, 430, 70, 19);

        jRadioButton1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(102, 51, 0));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Female");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(290, 430, 93, 23);

        jRadioButton2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(102, 51, 0));
        jRadioButton2.setText("Male");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(200, 430, 70, 23);

        label6.setBackground(new java.awt.Color(204, 204, 255));
        label6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label6.setForeground(new java.awt.Color(102, 51, 0));
        label6.setText("Email");
        getContentPane().add(label6);
        label6.setBounds(50, 240, 80, 20);

        textField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textField3.setForeground(new java.awt.Color(102, 51, 0));
        getContentPane().add(textField3);
        textField3.setBounds(190, 230, 190, 30);

        label8.setBackground(new java.awt.Color(204, 204, 255));
        label8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label8.setForeground(new java.awt.Color(102, 51, 0));
        label8.setText("MemberID");
        getContentPane().add(label8);
        label8.setBounds(50, 70, 96, 19);

        textField5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textField5.setForeground(new java.awt.Color(102, 51, 0));
        getContentPane().add(textField5);
        textField5.setBounds(190, 70, 190, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 51, 0));
        jButton2.setText("ADD");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 480, 120, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 51, 0));
        jButton3.setText("UPDATE");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(180, 480, 120, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 51, 0));
        jButton4.setText("DELETE");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(320, 480, 120, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 51, 0));
        jButton5.setText("Search");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(420, 70, 80, 30);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 0, 0);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(102, 51, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Phone", "EmailId", "MemberId"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(550, 30, 540, 460);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 51, 0));
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(420, 120, 80, 30);

        setBounds(0, 0, 1124, 656);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String url="jdbc:mysql://localhost/eventdb";
try
{
    Connection myconn =DriverManager.getConnection(url, "root", "");
try
{
    String q="insert into addmember(name,phone,email,address,gender,memberid)values(?,?,?,?,?,?)";
    PreparedStatement state=myconn.prepareStatement(q);
    
    state.setString(1, textField1.getText());
    state.setString(2, textField2.getText());
    state.setString(3, textField3.getText()); 
    state.setString(4, textArea1.getText()); 
    if(jRadioButton1.isSelected())
    {
    state.setString(5,"Female");
    }
    else
    {
    state.setString(5,"Male");
    }
    state.setString(6, textField5.getText()); 
    int res=state.executeUpdate();
    if(res>0)
    {
      JOptionPane.showMessageDialog(rootPane, "Member Added Succesfully");
       textField1.setText("");
       textField2.setText("");
       textField5.setText("");
       textArea1.setText("");
       buttonGroup1.clearSelection();
       textField3.setText("");
    }
    else
    {
           JOptionPane.showMessageDialog(rootPane, "Member NOT Added Succesfully");
       textField1.setText("");
       textField2.setText("");
       textArea1.setText("");
       buttonGroup1.clearSelection();
       textField3.setText("");

    }
    
}
catch(Exception e)
{
      JOptionPane.showMessageDialog(rootPane, "error in query"+e.getMessage()); 
}
finally
    {
      myconn.close();      
    }
}
catch(SQLException e)
{
    JOptionPane.showMessageDialog(rootPane, "error in connection"+e.getMessage());
}
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String url="jdbc:mysql://localhost/eventdb";
try
{
    Connection myconn =DriverManager.getConnection(url, "root", "");
try
{
    String q="update addmember set name=?,phone=?,email=?,address=?,gender=? where memberid=?";
    PreparedStatement state=myconn.prepareStatement(q);
    state.setString(1, textField1.getText());
    state.setString(2, textField2.getText());
    state.setString(3, textField3.getText()); 
    state.setString(4, textArea1.getText()); 
    if(jRadioButton1.isSelected())
    {
    state.setString(5,"Female");
    }
    else
    {
    state.setString(5,"Male");
    }
     state.setString(6, textField5.getText()); 
     String mid=textField1.getText();
     String mid1=textField2.getText();
     String mid2=textField3.getText();
     String mid3=textField5.getText();
    int res=state.executeUpdate();
   if(res>0)
   {
               DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
               Object myrow[]={mid,mid1,mid2,mid3};
               mymodel.addRow(myrow);
             mymodel.removeRow(d);
      JOptionPane.showMessageDialog(rootPane, "Member Updated Succesfully");
       textField1.setText("");
       textField2.setText("");
       textArea1.setText("");
       textField3.setText("");
       textField5.setText("");
       buttonGroup1.clearSelection();  
    }
   else
   {
             JOptionPane.showMessageDialog(rootPane, "Member Not Updated Succesfully");
   }
   
}
catch(Exception e)
{
      JOptionPane.showMessageDialog(rootPane, "error in query"+e.getMessage()); 
}
finally
    {
      myconn.close();      
    }
}
catch(SQLException e)
{
    JOptionPane.showMessageDialog(rootPane, "error in connection"+e.getMessage());
}
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  String url="jdbc:mysql://localhost/eventdb";
try
{ 
    int ch=JOptionPane.showConfirmDialog(rootPane,"Are u Sure to want to delete", "Confirm Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
    Connection myconn =DriverManager.getConnection(url, "root", "");
try
{
    if(ch==JOptionPane.YES_OPTION)
{
    String q="delete from addmember where memberid=?";
    PreparedStatement state=myconn.prepareStatement(q);
    state.setString(1, textField5.getText());
    int res=state.executeUpdate();
   if(res>0)
    {
      JOptionPane.showMessageDialog(rootPane, "Member Deleted Succesfully");
       textField1.setText("");
       textField2.setText("");
       textArea1.setText("");
       textField3.setText("");
       textField5.setText("");
       buttonGroup1.clearSelection(); 
         DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
         mymodel.removeRow(d);
     
    }
   else
   {
        JOptionPane.showMessageDialog(rootPane, "Wrong Id Member not Deleted Succesfully");
   }
}
    else
    {
       textField1.setText("");
       textField2.setText("");
       textArea1.setText("");
       textField3.setText("");
       textField5.setText("");
       buttonGroup1.clearSelection();
    }
}
catch(Exception e)
{
      JOptionPane.showMessageDialog(rootPane, "error in query"+e.getMessage()); 
}
finally
    {
      myconn.close();      
    }
}
catch(SQLException e)
{
    JOptionPane.showMessageDialog(rootPane, "error in connection"+e.getMessage());
}
       

    }//GEN-LAST:event_jButton4ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
jButton3.setVisible(false);jButton4.setVisible(false);
        String url="jdbc:mysql://localhost/eventdb";
try
{
    Connection myconn =DriverManager.getConnection(url, "root", "");
try
{
    buttonGroup1.clearSelection();
    String q="select * from addmember order by memberid desc";
    PreparedStatement state=myconn.prepareStatement(q);
    ResultSet res=state.executeQuery();
if(res.next())
{
    int b=res.getInt("memberid");
    textField5.setText(String.valueOf(b+1));
}
else
{
    textField5.setText(String.valueOf("1"));
}
}
catch(Exception e)
{
   JOptionPane.showMessageDialog(rootPane, "error in memberid");  
}
}
catch(SQLException e)
{
    
   JOptionPane.showMessageDialog(rootPane, "error in connection"+e.getMessage());  
}
    }//GEN-LAST:event_formInternalFrameActivated

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
             String url="jdbc:mysql://localhost/eventdb";
       try
       {
           Connection myconn=DriverManager.getConnection(url, "root", "");
           try
           {               DefaultTableModel mymodel1=(DefaultTableModel)jTable1.getModel();
               mymodel1.setRowCount(0);

             String q="select * from addmember where memberid=?";
             PreparedStatement state=myconn.prepareStatement(q);
             state.setString(1, textField5.getText());
             ResultSet res=state.executeQuery();
             if(res.next())
             {
                 jButton3.setVisible(true);
                 jButton4.setVisible(true);
                 textField1.setText(res.getString("name"));
                 textField2.setText(res.getString("phone"));
                 textArea1.setText(res.getString("address"));
                 textField3.setText(res.getString("email"));
               
                 if(res.getString("gender").equalsIgnoreCase("Male"))
                 {
                    jRadioButton2.setSelected(true);
                 }
                 else
                 {
                     jRadioButton1.setSelected(true);  
                 }
             }
             else
             {
                 JOptionPane.showMessageDialog(rootPane, "Invalid memberid"); 
             }
           }
                 catch(Exception e)
                    {
              JOptionPane.showMessageDialog(rootPane, "Error in Query"+e.getMessage());
                    }
       }
       catch(SQLException e)
       {
           JOptionPane.showMessageDialog(rootPane, "Error in Connection"+e.getMessage());
       }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
    jButton2.setBackground(Color.GRAY);    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
       jButton2.setBackground(Color.LIGHT_GRAY); // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
       jButton3.setBackground(Color.GRAY);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
 jButton3.setBackground(Color.LIGHT_GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
 jButton4.setBackground(Color.GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
 jButton4.setBackground(Color.LIGHT_GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
 jButton5.setBackground(Color.GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
 jButton5.setBackground(Color.LIGHT_GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseExited

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         String c=jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
                  String url="jdbc:mysql://localhost/eventdb";
       try
       {
           Connection myconn=DriverManager.getConnection(url, "root", "");
           try
           {
             String q="select * from addmember where memberid=?";
             PreparedStatement state=myconn.prepareStatement(q);
             state.setString(1, c);
             ResultSet res=state.executeQuery();
             if(res.next())
             {    d=jTable1.getSelectedRow();
                 textField1.setText(res.getString("name"));
                 textField2.setText(res.getString("phone"));
                 textArea1.setText(res.getString("address"));
                 textField3.setText(res.getString("email"));
                 textField5.setText(c);
               
                 if(res.getString("gender").equalsIgnoreCase("Male"))
                 {
                    jRadioButton2.setSelected(true);
                 }
                 else
                 {
                     jRadioButton1.setSelected(true);  
                 }
             }
             else
             {
                 JOptionPane.showMessageDialog(rootPane, "Invalid memberid"); 
             }
           }
                 catch(Exception e)
                    {
              JOptionPane.showMessageDialog(rootPane, "Error in Query"+e.getMessage());
                    }
       }
       catch(SQLException e)
       {
           JOptionPane.showMessageDialog(rootPane, "Error in Connection"+e.getMessage());
       }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       String url="jdbc:mysql://localhost/eventdb";
       try
       {
           Connection myconn=DriverManager.getConnection(url, "root", "");
           try
           {
      
               DefaultTableModel mymodel1=(DefaultTableModel)jTable1.getModel();
               mymodel1.setRowCount(0);
             String q="select * from addmember where name like'"+textField1.getText()+"%'";
    
            PreparedStatement state=myconn.prepareStatement(q);
           ResultSet res=state.executeQuery();
           while(res.next())
           {
              jButton3.setVisible(true);
              jButton4.setVisible(true);
               String n=res.getString("name");
               String p=res.getString("phone");
               String e=res.getString("email");
               String u=res.getString("memberid");
      
               DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
               Object myrow[]={n,p,e,u};
               mymodel.addRow(myrow);
              
           }
           if(jTable1.getRowCount()==0)
               {
                   JOptionPane.showMessageDialog(rootPane,"no memebers found");
               }
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "error in query"+e.getMessage());
        }
    }
    catch(SQLException e)
    {
       JOptionPane.showMessageDialog(rootPane, "error in connection"+e.getMessage());
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label8;
    private java.awt.TextArea textArea1;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField5;
    // End of variables declaration//GEN-END:variables
}