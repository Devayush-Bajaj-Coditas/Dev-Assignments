package Week_5.Day18.PRACTICE;
public class ArrayPractice {
    public int[] getMyArray() {
        return myArray;
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    int myArray []= new int[5];
    void arrayyy(){
        int temp = 0;
        int newArr[]={};
        myArray[0] =  23;
        myArray[1] = 13;
        myArray[2] = 43;
        myArray[3] = 23;
        myArray[4] = 53;
        myArray[5] = 63;

        for (int i =0; i <myArray.length; i++){
            for(int j =1; j< myArray.length; j++){
                if(myArray[j] > myArray[j+1]){
                    temp = myArray[i];
                    myArray[i]= myArray[j];
                    myArray[j]=temp;
                }
                newArr[i]=temp;
            }
            System.out.println(myArray[i]);}
    }

    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        arrayPractice.arrayyy();
    }

}
