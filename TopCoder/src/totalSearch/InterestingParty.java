package totalSearch;

import java.util.HashMap;

public class InterestingParty {

	public int bestInvitation(String[] first, String[] second) {
		HashMap<String,Integer> dic = new HashMap<String,Integer>();
		
		for(int i=0;i<first.length;i++) {
			dic.put(first[i], 0);
			dic.put(second[i],0);
		}
		System.out.println(dic);
		for(int i=0;i<first.length;i++) {
			dic.put(first[i],dic.get(first[i])+1);
			dic.put(second[i],dic.get(second[i])+1);
		}
		System.out.println(dic);
		int answer=0;
		for(String key :dic.keySet()) {
			answer= Math.max(answer,dic.get(key));
		}
					
		
		return answer;
	}
	
	
	public static void main(String[] args) {

		String [] first= {"fishing","gardening","swimming","fishing"};
		String [] second= {"hunting","fishing","fishing","biting"};
		
		InterestingParty ip = new InterestingParty();
		System.out.println(ip.bestInvitation(first, second));
	}

}
