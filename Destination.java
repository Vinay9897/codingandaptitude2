public class Destination {
    public static void main(String[] args) {
        int x1 = 2,y1=10;
        int x2 = 26,y2 = 12;
        findDestination(x1,y1,x2,y2);
        if(findDestination(x1, y1, x2, y2)){
            System.out.println("reached at distination");
            }
            else {
            System.out.println("Not reached at distination");
            }
    }

    private static boolean findDestination(int x1, int y1, int x2, int y2) {
        if(x1>x2 || y1>y2)return false;
        if(x1==x2 && y1==y2)return true;

        return findDestination(x1+y1, y1, x2, y2) || findDestination(x1,x1+ y1, x2, y2);
        
    }
}
