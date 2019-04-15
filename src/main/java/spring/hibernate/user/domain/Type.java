package spring.hibernate.user.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "type")
public class Type implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_type", nullable = false)
    private int idType;
    @Column(name = "name_type", nullable = false)
    private String nameType;
    
    public Type() {
        super();
    }
    
    public Type(int idType, String nameType) {
        super();
        this.idType = idType;
        this.nameType = nameType;
    }
    
    public int getIdType() {
        return idType;
    }
    
    public String getNameType() {
        return nameType;
    }
    
    public void setIdType(int idType) {
        this.idType = idType;
    }
    
    public void setNameType(String nameType) {
        this.nameType = nameType;
    }
}
