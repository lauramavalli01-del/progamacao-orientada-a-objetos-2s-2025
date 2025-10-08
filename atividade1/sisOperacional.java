package atividade1;

public class sisOperacional {
    private computador computador;

    public sisOperacional(computador computador) {
        this.computador = computador;
    }

    public computador getcomputador() {
        return this.computador;
    }

    public void setcomputador(computador computador) {
        this.computador = computador;
    }

    public Boolean executarPrograma(programa p){
        if(p.getSSDOcupado() > this.computador.getSSD()){
            System.out.println("Erro na INSTALAÇÃO do programa.");
            return false;
        }
        if(p.getMemoriaRAMAlocada() > this.computador.getMemoriaRAM()){
            System.out.println("Erro na EXECUÇÃO do programa.");
            return false;
        }

        double tempoExecucao = p.getQuantidadeOperacoes() / (this.computador.getOperacoesSegundo()*this.computador.getNucleos());
        System.out.println("Programa executado com sucesso: " + tempoExecucao + "s");
        return true;
    }
}