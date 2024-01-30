package com.sample;
import java.util.Random;
import java.util.Scanner;
public class prs {
 
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("*******************************************");
		System.out.println("*   Rock Paper Scissor   *");
		System.out.println("*******************************************");
		int a=10;
		int h=0;
		int A=0;
		while(a>0) {
			display();
			System.out.println("Enter your option");
			String c=s.next();
			if(c.equals("R")) {
				Random r=new Random();
				int comp=10+r.nextInt(3)+1;
				if(comp==11) {
					System.out.println("You: Rock");
					System.out.println("AI: Rock");
					System.out.println("Game is draw");
					System.out.println("You Win="+h++);
					System.out.println("AI Win="+A++);
					
				}
				if(comp==12) {
					System.out.println("You: Rock");
					System.out.println("AI: Scissor");
					System.out.println("YOU is win ");
					System.out.println("You Win="+h++);
					System.out.println("AI Win="+A++);
				}
				if(comp==13) {
					System.out.println("You: Rock");
					System.out.println("AI: Paper");
					System.out.println("AI is Win");
					System.out.println("You Win="+h++);
					System.out.println("AI Win="+A++);
				}
				
			}
			if(c.equals("P")) {
				Random r=new Random();
				int comp=20+r.nextInt(3)+1;
				if(comp==21) {
					System.out.println("You: Paper");
					System.out.println("AI: Rock");
					System.out.println("You is Win");
					System.out.println("You Win="+h++);
					System.out.println("AI Win="+A++);
					
				}
				if(comp==22) {
					System.out.println("You: Paper");
					System.out.println("AI: Paper");
					System.out.println("Game is draw ");
					System.out.println("You Win="+h++);
					System.out.println("AI Win="+A++);
				}
				if(comp==23) {
					System.out.println("You: Paper");
					System.out.println("AI: Scissor");
					System.out.println("AI is Win");
					System.out.println("You Win="+h++);
					System.out.println("AI Win="+A++);
				}
				
			}
			if(c.equals("S")) {
				Random r=new Random();
				int comp=30+r.nextInt(3)+1;
				if(comp==31) {
					System.out.println("You: Paper");
					System.out.println("AI: Rock");
					System.out.println("You is Win");
					System.out.println("You Win="+h++);
					System.out.println("AI Win="+A++);
					
				}
				if(comp==32) {
					System.out.println("You: Paper");
					System.out.println("AI: Scissor");
					System.out.println("AI is win ");
					System.out.println("You Win="+h++);
					System.out.println("AI Win="+A++);
					A++;
					
				}
				if(comp==33) {
					System.out.println("You: Paper");
					System.out.println("AI: Paper");
					System.out.println("Game is draw");
					System.out.println("You Win="+h++);
					System.out.println("AI Win="+A++);
				}
				
			}
			
			
		}
		
	}
	public static void display() {
		System.out.println("1. Rock:R");
		System.out.println("2. Paper:P");
		System.out.println("3. Scissor:S");
		System.out.println("________________________________________________________");
	}
	}