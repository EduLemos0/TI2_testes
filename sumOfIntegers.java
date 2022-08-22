import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o primeiro numero da soma:");
    int num1 = scanner.nextLine();
    
    System.out.println("Digite o segundo numero da soma:");
    int num2 = scanner.nextLine();
    
    System.out.println(soma(num1,num2));
  }
  
  static int soma(int num1,int num2){
    return num1+num2;
  }
}
