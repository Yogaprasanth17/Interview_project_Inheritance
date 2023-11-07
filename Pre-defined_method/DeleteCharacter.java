public class DeleteCharacter {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("apple");
		for(int i=0;i<sb.length();i++) {
		    String t = Character.toString(sb.charAt(i));
		    if(t.matches("[aeio]")) {
		        sb.deleteCharAt(i);
		    }
		}
		System.out.print(sb);
	}
}