/**
 * 
 * @author Marie Dohnalová
 * This program exercises the methods of the Time2 class to show 
 * that there are no visible changes to clients of the Time2 class. 
 */

public class TestTime2 {
	static int hour1=2;
	static int hour2=20;
	static int min1=15;
	static int min2=49;
	static int sec1=51;
	static int sec2=30;
	
	public static void main(String[] args){
		Time2 time=new Time2(hour1, min1, sec1);
		
		System.out.println("Initial time: "+time.toString());
		System.out.println("Universal string: "+time.toUniversalString());
		
		System.out.println();
		
		time.setHour(hour2);
		time.setMinute(min2);
		time.setSecond(sec2);
		
		System.out.println("Modified time: "+time.toString());
		System.out.println("Universal string: "+time.toUniversalString());
	}
}

