package atividade1;

public class computador {
    private Integer memoriaRAM;
    private Integer SSD;
    private Integer nucleos;
    private Double operacoesSegundo;

    public computador (Integer memoriaRAM, Integer SSD, Integer nucleos, Double operacoesSegundo) {
        this.memoriaRAM = memoriaRAM;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.operacoesSegundo = operacoesSegundo;
    }

    public Integer getMemoriaRAM() {
        return this.memoriaRAM;
    }

    public void setMemoriaRAM(Integer memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public Integer getSSD() {
        return this.SSD;
    }

    public void setSSD(Integer SSD) {
        this.SSD = SSD;
    }

    public Integer getNucleos() {
        return this.nucleos;
    }

    public void setNucleos(Integer nucleos) {
        this.nucleos = nucleos;
    }

    public Double getOperacoesSegundo() {
        return this.operacoesSegundo;
    }

    public void setOperacoesSegundo(Double operacoesSegundo) {
        this.operacoesSegundo = operacoesSegundo;
    }
}