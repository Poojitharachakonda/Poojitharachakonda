1)print the prime numbers 1 to n using while

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter a number");
	    int n = sc.nextInt();
	    System.out.println("prime numbers up to "+n+"");
	    int i =2;
	    while(i<=n){
	        boolean prime = true;
	        for(int j=2;j<i;j++){
	            if(i%j==0){
	               prime = false;
	               break;
	            }
	        }
	       if (prime){
	        System.out.println(i);
	    }
	    i++;
	}
}
}
--------------------------------------------------------------------------------------------
 
2)print the values in between 150 to 200 using do while

public class Main
{
	public static void main(String[] args) {
	    int i=150;
	   do {
	        if(i>150 && i<=200){
	            if(i%2==0){
	           System.out.println(i); 
	        }
	    }
	i++;	
	}while(i<=200);
}
}

-------------------------------------------------------------------------------------------
3)print the values in between 150 to 200 using while

public class Main
{
	public static void main(String[] args) {
	    int i=150;
	    while(i<=200){
	        if(i>150 && i<=200){
	            if(i%2==0){
	           System.out.println(i); 
	        }
	    }
	i++;	
	}
	}
}

--------------------------------------------------------------------------------------------------------------
4)print the values in between 150 to 200 using foor loop

public class Main
{
	public static void main(String[] args) {
	    for(int i=150; i<=200 ;i++) {
	        if(i>150 && i<=200){
	            if(i%2==0){
	           System.out.println(i); 
	        }
	    }
	
	}
	}
}


----------------------------------------------------------------------------------------------
5)print the values 10 to 1

public class Main
{
	public static void main(String[] args) {
	    int i=10;
	    while(i>=1){
		System.out.println(i);
		i--;
	}
	
}
}

---------------------------------------------------------------------------------------------

5) write the code how many value are initilazed in given array

public class Main
{
	public static void main(String[] args) {
	    int arr[] = new int[31];
	    arr[0]=23;
	    arr[9]=9;
	    arr[12]=2;
	    arr[8]=9;
	   int count =0;
	   for(int i=0 ;i< arr.length;i++ ){
	       if(arr[i] !=0){
	           count++;
	       }
	   }
	   System.out.println("number of initialized values"+count);
	}
}
-------------------------------------------------------------------------------------------------------


6) write a program to store elements in an array and print them
   input 10 elements in the array:
     element 0-1
     element 1-1
     .....
    expect output elements in array :1123456789

public class Main
{
	public static void main(String[] args) {
	    int arr[] = {1,1,2,3,4,5,6,7,8,9};
	    System.out.println("elements in an array :");
	    for(int i=0;i<=arr.length-1;i++){
		System.out.print(arr[i]);
	}
}
}
------------------------------------------------------------------------------------------------------------

7) write a program read n number of value in an array and display them in reverse order
   input 
   the number of elements in an array:
   1123456789
   expected output
   the values store into the array in reverse are:
   9876543211


public class Main
{
	public static void main(String[] args) {
	    int arr[] = {1,1,2,3,4,5,6,7,8,9};
	    System.out.println("tha values store into the array are");
	    for(int i=0;i<=arr.length-1;i++){
	        System.out.print(arr[i]);
	    }
	    System.out.println("\n the values store into the array in reverse are :");
	    for(int i=arr.length-1;i>=0;i--){
		System.out.print(arr[i]);
	}
}
}
-------------------------------------------------------------------------------------------------------

8) write a program to find the sum of all elements of the array
   input data
   it gives 3 elements 2,5,8
   expected output
   sum of all elements stored in the array is 15


public class Main
{
	public static void main(String[] args) {
	    int arr[] ={2,5,8};
	    int sum = 0;
	    System.out.println("sum of all elements stored in the array is");
	    for(int i=0;i<=arr.length-1;i++){
	        sum  = sum + arr[i];
	    }
	    System.out.println(sum);
	}
}
---------------------------------------------------------------------------------

9) write the to copy the elements of one array into anthor array 


public class Main
{
	public static void main(String[] args) {
	    int arr1[] ={15,10,12};
	    int arr2[] = new int[arr1.length];
	    System.out.println("the elements store in first array");
	    for(int i=0;i<=arr1.length-1;i++){
	    System.out.print(arr1[i]);
	}
	System.out.println("\nthe elements copied into the second array");
	for(int i =0;i<=arr1.length-1;i++){
	    arr2[i] = arr1[i];
	}
	for(int i=0;i<=arr2.length-1;i++){
	System.out.print(arr2[i]);
	}
}
}
------------------------------------------------------------------------------
10)revere a number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    System.out.println("enter the n number");
	    int n = sc.nextInt();
	    int reverse =0;
	    while(n!=0){
	        int lastdigit= n%10;
	        reverse=reverse*10+lastdigit;
	        n=n/10;
	    }
		System.out.println(reverse);
	}
}
-----------------------------------------------------------------------------

11) find the frequency of the given an array


