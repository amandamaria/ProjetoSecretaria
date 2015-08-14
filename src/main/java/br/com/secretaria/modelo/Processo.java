/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.secretaria.modelo;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Amanda
 */
@Entity
@Table(name = "processo")
public class Processo implements ModeloPersistencia {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;
   
    @Column(name = "dataentrada")
    @Temporal(TemporalType.DATE)
    private Date dataentrada;
   
    @Column(name = "dataconclusao")
    @Temporal(TemporalType.DATE)
    private Date dataconclusao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idprocesso")
    private List<Taxa> taxaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idprocesso")
    private List<Tramite> tramiteList;
    @JoinColumn(name = "idcidadao", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cidadao idcidadao;
    @JoinColumn(name = "idsetor", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Setor idsetor;

    public Processo() {
    }

    public Processo(int id) {
        this.id = id;
    }

    public Processo(int id, Date dataentrada, Date dataconclusao) {
        this.id = id;
        this.dataentrada = dataentrada;
        this.dataconclusao = dataconclusao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataentrada() {
        return dataentrada;
    }

    public void setDataentrada(Date dataentrada) {
        this.dataentrada = dataentrada;
    }

    public Date getDataconclusao() {
        return dataconclusao;
    }

    public void setDataconclusao(Date dataconclusao) {
        this.dataconclusao = dataconclusao;
    }

    public List<Taxa> getTaxaList() {
        return taxaList;
    }

    public void setTaxaList(List<Taxa> taxaList) {
        this.taxaList = taxaList;
    }

    public List<Tramite> getTramiteList() {
        return tramiteList;
    }

    public void setTramiteList(List<Tramite> tramiteList) {
        this.tramiteList = tramiteList;
    }

    public Cidadao getIdcidadao() {
        return idcidadao;
    }

    public void setIdcidadao(Cidadao idcidadao) {
        this.idcidadao = idcidadao;
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
        return "modelo.Processo[ id=" + id + " ]";
    }
    
}
