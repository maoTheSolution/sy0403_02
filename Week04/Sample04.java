/*
* precondition : there is an 1-D array consists of String elements 
 * 1. display :
 *       print out all the elements in the given array 
 * 2. isFull:
 *      reutrn false if the given array is full
 * 3. plusArray:
 *      return a new array which has a double-sized length of the current array
 * 4. copyElements:
 *      receive two arrays and copy all the elemtens from one array and push them into another array in the same order and return the new array/
 * 5. push:
 *      receive an array and a new input and push it into the array if it is not full. Then, return the array.
 */

public class Sample04 {
    public static void main(String[] args) {
        String temp[] = new String[3];
        Sample04 s4 = new Sample04();
        String slist[] = {"Adam", "Seoyeong", "Hwanmin", "Daeju", "Seoneun", "Joe", "Abby", "Hayeong"};
        for(String s: slist){
            if(s4.push(temp, s)){
                continue;
            }else{
                System.out.println(temp.length);
                String newArr[] = s4.plusArray(temp);
                newArr = s4.copyElements(temp, newArr);
                temp = newArr;
                System.out.println(temp.length);
                s4.push(temp, s);
                s4.display(temp);
            }
        }
    }

    public void display(String arr[]){
        for(String s:arr){
            System.out.println(s);
        }
    }

    public boolean isFull(String arr[]){
        boolean result = false;
        if(arr[arr.length-1] != null){
            result = true;
        }
        return result;
    }

    public String[] plusArray(String arr[]){
        return new String[arr.length*2];
    }

    public String[] copyElements(String []old, String[] newArr){
        for(int index=0; index<old.length; index++){
            newArr[index] = old[index];
        }
        return newArr;
    }

    public boolean push(String arr[], String newInput){
        // push the newInput into the array
        if(!isFull(arr)){
            int index = helper(arr);
            arr[index] = newInput;

            return true;
        }else {
            System.out.println("The array is full");
            return false;
        }
    }

    public int helper(String arr[]){
        // return the index of the first empty room in the array 
        int result = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == null){
                result = i;
                break;
            }
        }

        return result;
    }

}
