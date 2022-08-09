package Week_2.Day5;//Array
//Types arrau ->


class ineDArray{
        public void displaydaya(){

            System.out.println("**************FOR LOOP************");
            //way1 -- declairation
            int marks[] = new int [10];     //memory asignment
            //marks[5] =50;
            for(int i =0; i< marks.length;i++) {
                System.out.println(marks[i]);
            }
            System.out.println("for each");
            //Way 2 - initilization
            int rno[]= {1,2,3,4,5,6,7,8,9,10};
            for (int index: rno){
                System.out.println(index);
            }

        }
    }

    class TwoDArray{

    public void displaydata(){
        int rows [] [] = {{1,2},{3,4}};


        for(int i = 0; i< rows.length; i++){
            for(int j = 0; j<rows[i].length;j++) {
                System.out.println(rows[i][j]);
            }


            System.out.println("Jagged Array");

            }

        }
        public void jaggedArray(){
            int rows [] [] = {{1,2,3},{3,4,7,8}};
            for(int i = 0; i< rows.length; i++){
                for(int j = 0; j<rows[i].length;j++) {
                    System.out.println(rows[i][j]);
                }
            }
        }

    }


    public class DEMO_BASICS_COREJAVA {
        public static void main(String[] args) {
            ineDArray ineDArray = new ineDArray();
            ineDArray.displaydaya();
            TwoDArray twoDArray = new TwoDArray();
            twoDArray.displaydata();
            twoDArray.jaggedArray();
        }

}
