package DAO;

import ENTIDADE.CCliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import CONEXAO.Conexao;

public class DAOCliente {

    public static void insertCliente (CCliente cliente){

        String sql = "INSERT INTO TB_CLIENTE (NOME, TELEFONE, EMAIL, CPF) VALUES (?,?,?,?)";

        PreparedStatement ps = null;

        try{
            ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, cliente.getNome());
            ps.setLong(2, cliente.getTelefone());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getCpf());

            ps.execute();
            ps.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("\nFalha na conexao com o banco de dados");
        }

    }

    public static ArrayList<CCliente> selectCliente(){

        String sql = "SELECT * FROM TB_CLIENTE";
        PreparedStatement ps = null;

        try{

            ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            ArrayList<CCliente> clientes = new ArrayList<CCliente>();

            while (resultSet.next()){

                int idCLiente = resultSet.getInt("id");
                String nomeCliente = resultSet.getNString("nome");
                long telefoneCliente = resultSet.getLong("telefone");
                String emailCliente = resultSet.getString("email");
                String cpfCliente = resultSet.getString("cpf");

                CCliente cliente = new CCliente(idCLiente, nomeCliente, telefoneCliente, emailCliente, cpfCliente);

                clientes.add(cliente);
            }

            ps.close();
            return clientes;

        }
        catch (SQLException e){
            e.printStackTrace();
            System.out.println("\nFalha na conexao com o banco de dados");
            return null;
        }
    }

    public static void deleteCliente (String idCliente){

        String sql = "DELETE FROM TB_CLIENTE WHERE ID = ?";

        PreparedStatement ps = null;

        try{

            ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, idCliente);
            ps.execute();
            ps.close();

        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("\nFalha na conexao com o banco de dados");
        }
    }

    public static void updateCliente (CCliente cliente){

        String sql = "UPDATE TB_CLIENTE SET NOME = ?, TELEFONE = ?, EMAIL = ?, CPF = ? WHERE ID = ?";

        PreparedStatement ps = null;

        try{
            ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1,cliente.getNome());
            ps.setLong(2,cliente.getTelefone());
            ps.setString(3,cliente.getEmail());
            ps.setString(4,cliente.getCpf());
            ps.setString(5,"1"); //TESTE UPDATE ID 1 TB_CLIENTE

            ps.execute();
            ps.close();

        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("\nFalha na conexao com o banco de dados");
        }
    }
}


