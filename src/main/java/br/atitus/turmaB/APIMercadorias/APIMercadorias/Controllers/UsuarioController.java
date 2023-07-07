package br.atitus.turmaB.APIMercadorias.APIMercadorias.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.atitus.turmaB.APIMercadorias.APIMercadorias.Entities.Usuario;
import br.atitus.turmaB.APIMercadorias.APIMercadorias.Services.GenericService;
import br.atitus.turmaB.APIMercadorias.APIMercadorias.Services.UsuarioService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuarios")
public class UsuarioController extends GenericController<Usuario>{
	
	final UsuarioService usuarioService;
	public UsuarioController(UsuarioService ususarioService) {
		super();
		this.usuarioService = ususarioService;
	}
	
	@Override
	GenericService<Usuario> getService() {
		return usuarioService;
	}
}