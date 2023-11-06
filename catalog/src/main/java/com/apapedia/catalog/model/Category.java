package com.apapedia.catalog.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category")
@JsonIgnoreProperties(value = {"listCatalog"}, allowSetters = true)
public class Category {
    @Id
    private UUID id = UUID.randomUUID();

    @NotNull
    @NotBlank
    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "categoryId", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Catalog> listCatalog = new ArrayList<>();
}
