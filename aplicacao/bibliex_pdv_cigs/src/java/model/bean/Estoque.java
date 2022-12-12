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
public class Estoque {
    private int qtdeLivro;
    
    private final Livro l = new Livro();
    
    public int getIdLivro() {
        return l.getId();
    }

    public void setIdLivro(int id) {
        l.setId(id);
    }

    public int getEditorialLivro() {
        return l.getEditorial();
    }

    public void setEditorialLivro(int editorial) {
        l.setEditorial(editorial);
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

    public double getPreco() {
        return l.getPreco();
    }

    public void setPreco(double preco) {
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
