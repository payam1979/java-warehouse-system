/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse;
import static java.lang.ProcessBuilder.Redirect.from;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Timestamp.from;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Peyman
 */
public class Invoice extends javax.swing.JFrame {
    
Connection con;
Statement stmt;
ResultSet rs;
ResultSet rs1;
int curRow=1;

    public Invoice() {
         initComponents();
         DoConnect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        invNum = new javax.swing.JTextField();
        invDate = new javax.swing.JTextField();
        invName = new javax.swing.JTextField();
        invQty = new javax.swing.JTextField();
        invDateRecive = new javax.swing.JTextField();
        invDateExp = new javax.swing.JTextField();
        invDateAcc = new javax.swing.JTextField();
        invDateManager = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnSureUpdate = new javax.swing.JButton();
        btnSureDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnUpdate = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        labelinv = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        searchBox = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invNum.setEnabled(false);
        invNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invNumActionPerformed(evt);
            }
        });

        jLabel1.setText("Invoice Number");

        jLabel2.setText("Date");

        jLabel3.setText("Name");

        jLabel4.setText("Quantity");

        jLabel5.setText("Recive Date");

        jLabel6.setText("Expire Date");

        jLabel7.setText("Acc Confirm Date");

        jLabel8.setText("Mnager Confirm Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invDateAcc)
                    .addComponent(invDateExp)
                    .addComponent(invDateRecive)
                    .addComponent(invDateManager)
                    .addComponent(invQty)
                    .addComponent(invName)
                    .addComponent(invNum)
                    .addComponent(invDate, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invDateRecive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invDateExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invDateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invDateManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)))
        );

        btnFirst.setText("first");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setText("previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText("next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText("last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrevious)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSureUpdate.setText("Sure To Update");
        btnSureUpdate.setEnabled(false);
        btnSureUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSureUpdateActionPerformed(evt);
            }
        });

        btnSureDelete.setText("Sure To Delet");
        btnSureDelete.setEnabled(false);
        btnSureDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSureDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.setEnabled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSureDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSureUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnNew))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnSureDelete)
                    .addComponent(btnSureUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnCancel))
        );

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        labelinv.setText("Invoice Number");
        labelinv.setEnabled(false);

        btnStart.setText("Start");
        btnStart.setEnabled(false);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        searchBox.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelinv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBox, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelinv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnStart)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
            try {
          rs.last();
 
 int invoicenumber_col = rs.getInt("invoicenumber");
 String invoicenumber=Integer.toString(invoicenumber_col);
 
 String date = rs.getString("date");
 String name= rs.getString("name");
 String quantity = rs.getString("quantity");
 String recivedate = rs.getString("recivedate");
 String expiredate = rs.getString("expiredate");
 String accconfirmdate = rs.getString("accconfirmdate");
 String managerconfirmdate = rs.getString("managerconfirmdate");
       

invNum.setText(invoicenumber);
invDate.setText(date);
invName.setText(name);
invQty.setText(quantity);
invDateRecive.setText(recivedate);
invDateExp.setText(expiredate);
invDateAcc.setText(accconfirmdate);
invDateManager.setText(managerconfirmdate);

       
       }
catch (SQLException err) {
   JOptionPane.showMessageDialog(this, err.getMessage());
   
           
}   // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       try {
         if(  rs.next()){
 
 int invoicenumber_col = rs.getInt("invoicenumber");
 String invoicenumber=Integer.toString(invoicenumber_col);
 
 String date = rs.getString("date");
 String name= rs.getString("name");
 String quantity = rs.getString("quantity");
 String recivedate = rs.getString("recivedate");
 String expiredate = rs.getString("expiredate");
 String accconfirmdate = rs.getString("accconfirmdate");
 String managerconfirmdate = rs.getString("managerconfirmdate");
       

invNum.setText(invoicenumber);
invDate.setText(date);
invName.setText(name);
invQty.setText(quantity);
invDateRecive.setText(recivedate);
invDateExp.setText(expiredate);
invDateAcc.setText(accconfirmdate);
invDateManager.setText(managerconfirmdate);
}
         else{
                 rs.previous();
                 JOptionPane.showMessageDialog(this, "End of File");
                 }
       }
catch (SQLException err) {
   JOptionPane.showMessageDialog(this, err.getMessage());
   
           
} 
       
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
       try {
         if(  rs.previous()){
 
 int invoicenumber_col = rs.getInt("invoicenumber");
 String invoicenumber=Integer.toString(invoicenumber_col);
 
 String date = rs.getString("date");
 String name= rs.getString("name");
 String quantity = rs.getString("quantity");
 String recivedate = rs.getString("recivedate");
 String expiredate = rs.getString("expiredate");
 String accconfirmdate = rs.getString("accconfirmdate");
 String managerconfirmdate = rs.getString("managerconfirmdate");
       

invNum.setText(invoicenumber);
invDate.setText(date);
invName.setText(name);
invQty.setText(quantity);
invDateRecive.setText(recivedate);
invDateExp.setText(expiredate);
invDateAcc.setText(accconfirmdate);
invDateManager.setText(managerconfirmdate);
}
         else{
                 rs.next();
                 JOptionPane.showMessageDialog(this, "First of File");
                 }
       }
