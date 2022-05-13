package com.company;

public class MergeSort {
    //instance variables
    int[] array;
    int[] tempMergeArr;
    int length;
    public static void main(String[] args) {
        int[] inputArr  = {48,36,13,52,19,94,21};
        MergeSort ms  = new MergeSort();
        ms.sort(inputArr);
        //now here we'll print the elements
        for(int i:inputArr){
            System.out.print(i+" ");
        }

    }
    public void sort(int inputArr[]){  // we have to pass input array here for this we will create its object in main method
         this.array = inputArr;        //now we will declare input array in instance
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        devideArray(0,length-1);
    }
    //we know this method works on devide and conquer so
    public void devideArray(int lowerIndex,int higherIndex){  // we will call this method in upper method
                                                              //this sorting algo works on recursion so we will use recursion
        if(lowerIndex<higherIndex){
            int middle = lowerIndex+(higherIndex-lowerIndex)/2;
            //it will sort the left side of an array
            devideArray(lowerIndex,middle);

            //it will sort the right side of an array
            devideArray(middle+1,higherIndex);  //middle +1 because rhs ki value middle +1  se start ho jayegi aur ab ye array ko devide krta jayega

            mergeArray(lowerIndex,middle,higherIndex);
        }
    }
    public void mergeArray(int lowerIndex,int middle,int higherIndex){   // here we'll merge the array
        for(int i= lowerIndex;i<=higherIndex; i++){
            tempMergeArr[i] = array[i];  // array ke varibles ko temp ke andar dal denge
        }
        int i = lowerIndex;
        int j = middle+1;
        int k = lowerIndex;
        while(i<=middle && j<= higherIndex){
            if(tempMergeArr[i]<= tempMergeArr[j]){
                array[k]=tempMergeArr[i];        //array k is our original array
                i++;
            }
            else{
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }
        while(i<=middle){
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }
}
