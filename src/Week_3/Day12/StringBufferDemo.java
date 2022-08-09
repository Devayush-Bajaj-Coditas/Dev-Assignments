package Week_3.Day12;

public class StringBufferDemo {
    public static void main(String[] args) {

        String name = "Coditas";
        StringBuffer stringBuffer = new StringBuffer("Coditas");
        //concate
        name.concat("ELTP");
        System.out.println(name);

        stringBuffer.append("ELTP");
        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        stringBuffer.insert(3," Fun ");
        System.out.println(stringBuffer);

        StringBuffer stringBuffer1 = new StringBuffer("BatchTwo");
        StringBuffer stringBuffer2 = new StringBuffer();
        System.out.println(stringBuffer1.capacity());
        System.out.println("Default Capacity "+ stringBuffer2.capacity());


        System.out.println(stringBuffer1.capacity());   //24
        stringBuffer1.ensureCapacity(55);
        System.out.println(stringBuffer1.capacity());



    }
}
