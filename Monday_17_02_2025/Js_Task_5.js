/*5. Create a object called student with properties id, name, department, college and email.
Write a function to access the properties and display them.Invoke the function to display 
the details.Write another function to access the properties id, name and email and display them.
Invoke the function to display the details Add a property called address, as another object, 
with properties as doorNo, street, area and pincode Add a function to display the details of the student with address.
Delete the property email and the function created to display id, name and email.*/

const student ={id:123,Name:"Amutheswaran",Dept:"ECE",College:"PEC",email:"amudheswaran@gmail.com"}
display1=()=>console.log(student)
display1();
display2=()=>{
        console.log(student["id"]+" "+student["Name"]+" "+student["email"])
        student.address={
        doorNo:54,
        street:"Gandhi Nagar",
        area:"JKM",
        pincode:621802,
        }
}
console.log("function to display only id ,Name,email")
display2();
console.log("After Changes :")
display1()
delete student.email
console.log("After deleting email ")
display1()
