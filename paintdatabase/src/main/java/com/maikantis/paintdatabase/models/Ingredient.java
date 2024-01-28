package com.maikantis.paintdatabase.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Ingredient {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    // @ManyToMany(mappedBy = "indicatorList")
}
