
/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }
	//����� equals. ���������� 2 ������� 
	public boolean equals(Object Obj) {
		if (getClass()!=Obj.getClass()){
			return false;
		}
		else {
			Location another_loc = (Location) Obj;
			return xCoord==another_loc.xCoord && yCoord==another_loc.yCoord;
			}
	}
	//����� hashCode. ���������� ���������� ��� ����������
	public int hashCode() {
		//������� ��������� �������� � � ������� 
		//���������� ����� ���������� ������� ��� ��������
        int result = 33;
        result = 37 * result + xCoord;
        result = 38 * result + yCoord;
        return result;
    }
}
