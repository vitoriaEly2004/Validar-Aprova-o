import java.util.Scanner;

public class Main {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        int notaDigitada = scanner.nextInt();

        VerificaAprovacao verificaAprovacao = new VerificaAprovacao(notaDigitada) ;

        String resultadoFinal = verificaAprovacao.verificarNota(notaDigitada);
        System.out.println("Resultado: " + resultadoFinal);

        scanner.close();
    }
    }



