/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event.management2;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CS
 */
public class event extends javax.swing.JInternalFrame {
String c;
int d;
//public String bookingid;
    /**
     * Creates new form booking
     */
    public event() {
        initComponents();
           Toolkit yk= Toolkit.getDefaultToolkit();
         int x=(int) yk.getScreenSize().getWidth();
         int y=(int) yk.getScreenSize().getHeight();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Booking Events");
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("FOR EVENTS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 80, 180, 33);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Event Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 150, 128, 34);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(350, 150, 150, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText("Add");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 230, 100, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 0, 0));
        jButton5.setText("Update");
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
        jButton5.setBounds(310, 230, 100, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 51, 0));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 230, 100, 30);

        jTable1.setBackground(new java.awt.Color(240, 240, 240));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(102, 51, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Eventname"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(560, 140, 180, 240);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 0));
        jLabel4.setText("AlreadyEvents");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 90, 110, 30);

        setBounds(0, 0, 1028, 615);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
fetch();        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameActivated
void fetch()
{
    try
    {
        
        String url="jdbc:mysql://localhost/eventdb";
        Connection myconn=DriverManager.getConnection(url, "root", "");
        try
        {
            jButton2.setVisible(false);
            jButton5.setVisible(false);
            String q="select * from addevent";
            
            PreparedStatement state=myconn.prepareStatement(q);
       
            ResultSet res=state.executeQuery();
           while(res.next())
           {
               String mid=res.getString("name");
               DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
               Object myrow[]={mid};
               mymodel.addRow(myrow);
              
           }
            if(jTable1.getRowCount()==0)
               {
                   JOptionPane.showMessageDialog(rootPane,"no events found");
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

}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      if(jTextField1.getText().equalsIgnoreCase(""))
{
              JOptionPane.showMessageDialog(rootPane, "Enter the event name");
}
else
{
    String url="jdbc:mysql://localhost/eventdb";
try
{
    Connection myconn =DriverManager.getConnection(url, "root", "");
try
{              
    String q="insert into addevent values(?)";
    PreparedStatement state=myconn.prepareStatement(q); 
    state.setString(1, jTextField1.getText());
   
    int res10=state.executeUpdate();
    String mid=jTextField1.getText();
    if(res10>0)
    {
        JOptionPane.showMessageDialog(rootPane, "Event Added Succesfully");
       
               DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
               Object myrow[]={mid};
               mymodel.addRow(myrow);
               jTextField1.setText("");
    }
    else
    {
           JOptionPane.showMessageDialog(rootPane, "Event NOT Added Succesfully");
    }
}
catch(Exception e)
{
      JOptionPane.showMessageDialog(rootPane, "Double Entry of same name of event" ); 
              
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
}      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
 jButton1.setBackground(Color.GRAY);       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
jButton1.setBackground(Color.LIGHT_GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//if(jTextField1.getText().equalsIgnoreCase(""))
//{
//            JOptionPane.showMessageDialog(rootPane, "first choose event for updation");
//}

        String url="jdbc:mysql://localhost/eventdb";
        try
        {
            Connection myconn =DriverManager.getConnection(url, "root", "");
            try
            {
               
                    String q="update addevent set name=? where name=?";
                    PreparedStatement state=myconn.prepareStatement(q);
                    state.setString(1, jTextField1.getText());
                    state.setString(2, c);
                    String mid=jTextField1.getText();
                            int res=state.executeUpdate();
                            if(res>0)
                            {              
               DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
               Object myrow[]={mid};
               mymodel.addRow(myrow);
             mymodel.removeRow(d);
                                jTextField1.setText("");
                                JOptionPane.showMessageDialog(rootPane, "event updated Succesfully");
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

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

            String url="jdbc:mysql://localhost/eventdb";
            try
            {
                Connection myconn =DriverManager.getConnection(url, "root", "");
                try
                {
                    String q="delete from addevent where name=?";
                    PreparedStatement state=myconn.prepareStatement(q);
                    state.setString(1, jTextField1.getText());
                    int res=state.executeUpdate();
                    String mid=jTextField1.getText();
                    if(res>0)
                    {
                        JOptionPane.showMessageDialog(rootPane, "event Deleted Succesfully");
                         
               DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
             mymodel.removeRow(d);
                          jTextField1.setText("");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "event not Deleted Succesfully");
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          c=jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
                  String url="jdbc:mysql://localhost/eventdb";
       try
       {
           Connection myconn=DriverManager.getConnection(url, "root", "");
           try
           {
             String q="select * from addevent where name=?";
             PreparedStatement state=myconn.prepareStatement(q);
             state.setString(1, c);
             ResultSet res=state.executeQuery();
             if(res.next())
             {
             jTextField1.setText(res.getString("name"));
             d=jTable1.getSelectedRow();
            
            jButton2.setVisible(true);
            jButton5.setVisible(true);
             }
             else
             {
                 JOptionPane.showMessageDialog(rootPane, "Invalid event"); 
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked
                                 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
