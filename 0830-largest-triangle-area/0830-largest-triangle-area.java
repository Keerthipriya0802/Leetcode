class Solution {
    public double largestTriangleArea(int[][] points) {
        //Area=1/2 ​×∣x1×(y2−y3)+x2×(y3−y1)+x3×(y1−y2)∣
        int l = points.length;
        double maxarea = 0.0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                for (int k = j + 1; k < l; k++) {
                    double area = Math.abs(
                        points[i][0] * (points[j][1] - points[k][1]) +
                        points[j][0] * (points[k][1] - points[i][1]) +
                        points[k][0] * (points[i][1] - points[j][1])
                    ) / 2.0;
                    maxarea = Math.max(area, maxarea);
                }
            }
        }
        return maxarea;

    }
}