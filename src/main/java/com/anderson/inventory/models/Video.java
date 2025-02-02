package com.anderson.inventory.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
// @PrimaryKeyJoinColumn(name = "video_id") create custom pk name. Useful when we don't want to use the default pk
// name of the parent class (Resource) which is id in this case
//@DiscriminatorValue("V")
public class Video extends Resource {
    private int length;
}
