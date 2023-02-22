


import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());

		while(t-->0) {
			int n = Integer.parseInt(sc.next());
			int m = Integer.parseInt(sc.next());
			String s = sc.next() + new StringBuilder(sc.next()).reverse();
			int c = 0;
			for(int i=1; i<n+m; i++) {
				if(s.charAt(i)==s.charAt(i-1)) c++;
			}
			System.out.println(c <= 1 ? "YES" : "NO");
		}
	}
}