import java.util.*;


public class App {

    public static void main(String [] args){
        System.out.println("beHSHBDHABDHAra");
    }
    public static int toplamfarkcarp(int [] arr, int x, int y) throws Exception{
        if(x>=arr.length || y>= arr.length || x<0||y<0)
            throw new Exception("");
        if(x>y)
            return arr[x]-arr[y];
        else if(x<y)
            return arr[x]+arr[y];
        else
            return arr[x]*arr[y];
    }
}
