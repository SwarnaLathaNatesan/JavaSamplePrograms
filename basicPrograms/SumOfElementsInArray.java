package parthiban;
/*find the sum of array elements
* get array elements
* set initially sum is equals to zero
* sum = sum + each element in array using loop
* print sum
 */

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5};
        int sum =0;
        for (int i = 0;i<=array.length;i++)
        {
            sum = sum + i;
        }
        System.out.println("The sum of array is "+ sum);
    }
}
