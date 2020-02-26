package str.exam;

public class StringLv4_2_Class {
	String changeStr = ""; //리턴 값
	String interestingStr = ""; //대상
	int interestingIndex = 0;
	
	String changeWord1(String originStr) {
		changeStr = originStr;
		interestingStr = "자바";
		
		String frontStr = "";
		String centerStr = "";
		String endStr = "";

		for (int i = 0; i < 2; i++) {
			interestingIndex = changeStr.indexOf(interestingStr);
			
//			System.out.println(interestingIndex);
			
			frontStr = changeStr.substring(0, interestingIndex);
//			System.out.println(frontStr);
			centerStr = changeStr.substring(interestingIndex, interestingIndex + 
					interestingStr.length());
//			System.out.println(centerStr);
			centerStr = centerStr.replace(interestingStr, "DB");
//			System.out.println(centerStr);
			endStr = changeStr.substring(interestingIndex + interestingStr.length());
//			System.out.println(endStr);
			
			changeStr = frontStr + centerStr + endStr;
		}
		return changeStr;
	}
	
	String changeWord2(String originStr) {
		changeStr = originStr;
		interestingStr = "문자열";
		
		String frontStr = "";
		String centerStr = "";
		String endStr = "";
		
		for (int i = 0; i < interestingStr.length(); i++) {
			interestingIndex = changeStr.indexOf(interestingStr);
			
			frontStr = changeStr.substring(0, interestingIndex);
			centerStr = changeStr.substring(interestingIndex, interestingIndex + 
					interestingStr.length());
			centerStr = centerStr.replace(interestingStr, "인스턴스");
			endStr = changeStr.substring(interestingIndex + interestingStr.length());
			
			changeStr = frontStr + centerStr + endStr;
		}
		return changeStr;
	}
	

}
