public class VerificaAprovacao {
    private int nota;
    private String resultado;

    public VerificaAprovacao(int nota){
        this.nota = nota;
    }

    public String verificarNota(int nota){
        if(nota >=7){
            resultado = "aprovado";
        } else {
            resultado = "reprovado";
        }
        return resultado;
    }
}