catch (SQLException err) {
   JOptionPane.showMessageDialog(this, err.getMessage());
   
           
} 
 
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
               try {
          rs.first();
 
 int invoicenumber_col = rs.getInt("invoicenumber");
 String invoicenumber=Integer.toString(invoicenumber_col);
 
 String date = rs.getString("date");
 String name= rs.getString("name");
 String quantity = rs.getString("quantity");
 String recivedate = rs.getString("recivedate");
 String expiredate = rs.getString("expiredate");
 String accconfirmdate = rs.getString("accconfirmdate");
 String managerconfirmdate = rs.getString("managerconfirmdate");
       

invNum.setText(invoicenumber);
invDate.setText(date);
invName.setText(name);
invQty.setText(quantity);
invDateRecive.setText(recivedate);
invDateExp.setText(expiredate);
invDateAcc.setText(accconfirmdate);
invDateManager.setText(managerconfirmdate);

       
       }
catch (SQLException err) {
   JOptionPane.showMessageDialog(this, err.getMessage());
   
           
}   // TODO add your handling code here:
  
        
        
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        try{
        rs.absolute(curRow);

        invNum.setText(Integer.toString(rs.getInt("invoicenumber")));
        invDate.setText(rs.getString("date"));
        invName.setText(rs.getString("name"));
        invQty.setText(rs.getString("quantity"));
        invDateRecive.setText(rs.getString("recivedate"));
        invDateExp.setText(rs.getString("expiredate"));
        invDateAcc.setText(rs.getString("accconfirmdate"));
        invDateManager.setText(rs.getString("managerconfirmdate"));
        
        
         btnFirst.setEnabled(true);
         btnNext.setEnabled(true);
         btnPrevious.setEnabled(true);    
         btnLast.setEnabled(true);
         btnSureUpdate.setEnabled(false);
         btnSureDelete.setEnabled(false);
         btnDelete.setEnabled(true);
         btnSearch.setEnabled(true);
         btnNew.setEnabled(true);
         btnSave.setEnabled(false);
         btnCancel.setEnabled(false);
         btnStart.setEnabled(false);
         searchBox.setEnabled(false);
         labelinv.setEnabled(false);
         btnUpdate.setEnabled(true);
        }
         catch (SQLException err) {
             JOptionPane.showMessageDialog(this, err.getMessage());
         }
      
         

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSureUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSureUpdateActionPerformed

        
        String date1 = invDate.getText();
        String name1= invName.getText();
        String quantity1 = invQty.getText();
        
        String reciveDate1= invDateRecive.getText();
        
        String expireDate1 =invDateExp.getText();
        String accConfirmDate1 = invDateAcc.getText();
        String managerConfirmDate1 =invDateManager.getText();
        String invoiceNumber1=invNum.getText();
          int newInvNum=Integer.parseInt(invoiceNumber1);


try{
    rs.updateInt("invoicenumber", newInvNum);
    rs.updateString("date", date1);
    rs.updateString("name", name1);
    rs.updateString("quantity", quantity1);
    rs.updateString("recivedate", reciveDate1);
    rs.updateString("expiredate", expireDate1);
    rs.updateString("accconfirmdate", accConfirmDate1);
    rs.updateString("managerconfirmdate", managerConfirmDate1);
    rs.updateRow();
         JOptionPane.showMessageDialog(this,"Updated");
     
}
    catch (SQLException err) {
    JOptionPane.showMessageDialog(this, err.getMessage());

}


        // TODO add your handling code here:
    }//GEN-LAST:event_btnSureUpdateActionPerformed

    private void invNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invNumActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed

        
        
        
btnFirst.setEnabled(false);
btnNext.setEnabled(false);
btnPrevious.setEnabled(false);
btnDelete.setEnabled(false);
btnSearch.setEnabled(false);
btnLast.setEnabled(false);
btnSureUpdate.setEnabled(false);
btnSureDelete.setEnabled(false);
btnNew.setEnabled(false);
btnSave.setEnabled(true);
btnCancel.setEnabled(true);
btnUpdate.setEnabled(false);
invNum.setText("");
invDate.setText("");
invName.setText("");
invQty.setText("");
invDateRecive.setText("");
invDateExp.setText("");
invDateAcc.setText("");
invDateManager.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

    
        
        String date = invDate.getText();
        String name= invName.getText();
        String quantity = invQty.getText();
        
        String reciveDate= invDateRecive.getText();
        
        String expireDate =invDateExp.getText();
        String accConfirmDate = invDateAcc.getText();
        String managerConfirmDate =invDateManager.getText();
       
         

