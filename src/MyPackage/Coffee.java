/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

/**
 *
 * @author chhav
 */
public class Coffee extends javax.swing.JInternalFrame {

    /**
     * Creates new form Coffee
     */
    public Coffee() {
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
        label1 = new java.awt.Label();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyPackage/coffee.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 60, 270, 190);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("* It is type of cashcrop.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 260, 300, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("* It is used in Drinking.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 320, 310, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("* It CostPrice is 1234 Rupees");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 380, 390, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("* It  Sold Price is 2341 rupees.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 430, 380, 40);

        label1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label1.setText("Coffee");
        getContentPane().add(label1);
        label1.setBounds(210, 10, 120, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}