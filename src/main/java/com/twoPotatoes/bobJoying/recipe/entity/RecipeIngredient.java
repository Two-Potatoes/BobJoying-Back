package com.twoPotatoes.bobJoying.recipe.entity;

import org.hibernate.annotations.ColumnDefault;

import com.twoPotatoes.bobJoying.ingredient.entity.Ingredient;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecipeIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipeId")
    private Recipe recipe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ingredientId")
    private Ingredient ingredient;

    @Column(nullable = false)
    private Float quantity;

    @Column(length = 10, nullable = false)
    private String unit;

    @Column(nullable = false)
    @ColumnDefault("true")
    @Builder.Default
    private Boolean isMainIngredient = true;

}
