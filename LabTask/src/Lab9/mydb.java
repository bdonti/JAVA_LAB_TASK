/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author RAHID
 */
public class mydb {
     private Connection con;
    private Statement st;
    private ResultSet rs;

    //constructors
    public mydb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Step-1: get a connection to the db
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb", 
                    "root", "");
            System.out.println("DB Connect Successful");
            //Step-2: create a statement
            st = con.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    //parameterized constructor
    public mydb(String url, String user, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Step-1: get a connection to the db
            con = DriverManager.getConnection(url, user, password);
            //Step-2: create a statement
            st = con.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e);
        }
    }
  
    public ResultSet getResultSet() {
        try {
            String query = "select ID,NAME,DEPARTMENT,MAJOR;";
            //Step-3: Execute SQL query
            rs = st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return rs;
    }

    public void printDataInConole(ResultSet rs) {
        try {
            while (rs.next()) {
                String id = rs.getString("ID");
                String name = rs.getString("NAME");
                String department = rs.getString("DEPARTMENT");
                String major = rs.getString("MAJOR");
                System.out.println("\nStudent Id: " +id +"\n"
                        + "name: " +name + "\n"
                        + "department: " +department
                        + "major: " +major);
            }//end of while
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    public void insertIntoDB(ArrayList row) {
        try {
            String query = "insert into Student(id,name,department,major) values('" +
                    row.get(0) + "','" + row.get(1) + "','" + row.get(2) +"','"+ row.get(3)+"');";
            System.out.println(query);
            //Step-3: Execute SQL query
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Student Info Added Successfully.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Insert into Database Exception: " + e);
            System.out.println(e);
        }
         
    }
    
}
