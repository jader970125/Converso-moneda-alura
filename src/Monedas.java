import java.util.Map;

public class Monedas {
    public float getPesoArgentino() {
        return pesoArgentino;
    }

    public void setPesoArgentino(float pesoArgentino) {
        this.pesoArgentino = pesoArgentino;
    }

    public float getBolivianoBoliviano() {
        return bolivianoBoliviano;
    }

    public void setBolivianoBoliviano(float bolivianoBoliviano) {
        this.bolivianoBoliviano = bolivianoBoliviano;
    }

    public float getRealBrasileno() {
        return realBrasileno;
    }

    public void setRealBrasileno(float realBrasileno) {
        this.realBrasileno = realBrasileno;
    }

    public float getPesoChileno() {
        return pesoChileno;
    }

    public void setPesoChileno(float pesoChileno) {
        this.pesoChileno = pesoChileno;
    }

    public float getPesoColombiano() {
        return pesoColombiano;
    }

    public void setPesoColombiano(float pesoColombiano) {
        this.pesoColombiano = pesoColombiano;
    }

    public float getDolarEstadoUnidense() {
        return dolarEstadoUnidense;
    }

    public void setDolarEstadoUnidense(float dolarEstadoUnidense) {
        this.dolarEstadoUnidense = dolarEstadoUnidense;
    }

    private float pesoArgentino;
    private float bolivianoBoliviano;
    private float realBrasileno;
    private float pesoChileno;
    private float pesoColombiano;
    private float dolarEstadoUnidense;

    public Monedas (Map<String,Float> dicMonedas ){
        this.pesoArgentino = dicMonedas.get("ARS");
        this.bolivianoBoliviano = dicMonedas.get("BOB");
        this.realBrasileno = dicMonedas.get("BRL");
        this.pesoChileno = dicMonedas.get("CLP");
        this.pesoColombiano = dicMonedas.get("COP");
        this.dolarEstadoUnidense = dicMonedas.get("USD");
    }

    @Override
    public String toString() {
        return "Peso Argentino " + pesoArgentino +
                "\nBoliviano boliviano " + bolivianoBoliviano +
                "\nBoliviano boliviano " + bolivianoBoliviano +
                "\nReal Brasileño " + realBrasileno +
                "\nPeso Chileno " + pesoChileno +
                "\nPeso Colombiano " + pesoColombiano +
                "\nDolar Estado Unidense " + dolarEstadoUnidense;
    }
}
