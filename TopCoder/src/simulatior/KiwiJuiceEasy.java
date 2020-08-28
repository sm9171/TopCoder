package simulatior;

public class KiwiJuiceEasy {
	public int[] thePouring(int[] capacities,int[]bottles,int[]fromId,int[]toId) {
		for(int i= 0;i<fromId.length;i++) {
			int f = fromId[i];
			int t = toId[i];
			
			int vol =Math.min(bottles[f], capacities[t]-bottles[t]);
			
			bottles[f]-=vol;
			bottles[t]+=vol;
			
		}
		return bottles;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KiwiJuiceEasy kiwi = new KiwiJuiceEasy();
		int[] capacities={20,20};
		int[] bottles={5,8};
		int[] fromId={0};
		int[] toId={1};
		int[] result = kiwi.thePouring(capacities,bottles ,fromId ,toId );
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}

}
