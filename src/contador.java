import java.util.Scanner;
public class contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidoException e) {
            System.out.println(e.getMessage());
        }finally {
            terminal.close();
        }
    }

static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidoException {
    if (parametroUm <= parametroDois){
        throw new ParametrosInvalidoException("O segundo parâmetro deve ser menor que o segundo");

    }
    int contagem = parametroUm - parametroDois;
    for (int i = 1; i <= contagem; i++){
        System.out.println("Imprimindo o número:" + i);
    }
    }
}
class ParametrosInvalidoException extends Exception{
    public ParametrosInvalidoException(String message){
        super(message);
    }
}