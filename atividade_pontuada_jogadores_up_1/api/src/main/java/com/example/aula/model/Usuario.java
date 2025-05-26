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

    @NotNull(message = "A idade deve ser obrigatória.")
    @Min(value = 16, message = "A idade deve ser maior ou igual a 16.")
    private int idade;

    @NotBlank(message = "Altura deve ser obrigatória.")
    private String altura;

    @NotBlank(message = "O peso deve ser obrigatório.")
    private String peso;

    @NotBlank(message = "A posição deve ser obrigatóia.")
    private String posicao;

    @NotNull(message = "O numero da camisa é obrigatório.")
    @Min(value = 1, message = "O numero da camisa deve ser maior ou igual a 1.")
    @Max(value = 99, message = "O numero da camisa deve ser menor ou igual a 99.")
    private int numeroCamisa;

    public Usuario() {
    }

    public Usuario(Long id, String nome, Sexo sexo, int idade, String altura, String peso, String posicao, int numeroCamisa) {
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
}
