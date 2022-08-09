package service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafioJPA.entity.Aluno;
import br.com.desafioJPA.entity.AvaliacaoFisica;
import br.com.desafioJPA.formularios.AlunoForm;
import br.com.desafioJPA.formularios.AlunoUpdateForm;
import config.JavaTimeUtils;
import repository.AlunoRepository;

@Service
public class AlunoServiceImpl implements IAlunoService {

  @Autowired
  private AlunoRepository repository;

 @Autowired
  public Aluno create(AlunoForm form) {
    Aluno aluno = new Aluno();
    aluno.setNome(form.getNome());
    aluno.setCpf(form.getCpf());
    aluno.setBairro(form.getBairro());
    aluno.setDataDeNascimento(form.getDataDeNascimento());

    return repository.save(aluno);
  }

@Autowired
  public Aluno get(Long id) {
    return null;
  }

@Autowired
  public List<Aluno> getAll(String dataDeNascimento) {

    if(dataDeNascimento == null) {
      return repository.findAll();
    } else {
      LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
      return repository.findByDataDeNascimento(localDate);
    }

  }

  @Autowired
  public Aluno update(Long id, AlunoUpdateForm formUpdate) {
    return null;
  }

@Autowired
  public void delete(Long id) {
  }

 @Autowired
  public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

    Aluno aluno = repository.findById(id).get();

    return aluno.getAvaliacoes();

  }



}
