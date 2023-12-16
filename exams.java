import java.util.Scanner;

class exams {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while(t-- > 0){
            int school = inp.nextInt();
            int students = inp.nextInt();
            int pass = inp.nextInt();
            int mul=students*school;
            //String out = (pass*100/mul)>50 ? "YES" : "NO";
            String out = pass*100 > (mul/2)*100 ? "YES" : "NO";
            System.out.println(out);
        }
    }    
}
