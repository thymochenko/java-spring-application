package com.aluno;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.aluno.domain.Aluno;
import com.aluno.repository.AlunoRepository;

@SpringBootApplication
public class SpringBootAlunoApplication {

  @Bean
  InitializingBean saveData(AlunoRepository repo){
    return () -> {
      repo.save(new Aluno("Carlos Henrique",8.5, 1L, "01/01/2016"));
      repo.save(new Aluno("Jota",7.6, 2L, "01/01/2016"));
      repo.save(new Aluno("Maria",9.5, 1L, "01/01/2016"));
      repo.save(new Aluno("Jessica",5.5, 2L, "01/01/2016"));
      repo.save(new Aluno("Rodrigo",8.5, 2L, "01/01/2016"));
      repo.save(new Aluno("Sergio",8.5, 2L, "01/01/2016"));
      repo.save(new Aluno("Lucia",4.8, 1L, "01/01/2016"));
      repo.save(new Aluno("Erasmo",3.5, 1L, "01/01/2016"));
      repo.save(new Aluno("Freitas",3.7, 1L, "01/01/2016"));
    };
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringBootAlunoApplication.class, args);
  }

}
