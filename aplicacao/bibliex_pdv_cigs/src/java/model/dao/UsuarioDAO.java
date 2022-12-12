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
import model.bean.GrupoAcesso;
import model.bean.PostoGraduacao;
import model.bean.Usuario;

/**
 *
 * @author STI
 */
public class UsuarioDAO {
    //Tabela
    String tabela = "usuario";
    
    //Atributos
    String idtmilitar = "idtmilitar";
    String nome = "nome";
    String sobrenome = "sobrenome";
    String nomeguerra = "nomeguerra";
    String senha = "senha";
    String situacao = "situacao";
    String postograduacao_id = "postograduacao_id";
    String grupoacesso_id = "grupoacesso_id";
    
    //Insert SQL
    private final String INSERT = "INSERT INTO " + tabela + "(" + idtmilitar + "," + nome + "," + sobrenome +  "," + nomeguerra + ","  + senha +  "," + situacao + "," + postograduacao_id + "," +grupoacesso_id + ")" +
                                  " VALUES(?,?,?,?,md5(?),?,?,?);";
    
    //Update SQL
    private final String UPDATE = "UPDATE " + tabela +
                                  " SET " + nome + "=?, " + sobrenome + "=?, " + nomeguerra + "=?, " + postograduacao_id + "=? " +
                                  "WHERE " + idtmilitar + "=?;";
    
    private final String UPDATESENHA = "UPDATE " + tabela +
                                  " SET " + senha + "=md5(?) " +
                                  "WHERE " + idtmilitar + "=?;";
    
    private final String UPDATESITUACAO = "UPDATE " + tabela +
                                  " SET " + situacao + "=? " +
                                  "WHERE " + idtmilitar + "=?;";
    
    private final String UPDATEGRUPOACESSO = "UPDATE " + tabela +
                                  " SET " + grupoacesso_id + "=? " +
                                  "WHERE " + idtmilitar + "=?;";
        
    //Delete SQL
    private final String DELETE = "DELETE FROM " + tabela + " WHERE " + idtmilitar + "=?;";
    
