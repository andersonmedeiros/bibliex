/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the litor.
 */
package model.bean;

import java.sql.Date;

/**
 *
 * @author STI
 */
public class ItemVendaLivro {
    private int qtde_item_livro;
    private double valor_item_livro;
    
    private final Venda v = new Venda();
    private final Livro l = new Livro();

    public int getQtde_item_livro() {
        return qtde_item_livro;
    }

    public void setQtde_item_livro(int qtde_item_livro) {
        this.qtde_item_livro = qtde_item_livro;
    }

    public double getValor_item_livro() {
        return valor_item_livro;
    }

    public void setValor_item_livro(double valor_item_livro) {
        this.valor_item_livro = valor_item_livro;
    }
    
    //Venda
    public int getIdVenda() {
        return v.getId();
    }

    public void setIdVenda(int id) {
        v.setId(id);
    }

    public Date getDataVenda() {
        return v.getData();
    }

    public void setDataVenda(Date data) {
        v.setData(data);
    }

    public double getValorVenda() {
        return v.getValor();
    }

    public void setValorVenda(double valor) {
        v.setValor(valor);
    }
    
    //Cliente
    public String getCpfCliente() {
        return v.getCpfCliente();
    }

    public void setCpfCliente(String cpf) {
        v.setCpfCliente(cpf);
    }

    public String getNomeCliente() {
        return v.getNomeCliente();
    }

    public void setNomeCliente(String nome) {
        v.setNomeCliente(nome);
    }

    public String getSobrenomeCliente() {
        return v.getSobrenomeCliente();
    }

    public void setSobrenomeCliente(String sobrenome) {
        v.setSobrenomeCliente(sobrenome);
    }

    public String getFoneCliente() {
        return v.getFoneCliente();
    }

    public void setFoneCliente(String fone) {
        v.setFoneCliente(fone);
    }
    
    //Usuario
    public String getIdtmilitarUsuario() {
        return v.getIdtmilitarUsuario();
    }

    public void setIdtmilitarUsuario(String idtmilitar) {
        v.setIdtmilitarUsuario(idtmilitar);
    }

    public String getNomeUsuario() {
        return v.getNomeUsuario();
    }

    public void setNomeUsuario(String nome) {
        v.setNomeUsuario(nome);
    }

    public String getSobrenomeUsuario() {
        return v.getSobrenomeUsuario();
    }

    public void setSobrenomeUsuario(String sobrenome) {
        v.setSobrenomeUsuario(sobrenome);
    }

    public String getNomeguerraUsuario() {
        return v.getNomeguerraUsuario();
    }

    public void setNomeguerraUsuario(String nomeguerra) {
        v.setNomeguerraUsuario(nomeguerra);
    }

    public String getSenhaUsuario() {
        return v.getSenhaUsuario();
    }

    public void setSenhaUsuario(String senha) {
        v.setSenhaUsuario(senha);
    }
    
    public int getIdPGradUsuario() {
        return v.getIdPGradUsuario();
    }

    public void setIdPGradUsuario(int id) {
        v.setIdPGradUsuario(id);
    }

    public String getDescricaoPGradUsuario() {
        return v.getDescricaoPGradUsuario();
    }

    public void setDescricaoPGradUsuario(String descricao) {
        v.setDescricaoPGradUsuario(descricao);
    }

    public String getAbreviaturaPGradUsuario() {
        return v.getAbreviaturaPGradUsuario();
    }

    public void setAbreviaturaPGradUsuario(String abreviatura) {
        v.setAbreviaturaPGradUsuario(abreviatura);
    }
    
    //Livro
    public int getIdLivro() {
        return l.getId();
    }

    public void setIdLivro(int id) {
        l.setId(id);
    }

    public int getEditorialLivro() {
        return l.getEditorial();
    }

    public void setEditorialLivro(int litorial) {
        l.setEditorial(litorial);
    }

    public int getQtdePaginasLivro() {
        return l.getQtdePaginas();
    }

    public void setQtdePaginasLivro(int qtdePaginas) {
        l.setQtdePaginas(qtdePaginas);
    }

    public String getIsbnLivro() {
        return l.getIsbn();
    }

    public void setIsbnLivro(String isbn) {
        l.setIsbn(isbn);
    }

    public String getTituloLivro() {
        return l.getTitulo();
    }

    public void setTituloLivro(String titulo) {
        l.setTitulo(titulo);
    }

    public String getAutorLivro() {
        return l.getAutor();
    }

    public void setAutorLivro(String autor) {
        l.setAutor(autor);
    }

    public double getPrecoLivro() {
        return l.getPreco();
    }

    public void setPrecoLivro(double preco) {
        l.setPreco(preco);
    }
    
    //Dimensão Livro
    public int getIdDimensaoLivro() {
        return l.getIdDimensaoLivro();
    }

    public void setIdDimensaoLivro(int id) {
        l.setIdDimensaoLivro(id);
    }

    public double getLarguraDimensaoLivro() {
        return l.getLarguraDimensaoLivro();
    }

    public void setLarguraDimensaoLivro(double largura) {
        l.setLarguraDimensaoLivro(largura);
    }

    public double getEspessuraDimensaoLivro() {
        return l.getEspessuraDimensaoLivro();
    }

    public void setEspessuraDimensaoLivro(double espessura) {
        l.setEspessuraDimensaoLivro(espessura);
    }

    public double getAlturaDimensaoLivro() {
        return l.getAlturaDimensaoLivro();
    }

    public void setAlturaDimensaoLivro(double altura) {
        l.setAlturaDimensaoLivro(altura);
    }

    public double getPesoDimensaoLivro() {
        return l.getPesoDimensaoLivro();
    }

    public void setPesoDimensaoLivro(double peso) {
        l.setPesoDimensaoLivro(peso);
    }
    
    //Editora
    public int getIdEditora() {
        return l.getIdEditora();
    }

    public void setIdEditora(int id) {
        l.setIdEditora(id);
    }

    public String getDescricaoEditora() {
        return l.getDescricaoEditora();
    }

    public void setDescricaoEditora(String descricao) {
        l.setDescricaoEditora(descricao);
    }
    
    //Coleção
    public int getIdColecao() {
        return l.getIdColecao();
    }

    public void setIdColecao(int id) {
        l.setIdColecao(id);
    }

    public String getDescricaoColecao() {
        return l.getDescricaoColecao();
    }

    public void setDescricaoColecao(String descricao) {
        l.setDescricaoColecao(descricao);
    }
        
}
