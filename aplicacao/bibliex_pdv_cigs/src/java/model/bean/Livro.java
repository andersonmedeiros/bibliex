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
public class Livro {
    private int id, editorial, qtdePaginas;
    private String isbn, titulo, autor;
    private double preco;
    
    private final DimensaoLivro dl = new DimensaoLivro();
    private final Editora ed = new Editora();
    private final Colecao col = new Colecao();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEditorial() {
        return editorial;
    }

    public void setEditorial(int editorial) {
        this.editorial = editorial;
    }

    public int getQtdePaginas() {
        return qtdePaginas;
    }

    public void setQtdePaginas(int qtdePaginas) {
        this.qtdePaginas = qtdePaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    //Dimensão Livro
    public int getIdDimensaoLivro() {
        return dl.getId();
    }

    public void setIdDimensaoLivro(int id) {
        dl.setId(id);
    }

    public double getLarguraDimensaoLivro() {
        return dl.getLargura();
    }

    public void setLarguraDimensaoLivro(double largura) {
        dl.setLargura(largura);
    }

    public double getEspessuraDimensaoLivro() {
        return dl.getEspessura();
    }

    public void setEspessuraDimensaoLivro(double espessura) {
        dl.setEspessura(espessura);
    }

    public double getAlturaDimensaoLivro() {
        return dl.getAltura();
    }

    public void setAlturaDimensaoLivro(double altura) {
        dl.setAltura(altura);
    }

    public double getPesoDimensaoLivro() {
        return dl.getPeso();
    }

    public void setPesoDimensaoLivro(double peso) {
        dl.setPeso(peso);
    }
    
    //Editora
    public int getIdEditora() {
        return ed.getId();
    }

    public void setIdEditora(int id) {
        ed.setId(id);
    }

    public String getDescricaoEditora() {
        return ed.getDescricao();
    }

    public void setDescricaoEditora(String descricao) {
        ed.setDescricao(descricao);
    }
    
    //Coleção
    public int getIdColecao() {
        return col.getId();
    }

    public void setIdColecao(int id) {
        col.setId(id);
    }

    public String getDescricaoColecao() {
        return col.getDescricao();
    }

    public void setDescricaoColecao(String descricao) {
        col.setDescricao(descricao);
    }
}
