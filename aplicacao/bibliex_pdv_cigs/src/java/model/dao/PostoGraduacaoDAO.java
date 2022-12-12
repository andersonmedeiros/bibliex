/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.PostoGraduacao;

/**
 *
 * @author STI
 */
public class PostoGraduacaoDAO {
    //Tabela
    String tabela = "postograduacao";
    
    //Atributos
    String id = "id";
    String descricao = "descricao";
    String abreviatura = "abreviatura";
    
    //Insert SQL
    private final String INSERT = "INSERT INTO " + tabela + "(" + id + "," + descricao + "," + abreviatura + ") " +
                                  "VALUES(?,?,?,?);";
    
    //Update SQL
    private final String UPDATE = "UPDATE " + tabela +
                                  " SET " + descricao + "=?, " + abreviatura + "=? " +
                                  "WHERE " + id + "=?;";
        
    //Delete SQL
    private final String DELETE = "DELETE FROM " + tabela + " WHERE " + id + "=?;";
    
    //Consultas SQL
    
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    
    //Insert SQL
    public void insert(PostoGraduacao pg) {
        if (pg != null) {
            try {
                conn = Conexao.getConnection();
                
                pstm = conn.prepareStatement(INSERT);
                
                pstm.setInt(1, pg.getId());
                pstm.setString(2, pg.getDescricao());
                pstm.setString(3, pg.getAbreviatura());
                                                              
                pstm.execute();
                
                Conexao.fechaConexao(conn, pstm);

            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage());  
            }
        } else {
            throw new RuntimeException();
        }
    }
    
    //Update SQL
    public void update(PostoGraduacao pg) {
        if (pg != null) {
            try {
                conn = Conexao.getConnection();
                pstm = conn.prepareStatement(UPDATE);
                                
                pstm.setString(1, pg.getDescricao());
                pstm.setString(2, pg.getAbreviatura());
                pstm.setInt(3, pg.getId());
                
                pstm.execute();
                Conexao.fechaConexao(conn, pstm);

            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage());  
            }
        } else {            
            throw new RuntimeException();
        }
    }
    
    //Delete SQL
    public void delete(int id) {
        if (id != 0){
            try {
                conn = Conexao.getConnection();
                pstm = conn.prepareStatement(DELETE);
                pstm.setInt(1, id);
            
                pstm.execute();
                Conexao.fechaConexao(conn, pstm);

            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage());  
            }
        } else {            
            throw new RuntimeException();
        }
    }
    
    private final String GETPOSTOGRADUACAOBYID = "SELECT * " +
                                             "FROM postograduacao " + 
                                             "WHERE id = ?";
       
    public PostoGraduacao getPostoGraduacaoById(int idPG){
        PostoGraduacao pg = new PostoGraduacao();
        try {
            conn = Conexao.getConnection();
            pstm = conn.prepareStatement(GETPOSTOGRADUACAOBYID);
            pstm.setInt(1, idPG);
           
            rs = pstm.executeQuery();
            while (rs.next()) {
                pg.setId(rs.getInt("id"));
                pg.setDescricao(rs.getString("descricao"));
                pg.setAbreviatura(rs.getString("abreviatura"));
            }
            Conexao.fechaConexao(conn, pstm, rs);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());           
        }
        return pg;
    }
    
    private final static String GETPOSTOSGRADUACOESDWR = "SELECT * " + "FROM postograduacao";
    
    
    public static ArrayList<PostoGraduacao> getPostosGraduacoesDWR(){
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<PostoGraduacao> pgs = new ArrayList<>();
        
        try {
            conn = Conexao.getConnection();
            pstm = conn.prepareStatement(GETPOSTOSGRADUACOESDWR);
           
            rs = pstm.executeQuery();
            while (rs.next()) {
                PostoGraduacao pg = new PostoGraduacao();                

                pg.setId(rs.getInt("id"));
                pg.setDescricao(rs.getString("descricao"));
                pg.setAbreviatura(rs.getString("abreviatura"));

                pgs.add(pg);
            }
            Conexao.fechaConexao(conn, pstm, rs);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());           
        }
        return pgs;
    }
}
