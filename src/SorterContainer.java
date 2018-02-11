public class SorterContainer {
    public static void main(String args[]){
        int [] arr = {8,100,27,-3,4,56,32,1,67};
        bubbleSort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int[] array) {
        for (int j = array.length; j > 0; j--) {
            for (int i = 1; i < array.length; i++) {
                int temp = 0;
                if (array[i - 1] > array[i]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static void NikaBubbleSort(int[] mas) {
        for(int j = mas.length;j>0;j--){
            for(int i =1;i < mas.length;i++ ) {
                int temp =0;
                if(mas[i-1]>mas[i]) {
                    temp = mas[i-1];
                    mas[i-1] = mas[i];
                    mas[i]=temp;
                }
            }
        }
    }
}
