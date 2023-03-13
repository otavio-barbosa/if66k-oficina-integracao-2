/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Otávio Barbosa
 */
public class Cinema implements Serializable {
    private static long serialVersionUID = 2L;
    
    protected String sala;
    protected int assentos;
    protected float horario;
    protected String filme;

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public float getHorario() {
        return horario;
    }

    public void setHorario(float horario) {
        this.horario = horario;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }
}
