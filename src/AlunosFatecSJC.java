public class AlunosFatecSJC {

    private String[] materias;
    private String[] ler;
    private String[] duvidas;

    public AlunosFatecSJC() {
    }

    public AlunosFatecSJC(String[] materias, String[] ler, String[] duvidas) {
        this.materias = materias;
        this.ler = ler;
        this.duvidas = duvidas;
    }

    public void iniciarEstudo(String materia) {
        for (String m : materias) {
            if (materia == m) {
                System.out.println("estudando materia " + materia);
                break;
            }
        }
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public String[] getMaterias() {
        return this.materias;
    }

    public static void main(String[] args) {
        String[] oQueEstudar = new String[] { "Inglês", "Programação", "Lógica" };
        String[] quaisLivrosLer = new String[] { "Introdução a Programação", "Tim", "A metamorfose" };
        String[] tirarDuvidasCom = new String[] { "Secretaria", "Coordenação", "Administração" };
        AlunosFatecSJC Fatec = new AlunosFatecSJC(oQueEstudar, quaisLivrosLer, tirarDuvidasCom);

        System.out.println(Fatec.materias);
        System.out.println(Fatec.ler);
        System.out.println(Fatec.duvidas);
    }
}