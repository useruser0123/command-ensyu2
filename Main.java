import java.util.Scanner;
  public class Main {  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
   
        System.out.print("�g��(cm)����͂��Ă��������F");
        double height = scanner.nextDouble() / 100;
        System.out.print("�̏d(kg)����͂��Ă��������F");
        double weight = scanner.nextDouble();
        double dou = weight / height / height;
        String str = String.format("%.2f", dou);
        double BMI = Double.parseDouble(str);
        System.out.println("���Ȃ���BMI��"+BMI);

    
  }
}
