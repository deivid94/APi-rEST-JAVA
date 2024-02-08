package br.com.devdeivd.certificationnlw.modules.students.entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AwswersCertificationsEntity {
    private UUID certificationID;
    private UUID studentID;
    private UUID questionID;
    private boolean isCorrect;
}   
