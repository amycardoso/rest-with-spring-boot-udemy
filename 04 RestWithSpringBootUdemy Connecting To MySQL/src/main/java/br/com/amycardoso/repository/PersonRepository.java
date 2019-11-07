package br.com.amycardoso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.amycardoso.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}