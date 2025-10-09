package atividade2;

public class Main {
    public static void main(String[] args) {
        // Criando pessoas
        Usuario usuario = new Usuario("João Silva", "joao@email.com", 12345);
        Funcionario funcionario = new Funcionario("Maria Santos", "maria@email.com", "Bibliotecária");
        
        // Criando materiais
        Livro livro = new Livro("Java Programming", 2023, "3ª Edição");
        Revista revista = new Revista("Ciência Today", 2024, "Carlos Oliveira");
        
        // Criando empréstimos
        Emprestimo emprestimo1 = new Emprestimo(usuario, livro, "01/10/2025", "15/10/2025");
        Emprestimo emprestimo2 = new Emprestimo(funcionario, revista, "02/10/2025", "16/10/2025");
        
        // Exibindo detalhes dos empréstimos
        emprestimo1.exibirDetalhes();
        System.out.println();
        emprestimo2.exibirDetalhes();
    }
}
