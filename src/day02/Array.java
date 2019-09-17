package day02;
/*
 * 
 * 数组：数组是一种数据结构
 * 分类：一维数组、多维数组
 * 
 * 
 * 二维数组：内部元素仍然是一维数组的数组
 * */
public class Array {
	public static void main(String[] arags) {
		//数组类型 [] 数组名 = new 数据类型[size]
	
		int [] arr1 = new int[5];
		String [] arr2 = new String[5];	
		
		String [] names = {"张三","李四","王五"};
		System.out.println(names[0]);
		System.out.println(names.length);
	
		
		//二维数组
		String [][] names2 = {{"张三01","张三02"},{"李四01","李四02"},{"王五01","王五02"}};
		
		String [][] as001 = new String[4][3];
		//取第一行第一列
		System.out.println(names2[0][0]);
		
	}
}
