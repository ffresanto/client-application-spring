package io.github.ffresanto.cliente.model.repository;

import io.github.ffresanto.cliente.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
