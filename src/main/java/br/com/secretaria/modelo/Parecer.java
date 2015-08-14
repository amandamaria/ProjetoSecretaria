/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.secretaria.modelo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Amanda
 */
@Entity
@Table(name = "parecer")
public class Parecer implements ModeloPersistencia {
	
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Basic(optional = false)
    @Column(name = "resultado")
    private String resultado;
    @JoinColumn(name = "idtramite", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Tramite idtramite;

    public Parecer() {
    }

    public Parecer(int id) {
        this.id = id;
    }

    public Parecer(int id, String resultado) {
        this.id = id;
        this.resultado = resultado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Tramite getIdtramite() {
        return idtramite;
    }

    public void setIdtramite(Tramite idtramite) {
        this.idtramite = idtramite;
    }
    
    @Override
    public int hashCode() {
    	// TODO Auto-generated method stub
    	return super.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
    	// TODO Auto-generated method stub
    	return super.equals(obj);
    }
    
    @Override
    public String toString() {
        return "modelo.Parecer[ id=" + id + " ]";
    }
    
}
