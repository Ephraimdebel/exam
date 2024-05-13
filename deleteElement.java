package question6;

public class deleteElement {
    int[] array =  {3,7,1,9,4};
    int index;
    int i;
    int[] num = new int[array.length];
    public int[] deletElement(){
        for (int i=0; i < array.length;i++){
        if (array[i]!=array[index]){
                num[i] = array[i];
            //}
            }
        }
        return num;
        // for (int i : num){
        //     System.out.print("this "+ i);
        // }
        
    }
    
    
}
