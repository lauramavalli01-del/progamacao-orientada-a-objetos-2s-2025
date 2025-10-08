package atividade1;

public class main {
    public static void main(String[] args) {
        computador pc = new computador(4096, 256, 4, 15.0);
        sisOperacional so = new sisOperacional(pc);

        programa p1 = new programa(2048, 512, 5000);
        programa p2 = new programa(8192, 128, 5000);
        programa p3 = new programa(2048, 128, 5000);

        so.executarPrograma(p1);
        so.executarPrograma(p2);
        so.executarPrograma(p3);

    }
}