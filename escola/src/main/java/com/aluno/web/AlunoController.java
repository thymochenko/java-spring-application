package com.aluno.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.aluno.repository.AlunoRepository;
import com.aluno.domain.Aluno;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AlunoController {

  @RequestMapping(value="/aluno", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
  public @ResponseBody List<Aluno> getAluno(){
    return repo.findAll();
  }

  @Autowired
  AlunoRepository repo;
  @RequestMapping("/")
  public String index(Model model){
    model.addAttribute("aluno", repo.findAll());
    return "index";
  }
}
