package com.company;

import java.io.IOException;

public class Main {

	int mmm = 3;
	//EditText ed;

		public static void main(String[] args) {
		// throw - выброс искусств.исключ
			// throws - для методов
			
			try {
				Car.dooo();
			} catch (Exception e) {
				e.printStackTrace();
			}


			if(1==2) {
				throw new NullPointerException("Случилось страшное!");
			}

			throw new ArrayIndexOutOfBoundsException("Выход за пределы!");



			/*

			try {
				int a = 100;
				int b = 0;
				int[] d = {2,3,4};
				d[100] = 8;
				int c = a / b;
			} catch(ArithmeticException|ArrayIndexOutOfBoundsException v) {
				System.out.println("Случилось:" + v.toString());
			} finally {
				System.out.println("Всегда выполняется!!!!");
			}
			System.out.println("Что-то после...");


			 */
		}
}
