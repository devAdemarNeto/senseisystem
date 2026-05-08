package dev.ademarneto.senseisystem.repository;

import dev.ademarneto.senseisystem.domain.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaMatriculaRepository extends JpaRepository<Matricula, Long> {
}
