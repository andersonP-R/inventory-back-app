package com.anderson.inventory.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Author extends BaseEntity{
    //@Id
    //@GeneratedValue
    //types of generation id values
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_gen")
    //@SequenceGenerator(name = "author_seq", sequenceName = "author_seq", allocationSize = 1)
    //@TableGenerator(name = "author_id_gen", table = "id_generator", pkColumnName = "id_name", pkColumnValue = "id_value", allocationSize = 1)
    //private Integer id;

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

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
