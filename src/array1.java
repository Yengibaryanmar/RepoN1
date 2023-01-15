public class array1 {
    public static void main(String[] args) {


        int[] array = {-10, -5, 0, 3, 6, 2, -8, 7, -9,};
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {
                array[i] = Math.abs(array[i]);

                count++;
            }
        }
        System.out.println("number of negative elements is " + count);

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
       // System.out.println(" ");
        System.out.println("\nnumber of negative elements is " + (array.length - count));


    }





    }

