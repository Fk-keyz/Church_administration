/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package church_projet.login;

import church_projet.Acceuil.acc;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author frankey
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        juser = new javax.swing.JTextField();
        txtshow = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        juser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        juser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                juserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                juserFocusLost(evt);
            }
        });
        juser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                juserMouseClicked(evt);
            }
        });
        juser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juserActionPerformed(evt);
            }
        });
        jPanel1.add(juser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 172, 324, 30));

        txtshow.setForeground(new java.awt.Color(255, 255, 255));
        txtshow.setText("show password");
        txtshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtshowActionPerformed(evt);
            }
        });
        jPanel1.add(txtshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 110, -1));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jButton1.setText("Connexion");
        jButton1.setBorder(null);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 170, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/cryptographie-cles-cadenas-mot-passe-securite-icone-4965-128.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 160, -1));

        jPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPassFocusLost(evt);
            }
        });
        jPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPassMouseClicked(evt);
            }
        });
        jPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassActionPerformed(evt);
            }
        });
        jPanel1.add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 210, 320, 30));

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 150, 60));

        jButton9.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        jButton9.setText("-");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setDoubleBuffered(true);
        jButton9.setFocusable(false);
        jButton9.setSelected(true);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 29, -1));

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton10.setText("X");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setDoubleBuffered(true);
        jButton10.setFocusable(false);
        jButton10.setSelected(true);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/images-login1.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered


    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Récupérer les informations de l'utilisateur à partir des champs de saisie
        String username = juser.getText();
        String password = String.valueOf(jPass.getPassword());

        try {
            // Établir la connexion à la base de données
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/church_bd", "root", "");

            // Créer une requête SQL pour vérifier si l'utilisateur existe
            String query = "SELECT * FROM utilisateur WHERE nom = ? AND mot_de_passe= ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            // Exécuter la requête et récupérer le résultat
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // L'utilisateur existe, connexion réussie
                // JOptionPane.showMessageDialog(this, "Connexion réussie !");
                acc acc = new acc();
                acc.setVisible(true);
                dispose();// Fermer la fenêtre de connexion
                // Effectuer les actions nécessaires pour la connexion réussie
                
            } else {
                // L'utilisateur n'existe pas, refuser l'accès
                JOptionPane.showMessageDialog(this, "Nom d'utilisateur ou mot de passe incorrect ou veillez-vous Enregistrer avant.Merci!!!", "Erreur de connexion", JOptionPane.ERROR_MESSAGE);
            }

            // Fermer les ressources
            resultSet.close();
            preparedStatement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erreur lors de la connexion à la base de données.", "Erreur de connexion", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtshowActionPerformed
        if (txtshow.isSelected()) {
            jPass.setEchoChar((char) 0);
        } else {
            jPass.setEchoChar('*');
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtshowActionPerformed

    private void juserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juserActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_juserActionPerformed

    private void juserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_juserFocusGained
     if (juser.getText().equals("Entrez l'Utilisateur")) {
        juser.setText("");
        juser.setForeground(Color.BLACK); // Couleur du texte lorsque le champ a le focus
        juser.setBackground(Color.WHITE); // Couleur de l'arrière-plan lorsque le champ a le focus
    }

        // TODO add your handling code here:
    }//GEN-LAST:event_juserFocusGained

    private void juserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_juserFocusLost
      if (juser.getText().isEmpty()) {
        juser.setText("Entrez l'Utilisateur");
        juser.setForeground(Color.GRAY); // Couleur du texte lorsque le champ n'a pas le focus
        juser.setBackground(Color.white); // Couleur de l'arrière-plan lorsque le champ n'a pas le focus
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_juserFocusLost

    private void juserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_juserMouseClicked
        if (juser.getText().equals("Entrez l'Utilisateur")) {
        juser.setText("");
        juser.setForeground(Color.BLACK); // Couleur du texte lorsque le champ a le focus
        juser.setBackground(Color.WHITE); // Couleur de l'arrière-plan lorsque le champ a le focus
    }

        // TODO add your handling code here:
    }//GEN-LAST:event_juserMouseClicked

    private void jPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        this.setState(ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPassFocusGained
        if (jPass.getText().equals("Mot de passe")) {
        jPass.setText("");
        jPass.setForeground(Color.BLACK); // Couleur du texte lorsque le champ a le focus
        jPass.setBackground(Color.WHITE); // Couleur de l'arrière-plan lorsque le champ a le focus
    }


        // TODO add your handling code here:
    }//GEN-LAST:event_jPassFocusGained

    private void jPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPassFocusLost
        if (jPass.getText().isEmpty()) {
        jPass.setText("Mot de passe");
        jPass.setForeground(Color.GRAY); // Couleur du texte lorsque le champ n'a pas le focus
        jPass.setBackground(Color.white); // Couleur de l'arrière-plan lorsque le champ n'a pas le focus
    }

        // TODO add your handling code here:
    }//GEN-LAST:event_jPassFocusLost

    private void jPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPassMouseClicked
           if (jPass.getText().equals("Mot de passe")) {
        jPass.setText("");
        jPass.setForeground(Color.BLACK); // Couleur du texte lorsque le champ a le focus
        jPass.setBackground(Color.WHITE); // Couleur de l'arrière-plan lorsque le champ a le focus
    }

        // TODO add your handling code here:
    }//GEN-LAST:event_jPassMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField juser;
    private javax.swing.JCheckBox txtshow;
    // End of variables declaration//GEN-END:variables
}
