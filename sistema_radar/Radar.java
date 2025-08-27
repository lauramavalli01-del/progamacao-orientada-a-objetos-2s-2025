public class Radar {
    public Integer limiteVelocidade;
    public String modelo;
    public String localizacao;

    public void emitirNotificacao(String placa, Integer velocidadeAvaliada){
        System.err.println("Limite de velocidade: "+ this.limiteVelocidade);
        System.err.println("Velocidade avaliada: "+ velocidadeAvaliada);
        System.err.println("Placa:"+ placa);
    }

    public void avaliarVelocidade(Carro c){
        if (c.velocidade > this.limiteVelocidade){
            emitirNotificacao(c.placa, c.velocidade);         
        }
    }

}
