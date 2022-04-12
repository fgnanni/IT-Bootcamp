package br.com.mercadolivre.praticaintegradora01.repository;

import br.com.mercadolivre.praticaintegradora01.model.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface ITestCaseRepository extends JpaRepository<TestCase, Long> {

    List<TestCase> findByLastUpdate(LocalDate date);

}
