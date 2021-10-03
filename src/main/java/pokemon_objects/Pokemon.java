package pokemon_objects;

public class Pokemon {

    private String pokeId;
    private String pokeName;
    private String pokeLocation;

    public Pokemon(String pokeId, String pokeName, String pokeLocation) {
        this.pokeId = pokeId;
        this.pokeName = pokeName;
        this.pokeLocation = pokeLocation;
    }

    public String getPokeId() {
        return pokeId;
    }

    public void setPokeId(String pokeId) {
        this.pokeId = pokeId;
    }

    public String getPokeName() {
        return pokeName;
    }

    public void setPokeName(String pokeName) {
        this.pokeName = pokeName;
    }

    public String getPokeLocation() {
        return pokeLocation;
    }

    public void setPokeLocation(String pokeLocation) {
        this.pokeLocation = pokeLocation;
    }
}
