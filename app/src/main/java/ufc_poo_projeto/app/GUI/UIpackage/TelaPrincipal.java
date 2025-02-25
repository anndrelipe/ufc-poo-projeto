/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ufc_poo_projeto.app.GUI.UIpackage;

import ufc_poo_projeto.app.controllers.FilmeController;
import ufc_poo_projeto.app.controllers.UsuarioController;
import ufc_poo_projeto.app.entities.DadosUsuario;
import ufc_poo_projeto.app.entities.Filme;
import ufc_poo_projeto.app.services.GerenciadorEstado;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.net.URL;
import java.util.List;

public class TelaPrincipal extends JFrame {

    private DadosUsuario usuarioLogado;

    private Filme filmeSelecionado;

    private List<Filme> filmesComprados;
    private List<Filme> carrinho;

    FilmeController filmeController = new FilmeController();

    private GerenciadorEstado gerenciadorEstado = new GerenciadorEstado();

    public TelaPrincipal(DadosUsuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;

        if (usuarioLogado != null) {
            gerenciadorEstado.setEstadoAtual(usuarioLogado.getId());
        }

        filmesComprados = gerenciadorEstado.getEstadoAtual().getFilmes();
        carrinho = gerenciadorEstado.getEstadoAtual().getCarrinho();

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        card1 = new javax.swing.JPanel();
        buscaFilmeInput1 = new javax.swing.JTextField();
        buscaFilmeBtn1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        username1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        nomeFilme1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sinopse1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        genero1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        duracao1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        dataLancamento1 = new javax.swing.JTextField();
        capaPanel1 = new javax.swing.JPanel();
        carrinhoBtn = new javax.swing.JButton();
        card2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        voltarHomeBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        usuarioNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        usuarioCPF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        usuarioEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        salvarBtn = new javax.swing.JButton();
        genero = new javax.swing.JComboBox<>();
        status = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        saldoInput = new javax.swing.JSpinner();
        card3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFilmes = new javax.swing.JTable();
        voltarHomeBtn1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        finalizarCompraBtn = new javax.swing.JButton();
        deletaId = new javax.swing.JSpinner();
        confirmarBtn = new javax.swing.JButton();
        totalPreco = new javax.swing.JTextField();
        card4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaCarrinho = new javax.swing.JTable();
        voltarHomeBtn2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        sairBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        perfilBtn = new javax.swing.JButton();
        meusFilmesBtn = new javax.swing.JButton();
        verCarrinhoBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 933, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.CardLayout());

        card1.setBackground(new java.awt.Color(255, 255, 255));

        buscaFilmeInput1.setToolTipText("Título do filme...");

