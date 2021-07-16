/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Empresa;
import Classes.Trabalhador;
import Conexão.EmpresaDao;

/**
 *
 * @author compu
 */
public class AtualizarEmpresa extends javax.swing.JFrame {

    Empresa emp;
    
    public AtualizarEmpresa(Empresa em) {
        initComponents();
        this.setLocationRelativeTo(null);
        emp = em;
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
        voltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        endereço = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        telefone = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descrição = new javax.swing.JTextArea();
        necessidadeTexto = new javax.swing.JLabel();
        necessidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        usuarioTexto1 = new javax.swing.JLabel();
        vagas = new javax.swing.JTextField();
        confirmar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back.png"))); // NOI18N
        voltar.setOpaque(false);
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jPanel1.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Endereço:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        endereço.setColumns(20);
        endereço.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        endereço.setRows(5);
        endereço.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(endereço);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 210, 80));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Telefone:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        telefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 209, 22));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Descrição:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        descrição.setColumns(20);
        descrição.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        descrição.setRows(5);
        descrição.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(descrição);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 210, 80));

        necessidadeTexto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        necessidadeTexto.setText("NECESSIDADE:");
        jPanel1.add(necessidadeTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, 24));

        necessidade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        necessidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(necessidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 320, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("palavras-chave, apenas.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        usuarioTexto1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        usuarioTexto1.setText("Nº DE VAGAS:");
        jPanel1.add(usuarioTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, 24));

        vagas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        vagas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(vagas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 50, 30));

        confirmar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        confirmar.setText("ATUALIZAR");
        confirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        jPanel1.add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 100, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telawhatever.jpeg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        new TelaEmpresa(emp).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_voltarActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        
        emp.setEndereço(endereço.getText());
        emp.setTelefone(telefone.getText());
        emp.setDescrição(descrição.getText());
        emp.setNecessidade(necessidade.getText());

        int vaga=Integer.parseInt(vagas.getText());
        emp.setVagas(vaga);
        
        EmpresaDao empreDao = new EmpresaDao();
        empreDao.atualizar(emp);
        new TelaEmpresa(emp).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_confirmarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmar;
    private javax.swing.JTextArea descrição;
    private javax.swing.JTextArea endereço;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField necessidade;
    private javax.swing.JLabel necessidadeTexto;
    private javax.swing.JFormattedTextField telefone;
    private javax.swing.JLabel usuarioTexto1;
    private javax.swing.JTextField vagas;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}