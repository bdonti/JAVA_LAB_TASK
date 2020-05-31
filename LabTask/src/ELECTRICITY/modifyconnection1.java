

package electricitynew;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.ResultSet;
import static electricitynew.myvariables.password;
import static electricitynew.myvariables.path;
import static electricitynew.myvariables.place;
import static electricitynew.myvariables.username;
import static java.awt.Frame.MAXIMIZED_BOTH;
import static java.nio.file.Files.delete;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author parveen
 */
public class modifyconnection1 extends javax.swing.JInternalFrame implements myvariables
{
    private int date;

    public modifyconnection1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Connection Form");
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

        jLabel1.setText("Connection Id");

        jLabel2.setText("Name");

        jLabel3.setText("Father's Name");

        jLabel4.setText("Mother's Name");

        jLabel5.setText("Choose District");

        jLabel6.setText("Phone No");

        jLabel7.setText("Address");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose your District" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Residantial Proof");

        jCheckBox1.setText("Ration Card");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Aadhar Card");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");

        jLabel9.setText("Gender");

        jLabel10.setText("Date");

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Connection Id ", "Name", "District", "Phone No", "Address ", "Gender", "Connection type"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton4.setText("Search by Id");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Search by Name");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Connection type", "Domestic", "Commercial" }));

        jLabel12.setText("Select Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel12)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
  
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {
    Connection myconnection;
    myconnection=DriverManager.getConnection(path+place, username, password);
try{
    String q="update createconnection set pname=?,pfname=?,pmname=?,choosedistrict=?,Mno=?,ctype=?,address=?,rproof=?,gender=?,date=? where cid=?";
    PreparedStatement mysat=myconnection.prepareStatement(q);
    mysat.setString(1, jTextField3.getText());
    mysat.setString(2, jTextField4.getText());
    mysat.setString(3,jTextField5.getText( ));
        mysat.setString(4, jComboBox1.getSelectedItem().toString());
mysat.setString(5, jFormattedTextField1.getText());
        mysat.setString(6, jComboBox2.getSelectedItem().toString());

     mysat.setString(7, jTextArea1.getText());
    if(jCheckBox1.isSelected() && jCheckBox2.isSelected())
    {
        String proof=jCheckBox1.getText()+","+jCheckBox2.getText();
           mysat.setString(8, proof);

    }
    else if(jCheckBox1.isSelected())
    {
            mysat.setString(8, jCheckBox1.getText());

    }
    else if(jCheckBox2.isSelected())
    {
            mysat.setString(8, jCheckBox1.getText());

    }
    if(jRadioButton1.isSelected())
    {
            mysat.setString(9, jRadioButton1.getText());

    }
    else if(jRadioButton2.isSelected()){
            mysat.setString(9, jRadioButton2.getText());

    }
    SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
      String date=myformat.format(jDateChooser1.getDate());
      mysat.setString(10, date);
          mysat.setString(11, jTextField2.getText());

          mysat.executeUpdate();

    JOptionPane.showInternalMessageDialog(rootPane, " Updated Sucessfully ", "Sucess", JOptionPane.YES_NO_CANCEL_OPTION);
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);

    jFormattedTextField1 .setText("");
    jTextArea1.setText("");
    jCheckBox1.setSelected(false);
    jCheckBox2.setSelected(false);
    buttonGroup1.clearSelection();
}
catch(Exception  e)
{
e.printStackTrace();
JOptionPane.showMessageDialog(rootPane,"Error ocuure due to "+e.getMessage(),"Error",   JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed
finally
{
        try {
            myconnection.close();
        } catch (SQLException ex) {
        }
}
}       catch (Exception ex) {
    JOptionPane.showMessageDialog(rootPane,"Error ocuure due to "+ex.getMessage());

        }
}
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
 jScrollPane2.setVisible(false);
       getContentPane().validate();  
    try {
    Connection myconnection = null ;
        try {
            myconnection =DriverManager.getConnection(path+place, username, password);
        } catch (SQLException ex) {
        }

try{
    String q="select * from district";
    PreparedStatement mysat=myconnection.prepareStatement(q);
    ResultSet myresult=mysat.executeQuery();
   
 if(myresult.next())
  
  {
       do
       {
         
  jComboBox1.addItem(myresult.getString("add_district"));
    
}while(myresult.next());
  
  }
    else
    {

  
  }
}
catch(Exception  
e)
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
    }//GEN-LAST:event_formInternalFrameActivated

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try {
    Connection myconnection;
    myconnection=DriverManager.getConnection(path+place, username, password);
try{
    String q="delete from  createconnection where cid=?";
    PreparedStatement mysat=myconnection.prepareStatement(q);
 
          mysat.setString(1, jTextField2.getText());
          int a=JOptionPane.showConfirmDialog(rootPane,"Do you really want to delete?",title,JOptionPane.YES_NO_CANCEL_OPTION);
         if(a==JOptionPane.YES_OPTION)
         {
     
     
          mysat.executeUpdate();
         }
    JOptionPane.showInternalMessageDialog(rootPane, " Deleted Sucessfully ", "Sucess", JOptionPane.YES_NO_CANCEL_OPTION);
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jComboBox1.setSelectedIndex(0);
    jFormattedTextField1 .setText("");
    jTextArea1.setText("");
    jCheckBox1.setSelected(false);
    jCheckBox2.setSelected(false);
    buttonGroup1.clearSelection();
}
catch(Exception  e)
{
e.printStackTrace();
JOptionPane.showMessageDialog(rootPane,"Error ocuure due to "+e.getMessage(),"Error",   JOptionPane.ERROR_MESSAGE);
    }                                        
finally
{
        try {
            myconnection.close();
        } catch (SQLException ex) {
        }
}
}       catch (Exception ex) {
    JOptionPane.showMessageDialog(rootPane,"Error ocuure due to "+ex.getMessage());

        }        

        


// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 try 
{
    Connection myconnection;
  
    myconnection=DriverManager.getConnection(path+place, username, password);
try{
    String q="select *  from createconnection where cid=?";
    PreparedStatement mysat=myconnection.prepareStatement(q);
       mysat.setString(1,jTextField2.getText());
    ResultSet myresult=mysat.executeQuery();
    if(myresult.next())
            { 
    jTextField3.setText(myresult.getString("pname"));
    jTextField4.setText(myresult.getString("pfname"));
    jTextField5.setText(myresult.getString("pmname"));
    jDateChooser1.setDate(myresult.getDate("date"));
   // jComboBox1.removeAllItems();
  //jComboBox1.addItem("choose district");
    jComboBox1.setSelectedItem(myresult.getString("choosedistrict"));
        jComboBox2.setSelectedItem(myresult.getString("ctype"));

    
    jFormattedTextField1 .setText(myresult.getString("Mno"));
    jTextArea1.setText(myresult.getString("address"));
    if((myresult.getString("rproof").equals("Ration Card,Aadhar Card")))
    {
 jCheckBox1.setSelected(true);
 jCheckBox2.setSelected(true);        
    }
    else if(myresult.getString("rproof").equals("Ration Card"))
    {
        jCheckBox1.setSelected(true);
        
    }
    else if(myresult.getString("rproof").equals("Aadhar Card"))
    {
        jCheckBox2.setSelected(true);
        
    }
   
if(myresult.getString("gender").equals("Male"))
{
    jRadioButton1.setSelected(true);
}
else 
{
    jRadioButton2.setSelected(true);
}
            

            }
    else
    {
         JOptionPane.showMessageDialog(rootPane, "enterted wrong input");
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
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

         jTextField2.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);

    jFormattedTextField1 .setText("");
    jTextArea1.setText("");
    jCheckBox1.setSelected(false);
    jCheckBox2.setSelected(false);
    buttonGroup1.clearSelection();
        try 
{
    Connection myconnection;
  
    myconnection=DriverManager.getConnection(path+place, username, password);
try{
     if(!jTextField3.getText().equals(""))
                {
    String q="select * from createconnection where pname like ?" ;
    PreparedStatement mysat=myconnection.prepareStatement(q);
       //mysat.setString(1,+ "%");
                    mysat.setString(1,jTextField3.getText()+ "%");

    ResultSet myresult=mysat.executeQuery();
    
    if(myresult.next())

              
    {
        jScrollPane2.setVisible(true);
              getContentPane().validate();
    DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
    mymodel.setRowCount(0);
    do
    {
        String cno,name,ph,add,dist,gen,ctype;
        cno=myresult.getString("cid");
        name=myresult.getString("pname");
        dist=myresult.getString("choosedistrict");
        ph=myresult.getString("Mno");
        add=myresult.getString("address");
        gen=myresult.getString("gender");
        ctype=myresult.getString("ctype");
        mymodel.addRow(new Object[]{cno,name,ph,add,dist,gen,ctype});
    }
   
    while(myresult.next());
    }
}
 else           
    {
        JOptionPane.showInternalMessageDialog(rootPane, "No connections found ", " ", JOptionPane.YES_NO_CANCEL_OPTION);

    
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
   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
           int column=0;
           int row=jTable1.getSelectedRow();
            String cid1=jTable1.getValueAt(row, column).toString();
            try {
    Connection myconnection;
    myconnection=DriverManager.getConnection(path+place, username, password);

try{
    String q="select * from createconnection where cid=?";
    PreparedStatement mysat=myconnection.prepareStatement(q);
    mysat.setString(1,cid1);
       ResultSet myresult=mysat.executeQuery();
if(myresult.next()){
     jTextField2.setText(myresult.getString("cid"));
     jTextField3.setText(myresult.getString("pname"));
     jTextField4.setText(myresult.getString("pfname"));
     jTextField5.setText(myresult.getString("pmname"));
    jDateChooser1.setDate(myresult.getDate("date"));
    jComboBox1.setSelectedItem(myresult.getString("choosedistrict"));
        jComboBox2.setSelectedItem(myresult.getString("ctype"));

    jFormattedTextField1 .setText(myresult.getString("Mno"));
    jTextArea1.setText(myresult.getString("address"));
    if((myresult.getString("rproof").equals("Ration Card,Aadhar Card")))
    {
 jCheckBox1.setSelected(true);
 jCheckBox2.setSelected(true);        
    }
    else if(myresult.getString("rproof").equals("Ration Card"))
    {
        jCheckBox1.setSelected(true);
        
    }
    else if(myresult.getString("rproof").equals("Aadhar Card"))
    {
        jCheckBox2.setSelected(true);
        
    }
   
if(myresult.getString("gender").equals("Male"))
{
    jRadioButton1.setSelected(true);
}
else 
{
    jRadioButton2.setSelected(true);
}

            }
         

 else           
    {
        JOptionPane.showInternalMessageDialog(rootPane, "No connections found ", " ", JOptionPane.YES_NO_CANCEL_OPTION);

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

// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked
                 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
