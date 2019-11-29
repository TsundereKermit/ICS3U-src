
public class Date {
        
        private int year;
        private int month;
        private int day;
        
        public Date (int y, int m, int d) {
            setYear(y);
            setMonth(m);
            setDay(d);
        }
        
        public void setYear(int y) {
            year=y;
        }
        
        public void setMonth(int m) {
            month=m;
        }
        
        public void setDay(int d) {
            day=d;
        }
        
        public int getYear() {
            return year;
        }
        
        public int getMonth() {
            return month;
        }
        
        public int getDay() {
            return day; 
        }
        
        public String toString()
	{
            
            switch (month)
            {
                case 1: return "January " + day + ", " + year;
                case 2: return "February " + day + ", " + year;
                case 3: return "March " + day + ", " + year;
                case 4: return "April " + day + ", " + year;
                case 5: return "May " + day + ", " + year;
                case 6: return "June " + day + ", " + year;
                case 7: return "July " + day + ", " + year;
                case 8: return "August " + day + ", " + year;
                case 9: return "September " + day + ", " + year;
                case 10: return "October " + day + ", " + year;
                case 11: return "November " + day + ", " + year;
                case 12: return "December " + day + ", " + year;
                
            }
            return "Error...";
	}
        
        public boolean equals(Date d)
	{
		return (day == d.getDay() && month==d.getMonth() && year == d.getYear());
	}
        
}
