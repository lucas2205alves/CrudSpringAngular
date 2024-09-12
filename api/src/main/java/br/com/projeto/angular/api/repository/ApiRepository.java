package br.com.projeto.angular.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.angular.api.entity.Cliente;

@Repository
public interface ApiRepository extends CrudRepository<Cliente, Long>{

     
}
