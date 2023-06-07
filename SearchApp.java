package task1;

import java.util.Scanner;

public class SearchApp {

    private int search(int[] array, int elementToFind){
        int steps = 0;
        for(int i = 0; i < array.length; i++){
            steps++;
            if(elementToFind == array[i]){
                System.out.println("Steps quantity to find element: " + steps);
                return i;
            }
        }

        return -1;
    }
    public void work(){
        System.out.println("Enter array size: ");
        Scanner scanner = new Scanner(System.in);
        String arraySize = scanner.nextLine();
        int SIZE = Integer.parseInt(arraySize);
        int[] array = new int[SIZE];
        for(int element: array){
            System.out.print(element+ " ");
        }
        System.out.println();
        System.out.println("Enter element you wanna find: ");
        String element = scanner.nextLine();
        int elementToFind = Integer.parseInt(element);
        int foundElement = search(array, elementToFind);
        if(foundElement == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Index of found element");
        }
    }


}