    //Consultas SQL
    
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    
    //Insert SQL
    public void insert(Usuario usu) {
        if (usu != null) {
            try {
                conn = Conexao.getConnection();
                
                pstm = conn.prepareStatement(INSERT);
                
                pstm.setString(1, usu.getIdtmilitar());
                pstm.setString(2, usu.getNome());
                pstm.setString(3, usu.getSobrenome());
                pstm.setString(4, usu.getNomeguerra());
                pstm.setString(5, usu.getSenha());
                pstm.setInt(6, usu.getSituacao());
                pstm.setInt(7, usu.getIdPGrad());
                pstm.setInt(8, usu.getIdGrupoAcesso());
                
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
    public void update(Usuario usu) {
        if (usu != null) {
            try {
                conn = Conexao.getConnection();
                pstm = conn.prepareStatement(UPDATE); 
                
                pstm.setString(1, usu.getNome());
                pstm.setString(2, usu.getSobrenome());
                pstm.setString(3, usu.getNomeguerra());
                pstm.setInt(4, usu.getIdPGrad());
                pstm.setString(5, usu.getIdtmilitar());
                
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
    public void updateSenha(String senha, String idtUsuario) {
        if (senha != "") {
            try {
                conn = Conexao.getConnection();
                pstm = conn.prepareStatement(UPDATESENHA); 
                
                pstm.setString(1, senha);
                pstm.setString(2, idtUsuario);
                
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
    public void updateGrupoAcesso(int grupoacesso_id, String idtUsuario) {
        if (grupoacesso_id >= 0) {
            try {
                conn = Conexao.getConnection();
                pstm = conn.prepareStatement(UPDATEGRUPOACESSO); 
                
                pstm.setInt(1, grupoacesso_id);
                pstm.setString(2, idtUsuario);
                
                pstm.execute();
                Conexao.fechaConexao(conn, pstm);

            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage());  
            }
        } else {            
            throw new RuntimeException();
        }
    }
    public void updateSituacao(int situacao, String idtUsuario) {
        if (situacao >= 0) {
            try {
                conn = Conexao.getConnection();
                pstm = conn.prepareStatement(UPDATESITUACAO); 
                
                pstm.setInt(1, situacao);
                pstm.setString(2, idtUsuario);
                
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
    public void delete(String idtmilitar) {
        if (!idtmilitar.equals("")){
            try {
                conn = Conexao.getConnection();
                pstm = conn.prepareStatement(DELETE);
                pstm.setString(1, idtmilitar);
            
                pstm.execute();
                Conexao.fechaConexao(conn, pstm);

            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage());  
            }
        } else {            
            throw new RuntimeException();
        }
    }
    
    private final String GETUSUARIOBYIDT = "SELECT * " +
                                            "FROM usuario " + 
                                            "WHERE idtmilitar = ?";
       
    public Usuario getUsuarioByIdentidade(String idtmilitar){
        Usuario usu = new Usuario();
        PostoGraduacaoDAO pgDAO = new PostoGraduacaoDAO();
        GrupoAcessoDAO grpacessoDAO = new GrupoAcessoDAO();
        try {
            conn = Conexao.getConnection();
            pstm = conn.prepareStatement(GETUSUARIOBYIDT);
            pstm.setString(1, idtmilitar);
           
            rs = pstm.executeQuery();
            while (rs.next()) {
                usu.setIdtmilitar(rs.getString("idtmilitar"));
                usu.setNome(rs.getString("nome"));
                usu.setSobrenome(rs.getString("sobrenome"));                         
                usu.setNomeguerra(rs.getString("nomeguerra"));            
                usu.setSenha(rs.getString("senha"));                        
                usu.setSituacao(rs.getInt("situacao"));                        
                
                PostoGraduacao pg = pgDAO.getPostoGraduacaoById(rs.getInt("postograduacao_id"));
                usu.setIdPGrad(pg.getId());
                usu.setDescricaoPGrad(pg.getDescricao());
                usu.setAbreviaturaPGrad(pg.getAbreviatura());
                
                GrupoAcesso grpacesso = grpacessoDAO.getGrupoAcessoById(rs.getInt("grupoacesso_id"));
                usu.setIdGrupoAcesso(grpacesso.getId());
                usu.setDescricaoGrupoAcesso(grpacesso.getDescricao());
            }
            Conexao.fechaConexao(conn, pstm, rs);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());           
        }
        return usu;
    }  
    
    private final String GETUSUARIOS = "SELECT * " +
                                        "FROM " + tabela;
       
    public ArrayList<Usuario> getUsuarios(){
        ArrayList<Usuario> usuarios = new ArrayList<>();  
        PostoGraduacaoDAO pgDAO = new PostoGraduacaoDAO();
        GrupoAcessoDAO grpacessoDAO = new GrupoAcessoDAO();
        try {
            conn = Conexao.getConnection();
            pstm = conn.prepareStatement(GETUSUARIOS);
           
            rs = pstm.executeQuery();
            while (rs.next()) {
                Usuario usu = new Usuario();
                
                usu.setIdtmilitar(rs.getString("idtmilitar"));
                usu.setNome(rs.getString("nome"));
                usu.setSobrenome(rs.getString("sobrenome"));                         
                usu.setNomeguerra(rs.getString("nomeguerra"));            
                usu.setSenha(rs.getString("senha"));     
                usu.setSituacao(rs.getInt("situacao"));   
                
                PostoGraduacao pg = pgDAO.getPostoGraduacaoById(rs.getInt("postograduacao_id"));
                usu.setIdPGrad(pg.getId());
                usu.setDescricaoPGrad(pg.getDescricao());
                usu.setAbreviaturaPGrad(pg.getAbreviatura());
                
                GrupoAcesso grpacesso = grpacessoDAO.getGrupoAcessoById(rs.getInt("grupoacesso_id"));
                usu.setIdGrupoAcesso(grpacesso.getId());
                usu.setDescricaoGrupoAcesso(grpacesso.getDescricao());
                
                usuarios.add(usu);
            }
            Conexao.fechaConexao(conn, pstm, rs);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());           
        }
        return usuarios;
    }
    private final String GETUSUARIOSATIVOS = "SELECT * " +
                                        "FROM " + tabela + " WHERE situacao = 1";
       
    public ArrayList<Usuario> getUsuariosAtivos(){
        ArrayList<Usuario> usuarios = new ArrayList<>();  
        PostoGraduacaoDAO pgDAO = new PostoGraduacaoDAO();
        GrupoAcessoDAO grpacessoDAO = new GrupoAcessoDAO();
        try {
            conn = Conexao.getConnection();
            pstm = conn.prepareStatement(GETUSUARIOSATIVOS);
           
            rs = pstm.executeQuery();
            while (rs.next()) {
                Usuario usu = new Usuario();
                
                usu.setIdtmilitar(rs.getString("idtmilitar"));
                usu.setNome(rs.getString("nome"));
                usu.setSobrenome(rs.getString("sobrenome"));                         
                usu.setNomeguerra(rs.getString("nomeguerra"));            
                usu.setSenha(rs.getString("senha"));     
                usu.setSituacao(rs.getInt("situacao"));   
                
                PostoGraduacao pg = pgDAO.getPostoGraduacaoById(rs.getInt("postograduacao_id"));
                usu.setIdPGrad(pg.getId());
                usu.setDescricaoPGrad(pg.getDescricao());
                usu.setAbreviaturaPGrad(pg.getAbreviatura());
                
                GrupoAcesso grpacesso = grpacessoDAO.getGrupoAcessoById(rs.getInt("grupoacesso_id"));
                usu.setIdGrupoAcesso(grpacesso.getId());
                usu.setDescricaoGrupoAcesso(grpacesso.getDescricao());
                
                usuarios.add(usu);
            }
            Conexao.fechaConexao(conn, pstm, rs);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());           
        }
        return usuarios;
    }
    private final String GETUSUARIOSINATIVOS = "SELECT * " +
                                        "FROM " + tabela + " WHERE situacao = 0";
       
    public ArrayList<Usuario> getUsuarioesInativos(){
        ArrayList<Usuario> usuarios = new ArrayList<>();  
        PostoGraduacaoDAO pgDAO = new PostoGraduacaoDAO();
        GrupoAcessoDAO grpacessoDAO = new GrupoAcessoDAO();
        try {
            conn = Conexao.getConnection();
            pstm = conn.prepareStatement(GETUSUARIOSINATIVOS);
           
            rs = pstm.executeQuery();
            while (rs.next()) {
                Usuario usu = new Usuario();
                
                usu.setIdtmilitar(rs.getString("idtmilitar"));
                usu.setNome(rs.getString("nome"));
                usu.setSobrenome(rs.getString("sobrenome"));                         
                usu.setNomeguerra(rs.getString("nomeguerra"));            
                usu.setSenha(rs.getString("senha"));     
                usu.setSituacao(rs.getInt("situacao"));   
                
                PostoGraduacao pg = pgDAO.getPostoGraduacaoById(rs.getInt("postograduacao_id"));
                usu.setIdPGrad(pg.getId());
                usu.setDescricaoPGrad(pg.getDescricao());
                usu.setAbreviaturaPGrad(pg.getAbreviatura());
                
                GrupoAcesso grpacesso = grpacessoDAO.getGrupoAcessoById(rs.getInt("grupoacesso_id"));
                usu.setIdGrupoAcesso(grpacesso.getId());
                usu.setDescricaoGrupoAcesso(grpacesso.getDescricao());
                
                usuarios.add(usu);
            }
            Conexao.fechaConexao(conn, pstm, rs);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());           
        }
        return usuarios;
    }
    
    private final static String GETUSUARIOBYIDTDWR = "SELECT * FROM usuario WHERE idtmilitar = ?";
       
    public static Usuario getUsuarioByIdentidadeDWR(String idtmilitar){
        PostoGraduacaoDAO pgDAO = new PostoGraduacaoDAO();
        GrupoAcessoDAO grpacessoDAO = new GrupoAcessoDAO();
        Usuario usu = new Usuario();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            conn = Conexao.getConnection();
            pstm = conn.prepareStatement(GETUSUARIOBYIDTDWR);
            pstm.setString(1, idtmilitar);
           
            rs = pstm.executeQuery();
            while (rs.next()) {       
                usu.setIdtmilitar(rs.getString("idtmilitar"));
                usu.setNome(rs.getString("nome"));
                usu.setSobrenome(rs.getString("sobrenome"));                         
                usu.setNomeguerra(rs.getString("nomeguerra"));            
                usu.setSenha(rs.getString("senha"));     
                usu.setSituacao(rs.getInt("situacao"));   
                
                PostoGraduacao pg = pgDAO.getPostoGraduacaoById(rs.getInt("postograduacao_id"));
                usu.setIdPGrad(pg.getId());
                usu.setDescricaoPGrad(pg.getDescricao());
                usu.setAbreviaturaPGrad(pg.getAbreviatura());
                
                GrupoAcesso grpacesso = grpacessoDAO.getGrupoAcessoById(rs.getInt("grupoacesso_id"));
                usu.setIdGrupoAcesso(grpacesso.getId());
                usu.setDescricaoGrupoAcesso(grpacesso.getDescricao());
            }
            Conexao.fechaConexao(conn, pstm, rs);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());           
        }
        return usu;
    }
    
    //Consultas SQL
    private final String GETIDTSENHA = "SELECT " + idtmilitar + "," + senha + " FROM " + tabela + " WHERE " + idtmilitar + "=? AND " + senha + "=md5(?)";
    private final String GETSENHA = "SELECT " + senha + " FROM " + tabela + " WHERE " + senha + "=md5(?)";
    private final String GETIDENTIDADE = "SELECT "+ idtmilitar + " FROM "+ tabela + " WHERE " + idtmilitar + "=?";
    
    //Validação de Login(Identidade) e senha
    public boolean validarLoginSenha(String idtmilitar, String senha) {
        try {
            conn = Conexao.getConnection();
            pstm = conn.prepareStatement(GETIDTSENHA);
            pstm.setString(1, idtmilitar);
            pstm.setString(2, senha);
            rs = pstm.executeQuery();
            while (rs.next()) {
                return true;
            }
            Conexao.fechaConexao(conn, pstm, rs);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());            
        }
        return false;
    }
    
    //Validação de Login(Identidade)
    public boolean validarLogin(String idtmilitar) {       
        try {
            conn = Conexao.getConnection();
            pstm = conn.prepareStatement(GETIDENTIDADE);
            pstm.setString(1, idtmilitar);
            
            rs = pstm.executeQuery();
            while (rs.next()) {
                return true;
            }
            Conexao.fechaConexao(conn, pstm, rs);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());            
        }
        return false;
    }
    
    //Validação de Senha
    public boolean validarSenha(String senha) {
        try {
            conn = Conexao.getConnection();
            pstm = conn.prepareStatement(GETSENHA);
            
            pstm.setString(1, senha);
            rs = pstm.executeQuery();
            while (rs.next()) {
                return true;
            }
            Conexao.fechaConexao(conn, pstm, rs);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());            
        }
        return false;
    }
    
    //Recupera os dodos do usuario que está logando
    public Usuario autenticacao(Usuario usu){
        Usuario usuRetorno = null;
        PostoGraduacaoDAO pgDAO = new PostoGraduacaoDAO();
        GrupoAcessoDAO grpacessoDAO = new GrupoAcessoDAO();
        if(usu != null){
            conn = null;
            try{
                conn = Conexao.getConnection();
                pstm = conn.prepareStatement(GETUSUARIOBYIDT);
                pstm.setString(1, usu.getIdtmilitar());
                
                rs = pstm.executeQuery();
                
                if(rs.next()){
                    usuRetorno = new Usuario();
                    
                    usuRetorno.setIdtmilitar(rs.getString("idtmilitar"));
                    usuRetorno.setNome(rs.getString("nome"));
                    usuRetorno.setSobrenome(rs.getString("sobrenome"));                         
                    usuRetorno.setNomeguerra(rs.getString("nomeguerra"));            
                    usuRetorno.setSenha(rs.getString("senha"));     
                    usuRetorno.setSituacao(rs.getInt("situacao"));   

                    PostoGraduacao pg = pgDAO.getPostoGraduacaoById(rs.getInt("postograduacao_id"));
                    usuRetorno.setIdPGrad(pg.getId());
                    usuRetorno.setDescricaoPGrad(pg.getDescricao());
                    usuRetorno.setAbreviaturaPGrad(pg.getAbreviatura());

                    GrupoAcesso grpacesso = grpacessoDAO.getGrupoAcessoById(rs.getInt("grupoacesso_id"));
                    usuRetorno.setIdGrupoAcesso(grpacesso.getId());
                    usuRetorno.setDescricaoGrupoAcesso(grpacesso.getDescricao());
                }
                
                Conexao.fechaConexao(conn, pstm, rs);
            }catch(SQLException e){
                throw new RuntimeException("Erro: " + e.getMessage());
            }
        }
        return usuRetorno;
    }
}
