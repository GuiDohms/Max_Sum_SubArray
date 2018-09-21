public class app {
    public static void main (String[] args){
        int a[] = {2, -4, 6, 8,-10, 100, -6, 5};
        int b[] = {2,5};
        int b_2[] = {2,5,1};
        int c[] = {-4, -6};
        int c_2[] = {-4, -1, -6};
        int d[] = {8,-10, -6};
        int e[] = {2};

        //test the array from the example
        Max_Sum_SubArray one = new Max_Sum_SubArray(a);
        one.Sum_Array();
        one.result();

        //test an array with two positive numbers
        Max_Sum_SubArray two = new Max_Sum_SubArray(b);
        two.Sum_Array();
        two.result();

        //test an array with positive numbers only
        Max_Sum_SubArray two_b = new Max_Sum_SubArray(b_2);
        two_b.Sum_Array();
        two_b.result();

        //test an array with two negative numbers only
        Max_Sum_SubArray three = new Max_Sum_SubArray(c);
        three.Sum_Array();
        three.result();

        //test an array with negative numbers only
        Max_Sum_SubArray three_b = new Max_Sum_SubArray(c_2);
        three_b.Sum_Array();
        three_b.result();

        //test an array where the sum product is a negative number
        Max_Sum_SubArray four = new Max_Sum_SubArray(d);
        four.Sum_Array();
        four.result();

        //test a single object array
        Max_Sum_SubArray five = new Max_Sum_SubArray(e);
        five.Sum_Array();
        five.result();
    }
}
