package Jogo.Gamilist20.Modelo;

import jakarta.persistence.*;

@Entity
@Table
public class JogosFavoritos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private Integer avaliacao;
    private String ano;

    public JogosFavoritos(JogoRawg jogoRawg) {
        this.nome = jogoRawg.nome();
        this.avaliacao = jogoRawg.avaliacao() != null ? jogoRawg.avaliacao() : 0;
        this.ano = jogoRawg.ano();

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
