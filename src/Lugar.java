public class Lugar {
    private String[] pontosTuristicos;
    private String[] comidas;
    private String[] hoteis;
    
    public Lugar() {
    }
    
    public Lugar(String[] pontosTuristicos, String[] comidas, String[] hoteis) {
        this.pontosTuristicos = pontosTuristicos;
        this.comidas = comidas;
        this.hoteis = hoteis;
    }
    public void visitar() {
        System.out.println("\n Os melhores pontos Turísticos da Bahia: ");
        for (int i = 0; i < pontosTuristicos.length; i++) {
            System.out.println("\t - " + this.pontosTuristicos[i]);
        }
    }

    public void comer() {
        System.out.println("\n As melhores comídas Típicas da Bahia: ");
        for (int i = 0; i < comidas.length; i++) {
            System.out.println("\t - " + this.comidas[i]);
        }
    }

    public void nomes() {
        System.out.println("\n Os melhores Hoteis da Bahia: ");
        for (int i = 0; i < hoteis.length; i++) {
            System.out.println("\t - " + this.hoteis[i]);
        }
    }

    public void setPontosTuristicos(String[] pontosTuristicos) {
        this.pontosTuristicos = pontosTuristicos;
    }

    public String[] getPontosTuristicos() {
        return this.pontosTuristicos;
    }
    public void setComidas(String[] comidas) {
        this.comidas = comidas;
    }

    public String[] getComidas() {
        return this.comidas;
    }
    public void setHoteis(String[] hoteis) {
        this.hoteis = hoteis;
    }

    public String[] getHoteis() {
        return this.hoteis;
    }
    
    public static void main(String[] args) {
        String[] pontosTuristicosBahia = new String[]{"Parque Nacional", "Elevador Lacerda", "Mercado Modelo"};
        String[] comidasTipicas = new String[]{"Tapioca", "Vatapá", "Acarajé"};
        String[] nomeDeHoteis = new String[]{"Fiesta Bahia", "Gran Hotel", "Porto Seguro Eco Bahia Hotel"};
        Lugar bahia = new Lugar(pontosTuristicosBahia, comidasTipicas, nomeDeHoteis);
        
        
        bahia.visitar();
        bahia.comer();
        bahia.nomes();
    }
}