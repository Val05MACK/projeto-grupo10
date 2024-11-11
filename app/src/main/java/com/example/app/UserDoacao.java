package com.example.app;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="UserDoacao")
public class UserDoacao {
    @Id
    private long cpf;
    private String nomeUser;
    private String emailUser;
    
   
    public UserDoacao(long cpf, String nomeUser, String emailUser) {
        this.cpf = cpf;
        this.nomeUser = nomeUser;
        this.emailUser = emailUser;
    }
    public String getNomeUser() {
        return nomeUser;
    }
    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }
    public String getEmailUser() {
        return emailUser;
    }
    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
