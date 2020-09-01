package shuati;

import java.util.HashSet;
import java.util.Set;

/**
 *
 *
 * 874. 模拟行走机器人
 * 题目描述:
 *      机器人在一个无限大小的网格上行走，从点 (0, 0) 处开始出发，面向北方。该机器人可以接收以下三种类型的命令：
 *          -2：向左转 90 度
 *          -1：向右转 90 度
 *          1 <= x <= 9：向前移动 x 个单位长度
 *      在网格上有一些格子被视为障碍物。
 *      第 i 个障碍物位于网格点  (obstacles[i][0], obstacles[i][1])
 *      机器人无法走到障碍物上，它将会停留在障碍物的前一个网格方块上，但仍然可以继续该路线的其余部分。
 *      返回从原点到机器人所有经过的路径点（坐标为整数）的最大欧式距离的平方。
 *
 */
public class RobotSim {

    /**
     * 方法: 情景模拟
     *     思路 参考LeeCode
     * 复杂度分析
     *     时间复杂度：O(N+K)，其中 N,K 分别是 commands 和 obstacles 的长度。
     *     空间复杂度：O(K)，用于存储 obstacleSet 而使用的空间。
     */
    public int robotSim(int[] commands, int[][] obstacles) {

        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        int x = 0;
        int y = 0;
        int di = 0;

        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] +"_" + obstacle[1]);

        }

        int ans = 0;
        for (int command : commands) {
            if (command == -2) { //左转
                di = (di + 3) % 4;
            }else if (command == -1) { //右转
                di = (di + 1) % 4;
            }else {
                for (int i = 0; i < command; i++) {
                    int nx = x + dx[di];
                    int ny = y + dy[di];
                    String code = nx + "_" + ny;
                    if(!obstacleSet.contains(code)) {
                        x = nx;
                        y = ny;
                        ans = Math.max(ans, x*x + y*y);
                    }
                }
            }

        }
        return ans;
    }

    public int robotSim2(int[] commands, int[][] obstacles) {
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0,-1,  0};

        int x = 0;
        int y = 0;
        int di = 0;

        Set<String> obstacleSet = new HashSet<>();

        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "_" + obstacle[1]);
        }

        int ans = 0;
        for (int command : commands) {
            if (command == -2) {
                di = (di + 3) % 4;
            }else if (command == -1) {
                di = (di + 1) % 4;
            }else {
                for (int i = 0; i < command; i++) {

                    int nx = x + dx[di];
                    int ny = y + dy[di];
                    if (!obstacleSet.contains( nx + "_" + ny)) {
                        x = x + dx[di];
                        y = y + dy[di];
                        ans = Math.max(ans, x*x + y*y);
                    }
                }
            }

        }
        return ans;
    }

}
