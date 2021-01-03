package Patterns.PatternMergeIntervals;

import java.util.*;
class MergeIntervals{
    static class Interval{
        int start;
        int end;
        public Interval(int start,int end){
            this.start = start;
            this.end = end;
        }
    }
    static List<Interval> merge(List<Interval> intervals){
        List<Interval> mergedIntervals = new ArrayList<>();

        if(intervals.size()<2)
            return intervals;
        Collections.sort(intervals,(a,b)->Integer.compare(a.start,b.start));

        Iterator<Interval> iterator = intervals.iterator();
        Interval interval = iterator.next();
        int start = interval.start;
        int end = interval.end;

        while(iterator.hasNext()){
            interval = iterator.next();
            if(interval.start<=end){
                end = Math.max(interval.end,end);
            }
            else{
                mergedIntervals.add(new Interval(start,end));
                start = interval.start;
                end = interval.end;
            }
        }
        mergedIntervals.add(new Interval(start,end));
        return mergedIntervals;

    }
    public static void main(String args[]){
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,4));
        intervals.add(new Interval(2,5));
        intervals.add(new Interval(7,9));
        intervals = merge(intervals);

        for(Interval itr:intervals){
            System.out.println("["+itr.start+","+itr.end+"]");
        }
    }
}

