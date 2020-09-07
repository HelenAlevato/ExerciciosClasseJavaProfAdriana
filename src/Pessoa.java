public class Pessoa {
    
    private boolean fiqueEmCasa;
    private boolean viajeDepois;
    private String[] atividadesEmCasa;
    
    public Pessoa() {
    }
    
    public Pessoa(boolean viajeDepois, boolean fiqueEmCasa, String[] atividadesEmCasa) {
        this.viajeDepois = viajeDepois;
        this.fiqueEmCasa = fiqueEmCasa;
        this.atividadesEmCasa = atividadesEmCasa;
    }

    public static void main(String[] args) {
        String[] atividades = new String[]{"Receitas", "Livros", "Jogos"};
        Pessoa CVC = new Pessoa(true, true, atividades);
        
        
        System.out.println(CVC.fiqueEmCasa);
        System.out.println(CVC.viajeDepois);
        System.out.println(CVC.atividadesEmCasa);
    }
}