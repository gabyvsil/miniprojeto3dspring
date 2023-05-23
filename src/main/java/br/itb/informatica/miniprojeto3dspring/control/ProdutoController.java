package br.itb.informatica.miniprojeto3dspring.control;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itb.informatica.miniprojeto3dspring.service.ProdutoService;

@RestController
@CrossOrigin(origins="*", maxAge=3600, allowCredentials="false")
@RequestMapping("/produto")
public class ProdutoController {

	// Criar objeto de serviço
	final ProdutoService produtoService;
	
	//Construtor de injeção de dependência
	public ProdutoController (ProdutoService produtoService) {
		super();
		this.produtoService = produtoService;
	}
	
	
}