        buscaFilmeBtn1.setBackground(new java.awt.Color(0, 51, 102));
        buscaFilmeBtn1.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 15)); // NOI18N
        buscaFilmeBtn1.setForeground(new java.awt.Color(255, 255, 255));
        buscaFilmeBtn1.setText("Buscar");
        buscaFilmeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaFilmeBtn1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Procure aqui por um filme");

        jLabel10.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 20)); // NOI18N
        jLabel10.setText("<html><font color='rgb(0,51,102)'>Bem-vindo(a) novamente,</font></html> ");

        username1.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 18)); // NOI18N
        username1.setForeground(new java.awt.Color(0, 51, 102));
        username1.setText(this.usuarioLogado.getNome());
        username1.setBorder(null);

        jLabel11.setText("Título: ");

        nomeFilme1.setText("Nome do filme");
        nomeFilme1.setBorder(null);


        jLabel12.setText("Sinopse: ");

        sinopse1.setColumns(25);
        sinopse1.setRows(5);
        sinopse1.setLineWrap(true);
        sinopse1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(sinopse1);
        jScrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        jScrollPane2.setViewportView(sinopse1);

        jLabel13.setText("Genero:");

        genero1.setText("Genero do filme");
        genero1.setBorder(null);


        jLabel14.setText("Duração:");

        duracao1.setText("mmm min");
        duracao1.setBorder(null);

        jLabel15.setText("Lançamento:");

        dataLancamento1.setText("dd/mm/yyyy");
        dataLancamento1.setBorder(null);

        javax.swing.GroupLayout capaPanel1Layout = new javax.swing.GroupLayout(capaPanel1);
        capaPanel1.setLayout(capaPanel1Layout);
        capaPanel1Layout.setHorizontalGroup(
            capaPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        capaPanel1Layout.setVerticalGroup(
            capaPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        carrinhoBtn.setBackground(new java.awt.Color(0, 51, 102));
        carrinhoBtn.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 15)); // NOI18N
        carrinhoBtn.setForeground(new java.awt.Color(255, 255, 255));
        carrinhoBtn.setText("Adicionar ao Carrinho");
        carrinhoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrinhoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout card1Layout = new javax.swing.GroupLayout(card1);
        card1.setLayout(card1Layout);
        card1Layout.setHorizontalGroup(
            card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carrinhoBtn)
                    .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(card1Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(duracao1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel15)
                            .addGap(11, 11, 11)
                            .addComponent(dataLancamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(card1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(genero1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(card1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeFilme1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, card1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(capaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(card1Layout.createSequentialGroup()
                        .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(card1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(username1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buscaFilmeInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscaFilmeBtn1)))
                .addGap(113, 113, 113))
        );
        card1Layout.setVerticalGroup(
            card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscaFilmeInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscaFilmeBtn1))
                .addGap(39, 39, 39)
                .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card1Layout.createSequentialGroup()
                        .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeFilme1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(genero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jLabel14)
                                .addComponent(duracao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dataLancamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(capaPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(carrinhoBtn)
                .addContainerGap())
        );

        jPanel4.add(card1, "card1");

        card2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Seu Perfil");

        voltarHomeBtn.setBackground(new java.awt.Color(0, 51, 102));
        voltarHomeBtn.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 15)); // NOI18N
        voltarHomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        voltarHomeBtn.setText("Voltar");
        voltarHomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarHomeBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Nome de Usuário");

        usuarioNome.setText(this.usuarioLogado.getNome());

        jLabel4.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("CPF");

        usuarioCPF.setText(this.usuarioLogado.getCpf());

        jLabel5.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Email");

        usuarioEmail.setText(this.usuarioLogado.getEmail());

        jLabel6.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Genero");

        salvarBtn.setBackground(new java.awt.Color(0, 51, 102));
        salvarBtn.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 15)); // NOI18N
        salvarBtn.setForeground(new java.awt.Color(255, 255, 255));
        salvarBtn.setText("Salvar mudanças");
        salvarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBtnActionPerformed(evt);
            }});

        genero.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 15)); // NOI18N
        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outro" }));

        String generoFormatado = this.usuarioLogado.getGenero().name().toLowerCase();
        generoFormatado = generoFormatado.substring(0, 1).toUpperCase() + generoFormatado.substring(1);
        genero.setSelectedItem(generoFormatado);

        jLabel16.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 102));
        jLabel16.setText("Saldo R$");

        saldoInput.setValue(this.usuarioLogado.getSaldo());

        javax.swing.GroupLayout card2Layout = new javax.swing.GroupLayout(card2);
        card2.setLayout(card2Layout);
        card2Layout.setHorizontalGroup(
            card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarHomeBtn)
                        .addGap(51, 51, 51))
                    .addGroup(card2Layout.createSequentialGroup()
                        .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(card2Layout.createSequentialGroup()
                                .addComponent(salvarBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGap(6, 6, 6))
                            .addComponent(jLabel5)
                            .addComponent(usuarioEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(card2Layout.createSequentialGroup()
                                .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(usuarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(card2Layout.createSequentialGroup()
                                .addComponent(usuarioCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(saldoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(86, 86, 86))))
        );
        card2Layout.setVerticalGroup(
            card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(card2Layout.createSequentialGroup()
                        .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(voltarHomeBtn))
                        .addGap(84, 84, 84)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(card2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saldoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarBtn)
                    .addComponent(jLabel7))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        jPanel4.add(card2, "card3");

        card3.setBackground(new java.awt.Color(255, 255, 255));

        tabelaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Id", "Título", "Categoria", "Data de lançamento", "Diretor", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                Integer.class, String.class, String.class, String.class, String.class, String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });


        if (!this.carrinho.isEmpty()) {
            for (int i = 0; i < this.carrinho.size(); i++) {
                int id = i + 1;
                String titulo = carrinho.get(i).getTitulo();
                String categoria = carrinho.get(i).getGenero();
                String dataLancamento = carrinho.get(i).getDataLancamento();
                String diretor = carrinho.get(i).getDiretor();
                double preco = 140.;

                ((DefaultTableModel) tabelaCarrinho.getModel()).addRow(new Object[]{id, titulo, categoria, dataLancamento, diretor, preco});
            }
        }

        jScrollPane1.setViewportView(tabelaCarrinho);

        voltarHomeBtn1.setBackground(new java.awt.Color(0, 51, 102));
        voltarHomeBtn1.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 15)); // NOI18N
        voltarHomeBtn1.setForeground(new java.awt.Color(255, 255, 255));
        voltarHomeBtn1.setText("Voltar");
        voltarHomeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarHomeBtn1ActionPerformed(evt);
            }});

        jLabel17.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 102));
        jLabel17.setText("Remover do carrinho:");

        jLabel19.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 102));
        jLabel19.setText("Total R$:");

        finalizarCompraBtn.setBackground(new java.awt.Color(0, 51, 102));
        finalizarCompraBtn.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 15)); // NOI18N
        finalizarCompraBtn.setForeground(new java.awt.Color(255, 255, 255));
        finalizarCompraBtn.setText("Finalizar a compra");
        finalizarCompraBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarCompraBtnActionPerformed(evt);
            }
        });

        confirmarBtn.setForeground(new java.awt.Color(153, 0, 0));
        confirmarBtn.setText("Confirmar");
        confirmarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBtnActionPerformed(evt);
            }
        });

        totalPreco.setText("<total>");
        totalPreco.setBorder(null);

        javax.swing.GroupLayout card3Layout = new javax.swing.GroupLayout(card3);
        card3.setLayout(card3Layout);
        card3Layout.setHorizontalGroup(
            card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(card3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarHomeBtn1)
                .addContainerGap())
            .addGroup(card3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card3Layout.createSequentialGroup()
                        .addComponent(finalizarCompraBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(card3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        card3Layout.setVerticalGroup(
            card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17)
                    .addComponent(deletaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmarBtn)
                    .addComponent(totalPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(finalizarCompraBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(voltarHomeBtn1)
                .addContainerGap())
        );

        jPanel4.add(card3, "card4");

        card4.setBackground(new java.awt.Color(255, 255, 255));

        tabelaFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Título", "Categoria", "Data de lançamento", "Diretor", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, String.class, String.class, String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });

        if (!this.filmesComprados.isEmpty()) {
            for (int i = 0; i < this.filmesComprados.size(); i++) {
                String titulo = filmesComprados.get(i).getTitulo();
                String categoria = filmesComprados.get(i).getGenero();
                String dataLancamento = filmesComprados.get(i).getDataLancamento();
                String diretor = filmesComprados.get(i).getDiretor();
                double preco = 140.;

                ((DefaultTableModel) tabelaFilmes.getModel()).addRow(new Object[]{titulo, categoria, dataLancamento, diretor, preco});
            }
        }


        jScrollPane3.setViewportView(tabelaFilmes);

        voltarHomeBtn2.setBackground(new java.awt.Color(0, 51, 102));
        voltarHomeBtn2.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 15)); // NOI18N
        voltarHomeBtn2.setForeground(new java.awt.Color(255, 255, 255));
        voltarHomeBtn2.setText("Voltar");
        voltarHomeBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarHomeBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout card4Layout = new javax.swing.GroupLayout(card4);
        card4.setLayout(card4Layout);
        card4Layout.setHorizontalGroup(
            card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarHomeBtn2)
                .addContainerGap())
        );
        card4Layout.setVerticalGroup(
            card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarHomeBtn2)
                .addContainerGap())
        );

        jPanel4.add(card4, "card5");

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 449));

        sairBtn.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 15)); // NOI18N
        sairBtn.setForeground(new java.awt.Color(0, 51, 102));
        sairBtn.setText("Sair");
        sairBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 16)); // NOI18N
        jLabel8.setText("<html><font color='rgb(0,0,153)'>JAVA</font><font color='rgb(255,255,255)'>zon Prime Video</font></html> ");

        perfilBtn.setBackground(new java.awt.Color(51, 153, 255));
        perfilBtn.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 15)); // NOI18N
        perfilBtn.setForeground(new java.awt.Color(255, 255, 255));
        perfilBtn.setText("Meu perfil");
        perfilBtn.setBorder(null);
        perfilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilBtnActionPerformed(evt);
            }
        });

        meusFilmesBtn.setBackground(new java.awt.Color(51, 153, 255));
        meusFilmesBtn.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 15)); // NOI18N
        meusFilmesBtn.setForeground(new java.awt.Color(255, 255, 255));
        meusFilmesBtn.setText("Meus filmes");
        meusFilmesBtn.setBorder(null);
        meusFilmesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meusFilmesBtnActionPerformed(evt);
            }
        });

        verCarrinhoBtn.setBackground(new java.awt.Color(51, 153, 255));
        verCarrinhoBtn.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 15)); // NOI18N
        verCarrinhoBtn.setForeground(new java.awt.Color(255, 255, 255));
        verCarrinhoBtn.setText("Ver carrinho");
        verCarrinhoBtn.setBorder(null);
        verCarrinhoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCarrinhoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sairBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(perfilBtn)
                            .addComponent(meusFilmesBtn)
                            .addComponent(verCarrinhoBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(perfilBtn)
                .addGap(18, 18, 18)
                .addComponent(meusFilmesBtn)
                .addGap(18, 18, 18)
                .addComponent(verCarrinhoBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                .addComponent(sairBtn)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {
        double saldoInputValue = ((Number) saldoInput.getValue()).doubleValue();
        String generoValue = (String) genero.getSelectedItem();
        String emailValue = this.usuarioEmail.getText();
        String cpfValue = this.usuarioCPF.getText();
        String nomeValue = this.usuarioNome.getText();

        if (
                saldoInputValue != this.usuarioLogado.getSaldo() ||
                !generoValue.equalsIgnoreCase(this.usuarioLogado.getGenero().name()) ||
                !emailValue.equalsIgnoreCase(this.usuarioLogado.getEmail()) ||
                !cpfValue.equalsIgnoreCase(this.usuarioLogado.getCpf()) ||
                !nomeValue.equalsIgnoreCase(this.usuarioLogado.getNome())
        ) {

            JOptionPane.showMessageDialog(this, "Existem informações que serão alteradas! (Passível de receber cobranças)", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            UsuarioController.alteraInformacoes(this.usuarioLogado, nomeValue, cpfValue, emailValue, saldoInputValue, generoValue);
            this.usuarioLogado = UsuarioController.buscarUsuarioPorNome(nomeValue);
        }

        JOptionPane.showMessageDialog(this, "Informações alteradas com sucesso!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
    }

    private void buscaFilmeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {
        String titulo = buscaFilmeInput1.getText();
        if (titulo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Busque por um título válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        this.filmeSelecionado = filmeController.procurarPorTitulo(titulo);
        if (filmeSelecionado != null) {
            nomeFilme1.setText(filmeSelecionado.getTitulo());
            sinopse1.setText(filmeSelecionado.getSinopse().replace("\n", ""));
            genero1.setText(filmeSelecionado.getGenero());
            duracao1.setText(filmeSelecionado.getDuracao());
            dataLancamento1.setText(filmeSelecionado.getDataLancamento());

            try {
                URL url = new URL(filmeSelecionado.getCapa());

                ImageIcon icon = new ImageIcon(new ImageIcon(url).getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH));
                JLabel labelImagem = new JLabel(icon);

                capaPanel1.removeAll();
                capaPanel1.setLayout(new BorderLayout());
                capaPanel1.add(labelImagem, BorderLayout.CENTER);
                capaPanel1.revalidate();
                capaPanel1.repaint();
            } catch (Exception e) {
                e.printStackTrace();
                JLabel erroLabel = new JLabel("Erro ao carregar a imagem", JLabel.CENTER);
                capaPanel1.removeAll();
                capaPanel1.add(erroLabel, BorderLayout.CENTER);
                capaPanel1.revalidate();
                capaPanel1.repaint();
            }
        }
    }

    private void carrinhoBtnActionPerformed(java.awt.event.ActionEvent evt) {
        for (Filme filme : this.carrinho) {
            if (filme.equals(filmeSelecionado)) {
                JOptionPane.showMessageDialog(this, "O filme já está no carrinho!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        for (Filme filme : this.filmesComprados) {
            if (filme.equals(filmeSelecionado)) {
                JOptionPane.showMessageDialog(this, "O filme já foi comprado!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        if (filmeSelecionado.getTitulo() != null && !filmeSelecionado.getTitulo().isEmpty()) {
            filmeController.adicionar(filmeSelecionado, carrinho);
            DefaultTableModel model = (DefaultTableModel) tabelaCarrinho.getModel();
            model.addRow(new Object[]{this.carrinho.size(), filmeSelecionado.getTitulo(), filmeSelecionado.getGenero(), filmeSelecionado.getDataLancamento(), filmeSelecionado.getDiretor(), 140.});
            JOptionPane.showMessageDialog(this, "O filme foi adicionado ao carrinho", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
       }
    }

    private void sairBtnActionPerformed(java.awt.event.ActionEvent evt) {
        gerenciadorEstado.salvarEstadoAtual();

        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        this.setVisible(false);
    }


    private void voltarHomeBtnActionPerformed(java.awt.event.ActionEvent evt) {
        CardLayout cl = (CardLayout) jPanel4.getLayout();
        cl.show(jPanel4, "card1");
        jPanel4.revalidate();
        jPanel4.repaint();

    }

    private void voltarHomeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {
        CardLayout cl = (CardLayout) jPanel4.getLayout();
        cl.show(jPanel4, "card1");
        jPanel4.revalidate();
        jPanel4.repaint();

    }

    private void voltarHomeBtn2ActionPerformed(java.awt.event.ActionEvent evt) {
        CardLayout cl = (CardLayout) jPanel4.getLayout();
        cl.show(jPanel4, "card1");
        jPanel4.revalidate();
        jPanel4.repaint();

    }
    private void confirmarBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Tem certeza que deseja remover do carrinho?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION
        );

        if (resposta == JOptionPane.YES_OPTION) {
            DefaultTableModel model = (DefaultTableModel) tabelaCarrinho.getModel();
            int idParaDeletar =  (int) deletaId.getValue() - 1;
            filmeController.remover((String) model.getValueAt(idParaDeletar, 1), carrinho);

            model.removeRow(idParaDeletar);
            JOptionPane.showMessageDialog(this, "Filme removido do carrinho", "Mensagem", JOptionPane.INFORMATION_MESSAGE);

            int rowCount = model.getRowCount();
            totalPreco.setText(String.format("%.2f", (rowCount * 140.0)));
        }
    }

    private void perfilBtnActionPerformed(java.awt.event.ActionEvent evt) {
        saldoInput.setValue(this.usuarioLogado.getSaldo());
        String generoFormatado = this.usuarioLogado.getGenero().name().toLowerCase();
        generoFormatado = generoFormatado.substring(0, 1).toUpperCase() + generoFormatado.substring(1);
        genero.setSelectedItem(generoFormatado);
        usuarioEmail.setText(this.usuarioLogado.getEmail());
        usuarioCPF.setText(this.usuarioLogado.getCpf());
        usuarioNome.setText(this.usuarioLogado.getNome());

        CardLayout cl = (CardLayout) jPanel4.getLayout();
        cl.show(jPanel4, "card3");
        jPanel4.revalidate();
        jPanel4.repaint();

    }

    private void meusFilmesBtnActionPerformed(java.awt.event.ActionEvent evt) {
        CardLayout cl = (CardLayout) jPanel4.getLayout();
        cl.show(jPanel4, "card5");
        jPanel4.revalidate();
        jPanel4.repaint();
    }

    private void verCarrinhoBtnActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) tabelaCarrinho.getModel();
        int rowCount = model.getRowCount();
        totalPreco.setText(String.format("%.2f", (rowCount * 140.0)));

        CardLayout cl = (CardLayout) jPanel4.getLayout();
        cl.show(jPanel4, "card4");
        jPanel4.revalidate();
        jPanel4.repaint();
    }

    private void finalizarCompraBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarCompraBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelaCarrinho.getModel();
        DefaultTableModel fmodel = (DefaultTableModel) tabelaFilmes.getModel();
        double totalGasto = 0;

        if (usuarioLogado.getSaldo() >= Double.parseDouble(totalPreco.getText())) {

            int resposta = JOptionPane.showConfirmDialog(
                    this,
                    "Tem certeza que deseja continuar com essa operação? Será descontado do seu saldo R$ " + String.format("%.2f", model.getRowCount() * 140.),
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION
            );

            if (resposta == JOptionPane.YES_OPTION) {
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    String titulo = (String) model.getValueAt(i, 1);
                    String categoria = (String) model.getValueAt(i, 2);
                    String dataLancamento = (String) model.getValueAt(i, 3);
                    String diretor = (String) model.getValueAt(i, 4);
                    double preco = ((double) model.getValueAt(i, 5));

                    totalGasto += preco;
                    fmodel.addRow(new Object[]{titulo, categoria, dataLancamento, diretor, preco});
                    filmeController.adicionar(this.carrinho.get(i), filmesComprados);
                    filmeController.remover(this.carrinho.get(i).getTitulo(), carrinho);
                    model.removeRow(i);
                }
                JOptionPane.showMessageDialog(this, "Compra efetuada com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);

                UsuarioController.alteraInformacoes(this.usuarioLogado, usuarioLogado.getNome(), usuarioLogado.getCpf(), usuarioLogado.getEmail(), this.usuarioLogado.getSaldo() - totalGasto, genero1.getText());
                this.usuarioLogado.setSaldo(this.usuarioLogado.getSaldo() - totalGasto);
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Saldo insuficiente para completar a compra!", "ERROR", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_finalizarCompraBtnActionPerformed

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

//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new teste(usuarioLogado).setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscaFilmeBtn1;
    private javax.swing.JTextField buscaFilmeInput1;
    private javax.swing.JPanel capaPanel1;
    private javax.swing.JPanel card1;
    private javax.swing.JPanel card2;
    private javax.swing.JPanel card3;
    private javax.swing.JPanel card4;
    private javax.swing.JButton carrinhoBtn;
    private javax.swing.JButton confirmarBtn;
    private javax.swing.JTextField dataLancamento1;
    private javax.swing.JSpinner deletaId;
    private javax.swing.JTextField duracao1;
    private javax.swing.JButton finalizarCompraBtn;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JTextField genero1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton meusFilmesBtn;
    private javax.swing.JTextField nomeFilme1;
    private javax.swing.JButton perfilBtn;
    private javax.swing.JButton sairBtn;
    private javax.swing.JSpinner saldoInput;
    private javax.swing.JButton salvarBtn;
    private javax.swing.JTextArea sinopse1;
    private javax.swing.JTextField status;
    private javax.swing.JTable tabelaCarrinho;
    private javax.swing.JTable tabelaFilmes;
    private javax.swing.JTextField totalPreco;
    private javax.swing.JTextField username1;
    private javax.swing.JTextField usuarioCPF;
    private javax.swing.JTextField usuarioEmail;
    private javax.swing.JTextField usuarioNome;
    private javax.swing.JButton verCarrinhoBtn;
    private javax.swing.JButton voltarHomeBtn;
    private javax.swing.JButton voltarHomeBtn1;
    private javax.swing.JButton voltarHomeBtn2;
    // End of variables declaration//GEN-END:variables
}
