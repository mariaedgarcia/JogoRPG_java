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
    public int mana;
   
    // Métodos 
    public String classificacao(){ // OK
        System.out.println("=== Personagens ===\n");
        System.out.println("Guerreiro: realiza o ataque frente a frente com submetralhadoras");
        System.out.println("Cacador: realiza os ataques a distancia com sniper");
        System.out.println("Mago: realiza os ataques frente a frente com magia");
        
        if (classificacao != null && classificacao.equals("guerreiro")){
            return guerreiro;
        } else if (classificacao != null && classificacao.equals("cacador")){
            return cacador;
        } if (classificacao != null && classificacao.equals("mago")) {
            return mago;
        }
    }

    public void atacar(){ // Ok, coloquei para aparecer no meu principal, apena isso
        if (classificacao.equals("guerreiro")){
            System.out.println(nome+" realiza um ataque com sua submetralhadora");
        } else if (classificacao.equals("cacador")){
            System.out.println(nome+" realiza um ataque com sua sniper");
        } if (classificacao.equals("mago")){
            System.out.println(nome+" ataca com sua magia");
        }
    }

    public void receberDano(int dano){ // Acho que OK
        if (vida <= 0 || vida > 100){ // Paramos aqui
            System.out.println("Erro!");
        } else {
           vida = vida - dano;
        }
      } 
    
 
    public void usarHabilidadeEspecial(int mana){ // Aqui parece estar certo
        if (classificacao.equals("guerreiro")){
            System.out.println("Guerreiro realiza tiros na cabeca!");
        } else if (classificacao.equals("cacador")){
            System.out.println("Cacador faz um ataque com sua arma precia e silenciosa!");
        } if (classificacao.equals("mago")){ // Para o mago
            System.out.println("Sua quantidade de mana atual e "+manaAtual);
            if (manaAtual > mana){
                manaAtual = manaAtual - mana;  
                 System.out.println("Mago faz ataque com sua bola de magia!");
            } else {
                System.out.println("Mana insuficiente!");
            }
        }
    }

    public void mostrarStatus(){ // OK
        System.out.println("\n=== Informacoes do jogador  ===");
    }

    public void subirNivel(){ // OK
         /*if (vida >= 80 && forca >= 90){
            for (vida = 1; vida <= 100; vida++){
                System.out.println("O seu nivel atual e: "+vida);
                for (forca = 1; forca <= 100; forca++){
                    System.out.println("A sua forca agora e: "+forca);
                }
                if (classificacao == mago){
                    if (mana >= 1 && mana < 100){
                        manaAtual = manaAtual - mana;
                        System.out.println("A sua mana agora e:  "+manaAtual);
                    }
                }
            }
        } else {
            System.out.println("O seu nivel permanece o mesmo: "+nivel);
            System.out.println("A sua forca permanece a mesma: "+forca);
            if (classificacao.equals("mago")){
                System.out.println("A sua mana permanece a mesma: "+manaAtual);
            }
        }*/
       nivel = nivel + 1;
    }
}    