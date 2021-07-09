public class cricket2 {
	public static void main(String[] args) {
		System.out.println("Innings Statistics!!!");
		System.out.println("");
		
		int[] runs = new int[150];
		int r=0, z=0, o=0, tw=0, th=0, fr=0, fv=0, s=0;
		float strkr = 0, avg=0;
		
		for(int i=0; i < runs.length; i++) {
			runs[i] = (int) (Math.random() * 7) + 0;
		}
		
		for(int i=0; i < runs.length; i++) {
			r = r + runs[i];
			if(runs[i] == 0) {
				z++;
			}
			else if(runs[i] == 1) {
				o++;
			}
			else if(runs[i] == 2) {
				tw++;
			}
			else if(runs[i] == 3) {
				th++;
			}
			else if(runs[i] == 4) {
				fr++;
			}
			else if(runs[i] == 5) {
				fv++;
			}
			else {
				s++;
			}
		}
		strkr = (r / 30) * 100; 
		avg = r / 5;
		
		System.out.println("Runs on each ball: ");
		for(int i=0; i < runs.length; i++) {
			System.out.println("Ball " + i + ": " + runs[i] + "");
		}
		
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("Average score of 5 innings: " + avg);
		System.out.println("---------------------------------");
		System.out.println("Total runs: " + r);
		System.out.println("---------------------------------");
		System.out.println("Number of 0s: " + z);
		System.out.println("Number of 1s: " + o);
		System.out.println("Number of 2s: " + tw);
		System.out.println("Number of 3s: " + th);
		System.out.println("Number of 4s: " + fr);
		System.out.println("Number of 5s: " + fv);
		System.out.println("Number of 6s: " + s);
		System.out.println("---------------------------------");
		System.out.println("Strike Rate: " + strkr );
	
	}
}
