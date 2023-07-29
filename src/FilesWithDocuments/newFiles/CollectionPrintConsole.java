package FilesWithDocuments.newFiles;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionPrintConsole<E> {


    public void printConsole(ArrayList<E> arrList) {
        ListIterator<E> litr = arrList.listIterator();

        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

    }
}


//using for-each loop

//                  System.out.println("\nUsing for-each loop\n");
//                  for (String str : arrlist)
//                  {
//                  System.out.println(str);
//                  }