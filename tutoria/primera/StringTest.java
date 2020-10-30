import java.util.*;

public class StringTest {
	public static void main(String[] args) {
		String str = "abc";
		StringBuilder str_builder = new StringBuilder();

		for(int i = 0; i < 26; i++){
			//str += str;
			str_builder.append(str_builder.toString());
		}

		//System.out.println(str);
//		System.out.println(str_builder);
	}
}
