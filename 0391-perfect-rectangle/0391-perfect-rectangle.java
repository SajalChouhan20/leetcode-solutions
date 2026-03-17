import java.util.*;

class Solution {
    public boolean isRectangleCover(int[][] rectangles) {

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        int totalArea = 0;

        Set<String> set = new HashSet<>();

        for (int[] rect : rectangles) {
            int x1 = rect[0];
            int y1 = rect[1];
            int x2 = rect[2];
            int y2 = rect[3];

            totalArea += (x2 - x1) * (y2 - y1);

            minX = Math.min(minX, x1);
            minY = Math.min(minY, y1);
            maxX = Math.max(maxX, x2);
            maxY = Math.max(maxY, y2);

            String[] corners = {
                x1 + " " + y1,
                x1 + " " + y2,
                x2 + " " + y1,
                x2 + " " + y2
            };

            for (String corner : corners) {
                if (!set.add(corner)) {
                    set.remove(corner); 
                }
            }
        }

        int bigArea = (maxX - minX) * (maxY - minY);
        if (totalArea != bigArea) return false;

        if (set.size() != 4) return false;

        if (!set.contains(minX + " " + minY) ||
            !set.contains(minX + " " + maxY) ||
            !set.contains(maxX + " " + minY) ||
            !set.contains(maxX + " " + maxY)) {
            return false;
        }

        return true;
    }
}