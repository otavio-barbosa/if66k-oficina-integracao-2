/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author otavi
 */
public class FilmeDAOTest extends BdConnection {
    private PreparedStatement stat = null;
    private ResultSet rs = null;
    
    public FilmeDAOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    /**
     * Test of cadastrar method, of class FilmeDAO.
     */
    @Test
    public void testCadastrar() {  
        assertDoesNotThrow(() -> {
            String nome = "Mock Nome";
            String gene = "Mock Gênero";
            int ano = 2015;
            FilmeDAO instance = new FilmeDAO();
            instance.AcessaBD();
            instance.cadastrar(nome, gene, ano);
            stat = instance.connection.prepareStatement("SELECT * FROM filmes WHERE LOWER(nome) = LOWER(?);");
            stat.setString(1, nome);
            rs = stat.executeQuery();
            rs.next();
            
            assertEquals(nome, rs.getString("nome"));
            assertEquals(gene, rs.getString("genero"));
            assertEquals(ano, rs.getInt("ano"));
        });
    }

    /**
     * Test of deletar method, of class FilmeDAO.
     */
    @Test
    public void testDeletar() {
        assertDoesNotThrow(() -> {
            String nome = "Mock Nome";
            String gene = "Mock Gênero";
            int ano = 2015;
            FilmeDAO instance = new FilmeDAO();
            instance.AcessaBD();
            instance.cadastrar(nome, gene, ano);
            
            instance.deletar(nome);
            
            stat = instance.connection.prepareStatement("SELECT * FROM filmes WHERE LOWER(nome) = LOWER(?);");
            stat.setString(1, nome);
            rs = stat.executeQuery();
            rs.next();
            
            assertFalse(null, rs.getString("nome"));
        });
    }

    /**
     * Test of atualizar method, of class FilmeDAO.
     */
    @Test
    public void testAtualizar() {
        assertDoesNotThrow(() -> {
            String nome = "Mock Nome";
            String gene = "Mock Gênero";
            int ano = 2015;
            FilmeDAO instance = new FilmeDAO();
            instance.AcessaBD();
            instance.cadastrar(nome, gene, ano);
            
            String nomeAtt = "Mock Nome Att";
            String geneAtt = "Mock Gênero Att";
            int anoAtt = 2016;
            instance.atualizar(nomeAtt, geneAtt, anoAtt, nome);
            
            stat = instance.connection.prepareStatement("SELECT * FROM filmes WHERE LOWER(nome) = LOWER(?);");
            stat.setString(1, nomeAtt);
            rs = stat.executeQuery();
            rs.next();
            
            assertEquals(nomeAtt, rs.getString("nome"));
            assertEquals(geneAtt, rs.getString("genero"));
            assertEquals(anoAtt, rs.getInt("ano"));
        });
    }

    /**
     * Test of buscar method, of class FilmeDAO.
     */
    @Test
    public void testBuscar() {
        assertDoesNotThrow(() -> {
            String nome = "Mock Nome";
            String gene = "Mock Gênero";
            int ano = 2015;
            FilmeDAO instance = new FilmeDAO();
            instance.AcessaBD();
            instance.cadastrar(nome, gene, ano);
            
            instance.buscar(nome);
            
            stat = instance.connection.prepareStatement("SELECT * FROM filmes WHERE LOWER(nome) = LOWER(?);");
            stat.setString(1, nome);
            rs = stat.executeQuery();
            rs.next();
            
            assertEquals(nome, rs.getString("nome"));
        });
    }
    
}
