package br.com.devdeivd.certificationnlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class CertificationStudentEntity {
    private UUID id;
    private UUID StudentId;
    private String Tecnologies;
    private int grate;
    private List<AwswersCertificationsEntity> awswersCertificationsEntities;
  
}
