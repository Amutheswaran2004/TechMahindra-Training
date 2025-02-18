// Pass a parameter, and display the factors of that parameter in the function
let number=10;
function factors(number){
for(let i=1;i<number;i++){
    if(number%i===0)
        console.log(i)
}
}
factors(number)