public class Main {
    public static void main(String[] args) {
        String[] oQueEstudar = new String[] { "Inglês", "Programação", "Lógica" };
        String[] quaisLivrosleituras = new String[] { "Introdução a Programação", "Tim", "A metamorfose" };
        String[] tirarDuvidasCom = new String[] { "Secretaria", "Coordenação", "Administração" };
        AlunoFatecSJC fatec = new AlunoFatecSJC(oQueEstudar, quaisLivrosleituras, tirarDuvidasCom);
        
        fatec.estudar();
        fatec.leituras();
        fatec.duvidas();

        String[] tiposDeTenis = new String[]{"Corrida", "Minimalista", "Slip-On", "Old Skool"};
        String[] tiposDeSapatoSocial = new String[]{"Oxford", "Derby", "Brogue"};
        String[] tiposDeSalto = new String[]{"Anabela", "Meia Pata", "Bloco"};
        Calcados cal = new Calcados(tiposDeTenis, tiposDeSapatoSocial, tiposDeSalto);
        
        cal.tiposTenis();
        cal.tiposSapatoSocial();
        cal.tiposSalto();

        String[] tablaturasDeViolao = new String[]{"Los Hermanos-Ana Júlia", "Engenheiros do Hawaii-Dom Quixote", "Engenheiros do Hawaii-Terra de Gigantes"};
        String[] tablaturasDeViolino = new String[]{"Niccoló Paganini-Caprice24", "Niccoló Paganini-Duetto Amoroso", "Niccoló Paganini-Concerto n1"};
        String[] tablaturasDeVioloncelo = new String[]{"Apocalyptica-Battery", "Apocalyptica-Path", "Apocalyptica-I Don't Care"};
        InstrumentoMusical iMusical = new InstrumentoMusical(tablaturasDeViolao, tablaturasDeViolino, tablaturasDeVioloncelo);
        
        iMusical.tocarViolao();
        iMusical.tocarViolino();
        iMusical.tocarVioloncelo();

        String[] pontosTuristicosBahia = new String[]{"Parque Nacional", "Elevador Lacerda", "Mercado Modelo"};
        String[] comidasTipicas = new String[]{"Tapioca", "Vatapá", "Acarajé"};
        String[] nomeDeHoteis = new String[]{"Fiesta Bahia", "Gran Hotel", "Porto Seguro Eco Bahia Hotel"};
        Lugar bahia = new Lugar(pontosTuristicosBahia, comidasTipicas, nomeDeHoteis);
        
        
        bahia.visitar();
        bahia.comer();
        bahia.nomes();

        String[] atividades = new String[]{"Fazer receitas culinárias", "Ler livors", "Jogar jogos em família"};
        Pessoa cvc = new Pessoa(true, true, atividades);
        
        
        cvc.descansar();
        cvc.viajar();
        cvc.atividades();

        String[] areaDaSaude = new String[] { "Médico", "Enfermeiro", "Psicologia" };
        String[] areaDaSeguranca = new String[] { "Vigilante", "Guarda", "Policial" };
        String[] areaDaEducacao = new String[] { "Professor", "Educador" };
        Profissional pf = new Profissional(areaDaSaude, areaDaSeguranca, areaDaEducacao);

        pf.profissionaisSaude();
        pf.profissionaisSeguranca();
        pf.profissionaisEducacao();
    }
}