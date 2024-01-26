/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author joelmir
 */
public class Fornecedor extends PessoaJuridica{
    private String produto;
    private String Codigo;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
