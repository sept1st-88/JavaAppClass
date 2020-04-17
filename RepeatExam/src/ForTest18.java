
public class ForTest18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str = "a";
		
		if(!(Str == "y" || Str == "n")) {
			System.out.println("참인경우");
		}else {
			System.out.println("??????????");
		}
		
		if(!(Str == "y" || Str == "n")) {
			System.out.println("참인경우");
		}else if(Str == "y" || Str == "n"){
			System.out.println("??????????");
		}
		
		if(Str == "y" || Str == "n") {
			System.out.println("참인경우");
		}else if(Str != "y" && Str != "n"){
			System.out.println("?????????");
		}

	}

}
