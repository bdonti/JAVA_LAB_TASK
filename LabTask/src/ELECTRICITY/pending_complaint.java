/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package electricitynew;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static electricitynew.myvariables.password;
import static electricitynew.myvariables.path;
import static electricitynew.myvariables.place;
import static electricitynew.myvariables.username;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author parveen
 */
public class pending_complaint extends javax.swing.JInternalFrame implements myvariables
{

    /**
     * Creates new form listofconnections
     */
    public pending_complaint() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pending Complaints");
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Connection Id", "Name", "District", "Date", "Topic", "Enter detail/Compalint", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Choose district");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose your district" }));
        jComboBox1.setToolTipText("");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Connection Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(335, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
     
          try 
{
    Connection myconnection;
   
    myconnection=DriverManager.getConnection(path+place, username, password);

try{
    String q1="select * from district";
    PreparedStatement mysat1=myconnection.prepareStatement(q1);
    ResultSet myresult1=mysat1.executeQuery();
    if(myresult1.next())
    {
       do
       {
           jComboBox1.addItem(myresult1.getString("add_district"));
    }while(myresult1.next());
    }
   
}
catch(Exception  e)
{
e.printStackTrace();
JOptionPane.showMessageDialog(rootPane,"Error ocuure due to "+e.getMessage(),"Error",   JOptionPane.ERROR_MESSAGE);
    }                                        
  finally
{
    myconnection.close();
}
}
catch(Exception e)
        {
        e.printStackTrace();
        JOptionPane.showMessageDialog(rootPane, "Error in connection due to"+e.getMessage() );
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  try {
    Connection myconnection = null ;
       
            myconnection =DriverManager.getConnection(path+place, username, password);
       
try{
    String q1="select * from newcomplaint where dist=? and sts=?";
    PreparedStatement mysat1=myconnection.prepareStatement(q1);
    mysat1.setString(1, jComboBox1.getSelectedItem().toString());
    mysat1.setString(2,"unsolve");
     ResultSet myresult1=mysat1.executeQuery();

if(myresult1.next())
{        

    DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
    mymodel.setNumRows(0);
    do
    {
        
        String cno,name,dist,date,topic,detail,sts = null;
        cno=myresult1.getString("cid");
        name=myresult1.getString("name");
        dist=myresult1.getString("dist");
        date=myresult1.getString("date");
        topic=myresult1.getString("topic");
        detail=myresult1.getString("text");
        
        if(myresult1.getString("sts").equals("unsolve"))
        {
            sts=myresult1.getString("sts");
        }
         
                     mymodel.addRow(new Object[]{cno,name,dist,date,topic,detail,sts});
    }
    while(myresult1.next());
    
        mysat1.executeQuery();

}
 else           
    {
        JOptionPane.showInternalMessageDialog(rootPane, "No complaint found ", " ", JOptionPane.YES_NO_CANCEL_OPTION);

}
}
catch(Exception  e)
{
e.printStackTrace();
JOptionPane.showMessageDialog(rootPane,"Error ocuure due to "+e.getMessage(),"Error",   JOptionPane.ERROR_MESSAGE);
    }  
          finally
       { 
            myconnection.close();
        } 
        }
       catch(Exception e)
       {
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
                
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try {
    Connection myconnection;
    myconnection=DriverManager.getConnection(path+place, username, password);
try{
    String q="update newcomplaint set sts=? where cid=?";
    PreparedStatement mysat=myconnection.prepareStatement(q); 
   DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
   for(int i=0;i<mymodel.getRowCount();i++)
   {
mysat.setString(1, (String) jTable1.getValueAt(0, 6));
  int a=JOptionPane.showConfirmDialog(rootPane,"Do you want to solve this problem?",title,JOptionPane.YES_NO_CANCEL_OPTION);
         if(a==JOptionPane.YES_OPTION)
         {
        jTable1.setValueAt("solve",i , 6);
        mysat.setString(2,jTextField1.getText() );
        mysat.setString(1, (String) jTable1.getValueAt(0, 6) );
         // mysat.executeUpdate();
         }
      
   }
      mysat.executeUpdate();
}
catch(Exception  e)
{
e.printStackTrace();
JOptionPane.showMessageDialog(rootPane,"Error ocuure due to "+e.getMessage(),"Error",   JOptionPane.ERROR_MESSAGE);
    }                                        
finally
{
            myconnection.close();
        
}
}       catch (Exception ex) {
    JOptionPane.showMessageDialog(rootPane,"Error ocuure due to "+ex.getMessage());

        }
        



    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}