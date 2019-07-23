/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thewineproject.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author George
 */
@Entity
@Table(name="product",catalog = "SPLLOK", schema = "")
@XmlRootElement
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer pid;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private int pyear;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(nullable = false, length = 50)
    private String pname;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private int psize;
    @Size(max = 10)
    @Column(length = 10)
    private String pdryness;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private int palcohol;
    @Size(max = 500)
    @Column(length = 500)
    private String pdescr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22, scale = 0)
    private Double pprice;
    @Size(max = 50)
    @Column(length = 50)
    private String pcompany;
    @Size(max = 255)
    @Column(length = 255)
    private String image;
    @JoinColumn(name = "vid", referencedColumnName = "vid")
    @ManyToOne()
    private Variety vid;
    @JoinColumn(name = "clid", referencedColumnName = "clid")
    @ManyToOne()
    private Colour clid;
    @JoinColumn(name = "cid", referencedColumnName = "cid")
    @ManyToOne()
    private Country cid;

    public Product() {
    }

    public Product(Integer pid) {
        this.pid = pid;
    }

    public Product(Integer pid, int pyear, String pname, int psize, int palcohol, String image) {
        this.pid = pid;
        this.pyear = pyear;
        this.pname = pname;
        this.psize = psize;
        this.palcohol = palcohol;
        this.image = image;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public int getPyear() {
        return pyear;
    }

    public void setPyear(int pyear) {
        this.pyear = pyear;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPsize() {
        return psize;
    }

    public void setPsize(int psize) {
        this.psize = psize;
    }

    public String getPdryness() {
        return pdryness;
    }

    public void setPdryness(String pdryness) {
        this.pdryness = pdryness;
    }

    public int getPalcohol() {
        return palcohol;
    }

    public void setPalcohol(int palcohol) {
        this.palcohol = palcohol;
    }

    public String getPdescr() {
        return pdescr;
    }

    public void setPdescr(String pdescr) {
        this.pdescr = pdescr;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    

    public Double getPprice() {
        return pprice;
    }

    public void setPprice(Double pprice) {
        this.pprice = pprice;
    }

    public String getPcompany() {
        return pcompany;
    }

    public void setPcompany(String pcompany) {
        this.pcompany = pcompany;
    }

    public Variety getVid() {
        return vid;
    }

    public void setVid(Variety vid) {
        this.vid = vid;
    }

    public Colour getClid() {
        return clid;
    }

    public void setClid(Colour clid) {
        this.clid = clid;
       
    }

    public Country getCid() {
        return cid;
    }

    public void setCid(Country cid) {
        this.cid = cid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pid != null ? pid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.pid == null && other.pid != null) || (this.pid != null && !this.pid.equals(other.pid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.thewineproject.models.Product[ pid=" + pid + " ]";
    }
    
}
