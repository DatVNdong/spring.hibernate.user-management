package spring.hibernate.user.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_service")
public class UserServ implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user_service", nullable = false)
    private int idUserService;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "id_service", nullable = false)
    private int idService;

    public UserServ() {
        super();
    }

    public UserServ(String username, int idService) {
        super();
        this.username = username;
        this.idService = idService;
    }

    public int getIdService() {
        return idService;
    }

    public int getIdUserService() {
        return idUserService;
    }

    public String getUsername() {
        return username;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public void setIdUserService(int idUserService) {
        this.idUserService = idUserService;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
