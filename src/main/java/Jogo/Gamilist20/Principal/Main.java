package Jogo.Gamilist20.Principal;

import Jogo.Gamilist20.Modelo.JogoRawg;
import Jogo.Gamilist20.Servicos.Entrada;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;

public class Main {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        BuscarJogos encontrado = new BuscarJogos();

        System.out.println("""
                1. Procurar jogos
                2. Jogos favoritos
                """);
        String desejo = scanner.nextLine();

        switch (desejo) {
            case "1":

                encontrado.procurarJogo();


            case "2":
                System.out.println("""
                        1. Adicionar jogo
                        2. Remover jogo
                        3. Listar favoritos
                        """);
                String desejo2 = scanner.nextLine();
                switch (desejo2){
                    case "1":
                        encontrado.procurarJogo();


                }


        }
    }
}
