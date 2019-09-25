package crazy;


/**
 * クラス printNumber の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Exercise1{
       public static double powArray(double[] target){
     
           for (int i=0;i<target.length;i++){
          target[i] = Math.pow(target[i],2.0);
           System.out.println(target[i]);
       
       }
      return 1;
   }
   public static void main(){
       double a[]={2,3,4,5};
       powArray(a);
   
   }
 }