try{
    
    rs.last();
        int invoicenumber11_col = rs.getInt("invoicenumber");
 int newInvNum= invoicenumber11_col+1;
    
    
    
    rs.moveToInsertRow();
    rs.updateInt("invoicenumber", newInvNum);
    rs.updateString("date", date);
    rs.updateString("name", name);
    rs.updateString("quantity", quantity);
    rs.updateString("recivedate", reciveDate);
    rs.updateString("expiredate", expireDate);
    rs.updateString("accconfirmdate", accConfirmDate);
    rs.updateString("managerconfirmdate", managerConfirmDate);
    rs.insertRow();
    stmt.close();
     rs.close();
    
     stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
     String SQL = "SELECT*FROM INVOICEDB";
     rs = stmt.executeQuery (SQL);
     rs.next();
      int invoicenumber_col = rs.getInt("invoicenumber");
  String invoicenumber=Integer.toString(invoicenumber_col);
  String date2 = rs.getString("date");
  String name2= rs.getString("name");
  String quantity2 = rs.getString("quantity");
   String recivedate2 = rs.getString("recivedate");
   String expiredate2 = rs.getString("expiredate");
   String accconfirmdate2 = rs.getString("accconfirmdate");
   String managerconfirmdate2 = rs.getString("managerconfirmdate");
  invNum.setText(invoicenumber);
invDate.setText(date2);
invName.setText(name2);
invQty.setText(quantity2);
invDateRecive.setText(recivedate2);
invDateExp.setText(expiredate2);
invDateAcc.setText(accconfirmdate2);
invDateManager.setText(managerconfirmdate2); 
   
btnFirst.setEnabled(false);
btnNext.setEnabled(false);
btnPrevious.setEnabled(false);    
btnLast.setEnabled(false);
btnSureUpdate.setEnabled(false);
btnSureDelete.setEnabled(false);
btnNew.setEnabled(false);
btnSave.setEnabled(true);
btnCancel.setEnabled(true);
   JOptionPane.showMessageDialog(this, "Record Saved");
}

catch (SQLException err){
       JOptionPane.showMessageDialog(this, err.getMessage());

}




        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSureDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSureDeleteActionPerformed
    try{
         rs.deleteRow();
    stmt.close();
     rs.close();
    
     stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
     String SQL = "SELECT*FROM INVOICEDB";
     rs = stmt.executeQuery (SQL);
     rs.next();
      int invoicenumber_col = rs.getInt("invoicenumber");
  String invoicenumber=Integer.toString(invoicenumber_col);
  String date = rs.getString("date");
  String name= rs.getString("name");
  String quantity = rs.getString("quantity");
   String recivedate = rs.getString("recivedate");
   String expiredate= rs.getString("expiredate");
   String accconfirmdate= rs.getString("accconfirmdate");
   String managerconfirmdate= rs.getString("managerconfirmdate");
   
invNum.setText(invoicenumber);
invDate.setText(date);
invName.setText(name);
invQty.setText(quantity);
invDateRecive.setText(recivedate);
invDateExp.setText(expiredate);
invDateAcc.setText(accconfirmdate);
invDateManager.setText(managerconfirmdate); 
   

   JOptionPane.showMessageDialog(this, "Record Deleted");
}

catch (SQLException err){
       JOptionPane.showMessageDialog(this, err.getMessage());

}

// TODO add your handling code here:
    }//GEN-LAST:event_btnSureDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
btnFirst.setEnabled(false);
btnNext.setEnabled(false);
btnDelete.setEnabled(false);
btnPrevious.setEnabled(false);    
btnLast.setEnabled(false);
btnSureUpdate.setEnabled(false);
btnSureDelete.setEnabled(false);
btnNew.setEnabled(false);
btnSave.setEnabled(false);
btnSearch.setEnabled(false);
btnCancel.setEnabled(true);
btnStart.setEnabled(true);
searchBox.setEnabled(true);
labelinv.setEnabled(true);
btnUpdate.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
btnFirst.setEnabled(false);
btnNext.setEnabled(false);
btnPrevious.setEnabled(false);    
btnLast.setEnabled(false);
btnSureUpdate.setEnabled(false);
btnSureDelete.setEnabled(true);
btnNew.setEnabled(false);
btnSave.setEnabled(false);
btnSearch.setEnabled(false);
btnCancel.setEnabled(true);
btnStart.setEnabled(false);
searchBox.setEnabled(false);
btnDelete.setEnabled(false);
btnUpdate.setEnabled(false);



        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

