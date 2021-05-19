
public class StringCalculator {
	static int count=0; 
	public static int add(String text) {
		StringCalculator.count+=1;
		
		if(text.equals("")){
			return 0;
		}
		else{
			String delimiter = ",";
			if(text.matches("//(.*)\n(.*)")){
				delimiter = Character.toString(text.charAt(2));
				text = text.substring(4);
			}
			
			String numList[] = splitNumbers(text, delimiter + "|\n");
			return sum(numList);
		}
		}
	
	private static int sum(String[] s) {
		int total = 0;
		String neg_s = "";
		for(String num:s) {
			if(Integer.parseInt(num)<0) {
				if(neg_s.equals("")) 
					neg_s+=num;
				else
					neg_s+=(","+num);
				
			}
			else {
				total+=Integer.parseInt(num);
			}
			
			
		}
		if(!neg_s.equals("")){
			throw new IllegalArgumentException("negatives not allowed: " + neg_s);
		}
		return total;
	}
	private static String[] splitNumbers(String n,String d) {
		return n.split(d);
	}
	public static int GetCalledCount() {
		return StringCalculator.count;
	}
	
		
	}


