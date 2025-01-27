package com.anderson.inventory.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Author {
    @Id
    @GeneratedValue
    //types of generation id values
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_gen")
    //@SequenceGenerator(name = "author_seq", sequenceName = "author_seq", allocationSize = 1)
    //@TableGenerator(name = "author_id_gen", table = "id_generator", pkColumnName = "id_name", pkColumnValue = "id_value", allocationSize = 1)
    private Integer id;

    @Column(name = "f_name")
    private String firstName;

    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;
    private int age;

    @Column(updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @Column(insertable = false)
    private LocalDateTime lastModified;
}
