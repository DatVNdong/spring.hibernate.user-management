package springboot.hibernate.crud.user.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "service")
public class Serv implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_service", nullable = false)
    private int idService;
    @Column(name = "name_service", nullable = false)
    private String nameService;

    public Serv() {
        super();
    }

    public Serv(int idService, String nameService) {
        super();
        this.idService = idService;
        this.nameService = nameService;
    }

    public int getIdService() {
        return idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

}
