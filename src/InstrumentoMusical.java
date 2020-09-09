public class InstrumentoMusical {
    private String[] tablaturasDeViolao;
    private String[] tablaturasDeViolino;
    private String[] tablaturasDeVioloncelo;
    
    public InstrumentoMusical() {
    }
    
    public InstrumentoMusical(String[] violao, String[] violino, String[] violoncelo) {
        this.tablaturasDeViolao = violao;
        this.tablaturasDeViolino = violino;
        this.tablaturasDeVioloncelo = violoncelo;
    }

    public void tocarViolao() {
        System.out.println("\n Músicas para aprender a tocarno violão: ");
        for (int i = 0; i < tablaturasDeViolao.length; i++) {
            System.out.println("\t - " + this.tablaturasDeViolao[i]);
        }
    }

    public void tocarViolino() {
        System.out.println("\n Músicas para aprender a tocar no violino: ");
        for (int i = 0; i < tablaturasDeViolino.length; i++) {
            System.out.println("\t - " + this.tablaturasDeViolino[i]);
        }
    }

    public void tocarVioloncelo() {
        System.out.println("\n Músicas para aprender a tocar no violoncelo: ");
        for (int i = 0; i < tablaturasDeVioloncelo.length; i++) {
            System.out.println("\t - " + this.tablaturasDeVioloncelo[i]);
        }
    }

    public void setViolao(String[] violao) {
        this.tablaturasDeViolao = violao;
    }

    public String[] getViolao() {
        return this.tablaturasDeViolao;
    }
    public void setLer(String[] violino) {
        this.tablaturasDeViolino = violino;
    }

    public String[] getViolino() {
        return this.tablaturasDeViolino;
    }
    public void setVioloncelo(String[] violoncelo) {
        this.tablaturasDeVioloncelo = violoncelo;
    }

    public String[] getVioloncelo() {
        return this.tablaturasDeVioloncelo;
    }

    public static void main(String[] args) {
        String[] tablaturaViolao = new String[]{"Los Hermanos-Ana Júlia", "Engenheiros do Hawaii-Dom Quixote", "Engenheiros do Hawaii-Terra de Gigantes"};
        String[] tablaturaViolino = new String[]{"Niccoló Paganini-Caprice24", "Niccoló Paganini-Duetto Amoroso", "Niccoló Paganini-Concerto n1"};
        String[] tablaturaVioloncelo = new String[]{"Apocalyptica-Battery", "Apocalyptica-Path", "Apocalyptica-I Don't Care"};
        InstrumentoMusical iMusical = new InstrumentoMusical(tablaturaViolao, tablaturaViolino, tablaturaVioloncelo);
        
        iMusical.tocarViolao();
        iMusical.tocarViolino();
        iMusical.tocarVioloncelo();
    }
}