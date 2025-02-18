package ufc_poo_projeto.app.entities;

public class Filme {

    // Atributos
    private String titulo;
    private String anoLancamento;
    private String dataLancamento;
    private String duracao;
    private String genero;
    private String diretor;
    private String atores;
    private String sinopse;
    private String pais;
    private String capa;

    // Construtor
    public Filme(String titulo, String anoLancamento, String dataLancamento, String duracao, String genero, String diretor, String atores, String sinopse, String pais, String capa) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.dataLancamento = dataLancamento;
        this.duracao = duracao;
        this.genero = genero;
        this.diretor = diretor;
        this.atores = atores;
        this.sinopse = sinopse;
        this.pais = pais;
        this.capa = capa;
    }

    //Construtor que recebe um objeto DadosFilme
    public Filme(DadosFilme dadosFilme) {
        this.titulo = dadosFilme.titulo();
        this.anoLancamento = dadosFilme.anoLancamento();
        this.dataLancamento = dadosFilme.dataLancamento();
        this.duracao = dadosFilme.duracao();
        this.genero = dadosFilme.genero();
        this.diretor = dadosFilme.diretor();
        this.atores = dadosFilme.atores();
        this.sinopse = dadosFilme.sinopse();
        this.pais = dadosFilme.pais();
        this.capa = dadosFilme.capa();
    }

    // Métodos
    public String getTitulo() {
        return this.titulo;
    }
        
    public String getAnoLancamento() {
        return this.anoLancamento;
    }

    public String getDataLancamento() {
        return this.dataLancamento;
    }

    public String getDuracao() {
        return this.duracao;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getDiretor() {
        return this.diretor;
    }

    public String getAtores() {
        return this.atores;
    }

    public String getSinopse() {
        return this.sinopse;
    }

    public String getPais() {
        return this.pais;
    }

    public String getCapa() {
        return this.capa;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    @Override
    public String toString(){
        return "O filme " + this.titulo + " foi lançado em " + this.anoLancamento + " e tem duração de " + this.duracao + ".\n" +
                "Sinopse: " + this.sinopse + "\n\n" +
                "Informações adicionais \nGênero: " + this.genero + "\n" +
                "Criado por: " + this.diretor + "\n" +
                "Elenco: " + this.atores + "\n" +
                "País: " + this.pais + "\n" +
                "Capa: " + this.capa;
    }


}