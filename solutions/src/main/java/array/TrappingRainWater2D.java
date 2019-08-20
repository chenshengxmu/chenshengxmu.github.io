package array;

import java.util.PriorityQueue;

public class TrappingRainWater2D
{
    public int trapRainWater(int[][] a) {

        if (a.length == 0)
        {
            return 0;
        }
        if (a[0].length == 0)
        {
            return 0;
        }

        int m = a.length;
        int n = a[0].length;
        int res = 0;

        PriorityQueue<Cell> pq = new PriorityQueue<>();
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++)
        {
            visited[i][0] = true;
            pq.add(new Cell(i, 0, a[i][0]));

            visited[i][n-1] = true;
            pq.add(new Cell(i, n-1, a[i][n-1]));
        }

        for (int i = 0; i < n; i++)
        {
            visited[0][i] = true;
            pq.add(new Cell(0, i, a[0][i]));

            visited[m-1][i] = true;
            pq.add(new Cell(m-1, i, a[m-1][i]));

        }

        int[] xs = {0, 0, -1, 1};
        int[] ys = {-1, 1, 0, 0};

        while (pq.isEmpty() == false)
        {
            Cell cell = pq.poll();
            for (int i = 0; i < 4; i++)
            {
                int nx = cell.x + xs[i];
                int ny = cell.y + ys[i];

                if (nx < 0 || nx >= m)
                {
                    continue;
                }
                if (ny < 0 || ny >= n)
                {
                    continue;
                }

                if (visited[nx][ny])
                {
                    continue;
                }

                visited[nx][ny] = true;

                if (cell.h > a[nx][ny])
                {
                    res += cell.h - a[nx][ny];
                    pq.add(new Cell(nx, ny, cell.h));
                }
                else
                {
                    pq.add(new Cell(nx, ny, a[nx][ny]));
                }
            }

        }


        return res;
    }

}

class Cell implements Comparable<Cell>
{
    int x, y, h;

    public Cell(int x, int y, int h)
    {
        this.x = x;
        this.y = y;
        this.h = h;
    }

    @Override
    public int compareTo(Cell o)
    {
        return h - o.h;
    }
}
