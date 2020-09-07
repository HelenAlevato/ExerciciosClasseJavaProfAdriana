public class Profissional {

    private String[] saude;
    private String[] seguranca;
    private String[] educacao;

    public Profissional() {
    }

    public Profissional(String[] saude, String[] seguranca, String[] educacao) {
        this.saude = saude;
        this.seguranca = seguranca;
        this.educacao = educacao;
    }

    public static void main(String[] args) {
        String[] areaDaSaude = new String[] { "Médico", "Enfermeiro", "Psicologia" };
        String[] areaDaSeguranca = new String[] { "Vigilante", "Guarda", "Policial" };
        String[] areaDaEducacao = new String[] { "Professor", "Educador" };
        Profissional Fatec = new Profissional(areaDaSaude, areaDaSeguranca, areaDaEducacao);

        System.out.println(Fatec.saude);
        System.out.println(Fatec.seguranca);
        System.out.println(Fatec.educacao);
    }
}