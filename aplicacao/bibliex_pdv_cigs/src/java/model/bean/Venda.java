/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.sql.Date;

/**
 *
 * @author STI
 */
public class Venda {
    private int id;
    private Date data;
    private double valor;
    
    private final Cliente cli = new Cliente();
    private final Usuario usu = new Usuario();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    //Cliente
    public String getCpfCliente() {
        return cli.getCpf();
    }

    public void setCpfCliente(String cpf) {
        cli.setCpf(cpf);
    }

    public String getNomeCliente() {
        return cli.getNome();
    }

    public void setNomeCliente(String nome) {
        cli.setNome(nome);
    }

    public String getSobrenomeCliente() {
        return cli.getSobrenome();
    }

    public void setSobrenomeCliente(String sobrenome) {
        cli.setSobrenome(sobrenome);
    }

    public String getFoneCliente() {
        return cli.getFone();
    }

    public void setFoneCliente(String fone) {
        cli.setFone(fone);
    }
    
    //Usuario
    public String getIdtmilitarUsuario() {
        return usu.getIdtmilitar();
    }

    public void setIdtmilitarUsuario(String idtmilitar) {
        usu.setIdtmilitar(idtmilitar);
    }

    public String getNomeUsuario() {
        return usu.getNome();
    }

    public void setNomeUsuario(String nome) {
        usu.setNome(nome);
    }

    public String getSobrenomeUsuario() {
        return usu.getSobrenome();
    }

    public void setSobrenomeUsuario(String sobrenome) {
        usu.setSobrenome(sobrenome);
    }

    public String getNomeguerraUsuario() {
        return usu.getNomeguerra();
    }

    public void setNomeguerraUsuario(String nomeguerra) {
        usu.setNomeguerra(nomeguerra);
    }

    public String getSenhaUsuario() {
        return usu.getSenha();
    }

    public void setSenhaUsuario(String senha) {
        usu.setSenha(senha);
    }
    
    public int getIdPGradUsuario() {
        return usu.getIdPGrad();
    }

    public void setIdPGradUsuario(int id) {
        usu.setIdPGrad(id);
    }

    public String getDescricaoPGradUsuario() {
        return usu.getDescricaoPGrad();
    }

    public void setDescricaoPGradUsuario(String descricao) {
        usu.setDescricaoPGrad(descricao);
    }

    public String getAbreviaturaPGradUsuario() {
        return usu.getAbreviaturaPGrad();
    }

    public void setAbreviaturaPGradUsuario(String abreviatura) {
        usu.setAbreviaturaPGrad(abreviatura);
    }
}
