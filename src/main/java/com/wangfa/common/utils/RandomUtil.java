package com.wangfa.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 
 * @ClassName: RandomUtil 
 * @Description: 随机数
 * @author: wangfa
 * @date: 2020年2月27日 上午9:42:39
 */
public class RandomUtil {
	public static int random(int min,int max){
		Random random=new Random();
		int i=random.nextInt(max-min+1)+min;
		return i;
	}
	
	
	public static int[] subRandom(int min,int max,int subs){
		int[] arr=new int[subs];
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		while (hashSet.size()!=subs) {
			int i = random(min, max);
			hashSet.add(i);
		}
		int k=0;
		for (Integer value : hashSet) {
			arr[k]=value;
			k++;
		}
		
		return arr;
	}
	
	
	public static char randomCharacter(){
		String string="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return string.charAt(random(0, string.length()-1));
	}
	
	
	public static String randomString(int length){
		String str="";
		for (int i = 0; i < length; i++) {
			str+=randomCharacter();
		}
		return str;
	}
	
	
	
	
	
	
	
	
	
	
}
