public class Reverse{


public static void main(String []args)
{

String str1="jagan";
String str2="";
int len=str1.length();

for(int i=0;i<len;i++)
{
  char ch= str1.charAt(i);
  str2=ch+str2;

}
System.out.println(str2);


}


}