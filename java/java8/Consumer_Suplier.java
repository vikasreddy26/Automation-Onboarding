package java8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Consumer_Suplier {

    public static void main(String[] args) {
        Product p1 = new Product("Fan",1600,"Electronics","A");
        Product p2 = new Product("TubeLight",600,"Electronics","A");
        Product p3 = new Product("TV",20000,"Electronics","A");
        Product p4 = new Product("NoteBook",40,"Stationary","A");
        Product p5 = new Product("Bulb",50,"Electronics","A");
        Product p6 = new Product("Switch",70,"Electronics","A");
        Product p7  = new Product("TextBook",200,"Stationary","A");

        ArrayList<Product> al = new ArrayList<>();
        al.add(p1);
        al.add(p4);
        al.add(p3);
        al.add(p2);
        al.add(p5);
        al.add(p6);
        al.add(p7);
        for(int i =0;i<=al.size()-1;i++){
            if(al.get(i).getPrice()>1000){
                updateGrade().accept(al.get(i));
            }
        }
        System.out.println("********************Updated grade to 'premium' if price is more than 1000***************");
        System.out.println(al);
        for(int i =0;i<=al.size()-1;i++){
            if(al.get(i).getPrice()>3000){
                updateName().accept(al.get(i));
            }
        }
        System.out.println("********************Updated Name suffixed with '*' if price is greater than 3000*****************");
        System.out.println(al);
        for(int i =0;i<=al.size()-1;i++){
            if(al.get(i).getGrade().equals("Premium")){
                updateName().accept(al.get(i));
            }
        }
        System.out.println("******************************** Updated Name suffixed with '*' if the grade is premium **********************************");
        System.out.println(al);
        System.out.println("************************************************************");
        printProductToMedium(p1,"Console");

        System.out.println(" Random OTP Using supplier : "+genrateOTP(6).get());

    }
    public static void printProductToMedium(Product p,String s){
        Consumer file =file(p);
        Consumer console =console(p);
        if (s.equals("SetToFile")){
            file.accept(p);
        }else if(s.equals("Console")){
            console.accept(p);
        }
    }
    public static Consumer<Product> console(Product p){
       Consumer<Product> console = (b)->{
            System.out.println(p);
        };
       return console;
    }
    public static Consumer<Product> file(Product p){
        Consumer<Product> file = (a)->{
            try {
                FileWriter myWriter = new FileWriter("Product.txt");
                myWriter.write(p.toString());
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        };
        return file;
    }

    public static Consumer<Product> updateGrade(){
         Consumer<Product> grade = (p)->{
            p.setGrade("Premium");
        };
        return grade;
    }
    public static Consumer<Product> updateName(){
        Consumer<Product> grade = (p)->{
            p.setName(p.getName()+"*");
        };
        return grade;
    }

    public static Supplier<String> genrateOTP(final int lengthOfOTP) {
        return () -> {
            StringBuilder otp = new StringBuilder();
            Random random = new Random();
            for (int i = 0; i < lengthOfOTP; i++) {
                int randomNumber = random.nextInt(9);
                otp.append(randomNumber);
            }
            return otp.toString();
        };
    }
}
