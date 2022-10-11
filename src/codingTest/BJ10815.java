package codingTest;

import java.util.Arrays;
import java.util.Scanner;

class BJ10815 {
    private static int youNumber;
    private static int[] youCardArray;
    private static int myNumber;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        youNumber = sc.nextInt();
        youCardArray= new int[youNumber];
        for (int i = 0; i < youNumber; i++) {
            youCardArray[i] = sc.nextInt();
        }
        Arrays.sort(youCardArray);
        myNumber = sc.nextInt();
        for (int i = 0; i < myNumber; i++) {
            int myCard = sc.nextInt();
            int left = 0;
            int right = youNumber - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                int youCard = youCardArray[mid];
                if (youCard == myCard) {
                    sb.append(1 + " ");
                    break;
                }
                if (youCard > myCard) { //지금 상대방 카드보다 더 작은거 찾아야함
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                if (left > right) {
                    sb.append(0 + " ");
                    break;
                }
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}