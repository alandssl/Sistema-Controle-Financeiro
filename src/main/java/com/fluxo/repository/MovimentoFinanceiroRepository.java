package com.fluxo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fluxo.entity.MovimentoFinanceiro;


@Repository
public interface MovimentoFinanceiroRepository extends JpaRepository<MovimentoFinanceiro, Long> {

}
