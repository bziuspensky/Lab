//Класс Palindrome
public class Palindrome {
	//Метод main. Принимает массив строк
    public static void main(String[] args) {
		//Цикл перебирающий массив args
        for (int i = 0; i < args.length; i++) {
			String s = correctString(args[i]);
			//Если s = развернутому s, то печатаем что это палиндром
			if (s.equals(reverseString(s))){
				System.out.println(args[i]+" --- палиндром!"); 
			}
			else { //иначе печатаем что строка не является палиндромом
				System.out.println(args[i]+" --- не палиндром.");
			}
        }
    }
	
	//Метод correctString. Удаляет все пробелы, знаки препинания и переводит все буквы в нижний регистр
	//Благодаря этому методу программа может определять палиндромы вроде "A man, a plan, a canal -- Panama!"
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
	
	//Метод reverseString. Разворачивает строку
	public static String reverseString(String s){
		String rs="";
		//Цикл добавляющий к rs символы строки s, начиная с конца строки s
		for (int i = 0; i < s.length(); i++){
			rs+=s.charAt((s.length()-1)-i);
		}
		return rs;
	}
}