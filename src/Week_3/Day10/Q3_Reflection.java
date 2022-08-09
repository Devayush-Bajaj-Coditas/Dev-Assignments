//Q3)Try to access private variable of class using reflection
package Week_3.Day10;
import java.lang.reflect.*;


class ReflectionClass{
    private String name = "Devayush";
}

public class Q3_Reflection {
    public static void main(String[] args) throws Exception{
        ReflectionClass reflectionClass = new ReflectionClass();
        Field privateField = ReflectionClass.class.getDeclaredField("name");
        privateField.setAccessible(true);
        String name = (String)privateField.get(reflectionClass);
        System.out.println(name);
    }
}
// OUTPUT -- > Devayush