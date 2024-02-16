package com.twoPotatoes.bobJoying.recipe.entity;

import java.util.ArrayList;
import java.util.List;

import com.twoPotatoes.bobJoying.foodRequest.entity.FoodRequest;
import com.twoPotatoes.bobJoying.user.entity.Member;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "memberId")
    private Member member;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String recipe;

    private Integer calorie;

    @Builder.Default
    @OneToMany(mappedBy = "recipe", cascade = CascadeType.REMOVE)
    private List<RecipeIngredient> recipeIngredientList = new ArrayList<>();

    @Builder.Default
    @OneToMany(mappedBy = "recipe", cascade = CascadeType.REMOVE)
    private List<RecipeLink> recipeLinkList = new ArrayList<>();

    @Builder.Default
    @OneToMany(mappedBy = "recipe")
    private List<FoodRequest> foodRequestList = new ArrayList<>();
}
