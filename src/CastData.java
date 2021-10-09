public class CastData {
    /**
     *  Esto solo es una función que manda
     *  un mensaje de prueba
     * @param nombre El nombre de la persona
     * @return cadena Devuelve cadena completa.
     */
    public String prueba(String nombre){
        String cadena = "Esto solo es una prueba : "+nombre;
        return cadena;
    }

    public static void main(String[] args) {
        CastData cast = new CastData();
        int x = 30;
        int y = 12;
        System.out.println((double)x/y);
        double c = x/y;
        System.out.println(c);
        cast.prueba("guillermo");
    }
}
