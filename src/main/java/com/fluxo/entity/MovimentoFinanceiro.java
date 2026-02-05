package com.fluxo.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fluxo.enums.TipoMovimento;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "movimento_financeiro")
public class MovimentoFinanceiro {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column
    private String descricao;

    @Column
    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_movimento")
    private TipoMovimento tipo;

    @Column(name="data_movimento")
    private LocalDateTime data;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable=false)
    private Usuario usuario;


}
