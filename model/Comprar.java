/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/*
 *
 * @author joelmir
 */
public class Comprar {
    private String codigo;
    private String produto;
    private float valor;
    private int quantidade;
    private String nomeCliente;
    private String funcionario;
    private String datacompra;

    public String getDatacompra() {
        return datacompra;
    }

    public void setDatacompra(String datacompra) {
        this.datacompra = datacompra;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
}
