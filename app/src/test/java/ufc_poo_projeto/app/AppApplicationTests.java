package ufc_poo_projeto.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ufc_poo_projeto.app.entities.Filme;

@SpringBootTest
class AppApplicationTests {

	public static void testeFilmee(String[] s){
        Filme filme = new Filme("Avengers", "2012", "04 May 2012", "143 min", "Action, Adventure, Sci-Fi", "Joss Whedon", "Robert Downey Jr., Chris Evans, Mark Ruffalo, Chris Hemsworth", "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.", "USA", "https://m.media-amazon.com/images/I/71rV2g9Z8-L._AC_SY679_.jpg");
        System.out.println(filme);
    
    }
	@Test
	void contextLoads() {
	}

}
