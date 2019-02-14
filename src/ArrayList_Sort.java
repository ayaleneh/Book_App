import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_Sort {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
      number.add(10);
      number.add(1);
      number.add(4);
      number.add(3);
      number.add(9);

        Iterator itr=number.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());

        }
        System.out.println("the first "+number.indexOf(10));
        Collections.sort(number);
        System.out.println("the second "+number.indexOf(10));
    }
}
