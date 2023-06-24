/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author ooiju
 * New Line of Code Testing Git Hub
 */
public class EditTreatmentDetails extends javax.swing.JFrame {

    /**
     * Creates new form TreatmentForm
     */
    public EditTreatmentDetails() {
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
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        ReturntoMainMenu = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setBackground(new java.awt.Color(204, 255, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel1.setText("Treatment Form");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Results will be shown here.....\n\nUsers can edit the info here as this is Read or Write access");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("Enter treatment  ID:");

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        ReturntoMainMenu.setText("Return to Main Menu");
        ReturntoMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturntoMainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ReturntoMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit)
                    .addComponent(ReturntoMainMenu))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setToolTipText("");

        jLabel7.setBackground(new java.awt.Color(187, 187, 187));
        jLabel7.setFont(new java.awt.Font("Sitka Subheading", 1, 48)); // NOI18N
        jLabel7.setText("Edit Treatment Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        String treatmentID = jTextField2.getText();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        String treatmentID = jTextField2.getText();
        boolean patientExist = checkPatientExists(treatmentID);
        String editedDetails = jTextArea1.getText();

        if (patientExist) {
            String patientDetails = getPatientDetails(treatmentID);
            jTextArea1.setText(patientDetails);

            // Enable editing of the JTextArea
            jTextArea1.setEditable(true);
            jTextArea1.setFocusable(true);
            jTextArea1.requestFocus();

            if (!patientDetails.equals(editedDetails)) {
                // Check if the Submit button was clicked
                if (evt.getSource() == Submit) {
                    int option = JOptionPane.showOptionDialog(null, "Do you want to save the edited details?", "Save Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                    if (option == JOptionPane.YES_OPTION) {
                        boolean saveSuccessful = editPatientDetails(treatmentID, editedDetails);

                        if (saveSuccessful) {
                            System.out.println("Edited details saved successfully.");
                            // Update the patient details and display the edited details
                            patientDetails = editedDetails;
                            jTextArea1.setText(patientDetails);
                        } else {
                            System.out.println("Failed to save the edited details.");
                        }
                    }
                }
            }
        } else {
            System.out.println("Treatment ID not found!");
            jTextArea1.setText("No details found for the given Treatment ID.");
        }
    
        }

        private boolean checkPatientExists(String treatmentID) {
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\LORELYN\\OneDrive\\Desktop\\APAssignment\\src\\Text\\Treatment Details.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.equals("Treatment ID: " + treatmentID)) {
                        return true; // Patient ID exists in the text file
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false; 
        }

        private String getPatientDetails(String treatmentID) {
        StringBuilder details = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\LORELYN\\OneDrive\\Desktop\\APAssignment\\src\\Text\\Treatment Details.txt"))) {
                String line;
                boolean foundPatient = false;
                while ((line = br.readLine()) != null) {
                    if (line.equals("Treatment ID: " + treatmentID)) {
                        foundPatient = true;
                    } else if (foundPatient) {
                        if (line.startsWith("Treatment ID")) {
                            break;
                        }
                        details.append(line).append("\n");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return details.toString();
        }

        private boolean editPatientDetails(String treatmentID, String newDetails) {
            try {
                File inputFile = new File("C:\\Users\\LORELYN\\OneDrive\\Desktop\\APAssignment\\src\\Text\\Treatment Details.txt");
                File tempFile = new File("C:\\Users\\LORELYN\\OneDrive\\Desktop\\APAssignment\\src\\Text\\Temp Treatment Details.txt");

                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));

                String line;
                boolean patientFound = false;
                boolean editingDetails = false;

                while ((line = br.readLine()) != null) {
                    if (line.equals("Treatment ID: " + treatmentID)) {
                        patientFound = true;
                        editingDetails = true;
                        bw.write(line);
                        bw.newLine();
                        bw.write(newDetails);
                        bw.newLine();
                    } else if (line.startsWith("Teatment ID: ")) {
                        editingDetails = false;
                    }

                    if (!editingDetails) {
                        bw.write(line);
                        bw.newLine();
                    }
                }

        br.close();
        bw.close();

            if (patientFound) {
                if (!inputFile.delete()) {
                    System.out.println("Failed to delete the original file.");
                    return false;
                }

                if (!tempFile.renameTo(inputFile)) {
                    System.out.println("Failed to rename the temporary file.");
                    return false;
                }

                System.out.println("Treatment details updated successfully.");
                return true;
            } else {
                System.out.println("Treatment ID not found in the file.");
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

    }//GEN-LAST:event_SubmitActionPerformed
       
            
    private void ReturntoMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturntoMainMenuActionPerformed
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ReturntoMainMenuActionPerformed

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
            java.util.logging.Logger.getLogger(EditTreatmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTreatmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTreatmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTreatmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditTreatmentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReturntoMainMenu;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void getText() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void updatePatientDetailsInFile(String patientID, String editedDetails) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean checkDetailsSaved(String patientID, String editedDetails) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
