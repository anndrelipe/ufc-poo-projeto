package ufc_poo_projeto.app.GUI.UIpackage;
import ufc_poo_projeto.app.controllers.UsuarioController;
import ufc_poo_projeto.app.entities.DadosUsuario;
import ufc_poo_projeto.app.entities.Usuario;
import ufc_poo_projeto.app.exceptions.ValidacaoUsuarioException;
import ufc_poo_projeto.app.services.Autenticador;

import java.awt.CardLayout;
import java.io.FileNotFoundException;
import javax.swing.*;

//PULE PARA LINHA 461 PARA FAZER AS MODIFICACOES DOS BOTOES MEU CARO.
public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
        setTitle("Javazon");
        CardLayout cl = (CardLayout) getContentPane().getLayout();
        cl.show(getContentPane(), "card2"); // "card2" corresponde ao LoginPanel
        setLocationRelativeTo(null); // Centraliza a janela
    }

    // Declaração das variáveis de instância (ignore a menos que queira adicionar algo a tela)
    private javax.swing.JButton voltarButton;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel MainLoginPanel;
    private javax.swing.JLabel ImagemLogin;
    private javax.swing.JTextField LoginField;
    private javax.swing.JPasswordField SenhaField;
    private javax.swing.JLabel LoginText1;
    private javax.swing.JLabel SenhaText1;
    private javax.swing.JLabel TitleLogin1;
    private javax.swing.JButton EntrarButton;
    private javax.swing.JButton CadastrarButton;
    private javax.swing.JButton EsqueciSenhaButton;
    private javax.swing.JPanel CadastrarPanel;
    private javax.swing.JPanel AdCadastrarPanel;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel titleCadastrarPanel;
    private javax.swing.JTextField emailCadastrarField;
    private javax.swing.JTextField senhaCadastrarField;
    private javax.swing.JTextField repetirSenhaField;
    private javax.swing.JTextField cadastroPalavraChaveField;
    private javax.swing.JLabel newLoginText;
    private javax.swing.JLabel newSenhaText;
    private javax.swing.JLabel repetirSenhaText;
    private javax.swing.JLabel addPalavraChaveText;
    private javax.swing.JLabel newNameText;
    private javax.swing.JTextField newNameField;
    private javax.swing.JCheckBox plusEighteenCheck;
    private javax.swing.JCheckBox userTermCheck;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel genderText;
    private javax.swing.JButton enterNewCadastroButton;
    
    
    //Inicializacao dos componentes (ignora a menos que voce queira adicionar algo a tela)
    @SuppressWarnings("unchecked")
    private void initComponents() {
        LoginPanel = new javax.swing.JPanel();
        MainLoginPanel = new javax.swing.JPanel();
        ImagemLogin = new javax.swing.JLabel();
        LoginField = new javax.swing.JTextField();
        SenhaField = new javax.swing.JPasswordField();
        LoginText1 = new javax.swing.JLabel();
        SenhaText1 = new javax.swing.JLabel();
        TitleLogin1 = new javax.swing.JLabel();
        EntrarButton = new javax.swing.JButton();
        CadastrarButton = new javax.swing.JButton();
        EsqueciSenhaButton = new javax.swing.JButton();
        CadastrarPanel = new javax.swing.JPanel();
        AdCadastrarPanel = new javax.swing.JPanel();
        AdCadastrarPanel.setBackground(new java.awt.Color(44, 44, 44));
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        titleCadastrarPanel = new javax.swing.JLabel();
        emailCadastrarField = new javax.swing.JTextField();
        senhaCadastrarField = new javax.swing.JTextField();
        repetirSenhaField = new javax.swing.JTextField();
        cadastroPalavraChaveField = new javax.swing.JTextField();
        newLoginText = new javax.swing.JLabel();
        newSenhaText = new javax.swing.JLabel();
        repetirSenhaText = new javax.swing.JLabel();
        addPalavraChaveText = new javax.swing.JLabel();
        newNameText = new javax.swing.JLabel();
        newNameField = new javax.swing.JTextField();
        plusEighteenCheck = new javax.swing.JCheckBox();
        userTermCheck = new javax.swing.JCheckBox();
        genderComboBox = new javax.swing.JComboBox<>();
        genderText = new javax.swing.JLabel();
        enterNewCadastroButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 720));
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setPreferredSize(new java.awt.Dimension(1024, 720));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        // Configuração do LoginPanel (APARENCIA)
        LoginPanel.setBackground(new java.awt.Color(51, 102, 255));
        LoginPanel.setMaximumSize(new java.awt.Dimension(1024, 720));
        LoginPanel.setMinimumSize(new java.awt.Dimension(1024, 720));

        MainLoginPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainLoginPanel.setMaximumSize(new java.awt.Dimension(400, 720));
        MainLoginPanel.setMinimumSize(new java.awt.Dimension(400, 720));
        MainLoginPanel.setPreferredSize(new java.awt.Dimension(400, 720));

        //ImagemLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/logoprinc.png/")));
        ImagemLogin.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        LoginField.setBackground(new java.awt.Color(204, 204, 204));
        LoginField.setForeground(new java.awt.Color(0, 0, 0));

        SenhaField.setBackground(new java.awt.Color(204, 204, 204));
        SenhaField.setForeground(new java.awt.Color(0, 0, 0));

        LoginText1.setBackground(new java.awt.Color(0, 0, 0));
        LoginText1.setForeground(new java.awt.Color(0, 0, 0));
        LoginText1.setText("Login:");

        SenhaText1.setForeground(new java.awt.Color(0, 0, 0));
        SenhaText1.setText("Senha:");

        TitleLogin1.setFont(new java.awt.Font("Broadway", 0, 48));
        TitleLogin1.setForeground(new java.awt.Color(66, 66, 66));
        TitleLogin1.setText("Javazon");

        EntrarButton.setBackground(new java.awt.Color(204, 204, 204));
        EntrarButton.setForeground(new java.awt.Color(0, 0, 0));
        EntrarButton.setText("Entrar");
        EntrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarButtonActionPerformed(evt);
            }
        });

        CadastrarButton.setBackground(new java.awt.Color(204, 204, 204));
        CadastrarButton.setForeground(new java.awt.Color(0, 0, 0));
        CadastrarButton.setText("Cadastrar-se");
        CadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarButtonActionPerformed(evt);
            }
        });

        EsqueciSenhaButton.setBackground(new java.awt.Color(204, 204, 204));
        EsqueciSenhaButton.setForeground(new java.awt.Color(0, 0, 0));
        EsqueciSenhaButton.setText("Esqueci minha senha");
        EsqueciSenhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsqueciSenhaButtonActionPerformed(evt);
            }
        });
        //Layout
        javax.swing.GroupLayout MainLoginPanelLayout = new javax.swing.GroupLayout(MainLoginPanel);
        MainLoginPanel.setLayout(MainLoginPanelLayout);
        MainLoginPanelLayout.setHorizontalGroup(
            MainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLoginPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(ImagemLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainLoginPanelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(MainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainLoginPanelLayout.createSequentialGroup()
                        .addGroup(MainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoginText1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SenhaText1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoginField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TitleLogin1)
                            .addComponent(SenhaField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainLoginPanelLayout.createSequentialGroup()
                        .addComponent(EntrarButton)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainLoginPanelLayout.createSequentialGroup()
                        .addComponent(CadastrarButton)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainLoginPanelLayout.createSequentialGroup()
                        .addComponent(EsqueciSenhaButton)
                        .addGap(123, 123, 123))))
        );
        MainLoginPanelLayout.setVerticalGroup(
            MainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLoginPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(ImagemLogin)
                .addGap(28, 28, 28)
                .addComponent(TitleLogin1)
                .addGap(46, 46, 46)
                .addGroup(MainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginText1))
                .addGap(18, 18, 18)
                .addGroup(MainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SenhaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SenhaText1))
                .addGap(18, 18, 18)
                .addComponent(EntrarButton)
                .addGap(75, 75, 75)
                .addComponent(CadastrarButton)
                .addGap(18, 18, 18)
                .addComponent(EsqueciSenhaButton)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addComponent(MainLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(311, 311, 311))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainLoginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(LoginPanel, "card2");

        // Configuração do CadastrarPanel (aparencia)
        CadastrarPanel.setBackground(new java.awt.Color(51, 102, 255));

        jLabel12.setFont(new java.awt.Font("Broadway", 0, 36));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Javazon");

        //jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoprincSmall.png")));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 14));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Crie sua conta e começe a comprar ");

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 14));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("seus produtos e filmes só aqui na");

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 14));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Javazon Local Store");
        
        

        javax.swing.GroupLayout AdCadastrarPanelLayout = new javax.swing.GroupLayout(AdCadastrarPanel);
        AdCadastrarPanel.setLayout(AdCadastrarPanelLayout);
        AdCadastrarPanelLayout.setHorizontalGroup(
            AdCadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdCadastrarPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdCadastrarPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(AdCadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdCadastrarPanelLayout.createSequentialGroup()
                        .addGroup(AdCadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdCadastrarPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(53, 53, 53))))
        );
        AdCadastrarPanelLayout.setVerticalGroup(
            AdCadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdCadastrarPanelLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(52, 52, 52)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titleCadastrarPanel.setBackground(new java.awt.Color(255, 255, 255));
        titleCadastrarPanel.setFont(new java.awt.Font("Broadway", 0, 48));
        titleCadastrarPanel.setForeground(new java.awt.Color(255, 255, 255));
        titleCadastrarPanel.setText("Cadastrar-se");

        emailCadastrarField.setBackground(new java.awt.Color(255, 255, 255));
        emailCadastrarField.setForeground(new java.awt.Color(0, 0, 0));
        emailCadastrarField.setToolTipText("Difere Maiuscula");

        senhaCadastrarField.setBackground(new java.awt.Color(255, 255, 255));
        senhaCadastrarField.setForeground(new java.awt.Color(0, 0, 0));
        senhaCadastrarField.setToolTipText("Difere Maiuscula");

        repetirSenhaField.setBackground(new java.awt.Color(255, 255, 255));
        repetirSenhaField.setForeground(new java.awt.Color(0, 0, 0));
        repetirSenhaField.setToolTipText("Difere Maiuscula");

        cadastroPalavraChaveField.setBackground(new java.awt.Color(255, 255, 255));
        cadastroPalavraChaveField.setForeground(new java.awt.Color(0, 0, 0));

        newLoginText.setFont(new java.awt.Font("Segoe UI", 1, 12));
        newLoginText.setText("Email:");

        newSenhaText.setFont(new java.awt.Font("Segoe UI", 1, 12));
        newSenhaText.setText("Senha:");

        repetirSenhaText.setFont(new java.awt.Font("Segoe UI", 1, 12));
        repetirSenhaText.setText("Confirme sua Senha:");

        addPalavraChaveText.setFont(new java.awt.Font("Britannic Bold", 0, 14));
        addPalavraChaveText.setText("Adicione palavras chaves para lembrar sua senha:");

        newNameText.setFont(new java.awt.Font("Segoe UI", 1, 12));
        newNameText.setText("Nome:");

        newNameField.setBackground(new java.awt.Color(255, 255, 255));
        newNameField.setForeground(new java.awt.Color(0, 0, 0));

        plusEighteenCheck.setText("Sou maior de 18 anos");

        userTermCheck.setText("Concordo com os termos de usuário");

        genderComboBox.setBackground(new java.awt.Color(255, 255, 255));
        genderComboBox.setForeground(new java.awt.Color(0, 0, 0));
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outro" }));

        genderText.setText("Gênero:");
        
        enterNewCadastroButton.setText("Cadastrar");
        enterNewCadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    enterNewCadastroButtonActionPerformed(evt);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        
        voltarButton = new javax.swing.JButton();
        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            voltarButtonActionPerformed(evt);
        }
        });

        //Layout cadastrarPanel:
        javax.swing.GroupLayout CadastrarPanelLayout = new javax.swing.GroupLayout(CadastrarPanel);
