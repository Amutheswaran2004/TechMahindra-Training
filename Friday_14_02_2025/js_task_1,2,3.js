// 1. create a variable with let, find its cube and display the result
// 2. Create a variable with var, check if its positive or negative and display the result accordingly
// 3. Create a variable as const, check if its a prime number or not, and display the result accordingly
var task_1=()=>
{
 let a=2;
 let cube=(a)=>a*a*a
 console.log(`Cube value is ${cube(a)}`)

}

var task_2=()=>
{
var b=-8
console.log("Given number is "+b>=0 ? "Positive" : "Negative")
} 

var task_3=()=>
{
   var n=17
   var cal=(n) => {
   var flag=false
   for(let i=2;i<17;i++)
   {
       if(n%i===0){
       flag=true
    }
}
    return flag
}
   var check=cal(n) ? "Not a Prime" : "Prime"
   console.log("Give number is "+check)
}
task_1()
task_2()
task_3()

o