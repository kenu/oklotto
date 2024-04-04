package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LottoRepository extends JpaRepository<LottoRow, Long> {
}
