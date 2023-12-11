import java.io.BufferedReader;
import java.io.InputStreamReader;

public class add {
    public static void main(String[] args) {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        try{
        int test = Integer.parseInt(inp.readLine());
        for(int i=0;i<test;i++){
            String[] inp_lines = inp.readLine().split(" ");
            int a = Integer.parseInt(inp_lines[0]);
            int b = Integer.parseInt(inp_lines[1]);
            System.out.println(a+b);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
    
}
