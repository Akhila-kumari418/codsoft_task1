import java.util.Random;
import java.util.Scanner;
class random{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Random r=new Random();
int score=0;
for(int i=1;i<=3;i++)
{
System.out.println("Round"+i);
for(int j=1;j<=3;j++)
{
int ran_num=r.nextInt(100);
System.out.println("enter a number between 1 to 100");
int guess_num=sc.nextInt();
System.out.println("your guess"+guess_num);
System.out.println("computer generated number is"+ran_num);
if(guess_num==ran_num)
{
System.out.println("your guess is correct");
score++;
}
else if(guess_num<ran_num)
{
System.out.println("your guess is too lower than computer");
}
else{
System.out.println("your guess is too higher than computer");
}
}
}
System.out.println("your score is:"+score);
}}