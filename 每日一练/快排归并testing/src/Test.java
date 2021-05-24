public class Test {
    int[] data=new int[100];
    int size=data.length;

    public void showdata() {
        for(int i=0;i<size;i++) {
            System.out.println("[" + data[i] + "]");
        }
        System.out.println(" ");
    }

    public static void Quick(int[] data,int fist,int last) {
       if(fist<last) {
           int index=quickSort(data, fist, last);
           Quick(data, fist, index-1);
           Quick(data, index+1, last);
       }
    }


    public static int quickSort(int[] data,int fist,int last) {
        int key=data[fist];
        while(fist<last) {
            while(fist<last && data[last]>=key) {
                last--;
            }
            data[fist]=data[last];
            while(fist<last && data[fist]<=key) {
                fist++;
            }
            data[last]=data[fist];
        }
        data[fist]=key;
        return fist;
    }


    public void Merger(int[] data,int fist,int last) {
        int mid=fist+(last-fist)/2;
        if(fist>=last) {
            return;
        }

        Merger(data, fist, mid);
        Merger(data, mid+1, last);


    }

    public void mergerSort(int[] data,int fist,int mid,int last) {
        int[] temp=new int[last-fist+1];
        int i=fist;
        int j=mid+1;

        for(int z=0;z<temp.length;z++) {
            if(i<=mid && (j<last||data[i]<=data[j])) {
                temp[z]=data[i++];
            }
            if(j<=last && (i>mid||data[j]<=data[i])) {
                temp[z]=data[j++];
            }
        }

        for(int z=0;z<temp.length;z++) {
            data[z+fist]=temp[z];
        }

    }

}
