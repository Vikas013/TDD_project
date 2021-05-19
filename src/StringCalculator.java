
public class StringCalculator {
	public static int add(String text) {
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
		for(String num:s) {
			total+=Integer.parseInt(num);
			
		}
		return total;
	}
	private static String[] splitNumbers(String n,String d) {
		return n.split(d);
	}
	
		
	}


