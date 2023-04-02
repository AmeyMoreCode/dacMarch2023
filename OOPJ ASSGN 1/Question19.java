// 19.Write a program to perform below operations on long type to get: 
// a. The number of bits used to represent a long value
//  b. The number of bytes used to represent a long value 
//  c. The minimum value a long 
//  d. The maximum value a long
// Reference:https://docs.oracle.com/
class Question19{
    public static void main(String [] args){

          //15. Write a program to perform below operations on int type to get: a. The number of bits used to represent a integer value b. The number of bytes used to represent a integer value c. The minimum value a integer d. The maximum value a integer
            System.out.println("Size  : "+Long.SIZE);
           System.out.println("Size  : "+Long.BYTES);
           //System.out.println("Size  : "+Character.MAX_VALUE);
           Short maxValue = Short.MAX_VALUE;
           System.out.println("Size  : "+(long)(maxValue));

          // System.out.println("Size  : "+Character.MIN_VALUE);
           Short minValue = Short.MIN_VALUE;
           System.out.println("Size  : "+(long)(minValue));


             



    }
}