package inflearn04_string_stringbuilder;

public class StringBuilderExample {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		// append(...) 
		sb.append("Java ");
		sb.append("Program Study");
		
		System.out.println(sb.toString());
		
		// 지정된 위치에 문자를 대입시킨다.
		sb.insert(1,  "2");
		System.out.println(sb.toString());
		
		// 지정된 인덱스에 문자를 바꾼다
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		// 지정된 위치를 해당 문자열과 바꾼다.
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		// 공백포함
		int length = sb.length();
		System.out.println("총 문자 수 : " + length);
		
		
		String result = sb.toString();
		System.out.println(result);
	} // main
	
} // end class
