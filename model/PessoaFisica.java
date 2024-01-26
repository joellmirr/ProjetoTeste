/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author joelmir
 */
public class PessoaFisica extends Pessoa {
    private String NivelAscesso;
    private String Cpf;
    private String DataNascimento;
    private String Genero;
    private String EstadoCivil;
    private String Nacionalidade;
    private String Naturalidade;
    private String NomeSocial;
    private String Escolaridade;
    private String Etnia;

    public String getNomeSocial() {
        return NomeSocial;
    }

    public void setNomeSocial(String NomeSocial) {
        this.NomeSocial = NomeSocial;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getNaturalidade() {
        return Naturalidade;
    }

    public void setNaturalidade(String Naturalidade) {
        this.Naturalidade = Naturalidade;
    }

    public String getNivelAscesso() {
        return NivelAscesso;
    }

    public void setNivelAscesso(String Nivel) {
        this.NivelAscesso = Nivel;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }
    
    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }

    public String getEscolaridade() {
        return Escolaridade;
    }

    public void setEscolaridade(String Escolaridade) {
        this.Escolaridade = Escolaridade;
    }

    public String getEtnia() {
        return Etnia;
    }

    public void setEtnia(String Etnia) {
        this.Etnia = Etnia;
    }
}
