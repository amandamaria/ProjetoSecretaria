/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.secretaria.modelo;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Amanda
 */
@Entity
@Table(name = "taxa")
public class Taxa implements ModeloPersistencia {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Basic(optional = false)
    @Column(name = "valortaxa")
    private double valortaxa;
    @Basic(optional = false)
    @Column(name = "datavencimentotaxa")
    @Temporal(TemporalType.DATE)
    private Date datavencimentotaxa;
    @JoinColumn(name = "idprocesso", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Processo idprocesso;

    public Taxa() {
    }

    public Taxa(int id) {
        this.id = id;
    }

    public Taxa(int id, double valortaxa, Date datavencimentotaxa) {
        this.id = id;
        this.valortaxa = valortaxa;
        this.datavencimentotaxa = datavencimentotaxa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValortaxa() {
        return valortaxa;
    }

    public void setValortaxa(double valortaxa) {
        this.valortaxa = valortaxa;
    }

    public Date getDatavencimentotaxa() {
        return datavencimentotaxa;
    }

    public void setDatavencimentotaxa(Date datavencimentotaxa) {
        this.datavencimentotaxa = datavencimentotaxa;
    }

    public Processo getIdprocesso() {
        return idprocesso;
    }

    public void setIdprocesso(Processo idprocesso) {
        this.idprocesso = idprocesso;
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
        return "modelo.Taxa[ id=" + id + " ]";
    }
    
}
