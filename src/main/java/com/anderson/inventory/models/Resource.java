package com.anderson.inventory.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // join all props from parent class (Resource) into Video table
// or whatever table that we use
//@Inheritance(strategy = InheritanceType.JOINED) to join queries into a single one
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) join all values tables child in a single table (Resource table)
//@DiscriminatorColumn(name = "resource_type") join all values tables child in a single table (Resource table)
public class Resource {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int size;
    private String url;

    @OneToOne
    @JoinColumn(name = "lecture_id") // bidirectional relationship
    private Lecture lecture;
}
