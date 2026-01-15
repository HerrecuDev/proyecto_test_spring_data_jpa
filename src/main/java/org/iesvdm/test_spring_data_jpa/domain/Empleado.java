package org.iesvdm.test_spring_data_jpa.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//@Entity

public class Empleado {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, length = 9)
  private String nif;

  @Column(nullable = false, length = 100)
  private String nombre;

  @Column(nullable = false, length = 100)
  private String apellido1;

  @Column(length = 100)
  private String apellido2;


  //Lado propietario puesto que es esta tabla la que tiene la FK, en nuestro caso departamento_id
  @ManyToOne(fetch = FetchType.LAZY, optional = true)


  private Departamento departamento;

}
