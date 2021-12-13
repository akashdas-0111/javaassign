import java.lang.*;
public class Loop {
    public void division(){
        int num = 10000;
        for (int i = 0; ; i++) {
            try {
                int result =  (num/(int)(100*Math.random()));
                
            }
            catch(ArithmeticException e){
                System.out.println(e);
                System.out.println("Iteration count="+i);
                break;
            }
        }
    }
}

