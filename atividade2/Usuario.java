package atividade2;

public class Usuario extends Pessoa {
    private Integer matricula;

    public Usuario(String nome, String email, integer matricula){
        super(nome, email);
        this.matricula = matricula;
    }

    public Integer getMatricula(){
        return this.matricula;
    }

    public void setMatricula(Integer matricula){
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo(){
        System.out.println("nome: " = this.nome);
        System.out.println("email: " = this.email);
        System.out.println("matricula: " = this.matricula);
    }
    
}
