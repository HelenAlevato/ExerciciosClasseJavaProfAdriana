public class InstrumentoMusical {
    private String[] violao;
    private String[] violino;
    private String[] violoncelo;
    
    public InstrumentoMusical() {
    }
    
    public InstrumentoMusical(String[] violao, String[] violino, String[] violoncelo) {
        this.violao = violao;
        this.violino = violino;
        this.violoncelo = violoncelo;
    }

    public void tocarViolao() {
        System.out.println("\n Músicas para aprender a tocarno violão: ");
        for (int i = 0; i < violao.length; i++) {
            System.out.println("\t - " + this.violao[i]);
        }
    }

    public void tocarViolino() {
        System.out.println("\n Músicas para aprender a tocar no violino: ");
        for (int i = 0; i < violino.length; i++) {
            System.out.println("\t - " + this.violino[i]);
        }
    }

    public void tocarVioloncelo() {
        System.out.println("\n Músicas para aprender a tocar no violoncelo: ");
        for (int i = 0; i < violoncelo.length; i++) {
            System.out.println("\t - " + this.violoncelo[i]);
        }
    }

    public void setViolao(String[] violao) {
        this.violao = violao;
    }

    public String[] getViolao() {
        return this.violao;
    }
    public void setLer(String[] violino) {
        this.violino = violino;
    }

    public String[] getViolino() {
        return this.violino;
    }
    public void setVioloncelo(String[] violoncelo) {
        this.violoncelo = violoncelo;
    }

    public String[] getVioloncelo() {
        return this.violoncelo;
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