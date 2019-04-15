package spring.hibernate.user.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "user")
public class User implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    @Transient
    private List<Integer> listServices;
    @Transient
    private String services;
    @Transient
    private List<Integer> listTypes;
    @Transient
    private String types;
    @Column(name = "company", nullable = false)
    private int company;
    @Column(name = "branch")
    private int branch;
    @Column(name = "team")
    private int team;
    @Column(name = "user_id", nullable = false)
    private String userId;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;

    public User() {

    }

    public User(int id, int company, int branch, int team, String userId, String username, String password) {
        super();
        this.id = id;
        this.company = company;
        this.branch = branch;
        this.team = team;
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public int getBranch() {
        return branch;
    }

    public int getCompany() {
        return company;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getListServices() {
        return listServices;
    }

    public List<Integer> getListTypes() {
        return listTypes;
    }

    public String getPassword() {
        return password;
    }

    public String getServices() {
        return services;
    }

    public int getTeam() {
        return team;
    }

    public String getTypes() {
        return types;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public void setCompany(int company) {
        this.company = company;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListServices(List<Integer> listServices) {
        this.listServices = listServices;
    }

    public void setListTypes(List<Integer> listTypes) {
        this.listTypes = listTypes;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        String result = "{ " + String.valueOf(this.id) + ", " + String.valueOf(this.company) + ", "
                + String.valueOf(this.branch) + ", " + String.valueOf(this.team) + ", " + this.userId + ", "
                + this.username + ", " + this.password + " }";
        return result;
    }
}
