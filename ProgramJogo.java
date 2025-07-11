import java.util.Scanner;

public class ProgramJogo{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Jogo jogador1 = new Jogo();

        System.out.println("Informe o nome do seu personagem: ");
        jogador1.nome = scanner.nextLine();
        System.out.println("O nome do seu personagem e: "+jogador1.nome);

        System.out.println("\nHora de escolher seu personagem!");
        jogador1.classificacao();

        System.out.println("\nInforme qual o personagem escolhido: ");
        jogador1.classificacao = scanner.nextLine();
        System.out.println("O seu personagem e o "+jogador1.classificacao);



        System.out.println("\nDigite o seu dano no seu adversario: ");
        jogador1.vida = scanner.nextInt();

    }
}