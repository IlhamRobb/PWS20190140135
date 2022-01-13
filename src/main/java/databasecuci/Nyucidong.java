/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databasecuci;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author IlhamRobbS
 */
@Entity
@Table(name = "nyucidong")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nyucidong.findAll", query = "SELECT n FROM Nyucidong n"),
    @NamedQuery(name = "Nyucidong.findById", query = "SELECT n FROM Nyucidong n WHERE n.id = :id"),
    @NamedQuery(name = "Nyucidong.findByJenisKendaraan", query = "SELECT n FROM Nyucidong n WHERE n.jenisKendaraan = :jenisKendaraan"),
    @NamedQuery(name = "Nyucidong.findByMerkKendaraan", query = "SELECT n FROM Nyucidong n WHERE n.merkKendaraan = :merkKendaraan"),
    @NamedQuery(name = "Nyucidong.findByNomorKendaraan", query = "SELECT n FROM Nyucidong n WHERE n.nomorKendaraan = :nomorKendaraan")})
public class Nyucidong implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "jenis_kendaraan")
    private String jenisKendaraan;
    @Column(name = "merk_kendaraan")
    private String merkKendaraan;
    @Column(name = "nomor_kendaraan")
    private String nomorKendaraan;

    public Nyucidong() {
    }

    public Nyucidong(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getMerkKendaraan() {
        return merkKendaraan;
    }

    public void setMerkKendaraan(String merkKendaraan) {
        this.merkKendaraan = merkKendaraan;
    }

    public String getNomorKendaraan() {
        return nomorKendaraan;
    }

    public void setNomorKendaraan(String nomorKendaraan) {
        this.nomorKendaraan = nomorKendaraan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nyucidong)) {
            return false;
        }
        Nyucidong other = (Nyucidong) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "databasecuci.Nyucidong[ id=" + id + " ]";
    }
    
}
