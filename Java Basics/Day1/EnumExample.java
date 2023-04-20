enum WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}



class EnumExample{
    public static void main(String args[]){
        WeekDay day=WeekDay.SUNDAY;
        // System.out.println(day);

        for(WeekDay wd: WeekDay.values()){
            System.out.println(wd);
        }
    }
    
}