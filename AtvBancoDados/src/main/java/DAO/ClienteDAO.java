
package DAO;
import Conexao.conexao;
import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteDAO {
    public void inserirCliente (Cliente c){
        try {
        String SQL = "INSERT INTO thales_zinato.cliente (login, nome_cliente, email) VALUES (?,?,?)";
        Connection minhaConexao = conexao.getConexao();
        PreparedStatement comando = minhaConexao.prepareStatement(SQL);
        comando.setInt(1, c.getLogincliente());
        comando.setString(2, c.getNomecliente());
        comando.setString(3, c.getEmailcliente());
        int retorno = comando.executeUpdate();
        if(retorno>0){
            JOptionPane.showMessageDialog(null, "Cliente " +c.getNomecliente()+ " inserido com sucesso." );
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro ao inserir o Cliente " +c.getNomecliente()+ ", verifique os LOGS.");
        }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
