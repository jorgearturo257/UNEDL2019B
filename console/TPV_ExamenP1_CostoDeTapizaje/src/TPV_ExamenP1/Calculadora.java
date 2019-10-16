package TPV_ExamenP1;

public class Calculadora {
    Habitacion m;
    Tapiz s;
    float CostoTotal;


    public Calculadora(Habitacion m, Tapiz s ) {
        CostoTotal = m.getArea() * s.getGetCost();

    }

    public float getCostoTotal() {
        return CostoTotal;
    }
}
