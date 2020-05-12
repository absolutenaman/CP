
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import javax.swing.ImageIcon;


public class Restoring_Permutation {


  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t1=Integer.parseInt(br.readLine());
    for(int t=0;t<t1;++t)
    {
      int n=Integer.parseInt(br.readLine());
      ArrayList<Integer>al=new ArrayList<>();
      StringBuilder ans=new StringBuilder();
      for(int i=1;i<=2*n;++i)
      {
        al.add(i);
      }
      String s[]=br.readLine().trim().split(" ");

      for(String a:s)
      {
        Integer k=new Integer(a);
        al.remove(k);
      }
      boolean flag=true;
      for(String a:s)
      {
        Integer k=new Integer(a);
        ans.append(a+" ");
        int f=0;
        for(Integer i:al)
        {
          if(i>k)
          {
           f=1;
            ans.append(i+" ");
            al.remove(i);
            break;
          }

        }

        if(f==0)
        {
          System.out.println(-1);
          flag=false;
          break;
        }
      }
      if (flag) {
        System.out.println(ans);
      }




      }
    }
  }



