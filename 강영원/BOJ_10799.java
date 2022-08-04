import java.util.Scanner;

public class BO_10799 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		int start =0;
		int ans =0;
		
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			
			if(c == '(') {  //열린 괄호면 start +1해주기
				start++;
			} else { // 닫힌 괄호면
				start--;  // 빼주기
				
				if(input.charAt(i-1) == '(') {  //그 전 괄호가 열린거면 start값 만큼 더해주기
			
					ans += start;  
				} else {  //그 전 괄호 닫힌 괄호면 아님
					ans++; //그냥 1 더해줌
					
				}
			}
		}
		System.out.println(ans);

	}
	

}
