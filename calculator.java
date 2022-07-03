import java.util.Scanner; 
class operation{
    
    float add(float d,float e){
        return d+e;
    }
    float sub(float d,float e){
        return d-e;
    }
    float div(float d,float e){
        return d/e;
    }
    float mul(float d,float e){
        return d*e;
    }

}

public class calculator{
    
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    operation op = new operation();
    System.out.println("-------------ENTER VALUE OF A-----------");
    float d =sc.nextFloat();
    System.out.println("Enter the method");
    char c = sc.next().charAt(0);
    System.out.println("-------------ENTER VALUE OF B-----------");
    float e =sc.nextFloat();
    switch(c){
      case '+':
        System.out.printf("%.2f + %.2f = %.2f",d,e,op.add(d,e));
        break;
      case '-':
        System.out.printf("%f - %f = %f",d,e,op.sub(d,e));
        break;
      case '*':
        System.out.printf("%f x %f = %f",d,e,op.mul(d,e));
        break;
      case '/':
        System.out.printf("%f / %f = %f",d,e,op.div(d,e));
        break;
      default:
        System.out.println("invalid input operator");
    }
  }
}
