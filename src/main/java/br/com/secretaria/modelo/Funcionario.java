/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.secretaria.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Amanda
 */
@Entity
@Table(name = "funcionario")
public class Funcionario implements ModeloPersistencia {
    private static final long serialVersionUID = 1L;
    @Id    
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Column(name = "nome")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idfuncionario")
    private List<Tramite> tramiteList;
    @JoinColumn(name = "idsetor", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Setor idsetor;

    public Funcionario() {
    }

    public Funcionario(int id) {
        this.id = id;
    }

    public Funcionario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Tramite> getTramiteList() {
        return tramiteList;
    }

    public void setTramiteList(List<Tramite> tramiteList) {
        this.tramiteList = tramiteList;
    }

    public Setor getIdsetor() {
        return idsetor;
    }

    public void setIdsetor(Setor idsetor) {
        this.idsetor = idsetor;
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
        return "modelo.Funcionario[ id=" + id + " ]";
    }
    
}
