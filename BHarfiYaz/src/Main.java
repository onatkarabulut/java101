public class Main {
    public static void main(String[] args) {
        String [][] harf= new String[7][7];

        for (int i=0 ;i<7 ;i++){
            for (int j=0;j<7;j++){
                if(i==0 || i==3 || i==6){
                    harf[i][j] =(j%2==0)?"*":" ";
                }else{
                    harf[i][j] =(j==0 || j==6)?"*":" ";
                }
            }
        }
        for (String [] row: harf){
            for (String sutun: row) System.out.print(sutun);
            System.out.print("\n");
        }
    }
}
