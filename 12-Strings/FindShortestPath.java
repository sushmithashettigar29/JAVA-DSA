public class FindShortestPath {
    public static float getShortestPath(String path){
        int x = 0 , y = 0;
        for(int i=0;i<path.length();i++){
            char direction = path.charAt(i);
            //south
            if(direction == 'S'){
                y--;
            }
            //north
            else if(direction == 'N'){
                y++;
            }
            //west
            else if(direction == 'W'){
                x--;
            }
            //east
            else{
                x++;
            }
        }

        int Xsq = x*x;
        int Ysq = y*y;

        return (float)Math.sqrt(Xsq + Ysq);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest path : "+ getShortestPath(path));
    }
}
