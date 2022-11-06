/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Sanjay
 */
public class NewBook extends javax.swing.JFrame {
Connection con;
    ResultSet rs;
    PreparedStatement ps;
    /**
     * Creates new form NewBook
     */
    public NewBook() {
        super("Add New Book");
        initComponents();
        con = Connect.Connect();
        random();
    }
    public void random(){
        boolean num[] = new boolean[1001];
        Arrays.fill(num, false);
        Random r = new Random();
        int s = r.nextInt(1000);
        if(num[s] ==true){
            random();
        }
        String s1 = Integer.toString(s);
        jTextField7.setText(s1);
        num[s] = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("Author");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Edition");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("Publisher");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setText("Price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setText("Book Id");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setText("Isbn");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanjay\\Desktop\\CHANDRESH\\LibraryICons\\book_add.png")); // NOI18N
        jButton1.setText("Add");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 100, 40));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanjay\\Desktop\\CHANDRESH\\LibraryICons\\Back.png")); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 120, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 190, 30));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 190, 30));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 190, 30));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 190, 30));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 190, 30));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 190, 30));

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setEnabled(false);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 190, 30));

        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 204), 4), "New Book", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 0, 0))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 380, 460));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanjay\\Desktop\\CHANDRESH\\LibraryICons\\w1.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 400, 470));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanjay\\Desktop\\CHANDRESH\\LibraryICons\\2.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.hide();
        Home h = new Home();
        h.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
        // TODO add your handling code here:
        
        int B_id= Integer.parseInt(jTextField7.getText());
        String B_Name = jTextField1.getText();
        String Author = jTextField3.getText();
        int isbn = Integer.parseInt(jTextField2.getText());
        String publisher = jTextField5.getText();
        int edition = Integer.parseInt(jTextField4.getText());
        int price = Integer.parseInt(jTextField6.getText());
     
        
        String query = "Insert into book(b_Id ,b_name,isbn,author,edition,publisher,price) values(?,?,?,?,?,?,?)";
        ps=con.prepareStatement(query);
        ps.setInt(1, B_id);
        ps.setString(2, B_Name);
        ps.setInt(3, isbn);
        ps.setString(4, Author);
        ps.setInt(5, edition);
        ps.setString(6, publisher);
        ps.setInt(7, price);
        
        ps.execute();
        JOptionPane.showMessageDialog(this, "New Book Added Successfully!");
      random();
        jTextField2.setText("");
         jTextField3.setText("");
          jTextField4.setText("");
           jTextField5.setText("");
            jTextField6.setText("");
             jTextField1.setText("");
        rs.close();
        ps.close();
    } catch (Exception ex) {
       
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
