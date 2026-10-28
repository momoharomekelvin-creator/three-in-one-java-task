

public class Main {
public static void main(String[] args) {

    int[][] numbers = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    
    for (int rowIndex = 0; rowIndex < numbers.length; rowIndex++) {

        int temporaryNumber = numbers[rowIndex][0];

        numbers[rowIndex][0] = numbers[rowIndex][2];

        numbers[rowIndex][2] = temporaryNumber;
    }

    
    for (int rowIndex = 0; rowIndex < numbers.length; rowIndex++) {

        for (int columnIndex = 0; columnIndex < numbers[rowIndex].length; columnIndex++) {

            System.out.print(numbers[rowIndex][columnIndex] + " ");
        }

        System.out.println();
    }
}

}
