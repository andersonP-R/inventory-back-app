package com.anderson.inventory.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Section extends BaseEntity{


    private String name;
    private int sectionOrder;

    @ManyToOne // Many Sections belong to One Course (ManyToOne relationship)
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "section") // One Section has Many lectures
    private List<Lecture> lectures;
}
