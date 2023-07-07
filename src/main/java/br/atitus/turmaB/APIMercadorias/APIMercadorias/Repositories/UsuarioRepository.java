package br.atitus.turmaB.APIMercadorias.APIMercadorias.Repositories;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.atitus.turmaB.APIMercadorias.APIMercadorias.Entities.Usuario;

@Repository
public interface UsuarioRepository extends GenericRepository<Usuario>{
	
	Optional<Usuario> findByEmail(String email);
}