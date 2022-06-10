package com.acsi.gpa.dto.reparationdto;

import com.acsi.gpa.dto.chauffeurmecaniciendto.ChauffeurMecanicienResponse;
import com.acsi.gpa.dto.vehiculedto.VehiculeResponse;
import com.acsi.gpa.entities.ChauffeurMecanicien;
import com.acsi.gpa.entities.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReparationResponse {

    private Date dateReparation;

    private BigDecimal frais;

    private String note;

    private VehiculeResponse vehiculeResponse;

    private ChauffeurMecanicienResponse chauffeurMecanicienResponse;
}
