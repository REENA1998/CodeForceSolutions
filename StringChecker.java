package com.apple.mobileapps;

import java.util.Scanner;

public class StringChecker {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());

		while(t-->0){
			    String s =sc.next();

                String temp ="";
				boolean flag=true;
					for(int i=0;i<s.length();i++) {
						if ((i == 0 || s.charAt(i) != s.charAt(i-1)) && (i == s.length()- 1 || s.charAt(i) != s.charAt(i+1))) {
							flag=false;
							break;
						}
					}

						if(flag==true){
							System.out.println("yes");
						}
						else{
							System.out.println("no");
						}

					}
				

		}

}

