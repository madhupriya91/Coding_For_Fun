import java.util.*;


public class EnglishInt {
	private static String convert(int num){
		String res="";
		String[] units={"","one","two","three","four","five","six","seven","eight","nine"};
		String[] tens={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen",};
		ArrayList<Integer> digits=new ArrayList<>();
		int temp=num;
		if(num==0)
			return "zero";
		while(temp>0){
			digits.add(temp%10);
			temp/=10;
			
		}
		int len=digits.size();
		int index=len-1;
		if(len==3){
		     
			res=res+units[digits.get(index--)]+" hundred ";
			len--;
		}
		if(len>1){
		if(digits.get(index)==1){
			res+=tens[digits.get(index-1)+10];
			return res;
			
		}
		}
		if(len==2){
			res+=tens[digits.get(index)]+" ";
			index--;
		len--;	
		}
			res+=units[digits.get(index)]+" ";
			
			
		
		
			
		
			
			
		
			
		
		
		
		
		return res;
}
		
	private static String convertWhole(int num){
		int temp=num;
		String res="";
		ArrayList<Integer> digits=new ArrayList<>();
		if(num==0)
			return "zero";
		while(temp>0){
			digits.add(temp%1000);
			temp/=1000;
			
		}
		int len=digits.size();
		int index=len-1;
		if(len==3){
		     
			res+=convert(digits.get(index--))+" million ";
			len--;
		}
		
		if(len==2){
			res+=convert(digits.get(index))+" thousand ";
			index--;
		len--;	
		}
			res+=convert(digits.get(index))+" ";
			
			
		
		
			
		
			
			
		
			
		
		
		
		
		return res;
}
		
		
		
	
	
	
	
	
	public static void main(String args[]){
		
		String result=convertWhole(123008105);
		System.out.println(result);
		
		
	}

}
