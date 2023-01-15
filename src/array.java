public class array {
    public static void main(String[] args) {
   int[] arr1 = {1, 6, 8, 7, -15, 0, 24, 12, 19, -8, 11,};
   int[] arr2 = {5, 10, 9, -17, 25, 3, 14, 7, -8, 25, -6};
   int[] arr3 = new int[11];// իմ նախնական տարբերակնա, արդեն իմացա, որ կարելի էր գրել new int[arr1.length]

           for ( int i = 0; i < arr1.length; i++) {// ու մի for օգտագործել
           }

          for (int j = 0; j < arr2.length; j++) {

          }
          System.out.print("Create new arr3 with length 11\n\n");

       for ( int k = 0; k < arr3.length; k++) {

           if (arr1[k] % 2 != 0 && arr2[k] % 2 != 0) {
              arr3[k] = arr1[k];
             } else if (arr1[k] % 2 == 0 && arr2[k] % 2 == 0) {
                 arr3[k] = arr2[k];
             } else {
                 arr3[k] = 0;

              }

             System.out.print(" ");
             System.out.print(arr3[k] + " ");

         }






                }
            }








