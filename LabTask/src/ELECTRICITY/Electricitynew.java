/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package electricitynew;

import static electricitynew.myvariables.password;
import static electricitynew.myvariables.path;
import static electricitynew.myvariables.place;
import static electricitynew.myvariables.username;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author parveen
 */

public class Electricitynew {
  
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
   } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        }
      
try{
    Connection myconnection;
    
    
    myconnection=DriverManager.getConnection(path+place, username, password);
    
    try{
        String q="select*from admintable";
        PreparedStatement mysat=myconnection.prepareStatement(q);
        
        ResultSet myresult=mysat.executeQuery();
        
        // mysat.executeUpdate();
        if(myresult.next())
        {
            login1  obj=new login1();
            
            obj.setVisible(true);
        }
        else {
            createadmin obj=new createadmin();
            obj.setVisible(true);
        }
        
        
    }
    catch(SQLException  e)
    {
        System.out.println("Error occured due to"+e.getMessage());
        
        
    }
    finally
    {    myconnection.close();
    }
}
catch(SQLException  ex)
{
  
         
}


  //  new electrictyparente().setVisible(true);
    }
    

}
