package br.atitus.turmaB.APIMercadorias.APIMercadorias.ServicesImpl;

import org.springframework.stereotype.Service;

import br.atitus.turmaB.APIMercadorias.APIMercadorias.Repositories.PedidoRepository;
import br.atitus.turmaB.APIMercadorias.APIMercadorias.Services.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService{

	final PedidoRepository pedidoRepository;
	public PedidoServiceImpl(PedidoRepository pedidoRepository) {
		super();
		this.pedidoRepository = pedidoRepository;
	}
	
	@Override
	public PedidoRepository getRepository() {
		return pedidoRepository;
	}
}