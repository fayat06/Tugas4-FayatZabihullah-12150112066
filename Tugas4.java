import java.util.Arrays;

public class Tugas4 {
    public static void main(String[] args) {

        int[] ArrayInt = {82,12,41,38,19,26,9,48,20,55,8,32,3};

        int [] arrayGanjil = AngkaGanjil(ArrayInt);
        int [] arrayTiga = KelipatanTiga(ArrayInt);
        printArray(ArrayInt,"Menampilkan semua nilai dalam array = ");
        printArray(arrayGanjil, "Angka ganjil = ");
        printArray(arrayTiga, "Angka Kelipatan Tiga = ");

    }
    public static int[] AngkaGanjil(int []ganjil){
        int [] arrayGanjil = new int [ganjil.length];
        for (int i = 0; i < ganjil.length; i++){
            if(ganjil[i] % 2 != 0){
                arrayGanjil[i] = ganjil[i];
            }
        } return arrayGanjil;
    }

    public static int[] KelipatanTiga(int []tiga){
        int [] arrayTiga = new int[tiga.length];
        for (int i = 0; i < tiga.length; i++){
            if (tiga[i] % 3 == 0){
                arrayTiga[i] = tiga[i];
            }
        } return arrayTiga;

    }



    public static void printArray(int []dataArray, String message){
        System.out.println(message + " " + Arrays.toString(dataArray));
    }
}

