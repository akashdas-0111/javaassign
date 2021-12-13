 class Complex{
     double real;
     double img;

     public Complex(double real, double img) {
          this.real = real;
          this.img = img;
     }
     public void add(Complex a , Complex b){
          real = a.real + b.real;
          img = a.img + b.img;
          System.out.println("the addition is "+":"+ real +"+"+ img+"i");
     }
     public void sub(Complex a , Complex b){
          real = a.real - b.real;
          img = a.img - b.img;
          System.out.println("the subtraction is "+":"+ real +"+"+ img+"i");
     }
     public void mul(Complex a , Complex b){
          real = a.real * b.real;
          img = a.img * b.img*(-1);
          double sum = real +img;
          System.out.println("the multiplication is "+":"+sum);
     }


}

       
public class TestMain {
    public static void main(String[] args)
 {
   

            Complex obj = new Complex(0,0);
            Complex obj1 = new Complex(30,10);
            Complex obj2 = new Complex(60,41);
            obj.add(obj1,obj2);
            obj1.sub(obj1,obj2);
            obj2.mul(obj1,obj2);


        }
}


