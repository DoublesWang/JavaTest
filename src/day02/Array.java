package day02;
/*
 * 
 * ���飺������һ�����ݽṹ
 * ���ࣺһά���顢��ά����
 * 
 * 
 * ��ά���飺�ڲ�Ԫ����Ȼ��һά���������
 * */
public class Array {
	public static void main(String[] arags) {
		//�������� [] ������ = new ��������[size]
	
		int [] arr1 = new int[5];
		String [] arr2 = new String[5];	
		
		String [] names = {"����","����","����"};
		System.out.println(names[0]);
		System.out.println(names.length);
	
		
		//��ά����
		String [][] names2 = {{"����01","����02"},{"����01","����02"},{"����01","����02"}};
		
		String [][] as001 = new String[4][3];
		//ȡ��һ�е�һ��
		System.out.println(names2[0][0]);
		
	}
}
