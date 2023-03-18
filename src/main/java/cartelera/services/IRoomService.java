package cartelera.services;

import cartelera.entities.Room;

import java.util.List;
import java.util.Optional;

public interface IRoomService {

    /**
     * Obtiene la lista completa de salas.
     * @return Lista de salas.
     */
    List<Room> findAll();

    /**
     * Obtiene una sala por si ID.
     * @param id Identificador.
     * @return Opcionalmente, la sala indicada.
     */
    Optional<Room> findById(Long id);

    /**
     * Cumprueba si existe una sala por su ID.
     * @param id Identificador.
     * @return Verdadero si existe, falso en caso contrario.
     */
    boolean existsById(Long id);

    /**
     * Obtiene la lista de salas de un cine por el ID del cine.
     * @param id Identificador.
     * @return Lista de salas de un cine.
     */
    List<Room> findAllByCinemaId(Long id);

    /**
     * Obtiene la lista de salas de una película por el ID de la película.
     * @param id Identificador.
     * @return Lista de salas de una película.
     */
    List<Room> findAllByFilmId(Long id);

    /**
     * Guarda una sala.
     * @param room Sala.
     * @return La sala guardada.
     */
    Room save(Room room);

    /**
     * Borra una sala por el ID.
     * @param id Identificador.
     */
    void deleteById(Long id);
}
