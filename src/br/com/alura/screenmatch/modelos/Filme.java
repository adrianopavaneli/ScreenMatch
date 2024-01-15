public class Filme {
   private String nome;
   private int anoDeLancamento;
   private boolean incluidoNoPlano;
   private double somaDasAvaliacoes;
   private int totalDeAvaliacoes;
   private int duracaoEmMinutos;

 

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
