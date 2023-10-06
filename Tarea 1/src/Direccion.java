public class Direccion {

    private String direccion;

    public Direccion(String direc) {

        direccion = direc;
    }

    public String getDireccion(){

        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Direccion {" +
                "Direccion: " + direccion +
                '}';
    }
}

