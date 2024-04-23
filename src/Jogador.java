import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Jogador {
    private String nome;
    private int votos;


    public Jogador(String nome){
        this.nome = nome;
        this.votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarVoto(){
        this.votos++;
    }

    public int getVotos() {
        return votos;
       }
    }
