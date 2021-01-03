package Patterns.PatternMergeIntervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class InsertInterval {
    static class Interval{
        int start;
        int end;
        Interval(int start,int end){
            this.start = start;
            this.end = end;
        }
    }
    static List<Interval> insert(List<Interval> intervals,Interval interval){
        List<Interval> insertedList = new ArrayList<>();
        int start = interval.start;
        int end = interval.end;
        //Collections.sort(intervals,(a,b)->Integer.compare(a.start,b.start));

        Iterator iterator = intervals.iterator();
        while(iterator.hasNext()){
            interval = (Interval)iterator.next();
            if(interval.end<start)
                insertedList.add(new Interval(interval.start,interval.end));
            else if(interval.start<=end){
                start = Math.min(start,interval.start);
                end = Math.max(end,interval.end);
            }
            else{
                insertedList.add(new Interval(interval.start,interval.end));
            }

        }
        insertedList.add(new Interval(start,end));
        Collections.sort(intervals,(a,b)->Integer.compare(a.start,b.start));
        return insertedList;
    }

    //Best Solution
    static List<Interval> insert1(List<Interval> intervals,Interval interval){
        List<Interval> insertedList = new ArrayList<>();
        int start = interval.start;
        int end = interval.end;
        int i =0;
        while(i<intervals.size()&& intervals.get(i).end<start ){
            insertedList.add(intervals.get(i++));
        }

        while(i<intervals.size() && intervals.get(i).start<=end){
            start = Math.min(start,intervals.get(i).start);
            end  = Math.max(end,intervals.get(i).end);
            i++;
        }

        insertedList.add(new Interval(start,end));
        while(i<intervals.size()){
            insertedList.add(intervals.get(i++));
        }

        return insertedList;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(5,7));
        intervals.add(new Interval(8,12));
        intervals = insert1(intervals,new Interval(4,6));

        for(Interval itr:intervals){
            System.out.println("["+itr.start+","+itr.end+"]");
        }

        List<Interval> intervals1 = new ArrayList<>();
        intervals1.add(new Interval(1,3));
        intervals1.add(new Interval(5,7));
        intervals1.add(new Interval(8,12));
        intervals1 = insert1(intervals1,new Interval(4,10));

        for(Interval itr:intervals1){
            System.out.println("["+itr.start+","+itr.end+"]");
        }
    }
}
