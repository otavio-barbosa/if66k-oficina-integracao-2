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
public class Musica implements Serializable {
    private static long serialVersionUID = 3L;
    
    protected String nome;
    protected String artista;
    protected String tipo;
    protected float tempo;
    
    public String getNome() {
        return nome;
    }
    
    public String setNome(String nome) {
        return this.nome = nome;
    }
    
    public String getArtista() {
        return artista;
    }
    
    public String setArtista(String artista) {
        return this.artista = artista;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public String setTipo(String tipo) {
        return this.tipo = tipo;
    }
    
    public float getTempo() {
        return tempo;
    }
    
    public float setTempo(float tempo) {
        return this.tempo = tempo;
    }
}
