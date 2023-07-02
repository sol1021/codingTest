package DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ1697 {
    static int N, K;
    static int count;
    static Queue<int[]> que = new LinkedList<>();
    static boolean visited[];
    
    static int BFS(int n, int k) {
        que.offer(new int[] {n, 0});
        while (!que.isEmpty()) {
            int[] num = que.poll();
            if (num[0] == k) {
                return num[1];
            }
            if (num[0] * 2 <= 100000 && !visited[num[0] * 2]) {
                que.add(new int[] {num[0] * 2, num[1] + 1});
                visited[num[0] * 2] = true;
            }
            if (num[0] + 1 <= 100000 && !visited[num[0] + 1]) {
                que.add(new int[] {num[0] + 1, num[1] + 1});
                visited[num[0] + 1] = true;
            }
            if (num[0] - 1 >= 0 && !visited[num[0] - 1]) {
                que.add(new int[] {num[0] - 1, num[1] + 1});
                visited[num[0] - 1] = true;
            }
        }
        return -1; // 도달할 수 없는 경우
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visited = new boolean[100001]; // 크기 수정
        System.out.println(BFS(N, K));
    }
}