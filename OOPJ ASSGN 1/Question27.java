// 27.Write a program to perform below operations on Double type to get: 
// a. The number of bits used to represent a double value 
// b. The number of bytes used to represent a double value 
// c. The minimum value a double 
// d. The maximum value a double
class Question27{
    public static void main(String [] args){

          //15. Write a program to perform below operations on int type to get: a. The number of bits used to represent a integer value b. The number of bytes used to represent a integer value c. The minimum value a integer d. The maximum value a integer
            System.out.println("Size  : "+Double.SIZE);
           System.out.println("Size  : "+Double.BYTES);
           //System.out.println("Size  : "+Character.MAX_VALUE);
           Short maxValue = Short.MAX_VALUE;
           System.out.println("Size  : "+(double)(maxValue));

          // System.out.println("Size  : "+Character.MIN_VALUE);
           Short minValue = Short.MIN_VALUE;
           System.out.println("Size  : "+(double)(minValue));

    }
}