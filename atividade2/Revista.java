package atividade2;

public class Revista extends Material {
    private String autor;
    
    public Revista(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }
    
    @Override
    public void descricao() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Autor: " + autor);
    }
    
    public String getAutor() {
        return autor;
    }
}
