/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Aluno;
import Model.Curso;
import Model.DAO.AlunoDao;
import Model.DAO.CursoDao;
import Model.DAO.DiaCursoDao;
import Model.DAO.HoracursoDao;
import Model.Diacurso;
import Model.Horacurso;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author DeboraDev
 */
public class Alunos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Alunos
     */
    public Alunos() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) tbAlunos.getModel();
        tbAlunos.setRowSorter(new TableRowSorter(model));

        readCurso();
        readDiaCurso();
        readHoraCurso();
        readJtable();

    }

    public void readCurso() {
        CursoDao dao = new CursoDao();

        for (Curso c : dao.readCurso()) {
            cboModulo.addItem(c);
        }
    }

    public void readDiaCurso() {
        DiaCursoDao dao = new DiaCursoDao();
        for (Diacurso dcurso : dao.readDias()) {
            cboDiaAula.addItem(dcurso);
        }
    }

    public void readHoraCurso() {
        HoracursoDao dao = new HoracursoDao();
        for (Horacurso hcurso : dao.readHoras()) {
            cboHoraCurso.addItem(hcurso);
        }
    }

    public void readJtable() {
        DefaultTableModel model = (DefaultTableModel) tbAlunos.getModel();
        model.setNumRows(0);
        AlunoDao os = new AlunoDao();

        os.findAll().forEach((osAluno) -> {
            // for é usado para passar pelos objetos
            model.addRow(new Object[]{
                osAluno.getNomeAluno(),
                osAluno.getNomeAluno(),
                osAluno.gethCurso(),
                osAluno.getdCurso()

            });
        });

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
        txtFinderProf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnFinderProf = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAlunos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        btnAddAluno = new javax.swing.JButton();
        txtRemoveAluno = new javax.swing.JButton();
        txtEditAluno = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtTelefone01Aluno = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNomeResp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboModulo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cboDiaAula = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cboHoraCurso = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtProf = new javax.swing.JTextField();
        txtTelResp = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Alunos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Alunos"));

        txtFinderProf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFinderProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinderProfActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        btnFinderProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/procurar.png"))); // NOI18N
        btnFinderProf.setText("Pesquisar");
        btnFinderProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinderProfActionPerformed(evt);
            }
        });

        tbAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome Aluno(a)", "Dia de aula", "Curso", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbAlunos);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Aluno(a)"));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Nome Aluno(a)");

        txtNomeAluno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAlunoActionPerformed(evt);
            }
        });

        btnAddAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mais.png"))); // NOI18N
        btnAddAluno.setText(" addicionar");
        btnAddAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddAlunoMouseClicked(evt);
            }
        });
        btnAddAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAlunoActionPerformed(evt);
            }
        });

        txtRemoveAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fechar.png"))); // NOI18N
        txtRemoveAluno.setText(" Remover");
        txtRemoveAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemoveAlunoActionPerformed(evt);
            }
        });

        txtEditAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lapis.png"))); // NOI18N
        txtEditAluno.setText(" Editar");
        txtEditAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditAlunoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Celular do Aluno");

        try {
            txtTelefone01Aluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone01Aluno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTelefone01Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefone01AlunoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Nome do responsável");

        txtNomeResp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNomeResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeRespActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Dia de Aula:");

        cboModulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cboModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboModuloActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Curso - Modulo");

        cboDiaAula.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cboDiaAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDiaAulaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Hora:");

        cboHoraCurso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cboHoraCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHoraCursoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Professor(a)");

        txtProf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        try {
            txtTelResp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelResp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTelResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelRespActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Celular do Responsavel");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefone01Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboModulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(30, 30, 30)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(cboDiaAula, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(17, 17, 17)
                                            .addComponent(jLabel8))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(cboHoraCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(txtProf, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel16)
                                        .addComponent(txtTelResp, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNomeResp, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtEditAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRemoveAluno)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel12))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeResp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefone01Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelResp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDiaAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboHoraCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddAluno)
                    .addComponent(txtRemoveAluno)
                    .addComponent(txtEditAluno))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFinderProf, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinderProf)
                        .addGap(0, 252, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFinderProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnFinderProf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFinderProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinderProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinderProfActionPerformed

    private void btnFinderProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinderProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinderProfActionPerformed

    private void txtNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAlunoActionPerformed

    private void btnAddAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddAlunoActionPerformed

    private void txtEditAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditAlunoActionPerformed

    private void txtTelefone01AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefone01AlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone01AlunoActionPerformed

    private void txtNomeRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeRespActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeRespActionPerformed

    private void cboDiaAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDiaAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDiaAulaActionPerformed

    private void txtRemoveAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemoveAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemoveAlunoActionPerformed

    private void txtTelRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelRespActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelRespActionPerformed

    private void cboModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboModuloActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cboModuloActionPerformed

    private void cboHoraCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHoraCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboHoraCursoActionPerformed

    private void btnAddAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAlunoMouseClicked
        // Ao clicar no botão
        Aluno aluno = new Aluno();
        AlunoDao dao = new AlunoDao();
        aluno.setNomeAluno(txtNomeAluno.getText());
        aluno.setCelularAluno(txtTelefone01Aluno.getText());
        aluno.setNomeResponsalvel(txtNomeResp.getText());
        aluno.setCelularResponsavel(txtTelResp.getText());
        aluno.setNomeCurso(cboModulo.getSelectedItem().toString());
        aluno.setdCurso(cboDiaAula.getSelectedItem().toString());
        aluno.sethCurso(cboHoraCurso.getSelectedItem().toString());
        dao.insertStudent(aluno);
        readJtable();
    }//GEN-LAST:event_btnAddAlunoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAluno;
    private javax.swing.JButton btnFinderProf;
    private javax.swing.JComboBox<Object> cboDiaAula;
    private javax.swing.JComboBox<Object> cboHoraCurso;
    private javax.swing.JComboBox<Object> cboModulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAlunos;
    private javax.swing.JButton txtEditAluno;
    private javax.swing.JTextField txtFinderProf;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtNomeResp;
    private javax.swing.JTextField txtProf;
    private javax.swing.JButton txtRemoveAluno;
    private javax.swing.JFormattedTextField txtTelResp;
    private javax.swing.JFormattedTextField txtTelefone01Aluno;
    // End of variables declaration//GEN-END:variables
}
