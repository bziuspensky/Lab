import java.util.Objects;


/**
 * A two-dimensional point class.
 **/
public class Point3d {
    
    /** X coordinate of the point **/
    private double xCoord;
    private double yCoord;
	private double zCoord;

    /** Constructor to initialize point to (x, y, z) value. **/
    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
		zCoord = z;
    }

    /** No-argument constructor:  defaults to a point at the origin. **/
    public Point3d() {
        // Call two-argument constructor and specify the origin.
        this(0, 0, 0);
    }

    /** Return the X coordinate of the point. **/
    public double getX() {
        return xCoord;
    }

    /** Return the Y coordinate of the point. **/
    public double getY() {
        return yCoord;
    }
	/** Return the Z coordinate of the point. **/
	public double getZ() {
        return zCoord;
    }

    /** Set the X coordinate of the point. **/
    public void setX(double val) {
        xCoord = val;
    }

    /** Set the Y coordinate of the point. **/
    public void setY(double val) {
        yCoord = val;
    }
	/** Set the Z coordinate of the point. **/
	public void setZ(double val) {
        zCoord = val;
    }
	
	//Метод equals. Сравнивает экземпляры
	public boolean equals(Object obj) {
		//Проверка является ли объект экземпляром класса Point3d
		if (obj.getClass()!=getClass()){
			// Если нет, выводим false
			return false;
		}
		//Иначе сравниваем  2 объекта
		else {
			Point3d another_point = (Point3d) obj;
			return another_point.getX() == xCoord && another_point.getY() == yCoord && another_point.getZ() == zCoord;
		}
		
    }
	//Метод distanceTo. Возвращает расстояние между двумя точками
	public double distanceTo (Object obj) {
		if (obj.getClass()!=getClass()){
			return 0.0;
		}
		else{
			Point3d p3d = (Point3d) obj;
			//Вычисляем расстояние по формуле
			return Math.sqrt(Math.pow((xCoord-p3d.getX()),2)+Math.pow((yCoord-p3d.getY()),2)+Math.pow((zCoord-p3d.getZ()),2));
		}
	}
}








