public class ShapeUtil {
    public static void sort(Shape[] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=1;j< arr.length-i;j++) {
                if(arr[j].getArea() < arr[j-1].getArea()) {
                    Shape tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
    }
    public static void printShapes(Shape[] arr) {
        System.out.print("[");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i].toString()+ ": "+String.format("%.3f",arr[i].getArea())+", ");
        }
        System.out.println(arr[arr.length-1].toString()+": "+ String.format("%.3f",arr[arr.length-1].getArea())+"]");
    }

    public static Shape findShapeByName(Shape[] arr, String name) {
        Shape res = null;
        for(int i=0;i<arr.length;i++) {
            if(arr[i].getName().equals(name)) {
                res = arr[i];
                break;
            }
        }
        return res;
    }
}
