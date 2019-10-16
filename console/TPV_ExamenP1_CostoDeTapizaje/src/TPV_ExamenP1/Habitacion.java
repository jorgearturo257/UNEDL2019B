package TPV_ExamenP1;

public class Habitacion {
    float largo, ancho;
    float area;

    public Habitacion(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
        area=this.largo*this.ancho;

    }

    public float getArea () {
        return  area;
    }
    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
}
