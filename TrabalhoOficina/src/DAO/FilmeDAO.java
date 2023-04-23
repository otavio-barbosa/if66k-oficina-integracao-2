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
import model.Filme;
/**
 *
 * @author otavi
 */
public class FilmeDAO extends BdConnection {
    
    public List<Filme> getArrayFilme() {
        return arrayfilme;
    }
    
    protected Filme f = null;
    protected List<Filme> arrayfilme = new ArrayList<>();
    private PreparedStatement stat = null;
    private ResultSet rs = null;
        
    public void ler() {
        
        arrayfilme = new ArrayList();
        
        try {
           stat =  connection.prepareStatement("SELECT * FROM filmes");
           rs = stat.executeQuery();
           
           while(rs.next()) {
               
               f = new Filme();
               
               f.setNome(rs.getString("nome"));
               f.setGenero(rs.getString("genero"));
               f.setAno(rs.getInt("ano"));
               arrayfilme.add(f);
           }
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            JOptionPane.showMessageDialog(null, "Abra a conexão primeiro!!!\nOBS: Vá em Arquivo -> Abrir.");
        }
    }
    
    public void cadastrar(String nome, String gene, int ano) {
        try {
           connection = JDBCUtil.getConnection();
           stat =  connection.prepareStatement("INSERT INTO filmes (nome,genero,ano)VALUES(?,?,?)");
           
           stat.setString(1, nome); //começa no 1
           stat.setString(2, gene);
           stat.setInt(3, ano);
           stat.executeUpdate();    
           
           JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso!!!");
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            JOptionPane.showMessageDialog(null, "Abra a conexão primeiro!!!\nOBS: Vá em Arquivo -> Abrir.");
        }
    }
    
    public void deletar(String nome) {
        try {
            connection = JDBCUtil.getConnection();
            stat = connection.prepareStatement("DELETE FROM filmes WHERE nome = ?");
            
            stat.setString(1, nome);
            stat.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Filme deletado com sucesso!!!");
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            JOptionPane.showMessageDialog(null, "Abra a conexão primeiro!!!\nOBS: Vá em Arquivo -> Abrir.");
        }
    }
    
    public void atualizar(String nome, String genero, int ano, String sel) {
        try {
            connection = JDBCUtil.getConnection();
            stat = connection.prepareStatement("UPDATE filmes SET nome = ?, genero = ?, ano = ? WHERE nome = ?;");
            
            stat.setString(1, nome);
            stat.setString(2, genero);
            stat.setInt(3, ano);
            stat.setString(4, sel);
            stat.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Filme atualizado com sucesso!!!");
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            JOptionPane.showMessageDialog(null, "Abra a conexão primeiro!!!\nOBS: Vá em Arquivo -> Abrir.");
        }
    }
    
    public void buscar(String nome) {
        try {
            connection = JDBCUtil.getConnection();
            
            stat = connection.prepareStatement("SELECT * FROM filmes WHERE LOWER(nome) = LOWER(?);");
            stat.setString(1, nome);
            rs = stat.executeQuery();
           
           while(rs.next()) {
               
               f = new Filme();
               
               f.setNome(rs.getString("nome"));
               f.setGenero(rs.getString("genero"));
               f.setAno(rs.getInt("ano"));
               arrayfilme.add(f);
           }
           
           JOptionPane.showMessageDialog(null, "Nome: " + f.getNome() + "\nGenêro: " + f.getGenero() + "\nAno: " + f.getAno());

        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            JOptionPane.showMessageDialog(null, "Abra a conexão primeiro!!!\nOBS: Vá em Arquivo -> Abrir.");
        }
    }
}
