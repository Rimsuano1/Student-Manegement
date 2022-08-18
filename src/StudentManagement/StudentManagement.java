/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

/**
 *
 * @author Adminstratos
 */
public class StudentManagement extends javax.swing.JFrame {

    /**
     * Creates new form StudentManagement
     */
    public StudentManagement() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        label_studentManagement = new javax.swing.JLabel();
        label_Id = new javax.swing.JLabel();
        textField_Id = new javax.swing.JTextField();
        label_Email = new javax.swing.JLabel();
        textField_StudentName = new javax.swing.JTextField();
        label_StudentName = new javax.swing.JLabel();
        textField_Email = new javax.swing.JTextField();
        label_Birthday = new javax.swing.JLabel();
        textField_Birthday = new javax.swing.JTextField();
        label_Sex = new javax.swing.JLabel();
        radioButton_Male = new javax.swing.JRadioButton();
        radioButton_Female = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Student = new javax.swing.JTable();
        button_Add = new javax.swing.JButton();
        button_Save = new javax.swing.JButton();
        button_Update = new javax.swing.JButton();
        button_Delete = new javax.swing.JButton();
        label_PhoneNumber = new javax.swing.JLabel();
        textField_PhoneNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_studentManagement.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        label_studentManagement.setForeground(new java.awt.Color(102, 102, 0));
        label_studentManagement.setText("STUDENT MANAGEMENT");

        label_Id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label_Id.setText("ID:");

        textField_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_IdActionPerformed(evt);
            }
        });

        label_Email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label_Email.setText("Email:");

        label_StudentName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label_StudentName.setText("Student name:");

        label_Birthday.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label_Birthday.setText("Birthday:");

        textField_Birthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_BirthdayActionPerformed(evt);
            }
        });

        label_Sex.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label_Sex.setText("Sex:");

        buttonGroup1.add(radioButton_Male);
        radioButton_Male.setText("Male");
        radioButton_Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton_MaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton_Female);
        radioButton_Female.setText("Female");

        tb_Student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Student name", "Sex", "Email", "Phone number", "Birthday"
            }
        ));
        jScrollPane1.setViewportView(tb_Student);

        button_Add.setFont(new java.awt.Font("UD Digi Kyokasho NP-B", 1, 14)); // NOI18N
        button_Add.setText("Add");
        button_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_AddActionPerformed(evt);
            }
        });

        button_Save.setFont(new java.awt.Font("UD Digi Kyokasho NP-B", 1, 14)); // NOI18N
        button_Save.setText("Save");
        button_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SaveActionPerformed(evt);
            }
        });

        button_Update.setFont(new java.awt.Font("UD Digi Kyokasho NP-B", 1, 14)); // NOI18N
        button_Update.setText("Update");

        button_Delete.setFont(new java.awt.Font("UD Digi Kyokasho NP-B", 1, 14)); // NOI18N
        button_Delete.setText("Delete");

        label_PhoneNumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label_PhoneNumber.setText("Phone number:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_Id)
                                    .addComponent(label_Email)
                                    .addComponent(label_StudentName)
                                    .addComponent(label_PhoneNumber)
                                    .addComponent(label_Birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textField_StudentName, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(textField_Id)
                                    .addComponent(textField_Email)
                                    .addComponent(textField_PhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textField_Birthday)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_Sex))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(radioButton_Male, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioButton_Female, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(button_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(button_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(button_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_studentManagement)
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_studentManagement)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField_Id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Id))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_StudentName)
                    .addComponent(textField_StudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Sex)
                    .addComponent(radioButton_Male)
                    .addComponent(radioButton_Female))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Birthday)
                    .addComponent(textField_Birthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Add)
                    .addComponent(button_Save)
                    .addComponent(button_Update)
                    .addComponent(button_Delete))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_IdActionPerformed

    private void radioButton_MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButton_MaleActionPerformed

    private void textField_BirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_BirthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_BirthdayActionPerformed

    private void button_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_AddActionPerformed

    private void button_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_SaveActionPerformed

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
            java.util.logging.Logger.getLogger(StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton button_Add;
    private javax.swing.JButton button_Delete;
    private javax.swing.JButton button_Save;
    private javax.swing.JButton button_Update;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Birthday;
    private javax.swing.JLabel label_Email;
    private javax.swing.JLabel label_Id;
    private javax.swing.JLabel label_PhoneNumber;
    private javax.swing.JLabel label_Sex;
    private javax.swing.JLabel label_StudentName;
    private javax.swing.JLabel label_studentManagement;
    private javax.swing.JRadioButton radioButton_Female;
    private javax.swing.JRadioButton radioButton_Male;
    private javax.swing.JTable tb_Student;
    private javax.swing.JTextField textField_Birthday;
    private javax.swing.JTextField textField_Email;
    private javax.swing.JTextField textField_Id;
    private javax.swing.JTextField textField_PhoneNumber;
    private javax.swing.JTextField textField_StudentName;
    // End of variables declaration//GEN-END:variables
}
