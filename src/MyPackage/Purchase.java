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
import javax.swing.JOptionPane;

/**
 *
 * @author chhav
 */
@SuppressWarnings("serial")
public class Purchase extends javax.swing.JFrame {

    /**
     * Creates new form Purchase
     */
    public Purchase() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        AcceptBtn = new javax.swing.JButton();
        tf3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        TotalBtn = new javax.swing.JButton();
        tf20 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf12 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf10 = new javax.swing.JTextField();
        SubmitBtn = new javax.swing.JButton();
        label1 = new java.awt.Label();
        tf13 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Purchase");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(387, 29, 178, 41);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CropId");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(154, 123, 92, 35);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("CropName");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(282, 129, 108, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Price/item");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(154, 296, 104, 35);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(463, 123, 91, 35);
        getContentPane().add(tf1);
        tf1.setBounds(154, 189, 92, 34);

        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        getContentPane().add(tf2);
        tf2.setBounds(282, 176, 120, 34);
        getContentPane().add(tf4);
        tf4.setBounds(474, 176, 91, 34);

        AcceptBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AcceptBtn.setText("Accept");
        AcceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AcceptBtn);
        AcceptBtn.setBounds(644, 672, 121, 40);
        getContentPane().add(tf3);
        tf3.setBounds(154, 365, 177, 34);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Departure Date");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(154, 533, 141, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Arrival Date");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(154, 640, 120, 22);
        getContentPane().add(tf5);
        tf5.setBounds(413, 479, 178, 26);
        getContentPane().add(tf6);
        tf6.setBounds(413, 637, 178, 35);

        TotalBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TotalBtn.setText("Total");
        TotalBtn.setActionCommand("TotalBtn");
        TotalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalBtnActionPerformed(evt);
            }
        });
        getContentPane().add(TotalBtn);
        TotalBtn.setBounds(664, 312, 81, 35);
        TotalBtn.getAccessibleContext().setAccessibleName("TotalBtn");

        getContentPane().add(tf20);
        tf20.setBounds(644, 365, 177, 34);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Departure place");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(154, 479, 155, 26);
        getContentPane().add(tf12);
        tf12.setBounds(413, 590, 178, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("  Arrival Place");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(618, 125, 147, 35);
        getContentPane().add(tf10);
        tf10.setBounds(597, 178, 121, 30);

        SubmitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SubmitBtn);
        SubmitBtn.setBounds(664, 237, 101, 31);

        label1.setBackground(new java.awt.Color(255, 204, 204));
        label1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label1.setText("Arrival Place");
        getContentPane().add(label1);
        label1.setBounds(154, 590, 133, 29);
        getContentPane().add(tf13);
        tf13.setBounds(413, 536, 178, 30);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 0, 800, 110);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 110, 800, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AcceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptBtnActionPerformed
     
    
        try{
                 Class.forName("com.mysql.jdbc.Driver");
                 try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmarket","root","")) {
                     String sql;
                     sql = "select * from cpurchase  where cropid =?";
                     
                     PreparedStatement ps;
                     ps = con.prepareStatement(sql);
                     ps.setString(1,tf1.getText());
                     ResultSet rst;
                     rst = ps.executeQuery();
                     if(rst.next())
                     {
                         tf3.setText(rst.getString("price"));
                         tf5.setText(rst.getString("departureplace"));
                         tf13.setText(rst.getString("departuredate"));
                         tf12.setText(rst.getString("arrivalplace"));
                         tf6.setText(rst.getString("arrivaldate"));
                     }    
                 }
           
             } catch (ClassNotFoundException | SQLException e) {
               JOptionPane.showMessageDialog(null, "Your purchasing Succefully");
             }
              JOptionPane.showMessageDialog(null, "Your purchasing Succefully");
             new HomePage().setVisible(true);
  
        
        
        
   
// TODO add your handling code here:
    }//GEN-LAST:event_AcceptBtnActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void TotalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalBtnActionPerformed
      
        
         try{
                 Class.forName("com.mysql.jdbc.Driver");
                 try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmarket","root",""))
                 {
                   
                     String sql;
                     sql = "select price from cpurchase  where cropid =?";
                     sql = "select quantity from purchase  where cropid =?";
                   
                    // ps.setString(1,tf1.getText());
                    // ResultSet rst;
                     //rst = null;
                    try
                    {
                            //tf3.setText("");
                            //tf5.setText("");
                            tf20.setText("");

                            //if(TotalBtn.isSelected()==true)
                            //{
                               int num1 = Integer.parseInt(tf4.getText());
                               int num2 = Integer.parseInt(tf3.getText());
                               //System.out.println(tf4.getText());
                               //tf4.setText("bhgd");
                              
                              int  total = (num1)*(num2);
                             // total = Integer.valueOf(total);
                              // String total = String.valueOf(total);
                              String rst;
                                rst = String.format("0.0f",total);
                                //tf20.setText(rst);
                              tf20.setText(Integer.toString(total));
                              JOptionPane.showMessageDialog(null,"The Answer is: "+total,"total:",JOptionPane.INFORMATION_MESSAGE);
                           // }
                            
                        }catch(NumberFormatException e)
                        {
                             JOptionPane.showMessageDialog(null, "Please Input a Integer","Error",JOptionPane.ERROR_MESSAGE);
                        }
// TODO add your handling code here:
// TODO add your handling code here:
                 }
         }catch (ClassNotFoundException | SQLException e) {
               JOptionPane.showMessageDialog(null, "Your purchasing Succefully");
             }
        
        
    

// TODO add your handling code here:
    }//GEN-LAST:event_TotalBtnActionPerformed

    
    
    
    
    
    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
     final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
     final String DB_URL = "jdbc:mysql://localhost/cmarket";

    //Database credentials
    final String user = "root";
    final String pass = "";
    // final string address = " "
    // public static void main(String[] args) {
     Connection conn = null;
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
      String cropid = tf1.getText();
      String cropname;
         cropname = tf2.getText();
      String quantity;
         quantity = tf4.getText();
   
      String arrivalplace;
         arrivalplace = tf10.getText();
     // ResultSet sql;
     //this is for inserting the single vale inthe table
     // String sql = "INSERT INTO  cropinformation values('"+cropname+"')";
     //this is for the inserting multipal value in the table;
       String sql = "INSERT INTO purchase(cropid, cropname, quantity, arrivalplace)"+"values('"+cropid+"','"+cropname+"','"+quantity+"','"+arrivalplace+"')";
       stmt.executeUpdate(sql);
      //String tpl = "insert into cropinformation values('"+soiltype+"')";
      //String sql = "SELECT  ("soiltype FROM cropsinformation where cropname = wheat")";
     // stmt.executeUpdate(sql);
      //stmt.executeUpdate(tpl);
      
     // while(sql.next(sql));
     
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
 JOptionPane.showMessageDialog(null, "Your data submitted Successfully");
        
    }//GEN-LAST:event_SubmitBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptBtn;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JButton TotalBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf10;
    private javax.swing.JTextField tf12;
    private javax.swing.JTextField tf13;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf20;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    // End of variables declaration//GEN-END:variables

    
}
