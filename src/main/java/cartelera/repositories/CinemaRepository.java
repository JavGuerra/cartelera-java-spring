package cartelera.repositories;

import cartelera.entities.Address;
import cartelera.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {

    Optional<Cinema> findByName(String name);

    List<Cinema> findAllByName(String name);

    List<Cinema> findAllByPhone(String phone);

    List<Cinema> findByNameAndPhone(String name, Address address);

    @Query("select c from Cinema c where c.address.id = ?1")
    Cinema findByAddress_Id(Long id);

    List<Cinema> findAllByAddressCity(String city);

    // Consulta Jakarta Persistence Query Language (JPQL) personalizada para recuperar entidades room asociadas
    // @Query("select cinema from Cinema cinema left join fetch cinema.rooms where cinema.id = :id")
    // Optional<Cinema> findByIdWithRooms(Long id);
}