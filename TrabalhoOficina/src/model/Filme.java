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
public class Filme implements Serializable {
    private static long serialVersionUID = 1L;
    
    protected String nome;
    protected String genero;
    protected int ano;
    
    public String getNome() {
        return nome;
    }
    
    public String setNome(String nome) {
        return this.nome = nome;
    }
    
      public String getGenero() {
        return genero;
    }
    
    public String setGenero(String genero) {
        return this.genero = genero;
    }
    
      public int getAno() {
        return ano;
    }
    
    public int setAno(int ano) {
        return this.ano = ano;
    }
}
