package br.com.devdeivd.certificationnlw.modules.students.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class VerifyHasCertiticationDTO {
  private String email;
  private String technology;
}
