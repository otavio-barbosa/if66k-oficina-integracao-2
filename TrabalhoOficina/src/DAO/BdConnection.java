/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author otavi
 */
public class BdConnection {

    protected Connection connection = null;
    
    public boolean AcessaBD() {
            try {
                String path = System.getProperty("user.dir");
                File config_file = new File(path, "/src/DAO/configbd.properties");
                JDBCUtil.initBd(config_file);

                connection = JDBCUtil.getConnection();
                connection.setAutoCommit(false);

                DatabaseMetaData dbmt = connection.getMetaData();
                System.out.println("Nome do BD: " + dbmt.getDatabaseProductName());
                System.out.println("Versao do BD: " + dbmt.getDatabaseProductVersion());
                System.out.println("URL: " + dbmt.getURL());
                System.out.println("Driver: " + dbmt.getDriverName());
                System.out.println("Versao Driver: " + dbmt.getDriverVersion());
                System.out.println("Usuario: " + dbmt.getUserName());
            } catch (ClassNotFoundException erro) {
                System.out.println("Falha ao carregar o driver JDBC." + erro);
                return false;
            } catch (IOException erro) {
                System.out.println("Falha ao carregar o arquivo de configuração." + erro);
                return false;
            } catch (SQLException erro) {
                System.out.println("Falha na conexao, comando sql = " + erro);
                JOptionPane.showMessageDialog(null, "Abra a conexão primeiro!!!\nOBS: Vá em Arquivo -> Abrir.");
                return false;
            }
            return true;
        }
}
