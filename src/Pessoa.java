public class Pessoa {
    
    private boolean fiqueEmCasa;
    private boolean viajeDepois;
    private String[] atividadesEmCasa;
    
    public Pessoa() {
    }
    
    public Pessoa(boolean viajeDepois, boolean fiqueEmCasa, String[] atividadesEmCasa) {
        this.fiqueEmCasa = fiqueEmCasa;
        this.viajeDepois = viajeDepois;
        this.atividadesEmCasa = atividadesEmCasa;
    }

    public void descansar() {
        System.out.println("\nDurante a pandemia você pode, ficar em casa com a família:");
        System.out.println("\t - " + this.fiqueEmCasa);
        
    }

    public void viajar() {
        System.out.println("\nDurante a pandemia você pode, viajar depois:");
        System.out.println("\t - " + this.viajeDepois);
        
    }

    public void atividades() {
        System.out.println("\nSugestões de atividades para fazer em casa, durante a pandemia: ");
        for (int i = 0; i < atividadesEmCasa.length; i++) {
            System.out.println("\t - " + this.atividadesEmCasa[i]);
        }
    }

    public void setFiqueEmCasa(boolean fiqueEmCasa) {
        this.fiqueEmCasa = fiqueEmCasa;
    }

    public boolean getFiqueEmCasa() {
        return this.fiqueEmCasa;
    }
    public void setViajeDepois(boolean viajeDepois) {
        this.viajeDepois = viajeDepois;
    }

    public boolean getViajeDepois() {
        return this.viajeDepois;
    }
    public void setAtividadesEmCasa(String[] atividadesEmCasa) {
        this.atividadesEmCasa = atividadesEmCasa;
    }

    public String[] getAtividadesEmCasa() {
        return this.atividadesEmCasa;
    }

    public static void main(String[] args) {
        String[] atividades = new String[]{"Fazer receitas culinárias", "Ler livors", "Jogar jogos em família"};
        Pessoa cvc = new Pessoa(true, true, atividades);
        
        
        cvc.descansar();
        cvc.viajar();
        cvc.atividades();
    }
}