public class multyDimenArays {
    public static void main(String[] args) {


        // Print firts and last elements of each array
        int[][] m = {
                {25, 0, -12, 9},
                {16, 28, -9, 7},
        };

      for (int i = 0; i < m[i].length; i++) {
            for (int j = 0; j < m.length; j++) {

                System.out.print(m[0][0] + " ");//ինչիա միլիոն քսանմեկ հատ տպում իմ ուզածից՞
                System.out.println(m[0][m[i].length - 1]);
                System.out.print(m[1][0] + " ");
                System.out.println(m[1][m[i].length - 1]);
            }
        }
    //---------------------------------------------------------------------------------------


    // Find array with max length
   int[][]ar= {
        {1,2,3,4,5,6,},
        {7,8,0,6,8,9,10},
        {2,5,7,9,6,4,3,2},
         };
        int b=ar[0].length, c=ar[1].length,d=ar[2].length;


      if(b>c && c>d){

          System.out.println("max length of Array is ar[0] = " + b);
      } else if(c>b && b>d) {

          System.out.println("max length of Array is ar[1] = " + c);
      } else

          System.out.println("max length of Array is ar[2] = " + d);

//---------------------------------------------------------------------------------


//Count number of elements which greater than previous
        int [] array = { 1,6,8,-9,14,17,20,-3,0,};
        int num=0;
        for(int i=1;i<=array.length-1;i++) {

            if (array[i - 1] < array[i]) {

                num++;
            }
        }
        System.out.println(num);
//--------------------------------------------------------------------------------------------
    //convert binery to desimal---------------------
     /*int[]arr1={1,1,0,1,0,1};
        for(int  i=0;i<arr1.length;i++){
         int a2[] = {5,3};*/


}

    }


