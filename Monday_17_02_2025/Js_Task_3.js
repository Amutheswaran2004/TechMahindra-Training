// Pass a number, and find if the sum of their digits is an even or odd number

let answer=(number) => {
    let sum=0;
    while(number>=1){
     let box=number%10;
     sum+=box
     number=parseInt(number/10)
     console.log(number)
    }
    if(sum%2===0)
       return true  
    else 
      return false 
}
if(answer(23134))
    console.log("Sum of the digits is Even")
else
    console.log("Sum of the digits is Odd")