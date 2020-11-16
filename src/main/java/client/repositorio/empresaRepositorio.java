package client.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import client.modelo.Empresa;

@Repository
public interface empresaRepositorio extends JpaRepository<Empresa, Long>{

}
