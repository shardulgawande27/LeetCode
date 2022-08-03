class MyCalendar {
    
//     FloorEntry => Lower Entry value
//     CeilingEntry => High Entry value
    
    TreeMap<Integer , Integer> calender = null;
    public MyCalendar() {
        
        calender = new TreeMap();
        
    }
    
    public boolean book(int start, int end) {
//         condition around start time
//         start < lower entry end time
        if(calender.floorEntry(start) !=null && start < calender.floorEntry(start).getValue()) {
            return false;
        }
        
//         condition around end
//         end > higher Entry start time
    if(calender.ceilingEntry(start) != null && end > calender.ceilingEntry(start).getKey()){
        return false;
    }
        calender.put(start,end);
        return true;
        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */