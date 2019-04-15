package springboot.hibernate.crud.user.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_type")
public class UserType implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user_type", nullable = false)
    private int idUserType;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "id_type", nullable = false)
    private int idType;

    public UserType() {
        super();
    }

    public UserType(String username, int idType) {
        super();
        this.username = username;
        this.idType = idType;
    }

    public int getIdType() {
        return idType;
    }

    public int getIdUserType() {
        return idUserType;
    }

    public String getUsername() {
        return username;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public void setIdUserType(int idUserType) {
        this.idUserType = idUserType;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
