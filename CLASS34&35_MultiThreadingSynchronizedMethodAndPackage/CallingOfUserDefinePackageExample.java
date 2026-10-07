// Calling of User Define Package
import userpack.*;
//or
// import userpack.Area;
// import userpack.Series;

public class CallingOfUserDefinePackageExample {
    public static void main(String[] args) {
        Series s = new Series();
        Area a = new Area();
        s.apSeries(2,4,9);
        s.gpSeries(3,2,10);
        a.areaCircle(5.4);
        a.areaRectangle(4, 5);
        a.getDate();
    }
}
/*
OfUserDefinePackageExample
2 , 6 , 10 , 14 , 18 , 22 , 26 , 30 , 34 , End of AP Series
3 , 6 , 12 , 24 , 48 , 96 , 192 , 384 , 768 , 1536 , End of GP Series
Area of Ciccle = 91.60884177867837
Area of Rectangle = 20.0
DATE & TIME: Tue Sep 29 18:55:37 IST 2026
*/