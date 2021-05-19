
public class StringCalculator {
	public int add(String nums) {
		int sum = -1;
		if(nums.isEmpty()) {
			sum= 0;
		}
		else {
			if(nums.length()==1) sum= 1;
			
			else {
				sum=0;
				String[] ss = nums.split(",");
				for(int i=0;i<ss.length;i++) {
					sum+=Integer.valueOf(ss[i]);
				}
				
			}
		}
	return sum;
		
	}

}
