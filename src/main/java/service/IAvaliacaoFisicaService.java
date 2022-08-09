package service;

import java.util.List;

import br.com.desafioJPA.entity.AvaliacaoFisica;
import br.com.desafioJPA.formularios.AvaliacaoFisicaForm;
import br.com.desafioJPA.formularios.AvaliacaoFisicaUpdateForm;

public interface IAvaliacaoFisicaService {
	  
	  AvaliacaoFisica create(AvaliacaoFisicaForm form);

	
	  AvaliacaoFisica get(Long id);

	  List<AvaliacaoFisica> getAll();

	  AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

	  void delete(Long id);
	}
