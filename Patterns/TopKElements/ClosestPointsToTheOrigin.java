package Patterns.TopKElements;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ClosestPointsToTheOrigin {

    static class Point{
        int x,y;
        Point(int x,int y){
            this.x =x;
            this.y =y;
        }
        int distFromOrigin(){
            return (x*x)+(y*y);
        }
    }
    static List<Point> findClosestPoints(Point []points,int k){
        Queue<Point> maxHeap = new PriorityQueue<Point>((p1,p2)->(p2.distFromOrigin()-p1.distFromOrigin()));
        for(int i=0;i<k;i++)
            maxHeap.add(points[i]);

        for(int i=k;i<points.length;i++){
            if(points[i].distFromOrigin()<maxHeap.peek().distFromOrigin()){
                maxHeap.poll();
                maxHeap.add(points[i]);
            }
        }
        return new ArrayList<Point>(maxHeap);
    }

    public static void main(String[] args) {
     Point []points = new Point[]{new Point(1,3),new Point(3,4),new Point(2,-1)};
     List<Point> results = findClosestPoints(points,2);
     for(Point point:results)
         System.out.println("Point: "+point.x+","+point.y);

    }
}
