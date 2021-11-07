package ua.itea.bootformeat.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
    @NamedQuery(name = "UserEntity.checkUser", query = "SELECT user " +
        "FROM UserEntity user WHERE user.login=: login and user.password=: password")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "login", unique = true, nullable = false)
    private String login;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "region", nullable = false)
    private String region;

    @Column(name = "comment")
    private String comment;

    public UserEntity() {
    }

    public int getId() {
        return id;
    }

    public UserEntity setId(int id) {
        this.id = id;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public UserEntity setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public UserEntity setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public UserEntity setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public UserEntity setComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id && login.equals(that.login) && name.equals(that.name) && password.equals(that.password) && gender.equals(that.gender) && region.equals(that.region) && Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", region='" + region + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
