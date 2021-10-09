import java.util.Arrays;
/*
Las reglas del juego son las siguientes:

Si una célula está viva y tiene dos o tres vecinas vivas, sobrevive.
Si una célula está muerta y tiene tres vecinas vivas, nace.
Si una célula está viva y tiene más de tres vecinas vivas, muere.
La disposición o patrón inicial de células se llama «semilla».
La siguiente generación nace de aplicar las reglas del juego a todas las células de manera simultánea.

 */
public class ConwayLife {

    public static int[][] getGeneration(int[][] cells, int generations) {
        System.out.println("cells " + Arrays.deepToString(cells));
        int[][] returnValues;
        /*for(int x = 0; x < cells.length; x++){
            for (int y = 0; y < cells[x].length; y++){

            }
        }*/
        //System.out.println(LifeDebug.htmlize(cells));

        return null;
    }

    public static void main(String[] args) {
        int[][] values = {{1,0,0}, {0,1,1}, {1,1,0}};
        ConwayLife.getGeneration(values, 1);
    }

}