package Jogo.Gamilist20;

import Jogo.Gamilist20.Modelo.JogoRawg;
import Jogo.Gamilist20.Principal.Main;
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
			Main main = new Main();
			main.menu();


		}

	}


}
