package br.com.gustavojezini.gestao_vagas.modules.cadidate.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gustavojezini.gestao_vagas.modules.cadidate.CandaditeEntity;

@RestController
@RequestMapping("/candidates")
public class CandaditeController {

  @PostMapping("/")
  public void create(@RequestBody CandaditeEntity cadidateEntity) {

  }
}
