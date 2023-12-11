import java.io.*;
import java.util.*;

public class notFound404 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        for(int i=0;i<t;i++){
            int res = inp.nextInt();
            if(res==404)
                System.out.println("NOT FOUND");
            else
                System.out.println("FOUND");
        }

    }
}
