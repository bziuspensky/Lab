import java.io.*;

//����� Lab1
public class Lab1 
{
	//����� main
    public static void main(String[] args) 
	{
		//������� ���������� ������ Point3d
		Point3d A = new Point3d();
		Point3d B = new Point3d();
		Point3d C = new Point3d();
		//������ ������ � ���������� ������ Point3d
		System.out.println("\n");
		PointInsert(A, "������� ���������� ����� �:");
		PointInsert(B, "������� ���������� ����� B:");
		PointInsert(C, "������� ���������� ����� C:");
		//���� ���� �� ���� �� ����������� �����, �� ������� ������
		if (A.equals(B) || B.equals(C) || C.equals(A)) {
			System.out.println("\n������! ��������� ����� ���������.");
		}
		//����� ������� ���������� ����� ������� � ������� ������������
		else {	
			System.out.println(" AB="+A.distanceTo(B)+"\n AC="+A.distanceTo(C)+"\n BC="+B.distanceTo(C));
			System.out.println(" S="+computeArea(A,B,C));
		}
    }

	//����� PointInsert. ��������� ���� ������� Point3d
	public static void PointInsert (Point3d point, String s) {
		System.out.println(s);
		System.out.print(" X: ");
		point.setX(getDouble());
		System.out.print(" Y: ");
		point.setY(getDouble());
		System.out.print(" Z: ");
		point.setZ(getDouble());
		System.out.println("\n");
	} 
	//����� computeArea. ��������� ������� ������������ �� �������� ������
	public static double computeArea (Point3d A, Point3d B, Point3d C) {
		double AB = A.distanceTo(B);
		double AC = A.distanceTo(C);
		double BC = B.distanceTo(C);
		double p=(AB+AC+BC)/2;
		return Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
	}
	 
	 
    public static double getDouble() {

        // There's potential for the input operation to "fail"; hard with a
        // keyboard, though!
        try {
            // Set up a reader tied to standard input.
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

            // Read in a whole line of text.
            String s = br.readLine();

            // Conversion is more likely to fail, of course, if there's a typo.
            try {
                double d = Double.parseDouble(s);

                //Return the inputted double.
                return d;
            }
            catch (NumberFormatException e) {
                // Bail with a 0.  (Simple solution for now.)
                return 0.0;
            }
        }
        catch (IOException e) {
            // This should never happen with the keyboard, but we'll
            // conform to the other exception case and return 0 here,
            // too.
            return 0.0;
        }
    }
}