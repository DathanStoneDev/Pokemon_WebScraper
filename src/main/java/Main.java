import image_generator.ImageURLGenerator;
import webscraper.*;

public class Main {

    public static void main(String[] args) {

        ImageURLGenerator imageScraper = new ImageURLGenerator();
        PokemonDataWebScraper pokemonDataWebScraper = new PokemonDataWebScraper();

        final String ultraSunAndMoonUrl = "https://www.thonky.com/pokemon-ultra-sun-ultra-moon/list-of-pokemon-locations";
        final String xAndYUrl = "https://www.thonky.com/pokemon-x-y/list-of-pokemon-locations";
        final String letsGoUrl = "https://www.thonky.com/pokemon-lets-go/list-of-pokemon-locations";


        pokemonDataWebScraper.getPokemonData(ultraSunAndMoonUrl, "UltraSunAndMoonPokemonData.csv");
        pokemonDataWebScraper.getPokemonData(xAndYUrl, "XandYPokemonData.csv");
        pokemonDataWebScraper.getPokemonData(letsGoUrl, "LetsGoPokemonData.csv");
        imageScraper.getPokemonImages(807);

    }
}
