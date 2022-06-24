import java.util.Scanner;



public class Main {


    public static void main(String [] args)
    {
        int NUMBER_OF_ELEMENTS = 20;
        int [] array = new int[NUMBER_OF_ELEMENTS];
        array = Sorts.getArray(array);
        Sorts.shellSort(array);
        Sorts.showArray(array);
        }
    }

