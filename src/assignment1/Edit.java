/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment1;

import javax.swing.JFrame;

/**
 *
 * @author chrisliuwell
 */
public class Edit extends javax.swing.JFrame {

    /**
     * Creates new form Delete1
     */
    public Edit() {
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

        MainFrame = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        DeleteLabel = new javax.swing.JLabel();
        CloseIcon = new javax.swing.JLabel();
        Patient = new javax.swing.JPanel();
        PatientLabel = new javax.swing.JLabel();
        PatientIcon = new javax.swing.JLabel();
        Procedure = new javax.swing.JPanel();
        ProcedureLabel = new javax.swing.JLabel();
        ProcedureIcon = new javax.swing.JLabel();
        MedicalHistory = new javax.swing.JPanel();
        MedicalHistoryLabel = new javax.swing.JLabel();
        MedicalHistoryIcon = new javax.swing.JLabel();
        Treatment = new javax.swing.JPanel();
        TreatmentLabel = new javax.swing.JLabel();
        TreatmentIcon = new javax.swing.JLabel();
        Analysis = new javax.swing.JPanel();
        AnalysisLabel = new javax.swing.JLabel();
        AnalysisIcon = new javax.swing.JLabel();
        Medicine = new javax.swing.JPanel();
        MedicineLabel = new javax.swing.JLabel();
        MedicineIcon = new javax.swing.JLabel();
        ReturnMainMenu = new javax.swing.JPanel();
        MainMenuLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        MainFrame.setBackground(new java.awt.Color(102, 102, 102));
        MainFrame.setForeground(new java.awt.Color(255, 255, 255));

        Header.setBackground(new java.awt.Color(51, 51, 51));

        DeleteLabel.setBackground(new java.awt.Color(255, 255, 255));
        DeleteLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        DeleteLabel.setForeground(new java.awt.Color(255, 255, 255));
        DeleteLabel.setText("EDIT");

        CloseIcon.setIcon(new javax.swing.ImageIcon("../APAssignment/src/Icons/close.png"));
        CloseIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CloseIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CloseIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Patient.setBackground(new java.awt.Color(255, 255, 255));
        Patient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientMouseClicked(evt);
            }
        });

        PatientLabel.setBackground(new java.awt.Color(204, 204, 204));
        PatientLabel.setText("Patient");

        PatientIcon.setIcon(new javax.swing.ImageIcon("../APAssignment/src/Icons/Patient Details.png"));
        PatientIcon.setText("PatientIcon");

        javax.swing.GroupLayout PatientLayout = new javax.swing.GroupLayout(Patient);
        Patient.setLayout(PatientLayout);
        PatientLayout.setHorizontalGroup(
            PatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientLayout.createSequentialGroup()
                .addGroup(PatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PatientLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PatientLabel))
                    .addGroup(PatientLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(PatientIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        PatientLayout.setVerticalGroup(
            PatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(PatientIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(PatientLabel)
                .addContainerGap())
        );

        Procedure.setBackground(new java.awt.Color(255, 255, 255));
        Procedure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProcedureMouseClicked(evt);
            }
        });

        ProcedureLabel.setBackground(new java.awt.Color(204, 204, 204));
        ProcedureLabel.setText("Procedure");

        ProcedureIcon.setIcon(new javax.swing.ImageIcon("../APAssignment/src/Icons/Procedure Form.png"));
        ProcedureIcon.setText("ProcedureIcon");

        javax.swing.GroupLayout ProcedureLayout = new javax.swing.GroupLayout(Procedure);
        Procedure.setLayout(ProcedureLayout);
        ProcedureLayout.setHorizontalGroup(
            ProcedureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProcedureLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProcedureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProcedureLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProcedureIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        ProcedureLayout.setVerticalGroup(
            ProcedureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProcedureLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(ProcedureIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ProcedureLabel)
                .addContainerGap())
        );

        MedicalHistory.setBackground(new java.awt.Color(255, 255, 255));
        MedicalHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedicalHistoryMouseClicked(evt);
            }
        });

        MedicalHistoryLabel.setBackground(new java.awt.Color(204, 204, 204));
        MedicalHistoryLabel.setText("Medical History");

        MedicalHistoryIcon.setIcon(new javax.swing.ImageIcon("../APAssignment/src/Icons/Medical History.png"));
        MedicalHistoryIcon.setText("MedicalHistoryIcon");

        javax.swing.GroupLayout MedicalHistoryLayout = new javax.swing.GroupLayout(MedicalHistory);
        MedicalHistory.setLayout(MedicalHistoryLayout);
        MedicalHistoryLayout.setHorizontalGroup(
            MedicalHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicalHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MedicalHistoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MedicalHistoryLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(MedicalHistoryIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        MedicalHistoryLayout.setVerticalGroup(
            MedicalHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MedicalHistoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MedicalHistoryIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MedicalHistoryLabel)
                .addContainerGap())
        );

        Treatment.setBackground(new java.awt.Color(255, 255, 255));
        Treatment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TreatmentMouseClicked(evt);
            }
        });

        TreatmentLabel.setBackground(new java.awt.Color(204, 204, 204));
        TreatmentLabel.setText("Treatment");

        TreatmentIcon.setIcon(new javax.swing.ImageIcon("../APAssignment/src/Icons/Treatment.png"));

        javax.swing.GroupLayout TreatmentLayout = new javax.swing.GroupLayout(Treatment);
        Treatment.setLayout(TreatmentLayout);
        TreatmentLayout.setHorizontalGroup(
            TreatmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TreatmentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TreatmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TreatmentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TreatmentIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        TreatmentLayout.setVerticalGroup(
            TreatmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TreatmentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TreatmentIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(TreatmentLabel)
                .addContainerGap())
        );

        Analysis.setBackground(new java.awt.Color(255, 255, 255));
        Analysis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnalysisMouseClicked(evt);
            }
        });

        AnalysisLabel.setBackground(new java.awt.Color(204, 204, 204));
        AnalysisLabel.setText("Analysis");

        AnalysisIcon.setIcon(new javax.swing.ImageIcon("../APAssignment/src/Icons/Analysis.png"));
        AnalysisIcon.setText("AnalysisIcon");

        javax.swing.GroupLayout AnalysisLayout = new javax.swing.GroupLayout(Analysis);
        Analysis.setLayout(AnalysisLayout);
        AnalysisLayout.setHorizontalGroup(
            AnalysisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnalysisLayout.createSequentialGroup()
                .addGroup(AnalysisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AnalysisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AnalysisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AnalysisLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(AnalysisIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        AnalysisLayout.setVerticalGroup(
            AnalysisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AnalysisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AnalysisIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnalysisLabel)
                .addContainerGap())
        );

        Medicine.setBackground(new java.awt.Color(255, 255, 255));
        Medicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedicineMouseClicked(evt);
            }
        });

        MedicineLabel.setBackground(new java.awt.Color(204, 204, 204));
        MedicineLabel.setText("Medicine");

        MedicineIcon.setIcon(new javax.swing.ImageIcon("../APAssignment/src/Icons/Medicine.png"));
        MedicineIcon.setText("MedicineIcon");

        javax.swing.GroupLayout MedicineLayout = new javax.swing.GroupLayout(Medicine);
        Medicine.setLayout(MedicineLayout);
        MedicineLayout.setHorizontalGroup(
            MedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicineLayout.createSequentialGroup()
                .addGroup(MedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MedicineLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MedicineLabel))
                    .addGroup(MedicineLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(MedicineIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MedicineLayout.setVerticalGroup(
            MedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MedicineLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MedicineIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(MedicineLabel)
                .addContainerGap())
        );

        ReturnMainMenu.setBackground(new java.awt.Color(255, 255, 255));
        ReturnMainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnMainMenuMouseClicked(evt);
            }
        });

        MainMenuLabel.setText("Return to Main Menu");

        jLabel2.setIcon(new javax.swing.ImageIcon("../APAssignment/src/Icons/Menu.png"));
        jLabel2.setText("ReturnMainMenuIcon");

        javax.swing.GroupLayout ReturnMainMenuLayout = new javax.swing.GroupLayout(ReturnMainMenu);
        ReturnMainMenu.setLayout(ReturnMainMenuLayout);
        ReturnMainMenuLayout.setHorizontalGroup(
            ReturnMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReturnMainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        ReturnMainMenuLayout.setVerticalGroup(
            ReturnMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReturnMainMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainMenuLabel)
                .addContainerGap())
            .addGroup(ReturnMainMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainFrameLayout = new javax.swing.GroupLayout(MainFrame);
        MainFrame.setLayout(MainFrameLayout);
        MainFrameLayout.setHorizontalGroup(
            MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ReturnMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainFrameLayout.createSequentialGroup()
                        .addGroup(MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Patient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Procedure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Treatment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MedicalHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Analysis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Medicine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 4, Short.MAX_VALUE))
        );
        MainFrameLayout.setVerticalGroup(
            MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainFrameLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 61, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Patient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MedicalHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Analysis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Procedure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Treatment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Medicine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReturnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(MainFrame, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientMouseClicked
        EditForm ep = new EditForm();
        ep.setVisible(true);
        ep.pack();
        ep.setLocationRelativeTo(null);
        ep.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_PatientMouseClicked

    private void ProcedureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProcedureMouseClicked
        EditProcedure e = new EditProcedure();
        e.setVisible(true);
        e.pack();
        e.setLocationRelativeTo(null);
        e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ProcedureMouseClicked

    private void TreatmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreatmentMouseClicked
        EditTreatmentDetails et = new EditTreatmentDetails();
        et.setVisible(true);
        et.pack();
        et.setLocationRelativeTo(null);
        et.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_TreatmentMouseClicked

    private void MedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedicineMouseClicked
        EditMedicine em = new EditMedicine();
        em.setVisible(true);
        em.pack();
        em.setLocationRelativeTo(null);
        em.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_MedicineMouseClicked

    private void ReturnMainMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMainMenuMouseClicked
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ReturnMainMenuMouseClicked

    private void MedicalHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedicalHistoryMouseClicked
        EditMedicalHistory eh = new EditMedicalHistory();
        eh.setVisible(true);
        eh.pack();
        eh.setLocationRelativeTo(null);
        eh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_MedicalHistoryMouseClicked

    private void AnalysisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnalysisMouseClicked
        EditAnalysis ea = new EditAnalysis();
        ea.setVisible(true);
        ea.pack();
        ea.setLocationRelativeTo(null);
        ea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_AnalysisMouseClicked

    private void CloseIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseIconMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseIconMouseClicked

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
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Analysis;
    private javax.swing.JLabel AnalysisIcon;
    private javax.swing.JLabel AnalysisLabel;
    private javax.swing.JLabel CloseIcon;
    private javax.swing.JLabel DeleteLabel;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel MainFrame;
    private javax.swing.JLabel MainMenuLabel;
    private javax.swing.JPanel MedicalHistory;
    private javax.swing.JLabel MedicalHistoryIcon;
    private javax.swing.JLabel MedicalHistoryLabel;
    private javax.swing.JPanel Medicine;
    private javax.swing.JLabel MedicineIcon;
    private javax.swing.JLabel MedicineLabel;
    private javax.swing.JPanel Patient;
    private javax.swing.JLabel PatientIcon;
    private javax.swing.JLabel PatientLabel;
    private javax.swing.JPanel Procedure;
    private javax.swing.JLabel ProcedureIcon;
    private javax.swing.JLabel ProcedureLabel;
    private javax.swing.JPanel ReturnMainMenu;
    private javax.swing.JPanel Treatment;
    private javax.swing.JLabel TreatmentIcon;
    private javax.swing.JLabel TreatmentLabel;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
