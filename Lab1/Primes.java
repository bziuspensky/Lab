
//Класс Primes
public class Primes 
{
	//Метод main. Принимает массив строк
    public static void main(String[] args) 
	{
		//Перебор чисел от 2 до 100
		System.out.println("\nПростые числа от 2 до 100:");
		for	(int i = 2; i<=100; i++) {
			//Если число i простое, то выводим его
			if (isPrime(i)==true) {
				System.out.println(" "+i);
			}
		}
    }
	//Метод isPrime. Получает целое число, выдает true если число простое
	public static boolean isPrime(int n) {
		if (n==2){ //2 - простое число. Если n=2 то сразу выводим true
			return true;
		}
		else {
			//Последовательно делим n на числа от 2 до n-1
			//Если хотябы одно деление числа будет без остатка, то
			//выводим false, т.к. в этом случае число не может являться простым 
			for (int i=2; i<n; i++)
			{
				if (n%i == 0) {
					return false;
				}
			}
			//Если цикл не выдал false, то выдаем true
			return true;
		}
	}
}