CadastrarPanel.setLayout(CadastrarPanelLayout);
CadastrarPanelLayout.setHorizontalGroup(
    CadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(CadastrarPanelLayout.createSequentialGroup()
        .addComponent(AdCadastrarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
        .addGroup(CadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(voltarButton)
                .addGap(18, 18, 18))
            .addGroup(CadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastrarPanelLayout.createSequentialGroup()
                    .addGroup(CadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(CadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CadastrarPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(titleCadastrarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CadastrarPanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(newNameText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CadastrarPanelLayout.createSequentialGroup()
                                .addComponent(genderText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(203, 203, 203))
                            .addGroup(CadastrarPanelLayout.createSequentialGroup()
                                .addGroup(CadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(plusEighteenCheck)
                                    .addComponent(userTermCheck))
                                .addGap(106, 106, 106))
                            .addGroup(CadastrarPanelLayout.createSequentialGroup()
                                .addGroup(CadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cadastroPalavraChaveField, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addPalavraChaveText))
                                .addGap(39, 39, 39)))
                        .addGroup(CadastrarPanelLayout.createSequentialGroup()
                            .addGroup(CadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(CadastrarPanelLayout.createSequentialGroup()
                                    .addComponent(newLoginText)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(emailCadastrarField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(CadastrarPanelLayout.createSequentialGroup()
                                    .addGroup(CadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(repetirSenhaText)
                                        .addComponent(newSenhaText))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(CadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(senhaCadastrarField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(repetirSenhaField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(27, 27, 27)))
                    .addGap(164, 164, 164))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastrarPanelLayout.createSequentialGroup()
                    .addComponent(enterNewCadastroButton)
                    .addGap(318, 318, 318)))))
);

CadastrarPanelLayout.setVerticalGroup(
    CadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(AdCadastrarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    .addGroup(CadastrarPanelLayout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addComponent(voltarButton)
        .addGap(86, 86, 86)
        .addComponent(titleCadastrarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(54, 54, 54)
        .addGroup(CadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(newNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(newNameText))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(CadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(genderText))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(CadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(emailCadastrarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(newLoginText))
        .addGap(13, 13, 13)
        .addGroup(CadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(senhaCadastrarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(newSenhaText))
        .addGap(12, 12, 12)
        .addGroup(CadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(repetirSenhaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(repetirSenhaText))
        .addGap(24, 24, 24)
        .addComponent(addPalavraChaveText)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(cadastroPalavraChaveField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(plusEighteenCheck)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(userTermCheck)
        .addGap(35, 35, 35)
        .addComponent(enterNewCadastroButton)
        .addContainerGap(115, Short.MAX_VALUE))
);

        getContentPane().add(CadastrarPanel, "card3");

        pack();
    }

     //Tela de Login
     private void EntrarButtonActionPerformed(java.awt.event.ActionEvent evt) {
         String login = LoginField.getText();
         String senha = new String(SenhaField.getPassword());

         try {
             if (Autenticador.validaUsuario(login, senha)) {

                 JOptionPane.showMessageDialog(this, "Este carregamento pode demorar alguns instantes...", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                 DadosUsuario usuarioValidado = UsuarioController.buscarUsuarioPorNome(login);

                 TelaPrincipal telaprincipal = new TelaPrincipal(usuarioValidado);
                 JOptionPane.showMessageDialog(this, "Bem-vindo(a) " + login, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                 telaprincipal.setVisible(true);
                 this.setVisible(false);
             }
         } catch (ValidacaoUsuarioException e) {
             JOptionPane.showMessageDialog(this, "Credenciais inválidas!", "Erro", JOptionPane.ERROR_MESSAGE);
             throw new ValidacaoUsuarioException(e.getMessage());
         }
     }

    private void CadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        CardLayout cl = (CardLayout) getContentPane().getLayout();
        cl.show(getContentPane(), "card3");
    }

    private void EsqueciSenhaButtonActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Entre em contato com nosso suporte técnico: ajuda.javazon@gmail.com", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }

    //Tela de Cadastro
    private void enterNewCadastroButtonActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException {

        String novoNome = newNameField.getText();
        String novoEmail = emailCadastrarField.getText();
        String novaSenha = senhaCadastrarField.getText();
        String repetirNovaSenha = repetirSenhaField.getText();
        String selectedGender = (String) genderComboBox.getSelectedItem();

        if (!plusEighteenCheck.isSelected() || !userTermCheck.isSelected()) {
            JOptionPane.showMessageDialog(this, "É necessário ser maior de 18 anos e concordar com os termos de uso!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!novaSenha.equals(repetirNovaSenha)) {
            JOptionPane.showMessageDialog(this, "As senhas não coincidem!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String cpf = JOptionPane.showInputDialog("Digite seu CPF:");

        if (cpf == null || cpf.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "CPF é um parâmetro obrigatório!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Usuario novoUsuario = new Usuario(novoNome, cpf, novoEmail, novaSenha, selectedGender);
        JOptionPane.showMessageDialog(this, "Cadastro efetuado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        newNameField.setText("");
        emailCadastrarField.setText("");
        senhaCadastrarField.setText("");
        repetirSenhaField.setText("");
        genderComboBox.setSelectedIndex(0);

        plusEighteenCheck.setSelected(false);
        userTermCheck.setSelected(false);

        CardLayout cl = (CardLayout) getContentPane().getLayout();
        cl.show(getContentPane(), "card2");
    }

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        CardLayout cl = (CardLayout) getContentPane().getLayout();
        cl.show(getContentPane(), "card2");
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaInicial tela = new TelaInicial();
                tela.setVisible(true);
            }
        });
    }
}