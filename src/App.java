import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Testando saídas de dados

        *float nota=8.5f;
        *System.out.println("Nota igual a: " + nota);
        *System.out.printf("Nota igual a: %.2f", nota);
        *System.out.format("Nota do " + nome +" é igual a %.2f", nota);
        */

        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nomeString=teclado.nextLine();
        System.out.println("Digite a nota do aluno:");
        double nota=teclado.nextDouble();

        System.out.println("A nota do aluno "+ nomeString +" é "+ nota);
        //System.out.printf("A nota do %s é %.2f", nomeString, nota);
        teclado.close();
    }
}   