public class Calcados {

    private String[] tenis;
    private String[] social;
    private String[] salto;
    
    public Calcados() {
    }
    
    public Calcados(String[] tenis, String[] social, String[] salto) {
        this.tenis = tenis;
        this.social = social;
        this.salto = salto;
    }
    
    public void tiposTenis() {
        System.out.println("\n Alguns tipos de tênis são: ");
        for (int i = 0; i < tenis.length; i++) {
            System.out.println("\t - " + this.tenis[i]);
        }
    }

    public void tiposSapatoSocial() {
        System.out.println("\n Alguns sapatos sociais são: ");
        for (int i = 0; i < social.length; i++) {
            System.out.println("\t - " + this.social[i]);
        }
    }

    public void tiposSalto() {
        System.out.println("\n Alguns tipos de saltos são: ");
        for (int i = 0; i < salto.length; i++) {
            System.out.println("\t - " + this.salto[i]);
        }
    }

    public void setTenis(String[] tenis) {
        this.tenis = tenis;
    }

    public String[] getTenis() {
        return this.tenis;
    }
    public void setSocial(String[] social) {
        this.social = social;
    }

    public String[] getSocial() {
        return this.social;
    }
    public void setSalto(String[] salto) {
        this.salto = salto;
    }

    public String[] getSalto() {
        return this.salto;
    }

    public static void main(String[] args) {
        String[] tiposDeTenis = new String[]{"Corrida", "Minimalista", "Slip-On", "Old Skool"};
        String[] tiposDeSapatoSocial = new String[]{"Oxford", "Derby", "Brogue"};
        String[] tiposDeSalto = new String[]{"Anabela", "Meia Pata", "Bloco"};
        Calcados cal = new Calcados(tiposDeTenis, tiposDeSapatoSocial, tiposDeSalto);
        
        cal.tiposTenis();
        cal.tiposSapatoSocial();
        cal.tiposSalto();
    }
}