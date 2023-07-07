package br.atitus.turmaB.APIMercadorias.APIMercadorias.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.atitus.turmaB.APIMercadorias.APIMercadorias.Entities.Mercadoria;
import br.atitus.turmaB.APIMercadorias.APIMercadorias.Services.GenericService;
import br.atitus.turmaB.APIMercadorias.APIMercadorias.Services.MercadoriaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/mercadorias")
public class MercadoriaController extends GenericController<Mercadoria> {
	
	final MercadoriaService mercadoriaService;
	public MercadoriaController(MercadoriaService mercadoriaService) {
		super();
		this.mercadoriaService = mercadoriaService;
	}
	
	@Override
	GenericService<Mercadoria> getService() {
		return mercadoriaService;
	}
}