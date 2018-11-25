/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Fabian
 */
public class mLogin {
    public int codUsuario,funcionarioPersonaCi;
    public String usuario,clave,categoria;

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public int getFuncionarioPersonaCi() {
        return funcionarioPersonaCi;
    }

    public void setFuncionarioPersonaCi(int funcionarioPersonaCi) {
        this.funcionarioPersonaCi = funcionarioPersonaCi;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
