public class Jogo{

    // Atributos 
    public String nome; 
    public String classificacao; 
    public String guerreiro;
    public String cacador;
    public String mago; // Até aqui OK

    public int nivel;
    public int vida;
    public int mana;
    public int forca;

    // Métodos 
    public String classificacao(){
        System.out.println("=== Personagens ===\n");
        System.out.println("Guerreiro: realiza o ataque frente à frente com submetralhadoras");
        System.out.println("Caçador: realiza os ataques à distância com sniper");
        System.out.println("Mago: realiza os ataques frente à frente com magia");
        
        if (classificacao == guerreiro){
            return guerreiro;
        } else if (classificacao == cacador){
            return cacador;
        } else {
            return mago;
        }
    }

    public void atacar(){
        if (classificacao == guerreiro){
            String info = nome+" ataca com sua subtralhadora";
            return info;
        } else if (classificacao == cacador){
            String info1 = nome+" ataca com sua sniper";
            return info1;
        } else {
            String info2 = nome+" ataca com sua magia";
            return info2;
        }
    }
}