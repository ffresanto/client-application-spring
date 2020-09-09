package io.github.ffresanto.cliente.model.repository;

import io.github.ffresanto.cliente.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
