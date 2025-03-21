package CONEXAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static CONEXAO.Senha.getSenhaBanco;

public class Conexao {

    private static final String url = "jdbc:mysql://localhost:3306/quadra";
    private static final String user = "root";
    private static final String senha = getSenhaBanco(); //senha do banco de dados

    private static Connection cone;

    public static Connection getConexao(){

        try{
            if(cone == null) {
                cone = DriverManager.getConnection(url, user, senha);
                return cone;
            }
            else{
                return cone;
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}