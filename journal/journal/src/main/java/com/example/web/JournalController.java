package com.example.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.repository.JournalRepository;
import com.example.domain.Journal;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JournalController {

  @RequestMapping(value="/journal", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
  public @ResponseBody List<Journal> getJournal(){
    return repo.findAll();
  }

  @Autowired
  JournalRepository repo;
  @RequestMapping("/")
  public String index(Model model){
    model.addAttribute("journal", repo.findAll());
    return "index";
  }
}
