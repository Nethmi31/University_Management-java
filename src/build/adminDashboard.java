
package build;


public class adminDashboard extends javax.swing.JFrame {

    public adminDashboard() {
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
        admindashboardHeading = new javax.swing.JLabel();
        newAdmin = new javax.swing.JButton();
        newLecturer = new javax.swing.JButton();
        newStudent = new javax.swing.JButton();
        newTO = new javax.swing.JButton();
        newCourse = new javax.swing.JButton();
        newTimetable = new javax.swing.JButton();
        newNotice = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        adminLabel = new javax.swing.JLabel();
        lecturer = new javax.swing.JLabel();
        Student = new javax.swing.JLabel();
        TO = new javax.swing.JLabel();
        Timetable = new javax.swing.JLabel();
        Notice = new javax.swing.JLabel();
        Course = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(941, 540));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        admindashboardHeading.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        admindashboardHeading.setForeground(new java.awt.Color(204, 204, 204));
        admindashboardHeading.setText("Welcome to Admin dashboard");

        newAdmin.setIcon(new javax.swing.ImageIcon("G:\\Uni Works\\Level 2\\Sem 1\\OOD\\Small Projects\\University_Management-java-\\Other Project Materials\\Images\\admin.png")); // NOI18N
        newAdmin.setBorderPainted(false);
        newAdmin.setContentAreaFilled(false);
        newAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newAdminMouseClicked(evt);
            }
        });
        newAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAdminActionPerformed(evt);
            }
        });

        newLecturer.setIcon(new javax.swing.ImageIcon("G:\\Uni Works\\Level 2\\Sem 1\\OOD\\Small Projects\\University_Management-java-\\Other Project Materials\\Images\\lecture.png")); // NOI18N
        newLecturer.setBorderPainted(false);
        newLecturer.setContentAreaFilled(false);
        newLecturer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newLecturerActionPerformed(evt);
            }
        });

        newStudent.setIcon(new javax.swing.ImageIcon("G:\\Uni Works\\Level 2\\Sem 1\\OOD\\Small Projects\\University_Management-java-\\Other Project Materials\\Images\\student.png")); // NOI18N
        newStudent.setBorderPainted(false);
        newStudent.setContentAreaFilled(false);
        newStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudentActionPerformed(evt);
            }
        });

        newTO.setIcon(new javax.swing.ImageIcon("G:\\Uni Works\\Level 2\\Sem 1\\OOD\\Small Projects\\University_Management-java-\\Other Project Materials\\Images\\technical.png")); // NOI18N
        newTO.setBorderPainted(false);
        newTO.setContentAreaFilled(false);
        newTO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTOActionPerformed(evt);
            }
        });

        newCourse.setIcon(new javax.swing.ImageIcon("G:\\Uni Works\\Level 2\\Sem 1\\OOD\\Small Projects\\University_Management-java-\\Other Project Materials\\Images\\course1.png")); // NOI18N
        newCourse.setBorderPainted(false);
        newCourse.setContentAreaFilled(false);
        newCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        newTimetable.setIcon(new javax.swing.ImageIcon("G:\\Uni Works\\Level 2\\Sem 1\\OOD\\Small Projects\\University_Management-java-\\Other Project Materials\\Images\\time1.png")); // NOI18N
        newTimetable.setBorderPainted(false);
        newTimetable.setContentAreaFilled(false);
        newTimetable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        newNotice.setIcon(new javax.swing.ImageIcon("G:\\Uni Works\\Level 2\\Sem 1\\OOD\\Small Projects\\University_Management-java-\\Other Project Materials\\Images\\notice1.png")); // NOI18N
        newNotice.setBorderPainted(false);
        newNotice.setContentAreaFilled(false);
        newNotice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        logoutButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        logoutButton.setText("Log Out");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        adminLabel.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        adminLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminLabel.setText("New Admin");

        lecturer.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        lecturer.setForeground(new java.awt.Color(255, 255, 255));
        lecturer.setText("New Lecturer");

        Student.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        Student.setForeground(new java.awt.Color(255, 255, 255));
        Student.setText("New Student");

        TO.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        TO.setForeground(new java.awt.Color(255, 255, 255));
        TO.setText("New T.Officer");

        Timetable.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        Timetable.setForeground(new java.awt.Color(255, 255, 255));
        Timetable.setText("New Timetable");

        Notice.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        Notice.setForeground(new java.awt.Color(255, 255, 255));
        Notice.setText("New Notice");

        Course.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        Course.setForeground(new java.awt.Color(255, 255, 255));
        Course.setText("New Course");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(admindashboardHeading)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Timetable)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(newAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(adminLabel)))
                                .addGap(12, 12, 12))
                            .addComponent(newTimetable, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(Notice))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(lecturer))
                                    .addComponent(newLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newNotice, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(Student))
                                    .addComponent(newStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(TO))
                                    .addComponent(newTO, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(Course)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                                .addComponent(logoutButton)
                                .addGap(98, 98, 98))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(admindashboardHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(newLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lecturer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newNotice))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(newAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(adminLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(newTimetable, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Timetable)
                            .addComponent(Notice))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newTO, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Student)
                            .addComponent(TO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(newCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Course)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        
        setVisible(false); //Closing the DashBoard
        new loginForm().setVisible(true);//Back to Login form
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void newAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newAdminActionPerformed

    private void newAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newAdminMouseClicked
        new adminManagement().setVisible(true);
        dispose();
    }//GEN-LAST:event_newAdminMouseClicked

    private void newLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newLecturerActionPerformed
        new lecturerManagement().setVisible(true);
        dispose();
    }//GEN-LAST:event_newLecturerActionPerformed

    private void newStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudentActionPerformed
        new studentManagement().setVisible(true);
        dispose();
    }//GEN-LAST:event_newStudentActionPerformed

    private void newTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTOActionPerformed
        new technicalOfficerManagement().setVisible(true);
        dispose();
    }//GEN-LAST:event_newTOActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Course;
    private javax.swing.JLabel Notice;
    private javax.swing.JLabel Student;
    private javax.swing.JLabel TO;
    private javax.swing.JLabel Timetable;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JLabel admindashboardHeading;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lecturer;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton newAdmin;
    private javax.swing.JButton newCourse;
    private javax.swing.JButton newLecturer;
    private javax.swing.JButton newNotice;
    private javax.swing.JButton newStudent;
    private javax.swing.JButton newTO;
    private javax.swing.JButton newTimetable;
    // End of variables declaration//GEN-END:variables
}
