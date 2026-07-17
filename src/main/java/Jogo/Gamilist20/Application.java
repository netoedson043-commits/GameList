package Jogo.Gamilist20;

import Jogo.Gamilist20.Modelo.JogoRawg;
import Jogo.Gamilist20.Servicos.Entrada;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args); {
			var scanner = new Scanner(System.in);
			Entrada jogoProcurado = new Entrada();

			System.out.println("nome do jogo");
			String buscarJogo = scanner.nextLine();

			String endereco = "https://api.rawg.io/api/games?key=15a3e542eb6749c49df86111d2e2acd0&search=" + buscarJogo;


			var resultado = jogoProcurado.obterDados(endereco);
			ObjectMapper jackson = new ObjectMapper();
			JogoRawg jogoEncontrado = null;
			try {
				JsonNode raiz = jackson.readTree(resultado);
				JsonNode primeiroResultado = raiz.get("results").get(0);
				jogoEncontrado = jackson.treeToValue(primeiroResultado, JogoRawg.class);
			} catch (JsonProcessingException e) {
				throw new RuntimeException(e);
			}
			System.out.println(jogoEncontrado);


			System.out.println("primeiro commit");

		}

	}


}
