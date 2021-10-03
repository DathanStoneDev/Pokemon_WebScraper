package webscraper;

import pokemon_objects.Pokemon;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PokemonDataWebScraper {

    public void getPokemonData(String url, String csvFileName) {

        try {
            final Document document = Jsoup.connect(url).get();
            List<Pokemon> allPokemon = new ArrayList<>();

            for (Element row : document.select("table.table.table-bordered tr")) {
                final String id =
                        row.select("td:nth-of-type(1)").text();
                final String name =
                        row.select("td:nth-of-type(2)").text();
                final String location =
                        row.select("td:nth-of-type(3)").text();
                Pokemon pokemon = new Pokemon(id, name, location);
                allPokemon.add(pokemon);
            }

            //Creates new CSV file and writes Pokemon Objects to rows.
            Writer writer = new FileWriter(csvFileName);
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder<>(writer).build();
            beanToCsv.write(allPokemon);
            writer.close();


        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }


}
