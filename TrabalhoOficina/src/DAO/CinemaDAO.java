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
import model.Cinema;

/**
 *
 * @author otavi
 */
public class CinemaDAO extends BdConnection {
    
    public List<Cinema> getArrayCinema() {
        return arraycinema;
    }
    
    protected Cinema c = null;
    protected List<Cinema> arraycinema = new ArrayList<>();
    private PreparedStatement stat = null;
    private ResultSet rs = null;
    
    public void ler() {
        
        arraycinema = new ArrayList();
        
        try {
           stat =  connection.prepareStatement("SELECT * FROM cinemas");
           rs = stat.executeQuery();
           
           while(rs.next()) {
               
               c = new Cinema();
               
               c.setSala(rs.getString("sala"));
               c.setAssentos(rs.getInt("assentos"));
               c.setHorario(rs.getFloat("horario"));
               c.setFilme(rs.getString("filme"));
               arraycinema.add(c);
           }
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            JOptionPane.showMessageDialog(null, "Abra a conexão primeiro!!!\nOBS: Vá em Arquivo -> Abrir.");
        }
    }
    
    public void cadastrar(String sala, int assen, float hora, String film) {
        try {
           connection = JDBCUtil.getConnection();
           stat =  connection.prepareStatement("INSERT INTO cinemas (sala,assentos,horario,filme)VALUES(?,?,?,?)");
           
           stat.setString(1, sala);
           stat.setInt(2, assen);
           stat.setFloat(3, hora);
           stat.setString(4, film);
           stat.executeUpdate();    
           
           JOptionPane.showMessageDialog(null, "Arquivo cadastrado com sucesso!!!");
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            JOptionPane.showMessageDialog(null, "Abra a conexão primeiro!!!\nOBS: Vá em Arquivo -> Abrir.");
        }
    }
    
    public void deletar(String sala) {
        try {
            connection = JDBCUtil.getConnection();
            stat = connection.prepareStatement("DELETE FROM cinemas WHERE sala = ?");
            
            stat.setString(1, sala);
            stat.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Arquivo deletado com sucesso!!!");
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            JOptionPane.showMessageDialog(null, "Abra a conexão primeiro!!!\nOBS: Vá em Arquivo -> Abrir.");
        }
    }
    
    public void atualizar(String sala, int assen, float hora, String film, String sel) {
        try {
            connection = JDBCUtil.getConnection();
            stat = connection.prepareStatement("UPDATE cinemas SET sala = ?, assentos = ?, horario = ?, filme = ? WHERE sala = ?;");
            
            stat.setString(1, sala);
            stat.setInt(2, assen);
            stat.setFloat(3, hora);
            stat.setString(4, film);
            stat.setString(5, sel);
            stat.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Arquivo atualizado com sucesso!!!");
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            JOptionPane.showMessageDialog(null, "Abra a conexão primeiro!!!\nOBS: Vá em Arquivo -> Abrir.");
        }
    }
    
    public void buscar(String sala) {
        try {
            connection = JDBCUtil.getConnection();
            
            stat = connection.prepareStatement("SELECT * FROM cinemas WHERE LOWER(sala) = LOWER(?);");
            stat.setString(1, sala);
            rs = stat.executeQuery();
           
           while(rs.next()) {
               
               c = new Cinema();
               
               c.setSala(rs.getString("sala"));
               c.setAssentos(rs.getInt("assentos"));
               c.setHorario(rs.getFloat("horario"));
               c.setFilme(rs.getString("filme"));
               arraycinema.add(c);
           }
           
           JOptionPane.showMessageDialog(null, 
                   "Sala: " + c.getSala() 
                    + "\nAssentos: " + c.getAssentos() 
                    + "\nHorário: " + c.getHorario()
                    + "\nFilme: " + c.getFilme());

        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            JOptionPane.showMessageDialog(null, "Abra a conexão primeiro!!!\nOBS: Vá em Arquivo -> Abrir.");
        }
    }
}
