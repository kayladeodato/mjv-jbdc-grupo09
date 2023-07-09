/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import service.ProfessorService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import model.Professor;

/**
 *
 * @author julio
 */
public class GUIDadosProfessor extends javax.swing.JDialog {

    private static ProfessorService service = new ProfessorService();
    private Professor professor;

    /**
     * Creates new form jDiaDados
     */
    public GUIDadosProfessor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    public GUIDadosProfessor(java.awt.Frame parent, boolean modal, Professor newProfessor) {
        super(parent, modal);
        professor = newProfessor;

        initComponents();
        if (professor.getId() != null) {
            carregarDados();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

            butGrpEstrangeiro = new javax.swing.ButtonGroup();
            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            jTexFieNome = new javax.swing.JTextField();
            jForFieDataNasc = new javax.swing.JFormattedTextField();
            jForFieDataCadastro = new javax.swing.JFormattedTextField();
            jForFieCargaHoraria = new javax.swing.JFormattedTextField();
            jTexFieValorHora = new javax.swing.JTextField();
            jSpinHorasDisponiveis = new javax.swing.JSpinner();
            jButSalvar = new javax.swing.JButton();
            jButCancelar = new javax.swing.JButton();
            jScrollPane1 = new javax.swing.JScrollPane();
            jTexAreBiografia = new javax.swing.JTextArea();
            jRadButSim = new javax.swing.JRadioButton();
            jRadButNao = new javax.swing.JRadioButton();
            jLabel5 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setTitle("Professor");

            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do professor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 14))); // NOI18N

            jLabel1.setText("Nome");
            jLabel1.setMaximumSize(new java.awt.Dimension(80, 20));
            jLabel1.setMinimumSize(new java.awt.Dimension(80, 20));
            jLabel1.setPreferredSize(new java.awt.Dimension(80, 20));

            jLabel2.setText("Data Nascimento");
            jLabel2.setMaximumSize(new java.awt.Dimension(80, 20));
            jLabel2.setMinimumSize(new java.awt.Dimension(80, 20));
            jLabel2.setPreferredSize(new java.awt.Dimension(80, 20));

            jLabel3.setText("Carga Horária");
            jLabel3.setMaximumSize(new java.awt.Dimension(80, 20));
            jLabel3.setMinimumSize(new java.awt.Dimension(80, 20));
            jLabel3.setPreferredSize(new java.awt.Dimension(80, 20));

            jLabel4.setText("Valor Hora");
            jLabel4.setMaximumSize(new java.awt.Dimension(80, 20));
            jLabel4.setMinimumSize(new java.awt.Dimension(80, 20));
            jLabel4.setPreferredSize(new java.awt.Dimension(80, 20));

            jLabel6.setText("Horas Disponiveis");
            jLabel6.setMaximumSize(new java.awt.Dimension(80, 20));
            jLabel6.setMinimumSize(new java.awt.Dimension(80, 20));
            jLabel6.setPreferredSize(new java.awt.Dimension(80, 20));

            jLabel7.setText("Biografia");
            jLabel7.setMaximumSize(new java.awt.Dimension(80, 20));
            jLabel7.setMinimumSize(new java.awt.Dimension(80, 20));
            jLabel7.setPreferredSize(new java.awt.Dimension(80, 20));

            try {
                jForFieDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
            jForFieDataNasc.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

            try {
                jForFieDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/#### ##:##")));
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
            jForFieDataCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

            try {
                jForFieCargaHoraria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
            jForFieCargaHoraria.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

            jSpinHorasDisponiveis.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

            jButSalvar.setText("Salvar");
            jButSalvar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButSalvarActionPerformed(evt);
                }
            });

            jButCancelar.setText("Cancelar");
            jButCancelar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButCancelarActionPerformed(evt);
                }
            });

            jTexAreBiografia.setColumns(20);
            jTexAreBiografia.setRows(5);
            jScrollPane1.setViewportView(jTexAreBiografia);

            butGrpEstrangeiro.add(jRadButSim);
            jRadButSim.setText("Sim");

            butGrpEstrangeiro.add(jRadButNao);
            jRadButNao.setSelected(true);
            jRadButNao.setText("Não");

            jLabel5.setText("Estrangeiro");
            jLabel5.setMaximumSize(new java.awt.Dimension(80, 20));
            jLabel5.setMinimumSize(new java.awt.Dimension(80, 20));
            jLabel5.setPreferredSize(new java.awt.Dimension(80, 20));

            jLabel8.setText("Data Cadastro");
            jLabel8.setMaximumSize(new java.awt.Dimension(80, 20));
            jLabel8.setMinimumSize(new java.awt.Dimension(80, 20));
            jLabel8.setPreferredSize(new java.awt.Dimension(80, 20));

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jScrollPane1)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                                                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(jForFieDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                                                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                            .addComponent(jForFieDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                    .addComponent(jSpinHorasDisponiveis)
                                                                                                    .addComponent(jTexFieValorHora)
                                                                                                    .addComponent(jTexFieNome)
                                                                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                                            .addComponent(jRadButSim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                            .addGap(18, 18, 18)
                                                                                                            .addComponent(jRadButNao))
                                                                                                    .addComponent(jForFieCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                    .addGap(0, 13, Short.MAX_VALUE)))
                                                    .addGap(3, 3, 3))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jButCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addContainerGap())))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTexFieNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jForFieDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jForFieDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jForFieCargaHoraria, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTexFieValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jRadButSim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jRadButNao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSpinHorasDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                            .addComponent(jButCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap())
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(15, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(12, 12, 12))
            );

            pack();
            setLocationRelativeTo(null);
        }

    private void jButSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSalvarActionPerformed

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterCadastro = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        professor.setNome(jTexFieNome.getText());
        professor.setDataNascimento(LocalDate.parse(jForFieDataNasc.getText(), formatter));
        professor.setCargaHoraria(LocalTime.parse(jForFieCargaHoraria.getText()));
        professor.setValorHora(Double.valueOf(jTexFieValorHora.getText().replace(",", ".")));
        professor.setEstrangeiro(jRadButSim.isSelected());
        professor.setHorasDisponiveis((Integer) jSpinHorasDisponiveis.getValue());
        professor.setBiografia(jTexAreBiografia.getText());
        if (professor.getId() == null) {
            professor.setCadastro(LocalDateTime.now());
            jForFieDataCadastro.setText(LocalDateTime.now().format(formatterCadastro));
        }else{
            professor.setCadastro(LocalDateTime.parse(jForFieDataCadastro.getText(),formatterCadastro));
        }
        service.salvar(professor);
        this.dispose();
    }//GEN-LAST:event_jButSalvarActionPerformed

    private void jButCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup butGrpEstrangeiro;
    private javax.swing.JButton jButCancelar;
    private javax.swing.JButton jButSalvar;
    private javax.swing.JFormattedTextField jForFieCargaHoraria;
    private javax.swing.JFormattedTextField jForFieDataCadastro;
    private javax.swing.JFormattedTextField jForFieDataNasc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadButNao;
    private javax.swing.JRadioButton jRadButSim;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinHorasDisponiveis;
    private javax.swing.JTextArea jTexAreBiografia;
    private javax.swing.JTextField jTexFieNome;
    private javax.swing.JTextField jTexFieValorHora;
    // End of variables declaration//GEN-END:variables

    private void carregarDados() {

        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterDateCad = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm");
        jTexFieNome.setText(professor.getNome());
        jForFieDataNasc.setText(professor.getDataNascimento().format(formatterDate));
        jForFieDataCadastro.setText(professor.getCadastro().format(formatterDateCad));
        jForFieCargaHoraria.setText(professor.getCargaHoraria().format(formatterTime));
        jTexFieValorHora.setText(professor.getValorHora().toString().replace(".", ","));
        jRadButSim.setSelected(professor.isEstrangeiro());
        jSpinHorasDisponiveis.setValue(professor.getHorasDisponiveis());
        jTexAreBiografia.setText(professor.getBiografia());

    }
}
