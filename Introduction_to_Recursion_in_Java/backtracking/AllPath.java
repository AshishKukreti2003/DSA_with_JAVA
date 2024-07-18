import java.util.ArrayList;
import java.util.Arrays;

public class AllPath {  
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        // allPath("", maze, 0, 0);
        // System.out.println(allPathRet("", maze, 0, 0));
        int[][] path = new int[maze.length][maze[0].length];
        allPathCount("", maze, 0, 0, path, 1);

    }

    static void allPath(String p, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) return;

        maze[r][c] = false;
        if(r<maze.length-1) allPath(p+'D', maze, r+1, c);
        if(c<maze[0].length-1) allPath(p+'R', maze, r, c+1);
        if(r>0) allPath(p+'U', maze, r-1, c);
        if(c>0) allPath(p+'R', maze, r, c-1);
        maze[r][c] = true;
    }

    static ArrayList<String> allPathRet(String p, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(!maze[r][c]) return ans;
        maze[r][c] = false;
        if(r<maze.length-1) ans.addAll(allPathRet(p+'D', maze, r+1, c));
        if(c<maze[0].length-1) ans.addAll(allPathRet(p+'R', maze, r, c+1));
        if(r>0) ans.addAll(allPathRet(p+'U', maze, r-1, c));
        if(c>0) ans.addAll(allPathRet(p+'L', maze, r, c-1));
        maze[r][c] = true;
        return ans;
    }

    static void allPathCount(String p,boolean[][] maze, int r, int c, int[][] path, int steps){
        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = steps;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]) return;
        maze[r][c]= false;
        path[r][c]=steps;
        if(r<maze.length-1){
            allPathCount(p+'D',maze, r+1, c, path, steps+1);
        }
        if(c<maze[0].length-1){
            allPathCount(p+'R', maze, r, c+1, path, steps+1);
        }
        if(r>0){
            allPathCount(p+'U', maze, r-1, c, path, steps+1);
        }
        if(c>0){
            allPathCount(p+'L', maze, r, c-1, path, steps+1);
        }
        maze[r][c] = true;
        path[r][c] = steps;
    }
}
