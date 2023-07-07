package br.atitus.turmaB.APIMercadorias.APIMercadorias.ServicesImpl;

import org.springframework.stereotype.Service;

import br.atitus.turmaB.APIMercadorias.APIMercadorias.Entities.Mercadoria;
import br.atitus.turmaB.APIMercadorias.APIMercadorias.Repositories.GenericRepository;
import br.atitus.turmaB.APIMercadorias.APIMercadorias.Repositories.MercadoriaRepository;
import br.atitus.turmaB.APIMercadorias.APIMercadorias.Services.MercadoriaService;

@Service
public class MercadoriaServiceImpl implements MercadoriaService{

	final MercadoriaRepository mercadoriaRepository;
	public MercadoriaServiceImpl(MercadoriaRepository mercadoriaRepository) {
		super();
		this.mercadoriaRepository = mercadoriaRepository;
	}

	@Override
	public GenericRepository<Mercadoria> getRepository() {
		return mercadoriaRepository;
	}
}