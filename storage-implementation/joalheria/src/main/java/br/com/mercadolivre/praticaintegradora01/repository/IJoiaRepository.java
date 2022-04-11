package br.com.mercadolivre.praticaintegradora01.repository;

import br.com.mercadolivre.praticaintegradora01.model.Joia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJoiaRepository extends JpaRepository<Joia, Long> {

}
