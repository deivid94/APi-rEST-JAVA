package br.com.devdeivd.certificationnlw.modules.students.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devdeivd.certificationnlw.modules.students.dto.VerifyHasCertiticationDTO;

@RestController
@RequestMapping("/student")

public class StudentContoller {

@PostMapping("/verifyIfHasCertifation")
public String verififyifStudentHasCertification(@RequestBody VerifyHasCertiticationDTO verifyHasCertiticationDTO){
  System.out.println (verifyHasCertiticationDTO);
  return "usuario pode fazer a prova";
}
  
}
