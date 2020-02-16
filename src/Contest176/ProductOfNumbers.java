package Contest176;

public class ProductOfNumbers {

    int element = 0;
    int[] list;

    public ProductOfNumbers() {
        list = new int[2];
    }

    public void add(int num) {
        if (element >= list.length) {
            int[] list2 = new int[list.length * 3/2];
            for (int i = 0; i < list.length; i++) {
                list2[i] = list[i];
            }
            list = list2;
        }
        list[element] = num;
        element++;
    }

    public int getProduct(int k) {
        int m = 1;
        for (int i = element - k; i < element; i++) {
            m *= list[i];
        }
        return m;
    }

    public static void main(String[] args) {
        ProductOfNumbers a = new ProductOfNumbers();
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println(a.getProduct(1));
    }
}
