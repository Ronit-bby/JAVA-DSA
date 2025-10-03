package DAY44;

public class diagonal_sum_product {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {5, 9, 4},
                {8, 6, 2} };
        int n = matrix.length;
        int sum = 0, prod = 1;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            prod *= matrix[i][i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + prod);
    }
    }
