package com.edu.linhhn.dsa.sorting;

public class MergeSort {
	public static void mergeV1(int[] list1, int[] list2, int[] temp) {
		int id1 = 0, id2 = 0, idTemp = 0;

		while (idTemp < temp.length) {
			if(id1 == list1.length && id2 < list2.length) {
				for(int j = id2; j < list2.length; j++ ){
					temp[idTemp] = list2[j];
					idTemp++;
				}
				break;
			}
			
			if(id2 == list2.length && id1 < list1.length) {
				for(int j = id1; j < list1.length; j++ ){
					temp[idTemp] = list1[j];
					idTemp++;
				}
				break;
			}
			
			if (list1[id1] > list2[id2]) {
				temp[idTemp] = list2[id2];
				id2++;
			} else {
				temp[idTemp] = list1[id1];
				id1++;
			}
			idTemp++;
		}
		
		
		for(int i : temp) {
			System.out.println(i + " ");
		}

	}
	
	public static void mergeV2(int[] list1, int[] list2, int[] temp) {
		int id1 = 0, id2 = 0, idTemp = 0;

		while (id1 < list1.length && id2 < list2.length) {
			
			if (list1[id1] > list2[id2]) {
				temp[idTemp] = list2[id2];
				id2++;
			} else {
				temp[idTemp] = list1[id1];
				id1++;
			}
			idTemp++;
		}
		
		while(id1 < list1.length) {
			temp[idTemp++] = list1[id1++];
		}
		
		while(id2 < list2.length) {
			temp[idTemp++] = list1[id2++];
			
		}
		
		for(int i : temp) {
			System.out.println(i + " ");
		}

	}
	
	public static void main(String[] args) {
		int[] list1 = {2, 4, 7,9,11,11,12};
		int[] list2 = {1, 3, 5, 5, 6};
		int[] temp = new int[list1.length + list2.length];
		
		mergeV2(list1, list2, temp);
	}
}
