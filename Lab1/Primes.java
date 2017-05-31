
//����� Primes
public class Primes 
{
	//����� main. ��������� ������ �����
    public static void main(String[] args) 
	{
		//������� ����� �� 2 �� 100
		System.out.println("\n������� ����� �� 2 �� 100:");
		for	(int i = 2; i<=100; i++) {
			//���� ����� i �������, �� ������� ���
			if (isPrime(i)==true) {
				System.out.println(" "+i);
			}
		}
    }
	//����� isPrime. �������� ����� �����, ������ true ���� ����� �������
	public static boolean isPrime(int n) {
		if (n==2){ //2 - ������� �����. ���� n=2 �� ����� ������� true
			return true;
		}
		else {
			//��������������� ����� n �� ����� �� 2 �� n-1
			//���� ������ ���� ������� ����� ����� ��� �������, ��
			//������� false, �.�. � ���� ������ ����� �� ����� �������� ������� 
			for (int i=2; i<n; i++)
			{
				if (n%i == 0) {
					return false;
				}
			}
			//���� ���� �� ����� false, �� ������ true
			return true;
		}
	}
}