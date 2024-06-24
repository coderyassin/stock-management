package org.yascode.stock_management.model;

import jakarta.persistence.*;
import lombok.*;
import org.yascode.stock_management.util.enums.SourceMvtStk;
import org.yascode.stock_management.util.enums.TypeMvtStk;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mvt_stk")
@Builder
public class MvtStk extends AbstractEntity {
    @Column(name = "datemvt")
    private Instant dateMvt;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    @Column(name = "type_mvt")
    @Enumerated(EnumType.STRING)
    private TypeMvtStk typeMvt;

    @Column(name = "sourcemvt")
    @Enumerated(EnumType.STRING)
    private SourceMvtStk sourceMvt;

    @ManyToOne
    @JoinColumn(name = "entreprise_id")
    private Entreprise entreprise;
}