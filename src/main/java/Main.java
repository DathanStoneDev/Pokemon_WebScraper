import image_generator.ImageURLGenerator;
import webscraper.*;

public class Main {

    public static void main(String[] args) {


        ImageURLGenerator imageScraper = new ImageURLGenerator();
        PokemonDataWebScraper pokemonDataWebScraper = new PokemonDataWebScraper();


        final String ultraSunAndMoonUrl = "https://www.thonky.com/pokemon-ultra-sun-ultra-moon/list-of-pokemon-locations";


        pokemonDataWebScraper.getPokemonData(ultraSunAndMoonUrl, "UltraSunAndMoonPokemonData.csv");
        imageScraper.getPokemonImages(807);

    }
}
