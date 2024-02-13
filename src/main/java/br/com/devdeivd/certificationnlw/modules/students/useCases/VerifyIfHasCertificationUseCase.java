package br.com.devdeivd.certificationnlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import br.com.devdeivd.certificationnlw.modules.students.dto.VerifyHasCertiticationDTO;

@Service
public class VerifyIfHasCertificationUseCase {
  public boolean execute( VerifyHasCertiticationDTO dto){
    if (dto.getEmail().equals("teste@teste.com.br")  && dto.getTechnology().equals("JAVA")){
      return true;
    }
    return false;
  }
}
