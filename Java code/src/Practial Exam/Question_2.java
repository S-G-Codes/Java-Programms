

import TYBBACA.*;

import java.io.*;

 

public class Question_2 {

    public static void main(String args[])throws Exception{

        int r,n1,n2,t;

        String snm, tnm, sub;

        float per;

        DataInputStream dr = new DataInputStream(System.in);


        System.out.println("How Many Student's record You Want :");

        n1 = Integer.parseInt(dr.readLine());   


        System.out.println("How Many Teacher's record You Want :");

        n2 = Integer.parseInt(dr.readLine());

        stud s1[] = new stud[n1];

        Teacher t1[] = new Teacher[n2];

        System.out.println("Enter Student Details");

        for (int i=0; i<n1; i++){

            System.out.println("Enter roll no, Student name and Percentage");

            r = Integer.parseInt(dr.readLine());

            snm=dr.readLine();

            per=Float.parseFloat(dr.readLine());

            s1[i] = new stud(r,snm,per);

        }

        System.out.println("Enter Teacher Details");

        for (int j=0; j<n2; j++){

            System.out.println("Enter Teacher id , Teacher name and Subject");

            t = Integer.parseInt(dr.readLine());

            tnm=dr.readLine();

            sub=dr.readLine();

            t1[j] = new Teacher(t,tnm,sub);

        }

        System.out.println("Student Details");

        for (int i=0; i<n1; i++){

            ((stud) s1[i]).disp();

        }

        System.out.println("Teacher Details");

        String str ="java";

        for (int j=0; j<n2; j++){

            if(str.equals(t1[j].sub)){

                t1[j].disp();

            }

        }

    }

}