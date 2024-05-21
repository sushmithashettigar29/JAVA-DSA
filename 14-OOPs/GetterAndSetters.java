public class GetterAndSetters {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.setColor("Blue");
        System.out.println(pen1.getColor());
        pen1.setTip(5);
        System.out.println(pen1.getTip());
    }
}
class Pen{
    private String color;
    private int tip;
    //setters
    void setColor(String newColor){
        color = newColor;
    }
    //setters
    void setTip(int tip){
        this.tip = tip;
    }
    //getters
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}