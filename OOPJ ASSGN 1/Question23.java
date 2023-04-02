// 23.Write a program to perform below operations on float type to get:
//  a. The number of bits used to represent a float value 
//  b. The number of bytes used to represent a float value
//   c. The minimum value a float
//  d. The maximum value a float
class Question23{
    public static void main(String [] args){

          //15. Write a program to perform below operations on int type to get: a. The number of bits used to represent a integer value b. The number of bytes used to represent a integer value c. The minimum value a integer d. The maximum value a integer
            System.out.println("Size  : "+Float.SIZE);
           System.out.println("Size  : "+Float.BYTES);
           //System.out.println("Size  : "+Character.MAX_VALUE);
           Short maxValue = Short.MAX_VALUE;
           System.out.println("Size  : "+(float)(maxValue));

          // System.out.println("Size  : "+Character.MIN_VALUE);
           Short minValue = Short.MIN_VALUE;
           System.out.println("Size  : "+(float)(minValue));

    }
}