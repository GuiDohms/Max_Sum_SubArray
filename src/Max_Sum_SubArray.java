import java.util.*;

public class Max_Sum_SubArray {
    private int max_sum, current_sum, pos_initial, pos_final, size;
    private int[] sub_array;

    //Array constructor.
    public Max_Sum_SubArray(int array[]) {
        this.size = array.length;
        this.sub_array = array;
        this.pos_initial = 0;
        this.pos_final = 0;
    }

    public void Sum_Array(){
        for (int i =0; i < size; i++) {
            this.current_sum = 0;
            for (int j = i + 1; j < size; j++) {
                //Make sure that each time the array position on the first *for* changes it will start the sum with the next object in the array
                //other wise it would sum the object with itself
                if(j == i + 1){ // for first iteration
                    this.current_sum = (this.sub_array[i] + this.sub_array[j]);
                }else{
                    this.current_sum = this.current_sum  + this.sub_array[j];
                }
                //fetch the result from the *is_max_sum method* and saves the array positions
                if (is_max_sum(this.current_sum, this.max_sum)){
                    this.pos_initial=i;
                    this.pos_final=j;
                }
            }
        }
    }

    //Checks if the current sum is greater than the current max_sum
    public boolean is_max_sum(int current_sum, int max_sum){
        if(max_sum == 0){ //first iteration
            this.max_sum = current_sum;
            return true;
        }
        else if (max_sum > current_sum){
            return false;
        }
        else{
            this.max_sum = current_sum;
            return true;
        }
    }

    //Prints the sub_array that has the max_sum
    public void result() {
        //Checks if the array is not a single object array
        if (size >= 2) {
            System.out.println("Final Array is: [" + this.sub_array[pos_initial] + ", " + this.sub_array[pos_final] + "].");
        } else {
            System.out.println("Final Array is: [" + this.sub_array[0] + "].");
        }
    }
}