public class Main
{
	public static void main(String[] args) {
	    int arr[] = {1,2,1,3,4,2,5,5};
	    int frequency[] = new int[arr.length];
	    for(int i=0;i<arr.length;i++){
	        frequency[arr[i]]++;
	    }
	    for(int i=0;i<frequency.length;i++){
	       if (frequency[i] > 0){
	        System.out.println("the element frequency is "+ arr[i] +":"+frequency[i]);
	    }
		
	}
}
}
---------------------------------------------------------------------------------


12)print the prime numbers in given an array {1,3,6,7,13,14,45}


public class Main
{
	public static void main(String[] args) {
	    int arr[] ={1,3,6,7,13,14,45};
	    
	    for(int i=0;i<arr.length;i++){
	        int num =arr[i];
	        boolean prime = true;
	    for(int j=2;j<num;j++){
	        if(num % j ==0){
	            prime = false;
	            break;
	        }
	    }
	    if(prime && num > 1)
	    {
	        System.out.println(num);
	    }
	}
}
-------------------------------------------------------------------------------


13) write a program number is perfect or not



import  java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter a n number");
	    int n = sc.nextInt();
	    int sum =0;
	    for(int i=1;i<n;i++){
	        if(n % i==0){
	            sum =sum+i;
	        }
	    }
	    if(sum == n){
		System.out.println("perfect number");
	}
	else{
	System.out.println("not perfect number");
}
}
}
----------------------------------------------------------------------------


14) write a program to find year is leap or not


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the year");
	    int y= sc.nextInt();
	    if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)){
	     System.out.println("leap year");   
	    }
	    else{
		System.out.println("not leap year");
	}
}
}
-----------------------------------------------------------------------------------------------------------


15)write a program to check a character is vowel or not




import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter a char");
	    char ch = sc.next().charAt(0);
if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e'||ch=='a'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
		    System.out.println(ch +" is a vowel");
	}
	else{
	  System.out.println(ch +" is not a vowel");  
	}
}
}
--------------------------------------------------------------------------------------------

16) write a program to reverse a number



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter a number");
	    int number = sc.nextInt();
	    int reverse=0;
	    while(number !=0){
	       int dig = number%10; //for divisable any number with 10 it gives the last digit
	       reverse = reverse *10+dig;
	       number =number/10;
	    }
	    
		System.out.println(reverse);
	}
}
-----------------------------------------------------------------------------------------------


17) write aprogram to find a sub string in given string




public class Main
{
	public static void main(String[] args) {
	    String str = "abc";
	    for(int i=1;i<str.length();i++){
	        for(int j=2;j<=str.length();j++){
		System.out.println(str.substring(i,j));
	}
}
}
}
------------------------------------------------------------------------------------------------------



18) write a program to check number is palindrome or not


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter a number");
	    int number = sc.nextInt();
	    int reverse=0;
	    while(number!=0){
	        int dig = number%10;
	        reverse=reverse*10+dig;
	        number = number/10;
	    }
	    if(reverse == number){
	        System.out.println("it is a polindrome");
	    }
	    else{
		System.out.println("it is not polindrome");
	}
}
}
--------------------------------------------------------------------------------------------------------------

19)write a  program to find factorial of a number


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter a number");
	    int number = sc.nextInt();
	    long factorial =1;
	    for(int i=1;i<=number;i++){
	         factorial = factorial*i;
	    }
		System.out.println("the factorial of "+number+":is" + factorial);
	}
}
-----------------------------------------------------------------------------------------------------

20) write a program to convert binary to decimal



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input binary number as a string
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        int decimal = 0;
        int power = 0;

        // Convert binary to decimal
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        System.out.println("Decimal equivalent: " + decimal);
        scanner.close();
    }

	}

--------------------------------------------------------------------------------------------------------


21) write a program print the Pattern
              
               1 2 3
               1 2 3
               1 2 3




public class Main
{
	public static void main(String[] args) {
	    int rows = 3;
	    for(int i = 1;i <= rows; i++){
	        for(int j = 1;j <= 3; j++){
	            System.out.print( j + " ");
	        }
	       System.out.println( ); 
	    }
	
	}
}
---------------------------------------------------------------------------------------------------------


22) write a program to print the pattern
                    1
                    1 2
                    1 2 3
                    1 2 3 4


public class Main
{
	public static void main(String[] args) {
	    int rows = 3;
	    for(int i = 1;i <= rows; i++){
	        for(int j = 1;j <= i; j++){
	            System.out.print( j + " ");
	        }
	       System.out.println( ); 
	    }
	
	}
}
-----------------------------------------------------------------------------------------------------------

23) write a program to print pattern

                 1 1 1
                 2 2 2
                 3 3 3
                 4 4 4


public class Main
{
	public static void main(String[] args) {
	    int rows = 4;
	    for(int i = 1;i <= rows; i++){
	        for(int j = 1;j <= 3; j++){
	            System.out.print( i + " ");//1 1 1
	        }
	       System.out.println( ); 
	    }
	
	}
}

-------------------------------------------------------------------------------------------------------

