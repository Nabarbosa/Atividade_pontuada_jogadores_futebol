package com.example.aula.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "tab_jogador")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Min(16)
    private String idade;

    @NotBlank(message = "Altura deve ser obrigatória.")
    private String altura;

    @NotBlank(message = "O peso deve ser obrigatório.")
    private String peso;

    @NotBlank(message = "A posição deve ser obrigatóia.")
    private String posicao;

    @NotNull
    private int numeroCamisa;

    public Usuario() {
    }

    public Usuario(Long id, String nome, Sexo sexo, String idade, String altura, String peso, String posicao, int numeroCamisa) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public @Min(16) String getIdade() {
        return idade;
    }

    public void setIdade(@Min(16) String idade) {
        this.idade = idade;
    }

    public @NotBlank(message = "Altura deve ser obrigatória.") String getAltura() {
        return altura;
    }

    public void setAltura(@NotBlank(message = "Altura deve ser obrigatória.") String altura) {
        this.altura = altura;
    }

    public @NotBlank(message = "O peso deve ser obrigatório.") String getPeso() {
        return peso;
    }

    public void setPeso(@NotBlank(message = "O peso deve ser obrigatório.") String peso) {
        this.peso = peso;
    }

    public @NotBlank(message = "A posição deve ser obrigatóia.") String getPosicao() {
        return posicao;
    }

    public void setPosicao(@NotBlank(message = "A posição deve ser obrigatóia.") String posicao) {
        this.posicao = posicao;
    }

    @NotNull
    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(@NotNull int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
}
