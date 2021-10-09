public class HolaMundo {
    public static void main(String[] args) {
        String strMain = "Welcome";
        String[] arrSplit = strMain.split(" ");
        //System.out.println(arrSplit.getClass());

        String sen = "";
        for(String dia : arrSplit){
            int len = dia.length();
            if(len >= 5){
                String temp = "";
                for(int x = len - 1; x >= 0; x--){
                    temp+= dia.charAt(x);
                }
                sen += " " + temp;
            }else{
                sen += " " + dia;
            }
        }
        System.out.println("palaba " + sen);
    }
}
