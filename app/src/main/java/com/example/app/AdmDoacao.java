package com.example.app;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;





@Entity
public class AdmDoacao {
    
    @Id @GeneratedValue
    private long id;
    private String nome_Doador; // Changed to follow Java naming conventions
    private String titulo;
    private String texto;

    // Default constructor
    public AdmDoacao() {}

    // Parameterized constructor
    public AdmDoacao(long id, String d, String t, String text) {
        this.id = id;
        nome_Doador = d;
        titulo = t;
        texto = text;
    }

    //GETTERS
    public long getId(){return id;}
    public String nome_Doador(){return nome_Doador;}
    public String getTitulo(){return titulo;}
    public String getTexto(){return texto;}
    //SETTERS
    public void setId(long id){this.id=id;}
    public void setNome_Doador(String d){nome_Doador = d;}
    public void setTitulo(String t){titulo = t;}
    public void setTexto(String text){texto = text;}


    
}
