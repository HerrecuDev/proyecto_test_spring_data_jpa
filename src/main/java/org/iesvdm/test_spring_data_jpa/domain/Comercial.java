package org.iesvdm.test_spring_data_jpa.domain;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
public class Comercial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;


    @Column(length = 100)
    private String nombre;

    @Column(length = 100)
    private String apellido1;

    @Column(length = 100)
    private String apellido2;

    private String ciudad;

    @Column(precision = 10, scale =2)
    private BigDecimal comision;


    //LAdo inverso EL QUE NO TIENE FK  tiene mapperBy.

    @OneToMany(mappedBy = "comercial")
    @Builder.Default
    @ToString.Exclude
    private Set<Pedido> pedidos = new HashSet<>();
}
