/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sapaiada;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joaop
 */
public class Principal extends javax.swing.JFrame {

    private static String senhaPostgres = "";
    public Principal() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabRoupa = new javax.swing.JTable();
        cbLoja = new javax.swing.JComboBox<>();
        btComprar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        rtSenha = new javax.swing.JLabel();
        btConectar = new javax.swing.JButton();
        cxSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnLogin = new javax.swing.JMenu();
        mnitLogin = new javax.swing.JMenuItem();
        mnitDeslogar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabRoupa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Roupa", "Preço", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabRoupa);
        if (tabRoupa.getColumnModel().getColumnCount() > 0) {
            tabRoupa.getColumnModel().getColumn(0).setResizable(false);
            tabRoupa.getColumnModel().getColumn(1).setResizable(false);
            tabRoupa.getColumnModel().getColumn(2).setResizable(false);
        }

        cbLoja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha uma região", "Região 1", "Região 2", "Região 3", "Região 4", "Região 5" }));
        cbLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLojaActionPerformed(evt);
            }
        });

        btComprar.setText("Comprar");
        btComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComprarActionPerformed(evt);
            }
        });

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        rtSenha.setText("Senha Postgresql:");

        btConectar.setText("Conectar");
        btConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConectarActionPerformed(evt);
            }
        });

        cxSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxSenhaActionPerformed(evt);
            }
        });

        jButton1.setText("ListaFunc");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mnLogin.setText("Login");

        mnitLogin.setText("Logar");
        mnitLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitLoginActionPerformed(evt);
            }
        });
        mnLogin.add(mnitLogin);

        mnitDeslogar.setText("Deslogar");
        mnitDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitDeslogarActionPerformed(evt);
            }
        });
        mnLogin.add(mnitDeslogar);

        jMenuBar1.add(mnLogin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rtSenha)
                    .addComponent(btConectar)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(btComprar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(cbLoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btPesquisar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar)
                    .addComponent(rtSenha)
                    .addComponent(cxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConectar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btComprar)
                    .addComponent(jButton1))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        listarRoupa();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void cbLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLojaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLojaActionPerformed

    private void btComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComprarActionPerformed
        Roupa r;
        r = Banco.getBancoRoupaUnic().getBdRoupa().get(tabRoupa.getSelectedRow());
        Comprar.getComprarUnic().setCaixas(r);
        Comprar.getComprarUnic().setVisible(true);
    }//GEN-LAST:event_btComprarActionPerformed

    private void btConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConectarActionPerformed
        setSenhaPostgres(cxSenha.getText());
        Conexao.getCon();
    }//GEN-LAST:event_btConectarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListaFuncionarios.getListFunc().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cxSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxSenhaActionPerformed

    private void mnitLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitLoginActionPerformed
        if(Login.getLoginUnic().getLog() == -1){
            Login.getLoginUnic().setVisible(true);
        }
        else{
            System.out.println("Já está logado");
        }
    }//GEN-LAST:event_mnitLoginActionPerformed

    private void mnitDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitDeslogarActionPerformed
        Login.getLoginUnic().setLog(-1);
    }//GEN-LAST:event_mnitDeslogarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    public void listarRoupa() {
        Banco.getBancoRoupaUnic().getBdRoupa().clear();
        Conexao.getCon().executaBuscaLoja(cbLoja.getSelectedIndex());
        DefaultTableModel tabModel = (DefaultTableModel) tabRoupa.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        for (Roupa r : Banco.getBancoRoupaUnic().getBdRoupa()) {
            tabModel.insertRow(posLin, new Object[]{r.getDesc(), r.getPreco(), r.getQuant()});
            posLin++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btComprar;
    private javax.swing.JButton btConectar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JComboBox<String> cbLoja;
    private javax.swing.JPasswordField cxSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mnLogin;
    private javax.swing.JMenuItem mnitDeslogar;
    private javax.swing.JMenuItem mnitLogin;
    private javax.swing.JLabel rtSenha;
    private javax.swing.JTable tabRoupa;
    // End of variables declaration//GEN-END:variables

    public static String getSenhaPostgres() {
        return senhaPostgres;
    }

    public void setSenhaPostgres(String senhaPostgres) {
        this.senhaPostgres = senhaPostgres;
    }

}
