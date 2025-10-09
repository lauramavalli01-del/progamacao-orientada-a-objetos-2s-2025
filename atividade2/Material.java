package atividade2;

public abstract class Material {
    protected String titulo;
    protected int anoPublicacao;
    
    public Material(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }
    
    public abstract void descricao();
    
    // Getters
    public String getTitulo() {
        return titulo;
    }
    
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
}
