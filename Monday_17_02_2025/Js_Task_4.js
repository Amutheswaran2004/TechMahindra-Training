/*4. Create a arrow function without parameters, to choose the operation  among add, 
subtract, multiply and divide, using switch statement. On choosing the operation, 
it has to invoke the corresponding method (as expression) with parameters and 
display the results accordingly, like, sum for add, difference for subtract,
product for multiply, quotient and reminder for divide*/
var a=10;
var b=5;
var choice=3;
add=()=> a+b;
sub=()=> a-b;
multilpy=()=> a*b;
divide=()=>{
 console.log("Quotient :"+(a/b))
 console.log("Reminder :"+(a%b))
}
method =()=>{
switch(choice){
    case 1:{
       console.log("Sum value :"+sum(a,b))
        break
    }
    case 2:{
        console.log("Difference Value :"+sub(a,b))
        break
    }
    case 3:{
        console.log("Product Value :"+multilpy(a,b))
        break
    }
    case 4:{
        divide(a,b)
        break
    }
    default:{
        console.log("Invalid selection")
        break
    }
   
}
}
method();