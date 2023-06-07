package task1;

public class SearchApp {

    private int search(int[] array, int elementToFind){
        for(int i = 0; i < array.length; i++){
            if(elementToFind == array[i]){
                return i;
            }
        }
        return -1;
    }


}
