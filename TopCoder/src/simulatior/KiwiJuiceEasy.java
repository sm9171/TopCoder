package simulatior;

public class KiwiJuiceEasy {
	public int[] thePouring(int[] capacities,int[]bottles,int[]fromId,int[]toId) {
		for(int i= 0;i<fromId.length;i++) {
			int f = fromId[i];
			int t = toId[i];
			int space = capacities[i]-bottles[i];
			if(space>=bottles[f]) {
				int vol=bottles[f];
				bottles[t]+= vol;
				bottles[f]=0;
			}else {
				int vol= space;
				bottles[t]+= vol;
				bottles[f]-=space;
			}
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
