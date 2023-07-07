package br.atitus.turmaB.APIMercadorias.APIMercadorias.Services;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.atitus.turmaB.APIMercadorias.APIMercadorias.Entities.Usuario;

public interface UsuarioService extends GenericService<Usuario>, UserDetailsService {

}