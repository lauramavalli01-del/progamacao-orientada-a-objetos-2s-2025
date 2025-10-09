package atividade2;

public class Emprestimo {
    private Pessoa pessoa;
    private Material material;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo (Pessoa pessoa, Material material, String dataEmprestimo, String dataDevolucao){
        this.pessoa = pessoa;
        this.material = material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Pessoa getPessoa(){
        return this.pessoa;
    }

    public Material material(){
        return this.material;
    }

    public String dataEmprestimo(){
        return this.dataEmprestimo;
    }

    public String dataDevolucao(){
        return this.dataDevolucao;
    }

    public void exibirInfo(){
        System.out.println("data de emprestimo:" + this.dataEmprestimo);
        System.out.println("data de devolucao:" + this.dataDevolucao);
        System.out.println("pessoa vinculada:");
        this.pessoa.exibirInfo();
        System.out.println("material vinculado:");
        this.material.descricao();
    }
    
    
    
}
