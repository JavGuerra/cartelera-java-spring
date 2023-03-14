package cartelera.repositories;

import cartelera.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface FilmRepository extends JpaRepository<Film, Long> {

    // Películas de un cine
    //@Query("select f from Film f inner join f.rooms rooms where rooms.cinema.id = ?1")
    // List<Film> findAllByRooms_Cinema_Id(Long id);

    // Películas de una ciudad
    // @Query("select f from Film f inner join f.rooms rooms where upper(rooms.cinema.address.city) = upper(?1)")
    // List<Film> findAllByRooms_Cinema_Address_CityIgnoreCase(String city);

    // Películas por género
    // @Query("select film from Film film left join fetch film.genders where film.id = :id")
    // List<Film> findByIdWithGender(Long id);

    // List<Film> findAllByGenders(String gender);
}