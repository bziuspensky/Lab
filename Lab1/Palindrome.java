//����� Palindrome
public class Palindrome {
	//����� main. ��������� ������ �����
    public static void main(String[] args) {
		//���� ������������ ������ args
        for (int i = 0; i < args.length; i++) {
			String s = correctString(args[i]);
			//���� s = ������������ s, �� �������� ��� ��� ���������
			if (s.equals(reverseString(s))){
				System.out.println(args[i]+" --- ���������!"); 
			}
			else { //����� �������� ��� ������ �� �������� �����������
				System.out.println(args[i]+" --- �� ���������.");
			}
        }
    }
	
	//����� correctString. ������� ��� �������, ����� ���������� � ��������� ��� ����� � ������ �������
	//��������� ����� ������ ��������� ����� ���������� ���������� ����� "A man, a plan, a canal -- Panama!"
	public static String correctString(String s){
		String rs="";
		s=s.toLowerCase();
		for (int i = 0; i < s.length()-1; i++){
			if (Character.isLetter(s.charAt(i))){
				rs += s.charAt(i);
			}
		}
		return rs;
	}
	
	//����� reverseString. ������������� ������
	public static String reverseString(String s){
		String rs="";
		//���� ����������� � rs ������� ������ s, ������� � ����� ������ s
		for (int i = 0; i < s.length(); i++){
			rs+=s.charAt((s.length()-1)-i);
		}
		return rs;
	}
}