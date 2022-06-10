public class PaintManager {
    public static Shape[] getPaintedShapes(Shape[] arr, int numberOfCans, double volumeOfSingleCan) {
        ShapeUtil.sort(arr);
        double totalVolume = volumeOfSingleCan * numberOfCans;
        int flag = -1;
        for(int i=0;i<arr.length;i++) {
            totalVolume -= arr[i].getArea();
            if(totalVolume >= 0)
                flag = i;
            else
                break;
        }
        Shape[] res = new Shape[flag+1];
        for(int i=0;i<flag+1;i++)
            res[i] = arr[i];
        return res;
    }
}
