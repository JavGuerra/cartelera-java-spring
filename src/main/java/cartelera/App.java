package cartelera;

import cartelera.entities.User;
import cartelera.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(App.class, args);

		// var userRepo = context.getBean(UserRepository.class);
		// var passwordEncoder = context.getBean(PasswordEncoder.class);

		// var addressRepo = context.getBean(AddressRepository.class);
		// var cineRepo = context.getBean(CinemaRepository.class);
		// var roomRepo = context.getBean(RoomRepository.class);
		// var filmRepo = context.getBean(FilmRepository.class);

		// Datos en data.sql

		/*
		userRepo.saveAll(List.of(
				new User(null, "Dolores", "Fuertes", null, "dfuertes", "doloresem@il", passwordEncoder.encode("632541")),
				new User(null, "Manuel", "Perez", null, "mperez", "manuelem@il", passwordEncoder.encode("632541")),
				new User(null, "Rosa", "Fuentes", null, "rfuentes", "rosaem@il", passwordEncoder.encode("632541")),
				new User(null, "Luis", "Reta", null, "lreta", "luisem@il", passwordEncoder.encode("632541")),
				new User(null, "María", "Fernandez", null,"mfernandez", "mariaem@il", passwordEncoder.encode("632541")),
				new User(null, "Roberto", "Martinez", null, "rmartinez", "robertoem@il", passwordEncoder.encode("632541")),
				new User(null, "Ana", "Melendez", null, "amelendez", "anaem@il", passwordEncoder.encode("632541")),
				new User(null, "Alberto", "Lopez", null, "alopez", "albertoem@il", passwordEncoder.encode("632541")),
				new User(null, "Mercedes", "Mila", null, "mmila", "mercedesem@il", passwordEncoder.encode("632541")),
				new User(null, "Ramón", "Perez", null, "rperez", "ramonem@il", passwordEncoder.encode("632541"))
		));

		var address1 = new Address(null, "C/ Callejón, 2", "23654", "Bilbao", "España");
		var address2 = new Address(null, "C/ Calle Cita, 5", "41258", "Marbella", "España");
		var address3 = new Address(null, "C/ Carrerón, 3", "96587", "Lugo", "España");
		var address4 = new Address(null, "C/ Carrerita, 1", "12365", "Sevilla", "España");

		addressRepo.saveAll(List.of(address1, address2, address3, address4));

		var film1 = new Film(null, "Spiderman", 120, 2020, "uno", "EEUU",
				Classification.OLDER7,
				null, "Músico", "Fotógrafo", "Guionista", "Universal",
				null, Set.of(Gender.ACTION), null, null, null, null);
		var film2 = new Film(null, "Batman", 135, 2020, "uno", "EEUU",
				Classification.OLDER12,
				null, "Músico", "Fotógrafo", "Guionista", "Universal",
				null, Set.of(Gender.ACTION), null, null, null, null);
		var film3 = new Film(null, "Superman", 115, 2020, "uno", "EEUU",
				Classification.OLDER12,
				null, "Músico", "Fotógrafo", "Guionista", "Universal",
				null, Set.of(Gender.ACTION), null, null, null, null);
		var film4 = new Film(null, "X-Men", 122, 2020, "uno", "EEUU",
				Classification.ALL_AGES,
				null, "Músico", "Fotógrafo", "Guionista", "Universal",
				null, Set.of(Gender.ACTION), null, null, null, null);
		var film5 = new Film(null,"Los Fabelman",2022,151,"Steven Spielberg",
				"Estados Unidos",Classification.OLDER16,null, "John Williams",
				"Janusz Kaminski",
				"Tony Kushner_Steven Spielberg", "Universal Pictures",
				null,Set.of(Gender.DRAMA),null,null,null,null);
		var film6 = new Film(null,"La niña de la Comunión",2022,98,"Victor Garcia",
				"España",Classification.OLDER16,null, "Marc Timón",
				"José Luis Bernal Ibañez","Guillem Clua",
				"Ikiru Films",null,Set.of(Gender.TERROR),null,null,null,null);
		var film7 = new Film(null,"El Piloto",2023,107,"Jean-Francois Richet",
				"Estados Unidos",Classification.OLDER18,null,"Marco Beltrami",
				"Brendan Galvin","Matt Cook",
				"Coproducción Estados Unidos",null,Set.of(Gender.ACTION),
				null,null,null,null);
		var film8 = new Film(null,"Oro Puro",2022,138,"Faith Akin",
				"Alemania",Classification.OLDER18,null,
				"Ralf Kemper","Rainer Klausman","Fatih Akin","Warner Broos",
				null,Set.of(Gender.ACTION),null,null,null,null);
		var film9 = new Film(null,"Titanic",1997,195,"James Cameron",
				"Estados Unidos",Classification.OLDER12,null, "James Horner",
				"Russell Carpenter","James Cameron",
				"Paramount Pictures",null,Set.of(Gender.ROMANCE),null,
				null,null,null);
		var film10 = new Film(null,"Mi Querido Monstruo",2022,99,"Jianming Huang",
				"China",Classification.OLDER7,null, "Xiaoyu Wu",
				"Animación","Liang Li","Daysview Animation",
				null,Set.of(Gender.CHILDISH),null,null,null,null);
		var film11 = new Film(null,"Anime Supremacy!",2022,128,"Saim Kohei Yoshino",
				"Japón",Classification.OLDER16,null, "Mizuki Tsujimura","Motonobu kiyoku","Yosuke Masaike",
				"Toei",null,Set.of(Gender.DRAMA),null,null,null,null);
		var film12 = new Film(null,"Almas en pena de Inisherin",2022,114,"Martin McDonagh",
				"Reino Unido",Classification.OLDER12,null, "Carter Burwell",
				"Ben Davis","Martin McDonagh",
				"Walt Disney Pictures",null,Set.of(Gender.DRAMA),null,
				null,null,null);
		var film13 = new Film(null,"Llaman a la puerta",2023,100,"M. Night Shyamalan",
				"Estados Unidos",Classification.OLDER16,null, "Herdís Stefánsdóttir",
				"Jarin Blaschke",
				"M. Night Shyamalan","Universal Pictures",null,Set.of(Gender.TERROR),
				null,null,null,null);
		var film14 = new Film(null,"Astérix y Obélix y el reino medio",2023,111,
				"Guillaume Canet","Francia",Classification.OLDER7,null,
				"Matthie Chedid","Andre Chemetoff",
				"Guillaume Canet","Les Editions Albert René",null,Set.of(Gender.COMEDY),
				null,null,null,null);
		var film15 = new Film(null,"Todo a la vez en todas partes",2022,139,"Dan Kwan",
				"Estados Unidos",Classification.OLDER12,null, "Son Lux",
				"Larkin Seiple","Dan Kwan","AGBO",null,Set.of(Gender.ACTION),
				null,null,null,null);
		var film16 = new Film(null,"Los hijos de otros",2022,104,"Rebecca Zlotowski",
				"Francia",Classification.OLDER18,null, "Robin Coudert",
				"Georges Lechaptois","Rebeca Zkitiwski",
				"Les Films Velvet",null,Set.of(Gender.DRAMA),
				null,null,null,null);

		filmRepo.saveAll(List.of(film1, film2, film3, film4,film5, film6, film7, film8,
				film9, film10, film11, film12, film13, film14, film15,film16));

		var cinema1 = new Cinema(null, "123456987", "CineAlicante", "http://cinealicante.com",
				"Twitter1", "LinkedIn1", "Facebook1", "Instagram1",
				"alicante@cinefilos.org", "693326598", address1, null);
		var cinema2 = new Cinema(null, "987456321", "CineMadrid", "http://cinemadrid.com",
				"Twitter2", "LinkedIn2", "Facebook2", "Instagram2",
				"marid@cinefilos.org", "658946785", address2, null);
		var cinema3 = new Cinema(null, "654987123", "Burgos", "http://cineburgos.com",
				"Twitter3", "LinkedIn3", "Facebook3", "Instagram3",
				"burgos@cinefilos.org", "685269831", address3, null);
		var cinema4 = new Cinema(null, "951753682", "Pamplona", "http://cinepamplona.com",
				"Twitter4", "LinkedIn4", "Facebook4", "Instagram4",
				"pamplona@cinefilos.org", "647958969", address4, null);

		cineRepo.saveAll(List.of(cinema1, cinema2, cinema3, cinema4));

		var room1 = new Room(null, (byte) 1, 130, true,
				LocalDate.of(2023, 2, 18), null, film1, cinema1);
		var room2 = new Room(null, (byte) 2, 130, true,
				LocalDate.of(2023, 2, 18), null, film1, cinema2);
		var room3 = new Room(null, (byte) 3, 130, true,
				LocalDate.of(2023, 2, 18), null, film2, cinema3);
		var room4 = new Room(null, (byte) 4, 130, true,
				LocalDate.of(2023, 2, 18), null, film2, cinema4);

		roomRepo.saveAll(List.of(room1, room2, room3, room4));
		 */
	}
}