24)           *
              * *
              * * *
              * * * *


public class Main
{
	public static void main(String[] args) {
	    int rows = 4;
	    for(int i = 1;i <= rows; i++){
	        for(int j=1;j<=i;j++){
	            System.out.print('*');
	        }
	       System.out.println( ); 
	    }
	
	}
}
----------------------------------------------------------------------------------------------------------


25) * * * *
    * * *
    * * 
    *



public class Main
{
	public static void main(String[] args) {
	    int rows = 4;
	    for(int i = 4;i >= 1; i--){
	        for(int j=1;j<=i;j++){
	            System.out.print('*');
	        }
	       System.out.println( ); 
	    }
	
	}
}

---------------------------------------------------------------------------------------------------

26)      * * * *
           * * *
             * *
               *


public class Main
{
	public static void main(String[] args) {
	    int rows = 4;
	    for(int i = 4;i >= 1; i--){
	        for(int j=4;j>i;j--){
	            System.out.println("");
	        }
	        for(int k=1;k<=i;k++)
	       System.out.print('*'); 
	    }
	
	}
}
---------------------------------------------------------------------------------------------------------


27) prime numbers in between the 100 to 200


public class Main
{
	public static void main(String[] args) {
	     System.out.println("prime a numbers between the 100 to 200 is ");
	     for(int i=100;i<=200;i++){
	         boolean prime = true;
	     if(i <= 1){
	         prime=false;
	     }
	     else{
	         for(int j =2; j<i;j++){
	             if(i%j==0){
	                 prime=false;
	                 break;
	             }
	         }
	     }
	     if(prime){
	         System.out.print(i + " ");
	     }
	     }
}
} 

---------------------------------------------------------------------------------------------------------

28) print Fibonacci series


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number upto n");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            int sum = a+b;
            a=b;
            b=sum;
            System.out.println(a);   
            }
        }
    }
----------------------------------------------------------------------------------------------------------

29) using class and object program



public class Main
{
    double length;
    double breadth;
    double area(){
        return length*breadth;
    }
	public static void main(String[] args) {
	    Main rect1 = new Main();
	    Main rect2 = new Main();
	    rect1.length=10;
	    rect1.breadth=20;
	    rect2.length=30;
	    rect2.breadth=40;
		System.out.println("the area of rectangle is:" + rect1.area());
		System.out.println("the area of rectangle is:" + rect2.area());
	}
}

----------------------------------------------------------------------------------




30)reverse a string




public class Main
{
	public static void main(String[] args) {
	    String s1 = " satheesh ahtijoop";
	    StringBuilder sb= new StringBuilder(s1);
	    String ch = sb.reverse().toString();
	    System.out.println(ch);
	}
}
	    
------------------------------------------------------------------------------------------------


31) write a program to read a string from key board



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter a string");
	    String sen = sc.nextLine();
	    System.out.println(" "+sen);
	}
}

------------------------------------------------------------------------------------------


32) reverse the string



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter a string");
	    String s1 = sc.nextLine();
	    System.out.println(" "+s1);
	    StringBuilder sb = new StringBuilder(s1);
	    String s2 = sb.reverse().toString();
	    System.out.println(" "+s2);
	}
}
--------------------------------------------------------------------------------------------


33) write a program to read a dynamic string from a key board and whether it is palindrome or not



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter a string");
	    String s1 = sc.nextLine();
	    StringBuilder sb = new StringBuilder(s1);
	    String s2 = sb.reverse().toString();
	    if(s1.equals(s2)){
	    System.out.println("string is palindrome");
	}
	else{
	    System.out.println("string is not palindrome");
	}
}
}

----------------------------------------------------------------------------------------

34) write a program to check a given character is present or not in java


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter a charecter");
	    char s = sc.next().charAt(0);
	    String s1 = "sateesh";
	    if(s1.indexOf(s) != -1){
	    System.out.println("string is thire");
	}
	else{
	    System.out.println("string is not thire");
	}
}
}
----------------------------------------------------------------------------------------


35) write a program to find the length of the string



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s1 = "satheesh";
	    int s2 = s1.length();
	    System.out.println(" "+s2);
	}
}
--------------------------------------------------------------------------------------------


36) write a program using abstract



abstract class shap{
 abstract void draw();
 
}
  class circle extends shap{
     void draw(){
    System.out.println("draw circle");
}
}
  class rectangle extends circle{
      void draw(){
        System.out.println("draw a rectangle");
    }
}
public class Main
{
	public static void main(String[] args) {
		shap c = new circle();
		circle r = new rectangle();
		c.draw();
		r.draw();
	}
}	    
    
------------------------------------------------------------------------------------------



37)  write a program using inheriting




class employee{
     float salary = 500000;
 }
 class programmer extends employee{
     int bouns = 5000;
 }
 public class Main{
     public static void main(String args[]){
     programmer p = new programmer();    
     System.out.println("programer salary"+p.salary);
     System.out.println("programer salary"+p.bouns);
 }
 }
