public class Radar {
    private Integer limiteVelocidade;
    private String localizacao;

    public Radar(String localizacao, Integer limiteVelocidade) {
        this.localizacao = localizacao;
        this.limiteVelocidade = limiteVelocidade;
    }

    public Radar(Integer limiteVelocidade) {
        this.limiteVelocidade = limiteVelocidade;
    }

    public void emitirNotificacao(String placa, Integer velocidadeAvaliada){
        System.err.println("Limite de velocidade: "+ this.limiteVelocidade);
        System.err.println("Velocidade avaliada: "+ velocidadeAvaliada);
        System.err.println("Placa:"+ placa);
    }

    public void avaliarVelocidade(Carro c){
        if (c.getVelocidade() > this.limiteVelocidade){
            emitirNotificacao(c.getPlaca(), c.getVelocidade());         
        }
    }

}
