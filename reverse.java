
public class reverse{
	public static void main (String args[]) {
         String str="helloworld";
	     char [] stringre=str.toCharArray();
		 int lengthof = stringre.length;
		 int i=lengthof;
		 char[] newstring = new char[i] ;
		 int j=0;
		 for (i=lengthof; i > 0; i--)
			{
			newstring[j]=stringre[i-1];
			j++;
			}
		
		System.out.println(stringre);
		System.out.println(newstring);
	}
	
}