//import sun.awt.X11.XSystemTrayPeer;

public class Array {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];
        String[][] cities = new String[4][2];

        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];

        androidVersions[0] = "Apple pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        for(int x = 0; x < androidVersions.length; x++){
            System.out.println(androidVersions[x]);
        }

        for (String version: androidVersions) {
            System.out.println("version "+version);
        }

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "cdmx";

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println("1 - "+cities[i][j]);
            }
        }
        for (String[] pair: cities) {
            for (String name: pair) {
                System.out.println("bi " + name);
            }
        }

        /*System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);*/

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "monkey";
        System.out.println();
        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i <= 1 ; i++) {
            for (int j = 0; j <= 0 ; j++) {
                for (int k = 0; k <= 0; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println("new "+animals[i][j][k][l]);
                    }
                }
            }
        }
    }
}
