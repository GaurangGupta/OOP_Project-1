
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rushi
 */
public class RideReview extends javax.swing.JFrame {
    
    double rating;
    String driver_name;

    /**
     * Creates new form RideReview
     */
    public RideReview() {
        initComponents();
    }
    
    public RideReview(String start, String drop, String dri_name, int duration, int fare) {
        start_in.setText(start);
        drop_in.setText(drop);
        name_in.setText(dri_name);
        driver_name = dri_name;
        duration_in.setText(""+duration);
        fare_in.setText(""+fare);
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

        driver_rating = new javax.swing.ButtonGroup();
        ride_review = new javax.swing.JLabel();
        starting_point = new javax.swing.JLabel();
        dropping_point = new javax.swing.JLabel();
        label123 = new javax.swing.JLabel();
        driver_pre_rating = new javax.swing.JLabel();
        trip_duration = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        one_star = new javax.swing.JRadioButton();
        two_star = new javax.swing.JRadioButton();
        three_star = new javax.swing.JRadioButton();
        four_star = new javax.swing.JRadioButton();
        five_star = new javax.swing.JRadioButton();
        exit = new javax.swing.JButton();
        back_to_main = new javax.swing.JButton();
        start_in = new javax.swing.JLabel();
        drop_in = new javax.swing.JLabel();
        name_in = new javax.swing.JLabel();
        fare_in = new javax.swing.JLabel();
        duration_in = new javax.swing.JLabel();
        rating_confirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ride_review.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ride_review.setText("Ride Review");

        starting_point.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        starting_point.setText("Starting Point:");

        dropping_point.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dropping_point.setText("Dropping Point:");

        label123.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label123.setText("Driver Name:");

        driver_pre_rating.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        driver_pre_rating.setText("Fare:");

        trip_duration.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        trip_duration.setText("Trip Duration:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Rating:");

        driver_rating.add(one_star);
        one_star.setText("1");
        one_star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one_starActionPerformed(evt);
            }
        });

        driver_rating.add(two_star);
        two_star.setText("2");
        two_star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two_starActionPerformed(evt);
            }
        });

        driver_rating.add(three_star);
        three_star.setText("3");
        three_star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three_starActionPerformed(evt);
            }
        });

        driver_rating.add(four_star);
        four_star.setText("4");
        four_star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four_starActionPerformed(evt);
            }
        });

        driver_rating.add(five_star);
        five_star.setText("5");
        five_star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five_starActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        back_to_main.setText("Back to Main Menu");
        back_to_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_mainActionPerformed(evt);
            }
        });

        rating_confirm.setText("Confrm");
        rating_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rating_confirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(one_star)
                        .addGap(18, 18, 18)
                        .addComponent(two_star)
                        .addGap(18, 18, 18)
                        .addComponent(three_star)
                        .addGap(18, 18, 18)
                        .addComponent(four_star)
                        .addGap(18, 18, 18)
                        .addComponent(five_star)
                        .addGap(58, 58, 58)
                        .addComponent(rating_confirm))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(starting_point, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dropping_point, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(trip_duration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(driver_pre_rating, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label123, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(drop_in, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(name_in, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(start_in, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fare_in, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(duration_in, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(back_to_main)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ride_review)
                .addGap(265, 265, 265))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ride_review)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(starting_point)
                    .addComponent(start_in, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropping_point)
                    .addComponent(drop_in, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label123)
                    .addComponent(name_in, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(driver_pre_rating)
                    .addComponent(fare_in, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trip_duration)
                    .addComponent(duration_in, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(one_star)
                    .addComponent(two_star)
                    .addComponent(three_star)
                    .addComponent(four_star)
                    .addComponent(five_star)
                    .addComponent(rating_confirm))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_to_main)
                    .addComponent(exit))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void one_starActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one_starActionPerformed
        // TODO add your handling code here:
        if(one_star.isSelected())
        {
            rating = 1;
            //JOptionPane.showMessageDialog (null,rating);
        }
    }//GEN-LAST:event_one_starActionPerformed

    private void two_starActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two_starActionPerformed
        // TODO add your handling code here:
        if(two_star.isSelected())
        {
            rating = 2;
            //JOptionPane.showMessageDialog (null,rating);
        }
    }//GEN-LAST:event_two_starActionPerformed

    private void back_to_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_mainActionPerformed
        // TODO add your handling code here:
        dispose();
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        
    }//GEN-LAST:event_back_to_mainActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void three_starActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three_starActionPerformed
        // TODO add your handling code here:
        if(three_star.isSelected())
        {
            rating = 3;
            //JOptionPane.showMessageDialog (null,rating);
        }
    }//GEN-LAST:event_three_starActionPerformed

    private void four_starActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four_starActionPerformed
        // TODO add your handling code here:
        if(four_star.isSelected())
        {
            rating = 4;
            //JOptionPane.showMessageDialog (null,rating);
        }
    }//GEN-LAST:event_four_starActionPerformed

    private void five_starActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five_starActionPerformed
        // TODO add your handling code here:
        if(five_star.isSelected())
        {
            rating = 5;
            //JOptionPane.showMessageDialog (null,rating);
        }
    }//GEN-LAST:event_five_starActionPerformed

    private void rating_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rating_confirmActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/drivers?characterEncoding=latin1","root","root");
            Statement myStmt = myConn.createStatement();
            ResultSet myRs = myStmt.executeQuery("select * from driver" );
            while(myRs.next())
            {
                if(myRs.getString("driver_name").equals(driver_name))
                {
                    double a = myRs.getDouble("rating");//previous rating
                    int b = myRs.getInt("num_trips");//completed trips
                    double c = (a * b + rating)/(b + 1);
                    rating = c;
                    break;
                }
            }
            
            Statement myStmt1 = myConn.createStatement();
            ResultSet myRs1 = myStmt1.executeQuery("update drivers set rating = " + rating + "where driver_name = '" + driver_name + "'");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_rating_confirmActionPerformed

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
            java.util.logging.Logger.getLogger(RideReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RideReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RideReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RideReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RideReview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_to_main;
    private javax.swing.JLabel driver_pre_rating;
    private javax.swing.ButtonGroup driver_rating;
    private javax.swing.JLabel drop_in;
    private javax.swing.JLabel dropping_point;
    private javax.swing.JLabel duration_in;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fare_in;
    private javax.swing.JRadioButton five_star;
    private javax.swing.JRadioButton four_star;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel label123;
    private javax.swing.JLabel name_in;
    private javax.swing.JRadioButton one_star;
    private javax.swing.JButton rating_confirm;
    private javax.swing.JLabel ride_review;
    private javax.swing.JLabel start_in;
    private javax.swing.JLabel starting_point;
    private javax.swing.JRadioButton three_star;
    private javax.swing.JLabel trip_duration;
    private javax.swing.JRadioButton two_star;
    // End of variables declaration//GEN-END:variables
}
