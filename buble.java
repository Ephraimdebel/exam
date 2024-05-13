package question4;



public class buble {
    String[] c = {"a","b","c"};
    int size = c.length;
    String temp = "";


    for(int i = 0; i<size;i++){
            for(int j=0; j<size-i-1;j++){
                if (c[j] > c[j+1]){
                    temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            
}
    }
}