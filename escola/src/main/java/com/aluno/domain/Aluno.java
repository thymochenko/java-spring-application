package com.aluno.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Aluno {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String name;
  private Date created;
  private Double nota;
  private Long turma;

  @Transient
  private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

  public Aluno(String name, Double nota, Long turma, String date)
   throws ParseException{
    this.name = name;
    this.nota = nota;
    this.turma = turma;
    this.created = format.parse(date);
  }

  Aluno() {}

  public Long getId() {
   return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Double getNota() {
    return nota;
  }

  public void setNota(Double nota) {
    this.nota = nota;
  }

  public void setTurma(Long turma) {
    this.turma = turma;
  }

  public Long getTurma() {
    return turma;
  }

  public String getCreatedAsShort(){
    return format.format(created);
  }

  public String toString(){
    StringBuilder value = new StringBuilder("AlunolaEntry(");
    value.append("Id: ");
    value.append(id);
    value.append(",nome: ");
    value.append(name);
    value.append(",turma: ");
    value.append(turma);
    value.append(",Created: ");
    value.append(getCreatedAsShort());
    value.append(",nota: ");
    value.append(nota);
    value.append(")");
    return value.toString();
  }
}
