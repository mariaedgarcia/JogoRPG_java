public class Jogo{

    // Atributos 
    public String nome; 
    public String classificacao;

    public String guerreiro;
    public String cacador;
    public String mago; // Até aqui OK

    public int nivel = 1;
    public int vida = 100;
    public int forca;

    public int manaAtual = 100;
   
    // Métodos 
    public String classificacao(){ // OK
        System.out.println("=== Personagens ===\n");
        System.out.println("Guerreiro: realiza o ataque frente à frente com submetralhadoras");
        System.out.println("Caçador: realiza os ataques à distância com sniper");
        System.out.println("Mago: realiza os ataques frente à frente com magia");
        
        if (classificacao.equals(guerreiro)){
            return guerreiro;
        } else if (classificacao.equals(cacador)){
            return cacador;
        } else {
            return mago;
        }
    }

    public void atacar(){ // Ok, coloquei para aparecer no meu principal, apena isso
        if (classificacao.equals(guerreiro)){
            System.out.println(nome+" realiza um ataque com sua submetralhadora");
        } else if (classificacao.equals(cacador)){
            System.out.println(nome+" realiza um ataque com sua sniper");
        } else {
            System.out.println(nome+" ataca com sua magia");
        }
    }

    public void receberDano(int dano){ // Acho que OK
        if (vida > 100 || vida <= 0){
            vida = vida - dano;
            System.out.println("Erro!");
        } 
      } 
    
 
    public void usarHabilidadeEspecial(int mana){ // Aqui parece estar certo
        if (classificacao.equals("guerreiro")){
            System.out.println("Guerreiro realiz atiros na cabeca!");
        } else if (classificacao.equals("cacador")){
            System.out.println("Cacador faz um ataque com sua arma precia e silenciosa!");
        } else { // Para o mago
            System.out.println("Sua mana atual e de: "+manaAtual);
            if (manaAtual > mana){
                manaAtual = manaAtual - mana;  
                 System.out.println("Mago faz ataque com sua bola de magia! Mana restante: "+manaAtual);
            } else {
                System.out.println("Mana insuficiente!");
            }
        }
    }

    public void mostrarStatus(){ // OK
        System.out.println("=== Informacoes do jogador  ===");
    }

    public void subirNivel(){ // OK
         if (vida >= 80 && forca >= 90){
            for (vida = 1; vida <= 100; vida++){
                System.out.println("O seu nivel atual e: "+vida);
                for (forca = 1; forca <= 100; forca++){
                    System.out.println("A sua forca agora e: "+forca);
                }
                if (classificacao == mago){
                    for (mana = 1; mana <= 100; mana++){
                        System.out.println("A sua mana agora e:  "+mana);
                    }
                }
            }
        } else {
            System.out.println("O seu nivel permanece o mesmo: "+vida);
            System.out.println("A sua forca permanece a mesma: "+forca);
            if (classificacao.equals("mago")){
                System.out.println("A sua mana permanece a mesma: "+mana);
            }
        }
    }
}    