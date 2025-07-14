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
        jogador1.classificacao = scanner.nextLine(); // Até aqui tudo certo oq tinha feito

        jogador1.vida = 100;
        jogador1.nivel = 1;
        System.out.println("\nA vida do seu personagem comecou em: "+jogador1.vida+" e seu nivel e o: "+jogador1.nivel);

        jogador1.atacar();
        System.out.println("Informe o dano dado: ");
        int dano = scanner.nextInt();
        
        if (dano >= 1 && dano < 100){ 
            jogador1.receberDano(dano);  
             System.out.println("A vida do seu adversario e de: "+jogador1.vida);
        }

        System.out.print("Informe o valor da mana para aplicar a habilidade: ");
        int mana = scanner.nextInt();
        jogador1.usarHabilidadeEspecial(mana); 
        System.out.println("A quantidade de mana restante é: "+jogador1.manaAtual);

        jogador1.mostrarStatus(); 
        System.out.println("Nome: "+jogador1.nome+" | Classe: "+jogador1.classificacao+" | Nivel: "+jogador1.nivel+" | Vida: "+jogador1.vida+" | Forca: "+jogador1.forca);

        jogador1.subirNivel(); 

        System.out.println("\nDigite o seu dano no seu adversario: ");
        jogador1.vida = scanner.nextInt(); 

        scanner.close();
    }

    }
