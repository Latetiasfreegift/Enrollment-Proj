/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author knfne
 */
import java.util.ArrayList;
import java.util.Arrays;
public class StudentEnrollment extends javax.swing.JFrame {
    private ArrayList<String> majorList = new ArrayList<>(Arrays.asList("Data Structures (3)", "Computer Programming (3)", "Database Systems (4)", "Operating Systems (3)"));
    private ArrayList<String> minorList = new ArrayList<>(Arrays.asList("Purposive Communication (2)", "Ethics (3)", "Physical Education (2)", "Philippines History (3)"));

    /**
     * Creates new form StudentEnrollment
     */
    public StudentEnrollment() {
        
        initComponents();
    }
    
    private void calculateTotalUnits() {
    int total = 0;
    
    // Calculate from Major_table
    javax.swing.table.DefaultTableModel majorModel = (javax.swing.table.DefaultTableModel) Major_table.getModel();
    for (int i = 0; i < majorModel.getRowCount(); i++) {
        total += Integer.parseInt(majorModel.getValueAt(i, 1).toString().trim());
    }
    
    // Calculate from Minor_table
    javax.swing.table.DefaultTableModel minorModel = (javax.swing.table.DefaultTableModel) Minor_table.getModel();
    for (int i = 0; i < minorModel.getRowCount(); i++) {
        total += Integer.parseInt(minorModel.getValueAt(i, 1).toString().trim());
    }
    
    // Display the result
    total_of_units.setText(String.valueOf(total));
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Major_table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Minor_table = new javax.swing.JTable();
        Add_subject_minors = new javax.swing.JButton();
        Add_subject_major = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        total_of_units = new javax.swing.JTextField();
        Submit_subject = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        RemoveMajor = new javax.swing.JButton();
        RemoveMinor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Major_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Major subject", "Units"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Major_table.setToolTipText("");
        Major_table.setShowGrid(true);
        Major_table.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(Major_table);
        Major_table.getAccessibleContext().setAccessibleName("");

        Minor_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Minor subject", "Units"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Minor_table.setShowGrid(true);
        Minor_table.setShowHorizontalLines(false);
        jScrollPane2.setViewportView(Minor_table);

        Add_subject_minors.setText("+");
        Add_subject_minors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_subject_minorsActionPerformed(evt);
            }
        });

        Add_subject_major.setText("+");
        Add_subject_major.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_subject_majorActionPerformed(evt);
            }
        });

        jLabel1.setText("Total units:");

        total_of_units.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_of_units.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        total_of_units.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_of_unitsActionPerformed(evt);
            }
        });

        Submit_subject.setText("Submit");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel2.setText("Student Enrollment");

        RemoveMajor.setText("-");
        RemoveMajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveMajorActionPerformed(evt);
            }
        });

        RemoveMinor.setText("-");
        RemoveMinor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveMinorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Submit_subject))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add_subject_major)
                    .addComponent(Add_subject_minors)
                    .addComponent(RemoveMajor)
                    .addComponent(RemoveMinor))
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(total_of_units, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(Add_subject_major)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoveMajor)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(Add_subject_minors)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoveMinor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(total_of_units, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145)
                .addComponent(Submit_subject)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_subject_minorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_subject_minorsActionPerformed
    if (minorList.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "No more minor subjects available.");
        return;
    }

    String[] subjectsArray = minorList.toArray(new String[0]);
    String selection = (String) javax.swing.JOptionPane.showInputDialog(this, 
            "Select a Minor Subject:", "Minor Selection", 
            javax.swing.JOptionPane.QUESTION_MESSAGE, null, subjectsArray, subjectsArray[0]);

    if (selection != null) {
        String name = selection.substring(0, selection.lastIndexOf(" ("));
        String units = selection.substring(selection.lastIndexOf("(") + 1, selection.lastIndexOf(")"));
        
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) Minor_table.getModel();
        model.addRow(new Object[]{name, units});
        
        // REMOVE from the list
        minorList.remove(selection);
        
        calculateTotalUnits();
    }
    }//GEN-LAST:event_Add_subject_minorsActionPerformed

    
    private void Add_subject_majorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_subject_majorActionPerformed
    if (majorList.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "No more major subjects available.");
        return;
    }

    String[] subjectsArray = majorList.toArray(new String[0]);
    String selection = (String) javax.swing.JOptionPane.showInputDialog(this, 
            "Select a Major Subject:", "Major Selection", 
            javax.swing.JOptionPane.QUESTION_MESSAGE, null, subjectsArray, subjectsArray[0]);

    if (selection != null) {
        // Parse name and units
        String name = selection.substring(0, selection.lastIndexOf(" ("));
        String units = selection.substring(selection.lastIndexOf("(") + 1, selection.lastIndexOf(")"));
        
        // Add to Table
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) Major_table.getModel();
        model.addRow(new Object[]{name, units});
        
        // REMOVE from the list so it can't be picked again
        majorList.remove(selection);
        
        calculateTotalUnits();
    }
    }//GEN-LAST:event_Add_subject_majorActionPerformed

    private void total_of_unitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_of_unitsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_of_unitsActionPerformed

    private void RemoveMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveMajorActionPerformed
    int selectedRow = Major_table.getSelectedRow();
    if (selectedRow != -1) {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) Major_table.getModel();
        
        // Get data to put it back into the selection list
        String name = model.getValueAt(selectedRow, 0).toString();
        String units = model.getValueAt(selectedRow, 1).toString();
        majorList.add(name + " (" + units + ")");
        
        // Remove the row and update total
        model.removeRow(selectedRow);
        calculateTotalUnits();
    }
    }//GEN-LAST:event_RemoveMajorActionPerformed

    private void RemoveMinorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveMinorActionPerformed
    int selectedRow = Minor_table.getSelectedRow();
    if (selectedRow != -1) {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) Minor_table.getModel();
        
        String name = model.getValueAt(selectedRow, 0).toString();
        String units = model.getValueAt(selectedRow, 1).toString();
        minorList.add(name + " (" + units + ")");
        
        model.removeRow(selectedRow);
        calculateTotalUnits();
    }
    }//GEN-LAST:event_RemoveMinorActionPerformed

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
            java.util.logging.Logger.getLogger(StudentEnrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentEnrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentEnrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentEnrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentEnrollment().setVisible(true);
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_subject_major;
    private javax.swing.JButton Add_subject_minors;
    private javax.swing.JTable Major_table;
    private javax.swing.JTable Minor_table;
    private javax.swing.JButton RemoveMajor;
    private javax.swing.JButton RemoveMinor;
    private javax.swing.JButton Submit_subject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField total_of_units;
    // End of variables declaration//GEN-END:variables
}
