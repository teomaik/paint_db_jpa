package com.maikantis.paintdatabase.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
//@Table(name = "PAINT_TB")
public class Paint {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(
            unique = true,
            nullable = false
    )
    private String name;

    @Column(
            nullable = false,
            updatable = false
    )
    private Double specialWeight;

//    private Double base_price;
//
//    @Column(
//            nullable = false,
//            updatable = false
//    )
//    private LocalDateTime createdAt;
//
//    @Column(
//            insertable = false
//    )
//    private LocalDateTime lastModified;
//    private List<Ingredient> ingredientList;

}
