package Week_3.Day12.Assignmets;
//3) Remove all repeated characters from a given string.
public class Q3_Remove_repeted_from_string {
    void wordRemover(){
        StringBuilder name = new StringBuilder("Deevayuush");

            for (int i = 0; i < name.length(); i++){
                String s1=String.valueOf(name.charAt(i));

                for(int j = i+1; j<name.length();j++){

                    String s2= String.valueOf(name.charAt(j));
                    if(s1.equals(s2)){
                        name.deleteCharAt(j);
                    }
                }

            }
        System.out.println(name);
    }
    public static void main(String[] args) {
        Q3_Remove_repeted_from_string q3_remove_repeted_from_string = new Q3_Remove_repeted_from_string();
        q3_remove_repeted_from_string.wordRemover();
    }
}
//OUTPUT ----> Devayush