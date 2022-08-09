package service;

import java.util.List;

import br.com.desafioJPA.entity.Matricula;
import br.com.desafioJPA.formularios.MatriculaForm;

public interface IMatriculaService {
	
	  Matricula create(MatriculaForm form);

	 
	  Matricula get(Long id);

	  List<Matricula> getAll(String bairro);

	  void delete(Long id);

	}
