package com.aluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aluno.domain.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
