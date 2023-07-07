package br.atitus.turmaB.APIMercadorias.APIMercadorias.Repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import br.atitus.turmaB.APIMercadorias.APIMercadorias.Entities.GenericEntity;

@NoRepositoryBean
public interface GenericRepository<TEntidade extends GenericEntity> extends JpaRepository<TEntidade, Long> {
	Page<TEntidade> findByNomeContainingIgnoreCase(Pageable pageable, String nome);
	
}