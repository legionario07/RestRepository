package br.com.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.rest.model.Cliente;

@RepositoryRestResource
public interface ClienteRepository extends JpaRepository<Cliente, Long>, PagingAndSortingRepository<Cliente, Long>{

	Cliente findByNome(@Param(value = "nome") String nome);
	List<Cliente> findAllByOrderByNomeDesc();
	List<Cliente> findAllByOrderByNomeAsc();
	List<Cliente> findTop2ByOrderByNomeAsc();
	Cliente findByEnderecoContaining(@Param(value = "endereco") String endereco);
	Cliente findByCep(@Param(value = "cep") String cep);
	List<Cliente> findByNomeStartingWith(@Param(value = "nome") String nome);
	
	
	
}