btnNext.setEnabled(false);
btnPrevious.setEnabled(false);    
btnLast.setEnabled(false);
btnSureUpdate.setEnabled(true);
btnSureDelete.setEnabled(false);
btnNew.setEnabled(false);
btnSave.setEnabled(false);
btnSearch.setEnabled(false);
btnCancel.setEnabled(true);
btnStart.setEnabled(false);
searchBox.setEnabled(false);
btnDelete.setEnabled(false);
btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

@SuppressWarnings("empty-statement")
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
try{
           String invSearchNumber=searchBox.getText();
           int searchBox1=Integer.parseInt(invSearchNumber);
           //to test 
           System.out.println(searchBox1);
            
invNum.setText("");
invDate.setText("");
invName.setText("");
invQty.setText("");
invDateRecive.setText("");
invDateExp.setText("");
invDateAcc.setText("");
invDateManager.setText("");

try {
   rs.first();
   int invoicenumber_col = rs.getInt("invoicenumber");
 String invoicenumber=Integer.toString(invoicenumber_col);
 String date = rs.getString("date");
 String name= rs.getString("name");
 String quantity = rs.getString("quantity");
 String recivedate = rs.getString("recivedate");
 String expiredate = rs.getString("expiredate");
 String accconfirmdate = rs.getString("accconfirmdate");
 String managerconfirmdate = rs.getString("managerconfirmdate");
   if(invoicenumber_col==searchBox1){
            System.out.println("find it");

invNum.setText(invoicenumber);
invDate.setText(date);
invName.setText(name);
invQty.setText(quantity);
invDateRecive.setText(recivedate);
invDateExp.setText(expiredate);
invDateAcc.setText(accconfirmdate);
invDateManager.setText(managerconfirmdate);

   }
else{
      
while (rs.next()) {

 int invoicenumber_col1 = rs.getInt("invoicenumber");
 String invoicenumber5=Integer.toString(invoicenumber_col1);
 String date5 = rs.getString("date");
 String name5= rs.getString("name");
 String quantity5 = rs.getString("quantity");
 String recivedate5 = rs.getString("recivedate");
 String expiredate5 = rs.getString("expiredate");
 String accconfirmdate5 = rs.getString("accconfirmdate");
 String managerconfirmdate5= rs.getString("managerconfirmdate");

 if(invoicenumber_col1==searchBox1){
           

invNum.setText(invoicenumber5);
invDate.setText(date5);
invName.setText(name5);
invQty.setText(quantity5);
invDateRecive.setText(recivedate5);
invDateExp.setText(expiredate5);
invDateAcc.setText(accconfirmdate5);
invDateManager.setText(managerconfirmdate5);
break;
 }

 }
  }
                  
}
catch (SQLException err) {
   JOptionPane.showMessageDialog(this,err.getMessage());
   
} 
   
        
    }//GEN-LAST:event_btnStartActionPerformed
catch (NumberFormatException err) {
   JOptionPane.showMessageDialog(this,"please Enter Right Parameter ");
   
}
    }
    
    
    
    
    
    public  void DoConnect() {
         try {
            String host = "jdbc:derby://localhost:1527/invoice";
            String uName = "payam";
            String uPass = "123456";
         con = DriverManager.getConnection(host,uName,uPass);
  stmt =  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
 String SQL = "SELECT*FROM Invoicedb ";
 

  rs = stmt.executeQuery( SQL );
   

  
 rs.next();

 
 
   int invoicenumber_col = rs.getInt("invoicenumber");
  String invoicenumber=Integer.toString(invoicenumber_col);
  String date = rs.getString("date");
  String name= rs.getString("name");
  String quantity = rs.getString("quantity");
   String recivedate = rs.getString("recivedate");
   String expiredate = rs.getString("expiredate");
   String accconfirmdate = rs.getString("accconfirmdate");
   String managerconfirmdate = rs.getString("managerconfirmdate");
invNum.setText(invoicenumber);
invDate.setText(date);
invName.setText(name);
invQty.setText(quantity);
invDateRecive.setText(recivedate);
invDateExp.setText(expiredate);
invDateAcc.setText(accconfirmdate);
invDateManager.setText(managerconfirmdate);
}
catch (SQLException err) {
   JOptionPane.showMessageDialog(this, err.getMessage());
}
    }
    
     public static void main(String args[]){
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Invoice().setVisible(true);
        });
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnSureDelete;
    private javax.swing.JButton btnSureUpdate;
    private javax.swing.JToggleButton btnUpdate;
    private javax.swing.JTextField invDate;
    private javax.swing.JTextField invDateAcc;
    private javax.swing.JTextField invDateExp;
    private javax.swing.JTextField invDateManager;
    private javax.swing.JTextField invDateRecive;
    private javax.swing.JTextField invName;
    private javax.swing.JTextField invNum;
    private javax.swing.JTextField invQty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labelinv;
    private javax.swing.JTextField searchBox;
    // End of variables declaration//GEN-END:variables
}
