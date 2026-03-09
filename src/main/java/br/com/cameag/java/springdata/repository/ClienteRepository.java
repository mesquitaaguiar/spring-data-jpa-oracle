package br.com.cameag.java.springdata.repository;

import javax.persistence.LockModeType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import br.com.cameag.java.springdata.entity.Cliente;

@Repository
@Transactional(isolation=Isolation.READ_COMMITTED)
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    @Lock(LockModeType.OPTIMISTIC)
    @Query("select u from Cliente u where u.cliente_id = ?1")
    Cliente findByClienteId(Long customer_id);

    @Modifying
    @Query("delete from Cliente u where u.cliente_id = ?1")
    void deleteByClienteId(Long customer_id);
    
	/*
	 * @Procedure(name = "CURSO.get_tabela3") String functionGetNome(@Param("p_id")
	 * Integer id, @Param("l_name") String nome);
	 */
    
    @Query(value = "SELECT CURSO.get_tabela3(?1) FROM DUAL", nativeQuery = true)
    String callFunctionGetTabela3(Number param);
}
