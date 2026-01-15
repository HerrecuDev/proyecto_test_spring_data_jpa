package org.iesvdm.test_spring_data_jpa.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private double cantidad;

    private LocalDateTime fechaHora;

    //Lado propietario ES EL QUE TIENE LA FK

    @ManyToOne
    private Comercial comercial;

    @ManyToOne
    private Cliente cliente;


}
