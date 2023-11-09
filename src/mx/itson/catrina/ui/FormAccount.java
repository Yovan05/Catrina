/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.catrina.ui;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.DecimalFormat;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import mx.itson.catrina.entities.AccountStatus;
import mx.itson.catrina.entities.Transaction;
import mx.itson.catrina.enums.TransactionType;

/**
 *
 * @author alexi
 */
public class FormAccount extends javax.swing.JFrame {

    /**
     * Shows the account status of the selected file
     */
    public FormAccount() {
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
        btnSelect = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblRfc = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblZip_code = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAccount = new javax.swing.JLabel();
        lblClabe = new javax.swing.JLabel();
        lblCurrency = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();
        lblDeposits = new javax.swing.JLabel();
        lblWithdrawals = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        jbcMonth = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Estado de Cuenta");

        btnSelect.setText("Select the file...");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblName.setText("Name");

        lblRfc.setText("RFC: ");

        lblAddress.setText("Address: ");

        lblCity.setText("Ciudad: ");

        lblZip_code.setText("Zip Code");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("ACCOUNT STATEMENT");

        lblAccount.setText("Account: ");

        lblClabe.setText("Clabe: ");

        lblCurrency.setText("Currency: ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setText("PERIOD SUMMARY");

        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Description", "Deposits", "Withdrawals", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHistory);
        if (tblHistory.getColumnModel().getColumnCount() > 0) {
            tblHistory.getColumnModel().getColumn(0).setMaxWidth(100);
            tblHistory.getColumnModel().getColumn(1).setMinWidth(200);
        }

        lblDeposits.setText("Deposits: ");

        lblWithdrawals.setText("Withdrawals: ");

        lblBalance.setText("Final balance: ");

        jbcMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select the month..", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jbcMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSelect))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblRfc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblZip_code, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblClabe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblBalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(lblWithdrawals, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDeposits, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(255, 255, 255))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelect)
                    .addComponent(jbcMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRfc)
                    .addComponent(lblAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(lblClabe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(lblCurrency))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblZip_code)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeposits)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWithdrawals)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBalance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                byte fileBytes[] = Files.readAllBytes(file.toPath());
                String content = new String(fileBytes, StandardCharsets.UTF_8);
                
                AccountStatus accountStatus = new AccountStatus().deserialize(content);
                if (accountStatus != null) {
                    DefaultTableModel model = (DefaultTableModel) tblHistory.getModel();
                    model.setRowCount(0);
                    
                    DecimalFormat rondedNumeber = new DecimalFormat("#.##");
                    
                    lblName.setText(accountStatus.getCustomer().getName());
                    lblRfc.setText("RFC: "+accountStatus.getCustomer().getRfc());
                    lblAddress.setText("Address: "+accountStatus.getCustomer().getAddress());
                    lblCity.setText("City: "+accountStatus.getCustomer().getCity());
                    lblZip_code.setText("Zip code: "+accountStatus.getCustomer().getZipCode());
                    
                    lblAccount.setText("Account: "+accountStatus.getAccount());
                    lblClabe.setText("Clabe: "+accountStatus.getClabe());
                    lblCurrency.setText("Currency: "+accountStatus.getCurrency());
                    
                    double deposits = 0;
                    double withdrawals = 0;
                    double subTotal = 0;
                    accountStatus.sortTransactions();
                    for (Transaction t : accountStatus.getTransactions()) {
                        if(jbcMonth.getSelectedIndex()== t.getMonth() || jbcMonth.getSelectedIndex()==0){
                            double deposit =0;
                            double withdrawal=0;
                            if(t.getType()==TransactionType.DEPOSITS){
                                deposit = t.getAmount();
                                deposits +=deposit;
                                subTotal+=deposit;
                            }else{
                                withdrawal=t.getAmount();
                                subTotal-=withdrawal;
                                withdrawals+=withdrawal;
                            }
                            model.addRow(new Object[]{
                                t.getDate(), t.getDescription(), rondedNumeber.format(deposit), rondedNumeber.format(withdrawal), rondedNumeber.format(subTotal)
                            });
                        }
                    }

                    
                    lblDeposits.setText("Deposits: $\t"+ rondedNumeber.format(deposits));
                    lblWithdrawals.setText("Withdrawals: $\t"+rondedNumeber.format(withdrawals));
                    lblBalance.setText("Final Balance: $\t"+rondedNumeber.format(subTotal));
                    
                }
            }
        } catch (Exception ex) {
            System.err.print("Ocurrio un error: "+ ex.getMessage());
        }
    }//GEN-LAST:event_btnSelectActionPerformed

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
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jbcMonth;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblClabe;
    private javax.swing.JLabel lblCurrency;
    private javax.swing.JLabel lblDeposits;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRfc;
    private javax.swing.JLabel lblWithdrawals;
    private javax.swing.JLabel lblZip_code;
    private javax.swing.JTable tblHistory;
    // End of variables declaration//GEN-END:variables
}
