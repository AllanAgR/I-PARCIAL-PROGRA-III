public class QuickSort {

    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    public void quickSort(int[] arr, int xmenor, int xmayor) {
        if (xmenor < xmayor) {
            int pivotIndex = partition(arr,xmenor, xmayor);

            quickSort(arr,xmenor,pivotIndex - 1);
            quickSort(arr,pivotIndex + 1, xmayor);
        }
    }

    public int partition(int[] arr, int xm, int extlista) {
        int listaM = arr[extlista];
        int i = xm - 1;

        for (int j = xm; j < extlista; j++) {
            if (arr[j] < listaM) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, extlista);
        return i + 1;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4,15,5,2,10,8};

        System.out.println("Arreglo sin ordenar:");
        for (int num1 : arr) {
            System.out.print(num1 + " ");
        }

        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Arreglo Final");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
