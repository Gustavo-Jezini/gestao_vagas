package br.com.gustavojezini.gestao_vagas.modules.cadidate;

import java.util.UUID;

import lombok.Data;

@Data // * o Lombok - dependencia adicionada - cria automaticamente os Getters e
      // Setters ao adicionar essa annotation.
public class CandaditeEntity {

  private UUID id;
  private String name;
  private String username;
  private String email;
  private String password;
  private String description;
  private String curriculum;

}
