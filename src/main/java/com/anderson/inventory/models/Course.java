package com.anderson.inventory.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Course extends BaseEntity {

    private String title;
    private String description;

    // define which entity should be the owner of the other one. In this case the owner entity is Course so
    // on the other inverse table (table with inverse relationship to this table) it should be marked as
    // "mappeBy"
    @ManyToMany
    @JoinTable(
            name = "authors_courses", // join table between both Authors and Courses tables
            joinColumns = {
                    @JoinColumn(name = "course_id") // the pk of the owner relationship (Course id)
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "author_id") // this hold the inverse relation table pk (Author id)
            }
    )
    private List<Author> authors;

    @OneToMany(mappedBy = "course") // One Course has Many Sections (OneToMany relationship)
    private List<Section> sections;
}
