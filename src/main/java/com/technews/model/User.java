package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitialize","handler"})
@Table (name= "user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    @Column(unique = true)
    private String email;
    private String password;
    @Transient
    boolean loggedIn;

    @OneToMany(mappedBy = "userId",cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Post> posts;
    @OneToMany(mappedBy = "userId",cascade = CascadeType.All,fetch = FetchType.LAZY)
    private List<Vote> votes;
    private List<Comment> comments;

}
