// 13. Get 2 numbers. Have the third number as second number + 40. Using while loop, display the multiples of first number from second number to third number. For example , if the numbers are 7, 20, first number is 7, second number is 20 and third number is 20+40, which is 60. So, Multiples of 7 should be displayed from 20 to 60, using while loop

var first=7
var second=20
var third=second+40;
console.log("This are the multiples of "+first+" from "+second+" to "+third)
while(second<=third){
    if(second%7==0)
     console.log(second)
    second++; 
}