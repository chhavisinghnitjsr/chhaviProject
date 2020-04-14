/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author chhav
 */
@SuppressWarnings("serial")
public final class RegistrationForm extends javax.swing.JFrame {

    Connection conn = null;
    resultSet rs = null;
    preparedStatement pst = null;
    private preparedStatement setString;
  
    /**
     * Creates new form RegistrationForm
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public RegistrationForm() throws SQLException, ClassNotFoundException {
    initComponents(); 
   // UpdateTable();
    } 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf7 = new javax.swing.JPasswordField();
        Submit = new javax.swing.JButton();
        tf5 = new javax.swing.JTextField();
        Show = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText(" Farmer Registration Form");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 70, 500, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText(" Enter Your Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 180, 171, 26);
        getContentPane().add(tf1);
        tf1.setBounds(530, 180, 220, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText(" Enter Your MobileNo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 230, 201, 24);
        getContentPane().add(tf2);
        tf2.setBounds(530, 220, 220, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText(" Address");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(330, 380, 105, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText(" Set User Id");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(330, 290, 126, 24);
        getContentPane().add(tf6);
        tf6.setBounds(540, 280, 172, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText(" Set Password");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 330, 134, 30);
        getContentPane().add(tf7);
        tf7.setBounds(540, 330, 172, 30);

        Submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Submit.setText(" Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(440, 490, 101, 30);
        getContentPane().add(tf5);
        tf5.setBounds(540, 380, 172, 70);

        Show.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Show.setText("Show");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });
        getContentPane().add(Show);
        Show.setBounds(580, 490, 110, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyPackage/sky backgrid.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 150, 680, 500);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyPackage/wallpaper-1920x1080-00bfff.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(240, 50, 680, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("deprecation")
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
 
    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
     final String DB_URL = "jdbc:mysql://localhost/cregistration";

   //  Database credentials
    final String user = "root";
    final String pass = "";
   // final string address = " "
   
  // public static void main(String[] args) {
  // Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = java.sql.DriverManager.getConnection(DB_URL, user, pass);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      String name = tf1.getText();
      String mobileno;
         mobileno = tf2.getText();
     // String gender = tf3.getText();
      String address = tf5.getText();
      String userid;
      userid = tf6.getText();
      
       String password= tf7.getText();
     // ResultSet sql;
     //this is for inserting the single vale inthe table
     // String sql = "INSERT INTO  cropinformation values('"+cropname+"')";
     //this is for the inserting multipal value in the table;
       String sql = "INSERT INTO registration(name,mobileno,address,userid,password)"+"values('"+name+"','"+mobileno+"','"+address+"','"+userid+"','"+password+"')";
       stmt.executeUpdate(sql);
      //String tpl = "insert into cropinformation values('"+soiltype+"')";
      //String sql = "SELECT  ("soiltype FROM cropsinformation where cropname = wheat")";
     // stmt.executeUpdate(sql);
      //stmt.executeUpdate(tpl);
      
     // while(sql.next(sql));
     // new LoginForm.setVisible(true);
     
   }catch(SQLException | ClassNotFoundException se){
         //Handle errors for JDBC

   }
        //Handle errors for Class.forName
        finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
        
      }//end finally try
   }//end try
            JOptionPane.showMessageDialog(null, "You Are Suuccessfully Registered");
           new LoginForm().setVisible(true);
  
    }//GEN-LAST:event_SubmitActionPerformed

    /**
     *
     * @param args
     */
    @SuppressWarnings({"deprecation", "empty-statement"})
    
  
    
    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
              
        
        
        
 
             try{
                 Class.forName("com.mysql.jdbc.Driver");
                 try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cregistration","root","")) {
                     String sql;
                     sql = "select * from registration  where name =?";
                     
                     PreparedStatement ps;
                     ps = con.prepareStatement(sql);
                     ps.setString(1,tf1.getText());
                     ResultSet rst;
                     rst = ps.executeQuery();
                     if(rst.next())
                     {
                         tf2.setText(rst.getString("mobileno"));
                        // tf3.setText(rst.getString("male"));
                         //tf4.setText(rst.getString("female"));
                         tf5.setText(rst.getString("address"));
                         tf6.setText(rst.getString("userid"));
                         tf7.setText(rst.getString("password"));
                         // tf5.setText(rs.getString("address"));
                     }     }
           
             } catch (ClassNotFoundException | SQLException e) {
               JOptionPane.showMessageDialog(null, "Your Registration Succefully");
             }
 

             
             
             
             
    }//GEN-LAST:event_ShowActionPerformed
    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new RegistrationForm().setVisible(true);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Show;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JPasswordField tf7;
    // End of variables declaration//GEN-END:variables

    static class setVisible {

        public setVisible(boolean b) {
        }
    }

  

}

