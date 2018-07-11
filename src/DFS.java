import java.util.Scanner;

public class DFS {
    static int vertex; // 정점
    static int startNumber;
    static int[][] vertexMap;
    static boolean[] visited;
    static int n1, n2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vertex = sc.nextInt();
        startNumber = Integer.parseInt(sc.nextLine().trim());

        vertexMap = new int[vertex+1][vertex+1];
        visited = new boolean[vertex+1];

        while(true) {
            n1 = sc.nextInt();
            n2 = sc.nextInt();

            if(n1<0 || n2<0)
                break;

            vertexMap[n1][n2] = vertexMap[n2][n1] = 1;
        }

        dfs(startNumber);

    }

    public static void dfs(int startNumber) {
        visited[startNumber] = true;
        for(int i=1; i<n1; i++) {
            if(visited[i]==false && vertexMap[startNumber][i]==1){
                System.out.println(startNumber+"-->"+i);
                dfs(i);
            }
        }
    }
}
