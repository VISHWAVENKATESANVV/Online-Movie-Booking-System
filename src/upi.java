
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaush
 */
public class upi extends javax.swing.JFrame {

    /**
     * Creates new form upi
     */
    public upi() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        TICKETS = new javax.swing.JLabel();
        TIME = new javax.swing.JLabel();
        DATE = new javax.swing.JLabel();
        THEATRE = new javax.swing.JLabel();
        MOVIE = new javax.swing.JLabel();
        TOTAL = new javax.swing.JLabel();
        ROWS = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\kaush\\Downloads\\upi back.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 40, 40));

        TICKETS.setForeground(new java.awt.Color(255, 255, 255));
        TICKETS.setText("TICKETS");
        jPanel1.add(TICKETS, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 13, -1, -1));

        TIME.setForeground(new java.awt.Color(255, 255, 255));
        TIME.setText("jLabel1");
        jPanel1.add(TIME, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 36, -1, -1));

        DATE.setForeground(new java.awt.Color(255, 255, 255));
        DATE.setText("jLabel1");
        jPanel1.add(DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 59, -1, -1));

        THEATRE.setForeground(new java.awt.Color(255, 255, 255));
        THEATRE.setText("jLabel1");
        jPanel1.add(THEATRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 82, -1, -1));

        MOVIE.setForeground(new java.awt.Color(255, 255, 255));
        MOVIE.setText("jLabel1");
        jPanel1.add(MOVIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 105, -1, -1));

        TOTAL.setForeground(new java.awt.Color(255, 255, 255));
        TOTAL.setText("jLabel1");
        jPanel1.add(TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        ROWS.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(ROWS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 10));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticket/booking/bhim-upi-icon.png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, 100));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Enter Your UPI ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 140, 40));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kaush\\Downloads\\verify and pay.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 200, 40));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 170, 30));

        jLabel2.setText(" @upi");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 50, 30));

        user.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
paymentNew gp=new paymentNew();
gp.date.setText(DATE.getText());
gp.time.setText(TIME.getText());
gp.theatreName.setText(THEATRE.getText());
gp.amount.setText(TOTAL.getText());
gp.rows.setText(ROWS.getText());
gp.SEAT.setText(TICKETS.getText());
gp.movieLabel.setText(MOVIE.getText());
gp.user.setText(user.getText());
gp.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try
{
    String username=user.getText();
    String upi=jTextField1.getText();
    Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","");
PreparedStatement pst=con.prepareStatement("update moviefake set upi_id='"+upi+"@upi' where username='"+username+"'");
                pst.executeUpdate();
                String sql="SELECT * FROM moviefake WHERE username='"+username+"'";
                PreparedStatement st=con.prepareStatement(sql);
      ResultSet rs=st.executeQuery();
      if(rs.next())
      {
          String movie=rs.getString(6);
          String seat=rs.getString(10);
          String amount=rs.getString(14);
          String date=rs.getString(7);
          String time=rs.getString(8);
          String theatre=rs.getString(9);
          String rows=rs.getString(11);
          setVisible(false);
          ticket t=new ticket();
          t.ROWS.setText(rows);
          t.Movie.setText(movie);
          t.Date.setText(date);
          t.Theatre.setText(theatre);
          t.Tickets.setText(seat);
          t.Total.setText(amount);
          t.Time.setText(time);
          t.setVisible(true);
      }
}
catch(SQLException ex)
{
    Logger.getLogger(Newuser.class.getName()).log(Level.SEVERE,null,ex);
}       catch (ClassNotFoundException ex) {
            Logger.getLogger(choose_movie.class.getName()).log(Level.SEVERE, null, ex);
        }
setVisible(false);
ticket t=new ticket();
t.ROWS.setText(ROWS.getText());
t.Date.setText(DATE.getText());
t.Time.setText(TIME.getText());
t.Theatre.setText(THEATRE.getText());
t.Total.setText(TOTAL.getText());
t.Tickets.setText(TICKETS.getText());
t.Movie.setText(MOVIE.getText());
t.setVisible(true);         // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(upi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(upi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(upi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(upi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new upi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel DATE;
    public javax.swing.JLabel MOVIE;
    public javax.swing.JLabel ROWS;
    public javax.swing.JLabel THEATRE;
    public javax.swing.JLabel TICKETS;
    public javax.swing.JLabel TIME;
    public javax.swing.JLabel TOTAL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}