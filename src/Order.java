import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Order extends javax.swing.JFrame {
    public Order() {
        initComponents();
        try{
            Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airways?useSSL=false","root","password");
    String q = "Select * from final";
    PreparedStatement st = con.prepareStatement(q);
     ResultSet rs = st.executeQuery();
   while(rs.next()){
       int id = rs.getInt("icod");
       c1.addItem(id);
   }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    public ArrayList<Details> detailList(int id){
        int code = id;
        ArrayList<Details>  detailList = new ArrayList<>();
        try{
             Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airways?useSSL=false","root","password");
    String query = "Select * from cmbine where icod = ?";
    PreparedStatement st = con.prepareStatement(query);
    st.setInt(1,code);
    ResultSet rs = st.executeQuery();
    Details details;
    while(rs.next()){
        details = new Details(rs.getInt("icod"), rs.getInt("rcod"), rs.getInt("rmu"), rs.getInt("cscod"), rs.getInt("csu"));
        detailList.add(details);
    }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        return detailList;
    }
    public void show_list(int co, int qty){
        ArrayList<Details> details = detailList(co);
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        Object[] row = new Object[5];
        for(int i = 0; i<details.size(); i++ )
        {
            row[0] = details.get(i).getfcod();
            row[1] = details.get(i).getrcod();
            row[2] = details.get(i).getrmu()*qty;
            row[3] = details.get(i).getcscod();
            row[4] = details.get(i).getcsu()*qty;
            model.addRow(row);
        }
        
    }
 
    
    
    
    
     public ArrayList<Stock> stockList(int id){
        int code = id;
        ArrayList<Stock>  stockList = new ArrayList<>();
        try{
             Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airways?useSSL=false","root","password");
    String query = "Select * from cmbine where icod = ?";
     String b="select * from rm where rcod in (select rcod from cmbine where icod=?)";
      String c="select * from cs where cscod in (select cscod from cmbine where icod=?)";
    PreparedStatement st = con.prepareStatement(query);
    st.setInt(1,code);
     PreparedStatement st1 = con.prepareStatement(b);
    st1.setInt(1,code);
    PreparedStatement st2 = con.prepareStatement(c);
    st2.setInt(1,code);
    ResultSet rs = st.executeQuery();
    ResultSet rs1 = st1.executeQuery();
    ResultSet rs2 = st2.executeQuery();
    while(rs.next() && rs1.next() && rs2.next()){ 
        Stock stock;
          stock = new Stock(rs.getInt("icod"), rs1.getInt("rcod"), rs1.getInt("qty"), rs.getInt("rmu"), rs.getInt("cscod"), rs2.getInt("qty"), rs.getInt("csu"));
        stockList.add(stock);
//        JOptionPane.showMessageDialog(null,stock);
    }
    }
    catch(Exception ex)
    {
        JOptionPane.showMessageDialog(null,ex);
    }  

        return stockList;
    }
    
    
    
    
    public void show_stock(int co, int qty){
        ArrayList<Stock> stocks = stockList(co);
        DefaultTableModel model = (DefaultTableModel) tb2.getModel();
        Object[] row = new Object[7];
        for(int i = 0; i<stocks.size(); i++ )
        {
            row[0] = stocks.get(i).geticod();
            row[1] = stocks.get(i).getrcod();
            row[2] = stocks.get(i).getrq();
            row[3] = stocks.get(i).getqr()*qty;
            row[4] = stocks.get(i).getcscod();
            row[5] = stocks.get(i).getcsq();
            row[6] = stocks.get(i).getqcs()*qty;
            model.addRow(row);
        }
    }
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Results = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Stock = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        d1 = new com.toedter.calendar.JDateChooser();
        t3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t5 = new javax.swing.JTextArea();
        d2 = new com.toedter.calendar.JDateChooser();
        c1 = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();

        tb1.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 19)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Finished Code", "RM Store Code", "RM QTY", "CS Store Code", "CS QTY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb1.setSurrendersFocusOnKeystroke(true);
        jScrollPane2.setViewportView(tb1);

        jLabel8.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 24)); // NOI18N
        jLabel8.setText("Things You will Need");

        jButton2.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 22)); // NOI18N
        jButton2.setText("Check with our Stocks");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ResultsLayout = new javax.swing.GroupLayout(Results.getContentPane());
        Results.getContentPane().setLayout(ResultsLayout);
        ResultsLayout.setHorizontalGroup(
            ResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(ResultsLayout.createSequentialGroup()
                .addGroup(ResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultsLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel8))
                    .addGroup(ResultsLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        ResultsLayout.setVerticalGroup(
            ResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultsLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2))
        );

        tb2.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 12)); // NOI18N
        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Final Item", "RM Store", "RM Stock", "RM Req. Stock  ", "CS Store", "CS Stock", "CS Req. Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tb2);

        jLabel10.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 36)); // NOI18N
        jLabel10.setText("Our Stock");

        javax.swing.GroupLayout StockLayout = new javax.swing.GroupLayout(Stock.getContentPane());
        Stock.getContentPane().setLayout(StockLayout);
        StockLayout.setHorizontalGroup(
            StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockLayout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(StockLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        StockLayout.setVerticalGroup(
            StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StockLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        jLabel4.setText("Item Code: ");

        jLabel1.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("New Order");

        jLabel3.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        jLabel3.setText("Party Name: ");

        jButton1.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        jLabel2.setText("Date : ");

        t1.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N

        d1.setDateFormatString("yyyy/MM/dd");

        t3.setEditable(false);
        t3.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        jLabel6.setText("Quantity: ");

        jLabel5.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        jLabel5.setText("Item Name: ");

        jLabel7.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        jLabel7.setText("Delivery Date:");

        jLabel9.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        jLabel9.setText("Remark :");

        t4.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N

        t5.setColumns(20);
        t5.setLineWrap(true);
        t5.setRows(5);
        t5.setWrapStyleWord(true);
        jScrollPane1.setViewportView(t5);

        d2.setDateFormatString("yyyy/MM/dd");

        c1.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 18)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the Item Code" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 20)); // NOI18N
        jButton5.setText("Main Menu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t3)
                            .addComponent(t1)
                            .addComponent(d1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t4)
                            .addComponent(d2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(c1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(d1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(c1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton5))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault());
     String d = sdf.format(d1.getDate());
     SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault());
     int f = (int) c1.getSelectedItem();
     String dd = sdf1.format(d2.getDate());
     String pname = t1.getText();
   int qty  = Integer.parseInt(t4.getText());
     String rmk = t5.getText().trim();
     Results.pack();
     Results.setLocationRelativeTo(null);
     Results.setVisible(true);
     this.setVisible(false);
       DefaultTableModel model = (DefaultTableModel) tb1.getModel();
     model.setRowCount(0);
     show_list(f,qty);
     

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
int ii = (int) c1.getSelectedItem();
if(ii > 1)
try{
     Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airways?useSSL=false","root","password");
    String qu = "Select * from final where icod=?";
     PreparedStatement st = con.prepareStatement(qu);
     st.setInt(1,ii);
     ResultSet rs = st.executeQuery();
   if(rs.next()){
       String n = rs.getString("iname");
       t3.setText(n);
   }
}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(null,ex);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
        Stock.pack();
    Stock.setLocationRelativeTo(null);
     Stock.setVisible(true);
     int f = (int) c1.getSelectedItem();
     int qty  = Integer.parseInt(t4.getText());
     show_stock(f,qty);
     
     
     
     
     
     
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Results;
    private javax.swing.JDialog Stock;
    private javax.swing.JComboBox c1;
    private com.toedter.calendar.JDateChooser d1;
    private com.toedter.calendar.JDateChooser d2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextArea t5;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    // End of variables declaration//GEN-END:variables
}
