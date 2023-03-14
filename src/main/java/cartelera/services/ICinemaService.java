package cartelera.services;

import cartelera.entities.Cinema;

import java.util.List;
import java.util.Optional;

public interface ICinemaService {

    /**
     * Obtiene la lista completa de cines.
     * @return Lista de cines.
     */
    List<Cinema> findAll();

    /**
     * Obtiene una dirección por su ID.
     * @param id Identificador.
     * @return Opcionalmente, el cine solicitado.
     */
    Optional<Cinema> findById(Long id);

    /**
     * Comprueba si existe un cine por su ID.
     * @param id Identificador.
     * @return Verdadero si existe, falso en caso contrario.
     */
    boolean existsById(Long id);

    /**
     * Guarda un cine.
     * @param cinema Cine.
     * @return El cine guardado.
     */
    Cinema save(Cinema cinema);

    /**
     * Borra un cine por su ID.
     * @param id Identificador.
     */
    void deleteById(Long id);

    // Optional<Cinema> findByIdWithRooms(Long id);
}
