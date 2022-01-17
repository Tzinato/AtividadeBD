/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Conexao.conexao;
import Model.Avaliador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.List;
/**
 *
 * @author User
 */
public class AvaliadorDAO {
    public void inserirAvaliador (Avaliador a){
        try {
        String SQL = "INSERT INTO thales_zinato.avaliador (cpf, nome_avaliador, login, email) VALUES (?,?,?,?)";
        Connection minhaConexao = conexao.getConexao();
        PreparedStatement comando = minhaConexao.prepareStatement(SQL);
        comando.setString(1, a.getCpf());
        comando.setString(2, a.getNome_avaliador());
        comando.setInt(3, a.getLogin());
        comando.setString(4, a.getEmail());
        int retorno = comando.executeUpdate();
        if(retorno>0){
            JOptionPane.showMessageDialog(null, "Avaliador " +a.getNome_avaliador()+ " inserido com sucesso." );
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro ao inserir o Avaliador " +a.getNome_avaliador()+ ", verifique os LOGS.");
        }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List <Avaliador> listaDeLogins(){
        try {
            String SQL="SELECT login, nome_avaliador  FROM thales_zinato.avaliador";
            List <Avaliador>listaDeLogins = new ArrayList<Avaliador>();
            Connection c =conexao.getConexao();
            PreparedStatement ps=c.prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                Avaliador atual=new Avaliador();
                atual=this.pegaDados(resultado);
                listaDeLogins.add(atual);
            }

            return listaDeLogins;
        } catch (SQLException ex) {
            Logger.getLogger(AvaliadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    private Avaliador pegaDados(ResultSet resultado){
        try {
            Avaliador atual=new Avaliador();
            atual.setLogin (resultado.getInt ("login"));
            atual.setNome_avaliador(resultado.getString("nome_avaliador"));
            return atual;
        } catch (SQLException ex) {
            Logger.getLogger(AvaliadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
