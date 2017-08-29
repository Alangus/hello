import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)  {
        int[][] a=new int[][]{{1},{2},{3},{4}};//{{1,2},{3,4}};
        Solution solution=new Solution();
        int[][] b=solution.matrixReshape(a,2,2);

    }
}
