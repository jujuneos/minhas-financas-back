package com.portfolio.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
}
