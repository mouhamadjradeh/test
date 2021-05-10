package me.ideatolife.demo.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
@Getter
@NoArgsConstructor
@Setter
@Entity
public class AppUser {
    @SequenceGenerator(name="user_sequence_generator",
            sequenceName ="user_sequence",allocationSize = 1)
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator =
     "user_sequence_generator")
    private Long Id;
    private String profile_pic;
    @Column(length=100)
    private String username;
    @Column(length=200,nullable = false)
    private String full_name;
    @Column(length=100,unique = true)
    private String email;
   @Column(length=250)
   private String password;
    @Column(length=50)
    private String position;
    @Column(length=50,nullable = false)
    private String role;
    private boolean active=false;
    @Column(length=100)
    private String jwt_sign;
    @Column(length=100)
    private String reset_token;
    private Timestamp reset_expiry;
    private Timestamp last_synced_at;
    private Timestamp created_at;
    private Timestamp updated_at;

    public AppUser(Long id, String profile_pic, String username, String full_name, String email, String password, String position, String role, boolean active, String jwt_sign, String reset_token, Timestamp reset_expiry,
                   Timestamp last_synced_at, Timestamp created_at, Timestamp updated_at) {
        Id = id;
        this.profile_pic = profile_pic;
        this.username = username;
        this.full_name = full_name;
        this.email = email;
        this.password = password;
        this.position = position;
        this.role = role;
        this.active = active;
        this.jwt_sign = jwt_sign;
        this.reset_token = reset_token;
        this.reset_expiry = reset_expiry;
        this.last_synced_at = last_synced_at;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public AppUser(String profile_pic, String username, String full_name,
                   String email, String password, String position, String role,
                   boolean active, String jwt_sign, String reset_token,
                   Timestamp reset_expiry,
                   Timestamp last_synced_at, Timestamp created_at,
                   Timestamp updated_at) {
        this.profile_pic = profile_pic;
        this.username = username;
        this.full_name = full_name;
        this.email = email;
        this.password = password;
        this.position = position;
        this.role = role;
        this.active = active;
        this.jwt_sign = jwt_sign;
        this.reset_token = reset_token;
        this.reset_expiry = reset_expiry;
        this.last_synced_at = last_synced_at;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
}
