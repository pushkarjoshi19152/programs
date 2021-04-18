import java.util.*;

class Numbers {
    public Integer result[] = new Integer[10];

    void displayListOfNos() {
        System.out.println("Numbers stored in the array:");
        for (int idx = 0; idx < 10; ++idx) {
            System.out.println(result[idx]);
        }
    }

    void fillTheArray(int aUpperLimit, int aArraySize) {
        if (aUpperLimit <= 0) {
            throw new IllegalArgumentException("UpperLimit must be positive: " + aUpperLimit);
        }

        if (aArraySize <= 0) {
            throw new IllegalArgumentException("Size of returned List must be greater than 0.");
        }
        Random generator =new Random();
        
        for(int idx=0;idx<aArraySize;idx++)
        {
            result[idx]=generator.nextInt(aUpperLimit);
        }
        displayListOfNos();

    }
    public void sortAscending()
    {
        Arrays.sort(result);
       
       

    }
    public void sortDescending()
    {
        
        Arrays.sort(result, Collections.reverseOrder());
        
       

    }
}

    class ArrangementAscending implements Runnable {
        Numbers n1;

        ArrangementAscending(Numbers n) {
            n1 = n;
            new Thread(this).start();
        }
        public void show()
        {
            n1.displayListOfNos();
        }

        public void run() {
            n1.sortAscending();
    

        }
    }

    class ArrangementDescending implements Runnable {
        Numbers n2;

        ArrangementDescending(Numbers n) {
            n2 = n;
            new Thread(this).start();
        }
        public void show()
        {
            n2.displayListOfNos();
        }

        public void run() {
            n2.sortDescending();
           
        }
    }

class ArrangingNos {

    public static void main(String[] arg) {
        Numbers n = new Numbers();
        n.fillTheArray(20, 10);
        ArrangementAscending a1 = new ArrangementAscending(n);
        ArrangementDescending d1 = new ArrangementDescending(n);
        d1.show();
        a1.show();
    }
}
