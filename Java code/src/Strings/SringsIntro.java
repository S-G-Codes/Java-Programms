import java.util.Scanner;

public class SringsIntro {
    public static void main(String[] args) {
        //decleration of string
        // String name = "Tuffy";
        // String para = " Lorem sdfsd,fsdfkjsdfjksdfbdsj sdfsdjkfasdjlfbs msdbfmsdbfsdj fhjf";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Freaking name: ");
        String name = sc.nextLine();
        System.out.println(" Your Freaking name is : " + name);


        //concatenation
        String firstName = "Jully";
        String lastName = "Johnson";
        String Fullname = firstName + " " + lastName;
        System.out.println(Fullname);



        //Length of String
        System.out.println(Fullname.length());


        //charAt
        for (int i = 0; i < Fullname.length(); i++) {
            System.out.println(Fullname.charAt(i));
            
        }


//comparing String
String name1 = "Tuffy";
String name2 = "Nmae";


//Before Comoaring it check this three cond
//1  s1> s2  => any +ve Integer
//2  s1== s2  => 0
//1  s1< s2  =>Any -ve value


if(name1.compareTo(name2) ==0 ){
System.out.println("Yes its same");
}else{
System.out.println("Not  same");

}



//substring

String sentence = "My name is Maxx";
String n = sentence.substring(11,14);
System.out.println(n);

    }
}
