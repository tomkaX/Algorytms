import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.lowagie.text.List;

/*
 * Complete the function below.
 */
public class AmazonHakerRankTest{
    static int[] counts(int[] nums, int[] maxes) {
        int[] answers =new int[maxes.length];
        int r=0;
    for(int i=0; i<maxes.length; i++){
        for(int j=0;j<nums.length;j++){
          if (maxes[i]>=nums[j])
              r++;
              
        }
        answers[i]=r;
        r=0;
    }
        return answers;
    
    }

    /*
     * Complete the function below.
     */
///hhpddlnnsjfoyxpci  //ioigvjqzfbpllssuj
        static int[] getMinimumDifference(String[] a, String[] b) {
            int len=a.length>b.length?a.length:b.length;
            int[] results = new int[len];
            for (int i=0;i<len;i++){
               if(a.length==b.length){
                   String wordA=a[i];
                   String wordB=b[i];
                  char[] Ar= wordA.toCharArray(); //[c, d, d,  h, h,   n, n,  p,  x, y]
                  char[] Br= wordB.toCharArray(); //[b,  g,  i, j, l, , q,  s, u, v, z]
                  Arrays.sort(Ar); Arrays.sort(Br);
                  if(Arrays.equals(Ar,Br)){
                      results[i]=0;
                  }else{

                	  String[] setA = wordA.split("");
                	  String[] setB = wordB.split("");
                	  
//Character[] chArray = {'n','a','n','d','a','n','k','a','n','a','n'};

//List<Character> arrList = Arrays.asList(chArray);
                	  ArrayList listA = new ArrayList();
                	  ArrayList listB = new ArrayList();
                	  listA.addAll(Arrays.asList(setA));
                	  listB.addAll(Arrays.asList(setB)); 
                	  
                	 /* ArrayList list1 = new ArrayList();

                	  List setA1 =   (List) Arrays.asList(setA);
                	  List setB1 =   (List) Arrays.asList(setB);//.asList(Ar);
*/                	//  List<char[]> = (List) Arrays.asList(Br);
                       //Set<Character> setA = new HashSet<Character>(Ar.length);
                      // Set<Character> setB = new HashSet<Character>(Br.length);
                       /* for (char c : Ar)
                             setA.add(Character.valueOf(c));
                        for (char c1 : Br)
                             setB.add(Character.valueOf(c1));*/
                       // List<Character> compareList = Arrays.asList(strArr1);
                       // List<Character> baseList = Arrays.asList(strArr2);
                       // baseList.retainAll(compareList);
                	  //setA1.retainAll
                	  //a [h, h, p, d, d, l, n, n, s, j, f, o, y, x, p, c, i]
                	  //b [i, o, i, g, v, j, q, z, f, b, p, l, l, s, s, u, j]
                	  listA.retainAll(listB);
                	  if(listA.size()==0)
                   	   results[i]=-1;
                      else
                      results[i]=listA.size();
                       // Arrays.asList(wordA).retainAll(Arrays.asList(wordB));
                       /* setA.retainAll(setB);
                       */
                  }
                      
               }
             else{
                 results[i]=-1;
             } //-1
          }
            return results;

        }

        
        public static void main(String[] args)  {
    		

    		try {
    			 String[] a = new String[10];
    			 String[] b = new String[10];
    			File dir = new File(".");
    			File fin = new File(dir.getCanonicalPath() + File.separator + "input001.txt");
    			FileInputStream fis = new FileInputStream(fin);

    			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
                int n = Integer.valueOf(br.readLine());
                
                for(int x = 0; x < n; x++){
                    a[x] = br.readLine();
                }
                
                int n1 = Integer.valueOf(br.readLine());
                for(int x1 = 0; x1 < n1; x1++){
                    b[x1] = br.readLine();
                }
                
                int[] r =getMinimumDifference(a, b);
                for(int num :r){
                	System.out.println(num);
                }
               // System.out.println(getMinimumDifference(a, b).);
        
    			
    		} catch (IOException e) {

    			e.printStackTrace();
    		}
    	}

}
