import java.sql.*;
import javax.swing.*;
public class Configure extends javax.swing.JFrame {
    int ci=7,cu=0;
int ri=7,ru=0;

    public Configure() {
        initComponents();
        int index = c1.getSelectedIndex();
        if(index==0)
        {
            ch1.setVisible(false);
            ch2.setVisible(false);
        }
        if(!ch1.isSelected())
        {
            c2.setVisible(false);
            l1.setVisible(false);
            t1.setVisible(false);
        }
        if(!ch2.isSelected()){
              c3.setVisible(false);
            l2.setVisible(false);
            t2.setVisible(false);
        }
        try{
            Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airways?useSSL=false","root","password");
    String query = "Select * from final";
     PreparedStatement st = con.prepareStatement(query);
   ResultSet rs = st.executeQuery();
   while(rs.next()){
       int fi = rs.getInt("icod");
       c1.addItem(fi);
   }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        
               try{
            Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airways?useSSL=false","root","password");
    String query = "Select * from rm";
     PreparedStatement st = con.prepareStatement(query);
   ResultSet rs = st.executeQuery();
   while(rs.next()){
       int ri = rs.getInt("rcod");
       c2.addItem(ri);
   }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    
               
         try{
            Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airways?useSSL=false","root","password");
    String query = "Select * from cs";
     PreparedStatement st = con.prepareStatement(query);
   ResultSet rs = st.executeQuery();
   while(rs.next()){
       int ri = rs.getInt("cscod");
       c3.addItem(ri);
   }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }      
               
               
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        c2 = new javax.swing.JComboBox();
        l1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ch1 = new javax.swing.JCheckBox();
        ch2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        c3 = new javax.swing.JComboBox();
        t2 = new javax.swing.JTextField();
        l2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        jLabel1.setText("RM Store: ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        c1.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Item Code" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        jLabel2.setText("Finished Product: ");

        jLabel3.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 24)); // NOI18N
        jLabel3.setText("Let's Configure the Products");

        c2.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        c2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Item Code" }));
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        l1.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        l1.setText("Units for RM:");

        t1.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N

        jButton3.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        jButton3.setText("Main Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        jButton4.setText("SAVE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ch1.setText("  ");
        ch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch1ActionPerformed(evt);
            }
        });

        ch2.setText(" ");
        ch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        jLabel5.setText("Comp. Store: ");

        c3.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        c3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Item Code" }));
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        t2.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N

        l2.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        l2.setText("Units for CS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ch1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1)
                                        .addGap(0, 41, Short.MAX_VALUE)))
                                .addGap(117, 117, 117))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(l1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ch2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(ch2))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ch1)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
int fi = (int)c1.getSelectedItem();
int fii = (int)c1.getSelectedIndex();
if(fii > 0)
{  
//    
//       if(ch1.isSelected() && !ch2.isSelected())
//    {
//        ci = 0;
//        cu = 0;
//    }
//    if(!ch1.isSelected() && ch2.isSelected())
//    {
//        ri = 0;
//        ru = 0;
//    }
    if(!ch1.isSelected() && !ch2.isSelected())
    {
        JOptionPane.showMessageDialog(null,"Do SOMETHING.");
       return;
    }
    
    if(ch1.isSelected())
    {
        ri = (int)c2.getSelectedItem();
        if(ri > 0)
        {
            ru = Integer.parseInt(t1.getText());
        }
    }
    if(ch2.isSelected())
    {
        ci = (int)c3.getSelectedItem();
        if(ci > 0)
        {
            cu = Integer.parseInt(t2.getText());
        }
    }
 
}
 try{
              Class.forName("com.mysql.jdbc.Driver");  
    Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/airways?useSSL=false","root","password");
     String query1 = "Select * from cmbine";
     PreparedStatement st1 = con1.prepareStatement(query1);
   ResultSet rs = st1.executeQuery();
   while(rs.next()){
       int fi1 = rs.getInt("icod");
       int ri1 = rs.getInt("rcod");
       int ci1 = rs.getInt("cscod");
       if(fi1 == fi && ri1 == ri && ci1 == ci)
       {
           JOptionPane.showMessageDialog(null,"Same Product entry is not allowed.");
           return;
       }
   }
    
          }catch(Exception ex){
              JOptionPane.showMessageDialog(null,ex);
          }
try{
     Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airways?useSSL=false","root","password");
    String query= "INSERT INTO cmbine values(?,?,?,?,?)";
    PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,fi);
            st.setInt(2,ri);
            st.setInt(3, ru);
            st.setInt(4,ci);
            st.setInt(5, cu);  
            st.executeUpdate();       
            JOptionPane.showMessageDialog(null,"SAVED!");
}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(null,ex);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch1ActionPerformed
if(ch1.isSelected())
{
     c2.setVisible(true);
            l1.setVisible(true);
            t1.setVisible(true);
}
else  if(!ch1.isSelected())
        {
            c2.setVisible(false);
            l1.setVisible(false);
            t1.setVisible(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ch1ActionPerformed

    private void ch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch2ActionPerformed
if(ch2.isSelected())
{
     c3.setVisible(true);
            l2.setVisible(true);
            t2.setVisible(true);
}
else  if(!ch2.isSelected()){
              c3.setVisible(false);
            l2.setVisible(false);
            t2.setVisible(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ch2ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
int index =c1.getSelectedIndex();
if(index > 0)
{
    ch1.setVisible(true);
    ch2.setVisible(true);
}
else{
     ch1.setVisible(false);
            ch2.setVisible(false);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
int index =c3.getSelectedIndex();
if(index > 0)
{
    l2.setVisible(true);
    t2.setVisible(true);
}
else{
     l2.setVisible(false);
           t2.setVisible(false);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_c3ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
int index =c2.getSelectedIndex();
if(index > 0)
{
    l1.setVisible(true);
    t1.setVisible(true);
}
else{
     l1.setVisible(false);
            t1.setVisible(false);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Configure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox c1;
    private javax.swing.JComboBox c2;
    private javax.swing.JComboBox c3;
    private javax.swing.JCheckBox ch1;
    private javax.swing.JCheckBox ch2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
