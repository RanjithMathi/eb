package com.first.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EbAshManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbAshManagementApplication.class, args);
	}
}
/*
 * static int globalGivenArr[] = new int[0];
 * 
 * public static void main(String args[]) throws Exception {
 * 
 * Scanner s = new Scanner(System.in); int givenArrLen = s.nextInt(); String
 * givenSpacedArr[]=new String[givenArrLen]; givenSpacedArr =
 * s.nextLine().split(" "); globalGivenArr = new int[givenArrLen]; for (int i =
 * 0; i < givenArrLen; i++) { globalGivenArr[i] =
 * Integer.parseInt(givenSpacedArr[i]); }
 * 
 * int givenQueryArrLen = s.nextInt(); String queryArr[] = new
 * String[givenQueryArrLen]; EbAshManagementApplication
 * ebAshManagementApplication = new EbAshManagementApplication(); for (int i =
 * 0; i < givenQueryArrLen; i++) { queryArr[i] = s.nextLine(); }
 * 
 * for (int i = 0; i < queryArr.length; i++) { if
 * (queryArr[i].contains("Increment")) {
 * ebAshManagementApplication.incremntMethod(queryArr[i]); } else if
 * (queryArr[i].contains("Update")) {
 * ebAshManagementApplication.updatePosByVal(queryArr[i]); } else if
 * (queryArr[i].contains("Left")) { ebAshManagementApplication.leftArr(); } else
 * if (queryArr[i].contains("Right")) { ebAshManagementApplication.rightArr(); }
 * else if (queryArr[i].contains("?")) {
 * ebAshManagementApplication.printPos(queryArr[i]); } } s.close(); }
 * 
 * public int[] leftArr() { for (int i = 0; i < globalGivenArr.length; i++) { if
 * (i == globalGivenArr.length) globalGivenArr[0] = globalGivenArr[i];
 * globalGivenArr[i + 1] = globalGivenArr[i]; } return globalGivenArr; }
 * 
 * public int[] rightArr() { for (int i = 0; i < globalGivenArr.length; i++) {
 * if (i == globalGivenArr.length) globalGivenArr[i] = globalGivenArr[0];
 * globalGivenArr[i] = globalGivenArr[i + 1]; } return globalGivenArr; }
 * 
 * public void printPos(String positionToPrint) { int positionTo =
 * Integer.parseInt(positionToPrint.split(" ")[0]);
 * System.out.println(globalGivenArr[positionTo]); }
 * 
 * public int[] incremntMethod(String positionToPrint) { int positionTo =
 * Integer.parseInt(positionToPrint.split(" ")[1]); globalGivenArr[positionTo] =
 * globalGivenArr[positionTo] + 1; return globalGivenArr; }
 * 
 * public int[] updatePosByVal(String positionToUpdateValue) { int positionTo =
 * Integer.parseInt(positionToUpdateValue.split(" ")[1]);
 * globalGivenArr[positionTo] =
 * Integer.parseInt(positionToUpdateValue.split(" ")[2]); return globalGivenArr;
 * } }
 */
//
///* IMPORTANT: Multiple classes and nested static classes are supported */
//
//import java.util.*;
//
//// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
//
//class TestClass {
//	public static void main(String args[]) throws Exception {
//		// Scanner
//		Scanner s = new Scanner(System.in);
//		List<Integer> givenArrList = new ArrayList<Integer>();
//		while (s.hasNextInt())
//			givenArrList.add(s.nextInt());
//		int[] givenArr = givenArrList.toArray(new int[0]);
//
//		List<Integer> givenQueryList = new ArrayList<Integer>();
//		while (s.hasNextInt())
//			givenQueryList.add(s.nextInt());
//		int[] givenQueryArr = givenQueryList.toArray(new int[0]);
//
//	}
//
//	public int[] leftArr() {
//		for (int i = 0; i < globalGivenArr.length; i++) {
//			if (i == globalGivenArr.length)
//				globalGivenArr[0] = globalGivenArr[i];
//			globalGivenArr[i + 1] = globalGivenArr[i];
//		}
//		return globalGivenArr;
//	}
//
//	public int[] rightArr() {
//		for (int i = 0; i < globalGivenArr.length; i++) {
//			if (i == globalGivenArr.length)
//				globalGivenArr[i] = globalGivenArr[0];
//			globalGivenArr[i] = globalGivenArr[i + 1];
//		}
//		return globalGivenArr;
//	}
//
//	public void printPos(String positionToPrint) {
//		int positionTo = positionToPrint.split(" ")[0];
//		System.out.println(globalGivenArr[positionTo]);
//	}
//
//	public int[] incremntMethod(String positionToPrint) {
//		int positionTo = positionToPrint.split(" ")[1];
//		globalGivenArr[positionTo] = globalGivenArr[positionTo] + 1;
//		return globalGivenArr;
//	}
//
//	public int[] updatePosByVal(String positionToUpdateValue) {
//		int positionTo = positionToPrint.split(" ")[1];
//		globalGivenArr[positionTo] = positionToPrint.split(" ")[2];
//		return globalGivenArr;
//	}
//}
