import java.util.Arrays;
/*
Take the following IPv4 address: 128.32.10.1

This address has 4 octets where each octet is a single byte (or 8 bits).

1st octet 128 has the binary representation: 10000000
2nd octet 32 has the binary representation: 00100000
3rd octet 10 has the binary representation: 00001010
4th octet 1 has the binary representation: 00000001
So 128.32.10.1 == 10000000.00100000.00001010.00000001

Because the above IP address has 32 bits, we can represent it as the unsigned 32 bit number: 2149583361

Complete the function that takes an unsigned 32 bit number and returns a string representation of its IPv4 address.

Examples
2149583361 ==> "128.32.10.1"
32         ==> "0.0.0.32"
0          ==> "0.0.0.0"

 */
public class KataIp {
    static int xlimite = 4;
    static int ylimite = 8;
    public static String longToIP(long ip) {
        int[][] arrayBin = new int[xlimite][ylimite];
        int[] valoresBin = { 128, 64, 32, 16, 8, 4, 2, 1 };
        arrayBin = convertirBinario(ip);
        String ipString = "";
        int[] ipArray = new int[xlimite];
        for(int x = xlimite - 1; x >= 0; x--){
            for(int y = ylimite - 1; y >= 0; y--){
                if(arrayBin[x][y] == 1){
                    ipArray[x] += valoresBin[y];
                }
            }
        }
        for(int z = 0; z < ipArray.length; z++){
            ipString += ipArray[z];
            if(z < ipArray.length - 1){
                ipString += ".";
            }
        }
        return ipString;
    }

    public static int[][] convertirBinario(long ipDecimal) {
        int[][] arrayBin = new int[xlimite][ylimite];
        long resdivision;
        for(int x = xlimite - 1; x >= 0; x--){
            for(int y = ylimite -1; y >= 0; y--){
                arrayBin[x][y] = (int) (ipDecimal % 2);
                resdivision = ipDecimal/2;
                ipDecimal = resdivision;
            }
        }
        return arrayBin;
    }

    public static void main(String[] args) {
        System.out.println(KataIp.longToIP(323));
    }
}
