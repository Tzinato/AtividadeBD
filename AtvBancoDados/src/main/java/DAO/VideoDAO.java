/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Conexao.conexao;
import Model.Video;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class VideoDAO {
   public void inserirVideo (Video v){
        try {
        String SQL = "INSERT INTO thales_zinato.video (url_video, nome_video, nome_cliente, tipo_video) VALUES (?,?,?,?)";
        Connection minhaConexao = conexao.getConexao();
        PreparedStatement comando = minhaConexao.prepareStatement(SQL);
        comando.setString(1, v.getUrl_video());
        comando.setString(2, v.getNome_video());
        comando.setString(3, v.getNome_dono());
        comando.setString(4, v.getTipo_video());
        int retorno = comando.executeUpdate();
        if(retorno>0){
            JOptionPane.showMessageDialog(null, "Video " +v.getNome_video()+ "De " + v.getNome_dono()+ " inserido com sucesso." );
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro ao inserir o Video " +v.getNome_video()+ "De " + v.getNome_dono()+ ", verifique os LOGS.");
        }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
