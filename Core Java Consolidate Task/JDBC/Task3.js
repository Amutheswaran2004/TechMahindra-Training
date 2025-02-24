let student = {
    name: "Amutheswaran",
    age: 21,
    grade: "O",
    displayInfo: function() {
        console.log(`Name: ${this.name}, Age: ${this.age}, Grade: ${this.grade}`);
    }
};
console.log(student.name);
console.log(student.age);
console.log(student.grade);
student.displayInfo();
student.address = {
    street: "Anna Nagar",
    city: "Chennai",
    country: "India",
    displayAddress: function() {
        console.log(`Address: ${this.street}, ${this.city}, ${this.country}`);
    },
    updateAddress: function(street, city, country) {
        this.street = street;
        this.city = city;
        this.country = country;
        console.log("Address updated!");
    }
};
console.log(student.address.street);
console.log(student.address.city);
console.log(student.address.country);
student.address.displayAddress();
student.address.updateAddress("367 ", "TamilNadu", "India");
student.address.displayAddress();
delete student.grade;
delete student.displayInfo;
console.log(student);
