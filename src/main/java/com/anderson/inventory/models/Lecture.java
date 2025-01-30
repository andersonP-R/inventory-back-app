package com.anderson.inventory.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Lecture extends BaseEntity {

    private String name;

    @ManyToOne
    @JoinColumn(name = "section_id") // Many lectures belong to One Section
    private Section section;

    @OneToOne
    @JoinColumn(name = "resource_id") // uni directional relationship. Lecture is the owner on this relationship
    private Resource resource;
}
