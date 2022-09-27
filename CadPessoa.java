import java.util.Scanner;

public class CadPessoa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Qual é sua altura? ");
        double PessoaAltura = scan.nextDouble();
        pessoa.setAltura(PessoaAltura);

        System.out.println("Qual é seu peso? ");
        int PessoaPeso = scan.nextInt();
        pessoa.setPeso(PessoaPeso);

        System.out.println("Qual é sua cor? ");
        String PessoaCor = scan.next();
        pessoa.setCor(PessoaCor);

        System.out.println("Qual é seu sexo? ");
        String PessoaSexo = scan.next();
        pessoa.setSexo(PessoaSexo);

        System.out.println("Sua altura é: " + pessoa.getAltura());
        System.out.println("Seu peso é: " + pessoa.getPeso());
        System.out.println("Sua cor é: " + pessoa.getCor());
        System.out.println("Seu sexo é: " + pessoa.getSexo());
        System.out.println(pessoa.imc());

    }
}
