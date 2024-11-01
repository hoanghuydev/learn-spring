package com.example.learn_sping.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity //Cho spring biết đây là 1 table
@Table(name = "User") //Name of table
@Getter
@Setter
public class User {
    @Id //Anotation define for id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Increase id, if we use UUID,it will create random id
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @ManyToMany(mappedBy = "participants")
    private Set<Conversation> conversations = new HashSet<>();

}
