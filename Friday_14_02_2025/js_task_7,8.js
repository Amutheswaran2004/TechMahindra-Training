//  7..Check for a number, if its divisible by 12 using if statement
// 8. Get the price of 1 kg tomato from Monday to Sunday, find its average. 
// If the average is greater than Rs.50, then display, tomato has given good profit. 
// If not, display "No profit from tomato".
var task_7=()=>
{
var number =144;
if(number%12==0){
    console.log("Yes ,the number can be divisible by 12")
}
else{
    console.log("No ,the number can be divisible by 12")
}
}

var task_8=()=>
{
var price=3568
var average=price/7
console.log(average>50 ? "Tomato has profit" : "No profit from tomato")
    
}

task_7()
task_8()