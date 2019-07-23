/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thewineproject.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author George
 */
@Entity
@Table(name="colour",catalog = "SPLLOK", schema = "")
@XmlRootElement

public class Colour implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer clid;
    @Size(max = 50)
    @Column(length = 50)
    private String cldescr;
    @OneToMany(mappedBy = "clid", fetch = FetchType.LAZY)
    private List<Product> productList;

    public Colour() {
    }

    public Colour(Integer clid) {
        this.clid = clid;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public String getCldescr() {
        return cldescr;
    }

    public void setCldescr(String cldescr) {
        this.cldescr = cldescr;
    }

    @XmlTransient
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clid != null ? clid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colour)) {
            return false;
        }
        Colour other = (Colour) object;
        if ((this.clid == null && other.clid != null) || (this.clid != null && !this.clid.equals(other.clid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.thewineproject.models.Colour[ clid=" + clid + " ]";
    }
    
}
