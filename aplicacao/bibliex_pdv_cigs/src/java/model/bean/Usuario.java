/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author STI
 */
public class Usuario {
    private String idtmilitar, nome, sobrenome, nomeguerra, senha;
    
    private final PostoGraduacao pg = new PostoGraduacao();

    public String getIdtmilitar() {
        return idtmilitar;
    }

    public void setIdtmilitar(String idtmilitar) {
        this.idtmilitar = idtmilitar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeguerra() {
        return nomeguerra;
    }

    public void setNomeguerra(String nomeguerra) {
        this.nomeguerra = nomeguerra;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public int getIdPGrad() {
        return pg.getId();
    }

    public void setIdPGrad(int id) {
        pg.setId(id);
    }

    public String getDescricaoPGrad() {
        return pg.getDescricao();
    }

    public void setDescricaoPGrad(String descricao) {
        pg.setDescricao(descricao);
    }

    public String getAbreviaturaPGrad() {
        return pg.getAbreviatura();
    }

    public void setAbreviaturaPGrad(String abreviatura) {
        pg.setAbreviatura(abreviatura);
    }
}
