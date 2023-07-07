package br.atitus.turmaB.APIMercadorias.APIMercadorias.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.atitus.turmaB.APIMercadorias.APIMercadorias.Entities.Pedido;
import br.atitus.turmaB.APIMercadorias.APIMercadorias.Services.GenericService;
import br.atitus.turmaB.APIMercadorias.APIMercadorias.Services.PedidoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pedidos")
public class PedidoController extends GenericController<Pedido> {
	
	final PedidoService pedidoService;
	public PedidoController(PedidoService pedidoService) {
		super();
		this.pedidoService = pedidoService;
	}
	
	@Override
	GenericService<Pedido> getService() {
		return pedidoService;
	}
}