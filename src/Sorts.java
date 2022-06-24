public class Sorts {



    public static int[] getArray(int[] array) {
        for (int i = 0; i < array.length; i ++) {
            array[i] = ((int)(Math.random() * 1000000));
        }
        return array;
    }

    public static void showArray(int[] array){
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }


     public static int[] bubbleSort(int[] array) {
         int buf = 0;
         int r = array.length;
         boolean isnotSorted = true;
         while (isnotSorted) {
             isnotSorted = false;
             for (int i = 0; i + 1 < r; i++) {
                 if (array[i] > array[i + 1]) {
                     buf = array[i + 1];
                     array[i + 1] = array[i];
                     array[i] = buf;
                     isnotSorted = true;
                 }
             }
             r--;
         }
    return array;
    }

    public static int[] shakerSort(int[] array) {
        int buf = 0;
        int r = array.length;
        int d = 0;
        boolean isnotSorted = true;

        while (isnotSorted) {
            isnotSorted = false;
            for (int i = d; i + 1 < r; i++) {
                if (array[i] > array[i + 1]) {
                    buf = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buf;
                    isnotSorted = true;
                }
            }
            r--;
            for (int i = r; i - 1 >= d; i--) {
                if (array[i] < array[i - 1]) {
                    buf = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = buf;
                    isnotSorted = true;
                }
            }
            d++;
        }
        return array;
    }

    public static int[] combSort(int[] array) {
        int buf = 0;
        int step = array.length-1;
        double fact = 1.24733095;
        while (step >= 1) {
            for (int i = 0; i + step < array.length; i++) {
                if (array[i] > array[i + step]) {
                    buf = array[i + step];
                    array[i + step] = array[i];
                    array[i] = buf;
                }
            }
            step /= fact;
        }
        return array;
    }

    public static int[] insertSort(int[] array) {
        for (int i = 1; i < array.length; i ++) {
            int value = array[i];
            int j = i - 1;
            while (j >= 0 && value < array[j]){
                array[j + 1] = array[j];
            j--;
            }
            array[j+1] = value;
        }
        return array;
    }

    public static int[] shellSort(int[] array) {
        for (int step = array.length/2; step > 0; step /= 2)
        {
            for ( int i = step; i< array.length; i++) {
             for (int j = i - step; j >=0 && array[j] > array[j + step]; j-= step) {
                 int x = array[j];
                 array[j] = array[j + step];
                 array [j + step] = x;
             }
        }
        }
        return array;
    }

}

