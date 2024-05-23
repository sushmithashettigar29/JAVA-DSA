public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.eatGrass();
        b.eatMeat();
    }
}

interface  ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left , right,diagonal (int all 4 directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left , right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left , right,diagonal (by 1 step)");
    }
}


//multilevel interface
interface Herbivore{
    void eatGrass();

}
interface Carnivore{
    void eatMeat();
}

class Bear implements Herbivore,Carnivore{
    public void eatGrass(){
        System.out.println("eat grass");
    }
    public void eatMeat(){
        System.out.println("eat meat");
    }
}