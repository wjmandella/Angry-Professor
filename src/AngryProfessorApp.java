// My solution to the HackerRank.com problem "Angry Professor."
// https://www.hackerrank.com/challenges/angry-professor/problem

import java.util.Scanner;

public class AngryProfessorApp {
    static String angryProfessor(int k, int[] a) {

    	String msg = "YES";
    	int onTimeStudentCount = 0;
    	
    	for(int i = 0; i < a.length; i++) {
    		if(a[i] <= 0) {
    			onTimeStudentCount++;
    		}
    	}
    	
    	if(onTimeStudentCount >= k) {
    		msg = "NO";
    	}    	
    	return msg;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of test cases, T (integer 1-10): ");       
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            System.out.print("Enter the number of students, N (integer 1-1000), for case #" +(a0+1)+": ");
            int n = in.nextInt();
            System.out.print("Enter the cancelation threshold, K (integer 1-N), for case #" +(a0+1)+": ");          
            int k = in.nextInt();
            int[] a = new int[n];
            for(int a_i = 0; a_i < n; a_i++){
                System.out.print("Enter the arrival time in minutes (integer -100 to 100) for student #"+(a_i+1)+": ");
                a[a_i] = in.nextInt();
            }
            String result = angryProfessor(k, a);
            System.out.println(result);
        }
        in.close();
    }
}
