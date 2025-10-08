package atividade1;

public class programa {
    private Integer memoriaRAMalocada;
    private Integer SSDOcupado;
    private Integer quantidadeOperacoes;

    public programa(Integer memoriaRAMalocada, Integer SSDOcupado, Integer quantidadeOperacoes) {
        this.memoriaRAMalocada = memoriaRAMalocada;
        this.SSDOcupado = SSDOcupado;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    public Integer getMemoriaRAMAlocada() {
        return this.memoriaRAMalocada;
    }

    public void setMemoriaRAMAlocada(Integer memoriaRAMAlocada) {
        this.memoriaRAMalocada = memoriaRAMalocada;
    }

    public Integer getSSDOcupado() {
        return this.SSDOcupado;
    }

    public void setSSDOcupado(Integer SSDOcupado) {
        this.SSDOcupado = SSDOcupado;
    }

    public Integer getQuantidadeOperacoes() {
        return this.quantidadeOperacoes;
    }

    public void setQuantidadeOperacoes(Integer quantidadeOperacoes) {
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

}