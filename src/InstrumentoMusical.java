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

    public static void main(String[] args) {
        String[] tablaturaViolao = new String[]{"Los Hermanos-Ana Júlia", "Engenheiros do Hawaii-Dom Quixote", "Engenheiros do Hawaii-Terra de Gigantes"};
        String[] tablaturaViolino = new String[]{"Niccoló Paganini-Caprice24", "Niccoló Paganini-Duetto Amoroso", "Niccoló Paganini-Concerto n1"};
        String[] tablaturaVioloncelo = new String[]{"Apocalyptica-Battery", "Apocalyptica-Path", "Apocalyptica-I Don't Care"};
        InstrumentoMusical Fatec = new InstrumentoMusical(tablaturaViolao, tablaturaViolino, tablaturaVioloncelo);
        
        System.out.println(Fatec.violao);
        System.out.println(Fatec.violino);
        System.out.println(Fatec.violoncelo);
    }
}