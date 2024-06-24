package org.yascode.stock_management.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categories")
@Builder
public class Category extends AbstractEntity {
    @Column(name = "code")
    private String code;

    @Column(name = "designation")
    private String designation;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "entreprise_id", nullable = false)
    private Entreprise entreprise;

    @OneToMany(mappedBy = "category")
    private List<Article> articles;
}
