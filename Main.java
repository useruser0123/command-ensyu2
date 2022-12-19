import java.util.Scanner;
  public class Main {  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
   
        System.out.print("身長(cm)を入力してください：");
        double height = scanner.nextDouble() / 100;
        System.out.print("体重(kg)を入力してください：");
        double weight = scanner.nextDouble();
        double dou = weight / height / height;
        String str = String.format("%.2f", dou);
        double BMI = Double.parseDouble(str);
        System.out.println("あなたのBMIは"+BMI);

    
  }
}
