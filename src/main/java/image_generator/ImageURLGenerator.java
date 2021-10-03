package image_generator;

import pokemon_objects.Image;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class ImageURLGenerator {

    private String url = "https://www.serebii.net/swordshield/pokemon/";
    public void getPokemonImages(int numberOfImages) {

        try {
            List<Image> imageURLs= new ArrayList<>();

            for(int i = 0; i<numberOfImages + 1; i++) {
                int id = i;
                String string = url + i + ".png";
                Image image = new Image(id, string);
                imageURLs.add(image);
            }
            //Creates new CSV file and writes Pokemon Objects to rows.
            Writer writer = new FileWriter("pokemonImages.csv");
            StatefulBeanToCsv statefulBeanToCsv = new StatefulBeanToCsvBuilder(writer).build();
            statefulBeanToCsv.write(imageURLs);
            writer.close();


        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
