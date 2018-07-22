package app.canastazo.model;

public class Ubication {

    private int id;
    private String ubication;
    private int ubication_id;

    public Ubication() {
    }

    public Ubication(int id, String ubication, int ubication_id) {
        this.id = id;
        this.ubication = ubication;
        this.ubication_id = ubication_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public int getUbication_id() {
        return ubication_id;
    }

    public void setUbication_id(int ubication_id) {
        this.ubication_id = ubication_id;
    }

    @Override
    public String toString() {
        return "Ubication{" + "id=" + id + ", ubication=" + ubication + ", ubication_id=" + ubication_id + '}';
    }

    
}
