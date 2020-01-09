package KattisProblems;

import java.util.*;
public class pA{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
while(sc.hasNextInt()){
int x=sc.nextInt();
System.out.println((int)(Math.log10(Math.sqrt(2*x*Math.PI))+x*Math.log10(x/Math.E))+1);
}
sc.close();
}
}