package org.iesvdm.test_spring_data_jpa.repo;

import org.iesvdm.test_spring_data_jpa.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


    record IdDTO(Long id){};
    List<IdDTO> findByPedidos_IdIsNotNull();

    record IDNOmApell(long id , String nombre , String apellido1){};

    List<IDNOmApell> findByApellido2IsNotNullOrderByApellido1AscApellido2AscNombre();







//    @Query("select c.id , c.nombre , c")
}
