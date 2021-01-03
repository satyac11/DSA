package Patterns.PatternMergeIntervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConflictingAppointments {
    static class Interval{
        int start;
        int end;
        Interval(int start,int end){
            this.start = start;
            this.end = end;
        }
    }

    static boolean canAttendAllAppointments(List<Interval> intervals){
        if(intervals.size()<2)
            return true;
        Collections.sort(intervals,(a, b)->Integer.compare(a.start,b.start));
        Iterator iterator = intervals.iterator();
        Interval interval = (Interval)iterator.next();
        int start = interval.start;
        int end = interval.end;

        while(iterator.hasNext()){
            interval = (Interval)iterator.next();
            if(end>=interval.start)
                return false;
            start = interval.start;
            end = interval.end;
        }
        return true;

    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,4));
        intervals.add(new Interval(2,5));
        intervals.add(new Interval(7,9));
        System.out.println("Can Attend All Appointments: "+canAttendAllAppointments(intervals));

        List<Interval> intervals1 = new ArrayList<>();
        intervals1.add(new Interval(6,7));
        intervals1.add(new Interval(2,4));
        intervals1.add(new Interval(8,12));
        System.out.println("Can Attend All Appointments: "+canAttendAllAppointments(intervals1));

       /* List<Interval> intervals1 = new ArrayList<>();
        intervals1.add(new Interval(1,3));
        intervals1.add(new Interval(5,7));
        intervals1.add(new Interval(8,12));
        intervals1 = insert1(intervals1,new Interval(4,10));

        for(Interval itr:intervals1){
            System.out.println("["+itr.start+","+itr.end+"]");
        }*/
    }
}
