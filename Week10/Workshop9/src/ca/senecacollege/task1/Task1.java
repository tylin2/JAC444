/**********************************************
Workshop 9
Course:JAV444 - W
Last Name:Lin
First Name:Ting-Yeh
ID:141726182
Section:NEE
This assignment represents my own work in accordance with Seneca Academic Policy.
TING-YEH LIN
Date:2021/04/02
**********************************************/
package ca.senecacollege.task1;

public class Task1 {
	
	public static double[][] parallelMultiplyMatrix(double[][] a, double[][] b) {
		double[][] n = new double[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    n[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return n; 
	}
	
	public static double[][] sequentialMultiplyMatrix(double[][] c, double[][] d) {
		double[][] n = new double[c.length][c.length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                for (int k = 0; k < c[i].length; k++) {
                    n[i][j] += c[i][k] + d[k][j];
                }
            }
        }
        return n; 
	}
	

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				double[][] a = new double[2000][2000];
				double[][] b = new double[2000][2000];
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < b[i].length; j++) {
						a[i][j] = i;
					    b[i][j] = j;
					 }
				}
				long time = System.currentTimeMillis();					
				parallelMultiplyMatrix(a, b);
				System.out.println("parallelMultiplyMatrix() takes " + (System.currentTimeMillis() - time) + " msec");
				time = System.currentTimeMillis();
			}
		}.start();
		
		new Thread() {
			public void run() {
				double[][] a = new double[2000][2000];
				double[][] b = new double[2000][2000];
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < b[i].length; j++) {
						a[i][j] = i;
					    b[i][j] = j;
					 }
				}
				long time = System.currentTimeMillis();					
				sequentialMultiplyMatrix(a, b);
				System.out.println("sequentialMultiplyMatrix() takes " + (System.currentTimeMillis() - time) + " msec");
				time = System.currentTimeMillis();
			}
		}.start();
		

	}

}
