public class AlunoFatecSJC {

    private String[] materias;
    private String[] leituras;
    private String[] duvidas;

    public AlunoFatecSJC() {
    }

    public AlunoFatecSJC(String[] materias, String[] leituras, String[] duvidas) {
        this.materias = materias;
        this.leituras = leituras;
        this.duvidas = duvidas;
    }

    public void estudar() {
        System.out.println("\nSuas matérias para estudar são: ");
        for (int i = 0; i < materias.length; i++) {
            System.out.println("\t - " + this.materias[i]);
        }
    }

    public void leituras() {
        System.out.println("\nLivros escolhidos para leitura: ");
        for (int i = 0; i < leituras.length; i++) {
            System.out.println("\t - " + this.leituras[i]);
        }
    }

    public void duvidas() {
        System.out.println("\nNa FATEC, você pode tirar dúvidas na: ");
        for (int i = 0; i < duvidas.length; i++) {
            System.out.println("\t - " + this.duvidas[i]);
        }
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public String[] getMaterias() {
        return this.materias;
    }
    public void setleituras(String[] leituras) {
        this.leituras = leituras;
    }

    public String[] getleituras() {
        return this.leituras;
    }
    public void setDuvidas(String[] duvidas) {
        this.duvidas = duvidas;
    }

    public String[] getDuvidas() {
        return this.duvidas;
    }

    public static void main(String[] args) {
        String[] oQueEstudar = new String[] { "Inglês", "Programação", "Lógica" };
        String[] quaisLivrosleituras = new String[] { "Introdução a Programação", "Tim", "A metamorfose" };
        String[] tirarDuvidasCom = new String[] { "Secretaria", "Coordenação", "Administração" };
        AlunoFatecSJC fatec = new AlunoFatecSJC(oQueEstudar, quaisLivrosleituras, tirarDuvidasCom);
        
        fatec.estudar();
        fatec.leituras();
        fatec.duvidas();
    }
}