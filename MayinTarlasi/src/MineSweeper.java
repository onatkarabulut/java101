import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;

    public MineSweeper(int _rowNumber, int _colNumber) {
        rowNumber = _rowNumber;
        colNumber = _colNumber;
    }

    public void mayinYerlestir(String [][][] _arr){
        int mayinAdet=(int)(rowNumber*colNumber/4);
        while (mayinAdet>0){
            int konum=(int) (Math.random()*rowNumber*colNumber);
            int x=konum/colNumber;
            int y=konum%colNumber;
            if (x<rowNumber && y<colNumber){
                _arr[x][y][0]="*";
                _arr[x][y][1]="0";
                mayinAdet--;
            }

        }
    }

    public int control(int x, int y, String [][][] _arr){
        int toplam=0;
        for(int i=-1;i<2;i++){
            for(int j=-1 ;j<2;j++) {
                if (x + i < 0 || y +j < 0) continue;
                if (x + i >= rowNumber || y +j >= colNumber) continue;
                if (i == 0 && j == 0) continue;
                if (_arr[x + i][y + j][0] == "*") toplam++;
            }
        }
        return toplam;
    }

    public void sayiYerlestir(String [][][] _arr){
        for(int i=0;i<rowNumber;i++){
            for(int j=0;j<colNumber;j++){
                if(  _arr[i][j][0]==null) {
                    _arr[i][j][0]=String.valueOf(control(i,j,_arr));
                    _arr[i][j][1]="0";
                }
            }
        }
    }

    public void tarlaYazdir(String [][][] _arr){
        for(int i=0;i<rowNumber;i++) {
            for (int j = 0; j < colNumber; j++) {
                if (_arr[i][j][1]=="0"){
                    System.out.print("- ");
                }else{
                    System.out.print(_arr[i][j][0] + " ");
                }
            }
            System.out.print("\n");
        }
    }

    public void veriGiris(int x, int y , String [][][] _arr){
            _arr[x][y][1]="1";
    }


    public void run(){

        String [][][] arr = new String[rowNumber][colNumber][2];

        Scanner klavye=new Scanner(System.in);
        mayinYerlestir(arr);
        sayiYerlestir(arr);
        int giris=0;
        int row;
        int col;
        while(rowNumber*colNumber-giris>(int)(colNumber*rowNumber/4)){
            tarlaYazdir(arr);
            System.out.print("Satır sayısını giriniz : ");
            row=klavye.nextInt();
            System.out.print("Sutun sayısını giriniz : ");
            col=klavye.nextInt();
            if (arr[row][col][0].equals("*")){
                veriGiris(row,col,arr);
                tarlaYazdir(arr);
                System.out.println("Mayına bastınız... KAYBETTİNİZ...");
                break;
            }else {
                veriGiris(row,col,arr);
            }
            System.out.println("-----------------------------------------------------------");
        }


    }

}
