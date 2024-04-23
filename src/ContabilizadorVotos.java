import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContabilizadorVotos {
    private ArrayList<Jogador> participates;

    public ContabilizadorVotos() {
        this.participates = new ArrayList<>();
    }

    public void cadastrarParticipantes(String nome) {
        Jogador jogador = new Jogador(nome);
        participates.add(jogador);
    }

    public void votarEm(String nome) {
        for (Jogador jogador : participates) {
            if (jogador.getNome().equals(nome)) {
                jogador.adicionarVoto();
                return;
            }
        }
        System.out.println("Participante não encontrado.");
    }

    public String DeterminaroEliminado() {
        Map<String, Integer> mapVotos = new HashMap<>();
        for (Jogador jogador : participates) {
            mapVotos.put(jogador.getNome(), jogador.getVotos());
        }

        //Localizar o jogador com o maior numero de voto
        String eliminado = "";
        int maiorNumeroVotos = 0;
        for (Map.Entry<String, Integer> entry : mapVotos.entrySet()) {
            if (entry.getValue() > maiorNumeroVotos) {
                eliminado = entry.getKey();
                maiorNumeroVotos = entry.getValue();
            }
        }
        return eliminado;
    }

    public static void main(String[] args) {
        ContabilizadorVotos contabilidor = new ContabilizadorVotos();
        contabilidor.cadastrarParticipantes("Alana Dias");
        contabilidor.cadastrarParticipantes("Beatriz Reis");
        contabilidor.cadastrarParticipantes("Davi Brito");
        contabilidor.cadastrarParticipantes("Deniziane Ferreira");
        contabilidor.cadastrarParticipantes("Fernanda Bande");
        contabilidor.cadastrarParticipantes("Giovanna Lima");
        contabilidor.cadastrarParticipantes("Giovanna Pitel");
        contabilidor.cadastrarParticipantes("Isabelle Nogueira");
        contabilidor.cadastrarParticipantes("Juninho");
        contabilidor.cadastrarParticipantes("Leidy Elin");
        contabilidor.cadastrarParticipantes("Lucas Henrique");
        contabilidor.cadastrarParticipantes("Lucas Luigi");
        contabilidor.cadastrarParticipantes("Lucas Pizane");
        contabilidor.cadastrarParticipantes("Marcus Vinicius");
        contabilidor.cadastrarParticipantes("Matteus Amaral");
        contabilidor.cadastrarParticipantes("Maycon Cosmer");
        contabilidor.cadastrarParticipantes("MC Bin Laden");
        contabilidor.cadastrarParticipantes("Michel Nogueira");
        contabilidor.cadastrarParticipantes("Nizam");
        contabilidor.cadastrarParticipantes("Raquele Cardozo");
        contabilidor.cadastrarParticipantes("Rodriguinho");
        contabilidor.cadastrarParticipantes("Thalyta Alves");
        contabilidor.cadastrarParticipantes("Vanessa Lopes");
        contabilidor.cadastrarParticipantes("Vinicius Rodrigues");
        contabilidor.cadastrarParticipantes("Wanessa Camargo");
        contabilidor.cadastrarParticipantes("Yasmin Brunet");

        contabilidor.votarEm("Juninho");
        contabilidor.votarEm("Juninho");
        contabilidor.votarEm("Juninho");
        contabilidor.votarEm("Juninho");
        contabilidor.votarEm("Juninho");
        contabilidor.votarEm("Juninho");
        contabilidor.votarEm("Juninho");
        contabilidor.votarEm("Juninho");
        contabilidor.votarEm("Davi Brito");
        contabilidor.votarEm("Davi Brito");
        contabilidor.votarEm("Davi Brito");
        contabilidor.votarEm("Davi Brito");
        contabilidor.votarEm("Davi Brito");
        contabilidor.votarEm("Davi Brito");
        contabilidor.votarEm("Davi Brito");
        contabilidor.votarEm("Davi Brito");
        contabilidor.votarEm("Davi Brito");
        contabilidor.votarEm("Davi Brito");
        contabilidor.votarEm("Davi Brito");
        contabilidor.votarEm("Davi Brito");
        contabilidor.votarEm("Davi Brito");
        contabilidor.votarEm("Davi Brito");
        contabilidor.votarEm("Davi Brito");
        contabilidor.votarEm("Davi Brito");

        String eliminado = contabilidor.DeterminaroEliminado();
        System.out.println("O eliminado é : " + eliminado);

    }
}
