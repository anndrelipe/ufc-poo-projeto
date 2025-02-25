package ufc_poo_projeto.app.GUI.UIpackage;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TabelaFrame extends Frame {
    private Panel listaPanel;
    private int rowCount = 0;
    private String coluna1;
    private String coluna2;
    private String coluna3;
    private String coluna4;
    private String coluna5;
    
    public TabelaFrame(String nomeJanela, String Coluna1, String Coluna2, String Coluna3, String Coluna4, String Coluna5) {
        super(nomeJanela);
        this.coluna1 = Coluna1;
        this.coluna2 = Coluna2;
        this.coluna3 = Coluna3;
        this.coluna4 = Coluna4;
        this.coluna5 = Coluna5;
        setSize(710, 500);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        
        // Painel onde será exibida a lista
        listaPanel = new Panel(new GridLayout(0, 5)); // 5 colunas
        add(listaPanel, BorderLayout.NORTH);
        
        cabecalho();
        
        // Encerrar a janela ao fechar
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
        
    private void cabecalho() {
        rowCount++; //adiciona para a linha 1
        listaPanel.setLayout(new GridLayout(rowCount, 5)); // 5 colunas
        Font boldFont = new Font("SansSerif", Font.BOLD, 12);
     
        Label coluna1label = new Label(this.coluna1, Label.CENTER);
        coluna1label.setFont(boldFont);
        Label coluna2label = new Label(this.coluna2, Label.CENTER);
        coluna2label.setFont(boldFont);
        Label coluna3label = new Label(this.coluna3, Label.CENTER);
        coluna3label.setFont(boldFont);
        Label coluna4label = new Label(this.coluna4, Label.CENTER);
        coluna4label.setFont(boldFont);
        Label coluna5label = new Label(this.coluna5, Label.CENTER);
        coluna5label.setFont(boldFont);
        
        listaPanel.add(coluna1label);
        listaPanel.add(coluna2label);
        listaPanel.add(coluna3label);
        listaPanel.add(coluna4label);
        listaPanel.add(coluna5label);
        
        listaPanel.revalidate();
        listaPanel.repaint();
    }
    
    // Método original para outros frames (checkbox não marcado por padrão)
    public Checkbox adicionarProduto(String nome, String categoria, String descricao, double preco) {
        return adicionarProduto(nome, categoria, descricao, preco, false);
    }
    
    // Método sobrecarregado para definir o estado padrão da checkbox
    public Checkbox adicionarProduto(String nome, String categoria, String descricao, double preco, boolean isChecked) {
        rowCount++;
        listaPanel.setLayout(new GridLayout(rowCount, 5)); 
        listaPanel.add(new Label(nome, Label.CENTER));
        listaPanel.add(new Label(categoria, Label.CENTER));
        listaPanel.add(new Label(descricao, Label.CENTER));
        listaPanel.add(new Label("R$" + preco, Label.CENTER));
        
        // Cria a checkbox com o estado definido por isChecked
        Checkbox checkbox = new Checkbox("", isChecked);
        listaPanel.add(checkbox);
        
        listaPanel.revalidate();
        listaPanel.repaint();
        
        return checkbox;
    }
    
    public void adicionarPessoa(String nome,String matricula,String curso){
       rowCount++;
       listaPanel.setLayout(new GridLayout(rowCount, 5)); 
        listaPanel.add(new Label(nome, Label.CENTER));
        listaPanel.add(new Label(matricula, Label.CENTER));
        listaPanel.add(new Label(curso, Label.CENTER));
        listaPanel.add(new Label("01A", Label.CENTER));
        Checkbox checkbox = new Checkbox("", false);
        listaPanel.add(checkbox);
    }
    
    
}
