public class Area {
    private int number1;
    private int number2;

    public int getNumber1(){
        return number1;
    }
    public int getNumber2(){
        return number2;
    }
    public void setNumber1(int number1){
        this.number1 = number1;
    }
    public void setNumber2(int number2){
        this.number2 = number2;
    }
}

class main_{
    public static void main(String[] args) {
        Area area = new Area();
        area.setNumber1(100);
        area.setNumber2(20);
        int total_area = area.getNumber1() * area.getNumber2();
        System.out.println("Area is "+ total_area);
    }
}

//OUTPUT - Area is 2000