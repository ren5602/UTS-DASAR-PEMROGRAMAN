import java.util.Scanner;
 
// BMI kalkulator di Java
public class BMIKalkulator {
 
    public static void main(String[] args) throws Exception {
        menghitungBMI();
    }
 
    private static void menghitungBMI() throws Exception {
        System.out.print("Masukkan berat badan anda dalam kg: ");
        Scanner s = new Scanner(System.in);
        float weight = s.nextFloat();
        System.out.print("Masukkan tinggi anda dalam cm: ");
        float height = s.nextFloat();
         
        // Perkalian dengan 100*100 untuk konversi cm ke m
        float bmi = (100*100*weight)/(height*height);
         
        System.out.println("BMI anda adalah: "+bmi);
        printBMIKategori(bmi);
         
    }
     
    // Prints BMI Kategori
    private static void printBMIKategori(float bmi) {
        if(bmi < 18.5) {
            System.out.println("Anda kurus");
        }else if (bmi < 25) {
            System.out.println("Anda normal");
        }else if (bmi < 30) {
            System.out.println("Anda kelebihan berat badan");
        }else {
            System.out.println("Anda obesitas");
        }
    }
}