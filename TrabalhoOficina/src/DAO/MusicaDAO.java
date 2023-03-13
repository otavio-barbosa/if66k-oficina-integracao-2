/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Musica;

/**
 *
 * @author otavi
 */
public class MusicaDAO extends BdConnection{
public List<Musica> getArrayMusica() {
        return arraymusica;
    }
    
    protected Musica m = null;
    protected List<Musica> arraymusica = new ArrayList<>();
    private PreparedStatement stat = null;
    private ResultSet rs = null;
      
    public void ler() {
        
        arraymusica = new ArrayList();
        
        try {
           stat =  connection.prepareStatement("SELECT * FROM musicas");
           rs = stat.executeQuery();
           
           while(rs.next()) {
               
               m = new Musica();
               
               m.setNome(rs.getString("nome"));
               m.setArtista(rs.getString("artista"));
               m.setTipo(rs.getString("tipo"));
               m.setTempo(rs.getFloat("tempo"));
               arraymusica.add(m);
           }
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            JOptionPane.showMessageDialog(null, "Abra a conexão primeiro!!!\nOBS: Vá em Arquivo -> Abrir.");
        }
    }
    
    public void cadastrar(String nome, String arti, String tipo, Float temp) {
        try {
           connection = JDBCUtil.getConnection();
           stat =  connection.prepareStatement("INSERT INTO musicas (nome,artista,tipo,tempo)VALUES(?,?,?,?)");
           
           stat.setString(1, nome); 
           stat.setString(2, arti);
           stat.setString(3, tipo);
           stat.setFloat(4, temp);
           stat.executeUpdate();    
           
           JOptionPane.showMessageDialog(null, "Arquivo cadastrado com sucesso!!!");
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            JOptionPane.showMessageDialog(null, "Abra a conexão primeiro!!!\nOBS: Vá em Arquivo -> Abrir.");
        }
    }
    
    public void deletar(String nome) {
        try {
            connection = JDBCUtil.getConnection();
            stat = connection.prepareStatement("DELETE FROM musicas WHERE nome = ?");
            
            stat.setString(1, nome);
            stat.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Arquivo deletado com sucesso!!!");
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            JOptionPane.showMessageDialog(null, "Abra a conexão primeiro!!!\nOBS: Vá em Arquivo -> Abrir.");
        }
    }
    
    public void atualizar(String nome, String arti, String tipo, Float temp, String sel) {
        try {
            connection = JDBCUtil.getConnection();
            stat = connection.prepareStatement("UPDATE musicas SET nome = ?, artista = ?, "
                    + "tipo = ?, tempo = ? WHERE nome = ?;");
            
            stat.setString(1, nome);
            stat.setString(2, arti);
            stat.setString(3, tipo);
            stat.setFloat(4, temp);
            stat.setString(5, sel);
            stat.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Arquivo atualizado com sucesso!!!");
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            JOptionPane.showMessageDialog(null, "Abra a conexão primeiro!!!\nOBS: Vá em Arquivo -> Abrir.");
        }
    }
    
    public void buscar(String nome) {
        try {
            connection = JDBCUtil.getConnection();
            
            stat = connection.prepareStatement("SELECT * FROM musicas WHERE LOWER(nome) = LOWER(?);");
            stat.setString(1, nome);
            rs = stat.executeQuery();
           
            while(rs.next()) {
               
               m = new Musica();
               
               m.setNome(rs.getString("nome"));
               m.setArtista(rs.getString("artista"));
               m.setTipo(rs.getString("tipo"));
               m.setTempo(rs.getFloat("tempo"));
               arraymusica.add(m);
           }
           
           JOptionPane.showMessageDialog(null, 
                   "Nome: " + m.getNome() + 
                   "\nArtista: " + m.getArtista()+ 
                   "\nTipo: " + m.getTipo() + 
                   "\nTempo: " + m.getTempo());

        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            JOptionPane.showMessageDialog(null, "Abra a conexão primeiro!!!\nOBS: Vá em Arquivo -> Abrir.");
        }
    }
}
