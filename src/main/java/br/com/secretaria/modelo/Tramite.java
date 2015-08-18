/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.secretaria.modelo;

import java.util.List;

import javax.persistence.Basic;
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
@Table(name = "tramite")
public class Tramite implements ModeloPersistencia {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @JoinColumn(name = "idfuncionario", referencedColumnName = "id")    
    @ManyToOne(optional = false)
    private Funcionario idfuncionario;
    
    @JoinColumn(name = "idprocesso", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Processo idprocesso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtramite")
    private List<Parecer> parecerList;

    public Tramite() {
    }

    public Tramite(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Funcionario getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Funcionario idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public Processo getIdprocesso() {
        return idprocesso;
    }

    public void setIdprocesso(Processo idprocesso) {
        this.idprocesso = idprocesso;
    }

    public List<Parecer> getParecerList() {
        return parecerList;
    }

    public void setParecerList(List<Parecer> parecerList) {
        this.parecerList = parecerList;
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
        return "modelo.Tramite[ id=" + id + " ]";
    }

}
