package service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.desafioJPA.entity.Aluno;
import br.com.desafioJPA.entity.AvaliacaoFisica;
import br.com.desafioJPA.formularios.AlunoForm;
import br.com.desafioJPA.formularios.AlunoUpdateForm;



public interface IAlunoService {

  Aluno create(AlunoForm form);

  
  Aluno get(Long id);

  List<Aluno> getAll(String dataDeNascimento);

  
  Aluno update(Long id, AlunoUpdateForm formUpdate);

  void delete(Long id);

  
  List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);


}