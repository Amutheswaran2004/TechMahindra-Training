// 9. Get the values of year and month. Check if the year is leap year. If yes, check if the month is February. If yes, display "The year is leap year and the month is February with 29 days.". If no, display "The year is leap year and the month is not February ". If the year is not leap, display "The given year is not a leap year".
var year=2004;
var mon ="February";
if(((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))&& mon.toLowerCase()==="february")
{
    console.log("The year is leap year and the month is February with 29 days.")
}
else if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
   console.log("The year is leap year and the month is not February")
    
}
else{
    console.log("The given year is not a leap year")
}
