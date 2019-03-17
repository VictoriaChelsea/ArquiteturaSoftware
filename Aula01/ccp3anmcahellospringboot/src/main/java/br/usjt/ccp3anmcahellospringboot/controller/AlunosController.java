package br.usjt.ccp3anmcahellospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.ccp3anmcahellospringboot.model.Alunos;
import br.usjt.ccp3anmcahellospringboot.model.repository.AlunosRepository;

@Controller 
public class AlunosController {
	
	@Autowired
	private AlunosRepository alunosRepo;

	@GetMapping ("/alunos")
	public ModelAndView listarAlunos() {
		
		ModelAndView mv = new ModelAndView("lista_alunos");
		mv.addObject(new Alunos());

		List<Alunos> alunos = alunosRepo.findAll();
		 
		mv.addObject("alunos", alunos);
		return mv;
		
	}
	
	@PostMapping
	public String salvar (Alunos aluno) {
	alunosRepo.save(aluno);
	return "redirect:/alunos";
	} 
}
