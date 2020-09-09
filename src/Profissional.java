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
    public void profissionaisSaude() {
        System.out.println("\nAlguns profissionais da saúde são: ");
        for (int i = 0; i < saude.length; i++) {
            System.out.println("\t - " + this.saude[i]);
        }
    }

    public void profissionaisSeguranca() {
        System.out.println("\nAlguns profissionais da segurança são:");
        for (int i = 0; i < seguranca.length; i++) {
            System.out.println("\t - " + this.seguranca[i]);
        }
    }

    public void profissionaisEducacao() {
        System.out.println("\nAlguns profissionais da educação são: ");
        for (int i = 0; i < educacao.length; i++) {
            System.out.println("\t - " + this.educacao[i]);
        }
    }

    public void setsaude(String[] saude) {
        this.saude = saude;
    }

    public String[] getsaude() {
        return this.saude;
    }
    public void setseguranca(String[] seguranca) {
        this.seguranca = seguranca;
    }

    public String[] getseguranca() {
        return this.seguranca;
    }
    public void seteducacao(String[] educacao) {
        this.educacao = educacao;
    }

    public String[] geteducacao() {
        return this.educacao;
    }

    public static void main(String[] args) {
        String[] areaDaSaude = new String[] { "Médico", "Enfermeiro", "Psicologia" };
        String[] areaDaSeguranca = new String[] { "Vigilante", "Guarda", "Policial" };
        String[] areaDaEducacao = new String[] { "Professor", "Educador" };
        Profissional pf = new Profissional(areaDaSaude, areaDaSeguranca, areaDaEducacao);

        pf.profissionaisSaude();
        pf.profissionaisSeguranca();
        pf.profissionaisEducacao();
    }
}