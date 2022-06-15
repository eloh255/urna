/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author 55889
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        miCandidato = new javax.swing.JMenuItem();
        miChapa = new javax.swing.JMenuItem();
        miEleitor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Página inical");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo-1-removebg.png"))); // NOI18N

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-plus-16.png"))); // NOI18N
        jMenu2.setText("Cadastrar");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        miCandidato.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miCandidato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-administrator-male-skin-type-1-20.png"))); // NOI18N
        miCandidato.setText("Candidato");
        miCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCandidatoActionPerformed(evt);
            }
        });
        jMenu2.add(miCandidato);

        miChapa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miChapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-gestão-de-desenvolvimento-comercial-20.png"))); // NOI18N
        miChapa.setText("Chapa");
        miChapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miChapaActionPerformed(evt);
            }
        });
        jMenu2.add(miChapa);

        miEleitor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miEleitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-homem-popular-20 (1).png"))); // NOI18N
        miEleitor.setText("Eleitor");
        miEleitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEleitorActionPerformed(evt);
            }
        });
        jMenu2.add(miEleitor);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 101, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCandidatoActionPerformed
        TelaCandidato tp = new TelaCandidato(this, rootPaneCheckingEnabled);
        tp.show(true);
    }//GEN-LAST:event_miCandidatoActionPerformed

    private void miChapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miChapaActionPerformed
        TelaChapa tc = new TelaChapa(this, rootPaneCheckingEnabled);
        tc.show(true);
    }//GEN-LAST:event_miChapaActionPerformed

    private void miEleitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEleitorActionPerformed
        TelaEleitor te = new TelaEleitor(this, rootPaneCheckingEnabled);
        te.show(true);
    }//GEN-LAST:event_miEleitorActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miCandidato;
    private javax.swing.JMenuItem miChapa;
    private javax.swing.JMenuItem miEleitor;
    // End of variables declaration//GEN-END:variables
}